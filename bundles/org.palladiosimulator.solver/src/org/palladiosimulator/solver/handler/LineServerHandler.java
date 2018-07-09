package org.palladiosimulator.solver.handler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class LineServerHandler {
	
	private String host = null;
	private int port = -1;
	private Socket lineSocket = null;
	private PrintWriter out = null;
	private BufferedReader processIn = null;
	private BufferedReader socketIn = null;
	private LineMessageHandler processMessages;
	private LineMessageHandler socketMessages;
	private boolean localInstance = false;
	private Process proc;
	private File directory = null;
	private String MCR_dir = null;
	private String propertyFile = null;
	private static final Logger logger = Logger.getLogger(LineServerHandler.class);
	private final static String LINE_UNIX = "run_LINE.sh";
	private final static String LINE_WINDOWS = "LINE";

	/**
	 * Handler for all interactions with an instance of LINE
	 * 
	 * @param properyFile
	 */
	public LineServerHandler(String properyFile) {
		this.propertyFile = properyFile;
	}

	/**
	 * Closes the connection with the server
	 */
	public void closeConnections() {

		// Send LINE command to close the connection
		if (out != null && lineSocket != null && !lineSocket.isClosed()) {
			String command = "CLOSE";
			out.println(command);
			out.flush();
		}
		if (out != null)
			out.close();

		try {
			if (socketMessages != null && socketIn != null) {
				socketMessages.close();
				socketIn.close();
				socketIn = null;
				socketMessages = null;
			}
			if (lineSocket != null) {
				lineSocket.close();
				socketMessages = null;
			}
		} catch (IOException e) {
			logger.error("Error in closing LINE connection");
		}
	}

	private void loadProperties() {
		Properties lineProperties = new Properties();

		try {
			FileInputStream propInput = new FileInputStream(propertyFile);
			lineProperties.load(propInput);
			propInput.close();
			if (host == null)
				host = lineProperties.getProperty("host", "localhost");
			if (port == -1)
				port = Integer.parseInt(lineProperties.getProperty("port", "5463"));
			directory = new File(lineProperties.getProperty("directory", null));
			MCR_dir = lineProperties.getProperty("MCR_dir", "/usr/local/MATLAB/MATLAB_Compiler_Runtime/v81");
		} catch (IOException e) {
			logger.error("Could not load LINE connection properties", e);
		}
	}

	/**
	 * Connects to LINE server, if no instance of line server is found then a
	 * new one is launched
	 */
	public void connectToLINEServer() {

		loadProperties();

		try {
			// try to connect
			logger.info("connecting to LINE");
			initLINEConnection();
		} catch (UnknownHostException e) {
			// fallback to local host and retry
			if (host != "localhost") {
				closeConnections();
				logger.info("Don't know about host:" + host + ". Switching to localhost and trying reconnection.");
				host = "localhost";
				connectToLINEServer();
			} else {
				logger.error("Error while connecting to localhost", e);
			}
		} catch (IOException e) {
			closeConnections();
			// fall back to local host and launch LINE
			logger.info("Could not connect to LINE on host: " + host + " on port: " + port
					+ " trying to launch line locally and connect to localhost. This might take a while..");
			// launch line locally
			host = "localhost";
			launchLine();
			try {
				initLINEConnection();
			} catch (IOException e1) {
				closeConnections();
				logger.error("Could not connect to local instance of LINE", e1);
			}
		}
	}

	private void reConnect() {
		try {
			initLINEConnection();
		} catch (IOException e) {
			logger.error("Error in re-connecting to LINE", e);
		}
	}

	private void initLINEConnection() throws IOException {
		lineSocket = new Socket(host, port);

		out = new PrintWriter(lineSocket.getOutputStream());
		if (socketIn == null)
			socketIn = new BufferedReader(new InputStreamReader(lineSocket.getInputStream()));
		if (socketMessages == null) {
			socketMessages = new LineMessageHandler(socketIn, "socket");
			(new Thread(socketMessages)).start();
		}
		while (!socketMessages.isConnected())
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				logger.error("Error while waiting for LINE connection", e);
			}
		logger.info("Connected to LINE on " + host + ":" + port);
	}

	/**
	 * checks if the model submitted with the specified modelFile has been
	 * solved.
	 * 
	 * @param modelFile
	 * @return
	 */
	public boolean isSolved(String modelFile) {
		return socketMessages.isModelEvaluated(modelFile);
	}
		
	/**
	 * Launches a new instance of line
	 * 
	 * @return
	 */
	public boolean launchLine() {
		try {

			String lineInvocation = " " + "\"" + propertyFile.replace('\\', '/') + "\"";

			if (System.getProperty("os.name").indexOf("Windows") > -1)
				lineInvocation = LINE_WINDOWS + lineInvocation;
			else
				lineInvocation = LINE_UNIX + " " + MCR_dir + " " + propertyFile.replace('\\', '/');

			logger.debug(lineInvocation);
			ProcessBuilder pb = new ProcessBuilder(lineInvocation.split("\\s"));
			pb.directory(directory);
			pb.redirectErrorStream(true);
			proc = pb.start();
			processIn = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			processMessages = new LineMessageHandler(processIn, "process");
			(new Thread(processMessages)).start();
			while (!processMessages.isRunning())
				Thread.sleep(100);

			localInstance = true;

			// the startup has ended
			logger.info("Local instance of LINE launched");

			return true;
		} catch (IOException e) {
			logger.error("Error in launching LINE", e);
			return false;
		} catch (InterruptedException e) {
			logger.error("Error in launching LINE", e);
			return false;
		}

	}

	/**
	 * solves a LQN model
	 * 
	 * @param modelFilePath
	 * @param REfilePath
	 *            - path to a random environment to apply to the model
	 */
	public void solve(String modelFilePath, String REfilePath) {

		// check that the connection is alive
		if (out == null || out.checkError()) {
			logger.info("Connection with LINE server has encoutner a problem, trying to reconnect...");
			reConnect();
		}
		/*
		modelFilePath = modelFilePath.replace('\\', '/');
		if (REfilePath != null)
			REfilePath = REfilePath.replace('\\', '/');
		*/
		// build the command
		String command = "SOLVE " + modelFilePath;
		if (REfilePath != null)
			command = " " + REfilePath;

		logger.debug("Sending: " + command);

		// reset the Logger in case a previous model with the same name have
		// been specified
		socketMessages.reset(modelFilePath);

		out.println(command);
		out.flush();

		return;

	}

	/**
	 * Closes connections to an instance of LINE and, if the instance is local
	 * it terminates
	 */
	public void terminateLine() {
		if (localInstance) {
			// If LINE was launched by SPACE4Cloud close it
			out.println("QUIT");
			out.flush();
			try {
				proc.waitFor();
			} catch (InterruptedException e) {
				logger.error("Error in Quitting LINE", e);
			}

			if (processMessages != null && processIn != null) {
				processMessages.close();
				try {
					processIn.close();
				} catch (IOException e) {
					logger.error("Error in closing the process reader of LINE", e);
				}
			}
		}

		// otherwise just close the connection
		closeConnections();

	}

	/**
	 * Clear the handler from events of previous evaluations
	 */
	public void clear() {
		socketMessages.clear();

	}

}