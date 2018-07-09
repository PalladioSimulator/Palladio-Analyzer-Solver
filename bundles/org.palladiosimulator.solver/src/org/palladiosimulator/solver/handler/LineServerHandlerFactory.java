package org.palladiosimulator.solver.handler;

import org.apache.log4j.Logger;

public class LineServerHandlerFactory {

	private static LineServerHandler handler = null;
	private static String propfile = null;
	private static final Logger logger = Logger.getLogger(LineServerHandlerFactory.class);

	public static LineServerHandler getHandler() {
		if (propfile == null) {
			logger.error("No property file has been specified for LINE");
			return null;
		}
		if (handler == null) {
			handler = new LineServerHandler(propfile);
		}
		return handler;
	}

	/**
	 * Destroys the instance of the handler
	 */
	public static void clearHandler() {
		handler = null;
	}

	/**
	 * Specify the path to the LINE.properties file containing details about the
	 * connection to the server and parameters to launch a new server
	 * 
	 * @param linePropFile
	 */
	public static void setLINEPropertyFile(String linePropFile) {
		propfile = linePropFile;
	}

}