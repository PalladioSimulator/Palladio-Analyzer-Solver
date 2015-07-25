package org.palladiosimulator.solver.transformations.pcm2lqn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.solver.lqn.DocumentRoot;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.util.LqnResourceFactoryImpl;

public class LqnXmlHandler {

	private static Logger logger = Logger.getLogger(LqnXmlHandler.class.getName());
	
	LqnModelType lqnModel;
	
	static private LqnXmlToEmfMap[] lqnTermsToReplace = {
			//new LqnXmlToEmfMap("lqn:LqnModelType", "lqn-model"), 
			//new LqnXmlToEmfMap("LqnModelType", "lqn-model"),
			//new LqnXmlToEmfMap("xmlns:lqn", "xsi:noNamespaceSchemaLocation"),
			new LqnXmlToEmfMap("xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"", "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"")
			/*new LqnXmlToEmfMap("entryActivityGraph", "entry-activity-graph"),
			new LqnXmlToEmfMap("thinkTime", "think-time"),
			new LqnXmlToEmfMap("entryPhaseActivities", "entry-phase-activities"),
			new LqnXmlToEmfMap("solverParams", "solver-params"),
			new LqnXmlToEmfMap("synchCall", "synch-call"),
			new LqnXmlToEmfMap("itLimit", "it_limit"),
			new LqnXmlToEmfMap("printInt", "print_int"),
			new LqnXmlToEmfMap("underrelaxCoeff", "underrelax_coeff"),
			new LqnXmlToEmfMap("callOrder", "call-order"),
			new LqnXmlToEmfMap("hostDemandMean", "host-demand-mean"),
			new LqnXmlToEmfMap("hostDemandCvsq", "host-demand-cvsq"),
			new LqnXmlToEmfMap("callsMean", "calls-mean"),
			new LqnXmlToEmfMap("replyActivity", "reply-activity"),
			new LqnXmlToEmfMap("postOR", "post-OR"),
			new LqnXmlToEmfMap("postAND", "post-AND"),
			new LqnXmlToEmfMap("preOR", "pre-OR"),
			new LqnXmlToEmfMap("preAND", "pre-AND"),
			new LqnXmlToEmfMap("taskActivities", "task-activities"),
			new LqnXmlToEmfMap("boundToEntry", "bound-to-entry"),
			new LqnXmlToEmfMap("replyEntry", "reply-entry"),
			new LqnXmlToEmfMap("activityGraph", "activity-graph"),
			new LqnXmlToEmfMap("speedFactor", "speed-factor"),
			new LqnXmlToEmfMap("serviceTimeDistribution", "service-time-distribution"),
			new LqnXmlToEmfMap("openArrivalRate", "open-arrival-rate"),
			new LqnXmlToEmfMap("openWaitTime", "open-wait-time"),
			new LqnXmlToEmfMap("binSize", "bin-size"),
			new LqnXmlToEmfMap("midPoint", "mid-point"),
			new LqnXmlToEmfMap("numberBins", "number-bins"),
			new LqnXmlToEmfMap("stdDev", "std-dev"),
			new LqnXmlToEmfMap("histogramBin", "histogram-bin"),
			new LqnXmlToEmfMap("overflowBin", "overflow-bin"),
			new LqnXmlToEmfMap("waitingVariance", "waiting-variance"),
			new LqnXmlToEmfMap("phase1ProcWaiting", "phase1-procWaiting"),
			new LqnXmlToEmfMap("phase1ServiceTime", "phase1-serviceTime"),
			new LqnXmlToEmfMap("phase1ServiceTimeVariance", "phase1-serviceTime"),
			// some of the subsequent replacement rules are relevant only for result files
			new LqnXmlToEmfMap("resultGeneral", "result-general"),
			new LqnXmlToEmfMap("resultJoinDelay", "result-join-delay"),
			new LqnXmlToEmfMap("joinVariance","join-variance"),
			new LqnXmlToEmfMap("joinWaiting", "join-waiting"),
			new LqnXmlToEmfMap("elapsedTime", "elapsed-time"),
			new LqnXmlToEmfMap("solverInfo", "solver-info"),
			new LqnXmlToEmfMap("resultTask", "result-task"),
			new LqnXmlToEmfMap("phase1Utilization", "phase1-utilization"),
			new LqnXmlToEmfMap("procUtilization", "proc-utilization"),
			new LqnXmlToEmfMap("resultEntry", "result-entry"),
			new LqnXmlToEmfMap("squaredCoeffVariation", "squared-coeff-variation"),
			new LqnXmlToEmfMap("throughputBound", "throughput-bound"),
			new LqnXmlToEmfMap("resultActivity", "result-activity"),
			new LqnXmlToEmfMap("procWaiting", "proc-waiting"),
			// As "service-time" is a prefix of "service-time-variance", a following "=" is needed
			new LqnXmlToEmfMap("serviceTime=", "service-time="),   
			new LqnXmlToEmfMap("serviceTimeVariance", "service-time-variance"),
			new LqnXmlToEmfMap("resultCall", "result-call"),
			new LqnXmlToEmfMap("resultProcessor", "result-processor"),
			new LqnXmlToEmfMap("platformInfo", "platform-info"),
			new LqnXmlToEmfMap("userCpuTime", "user-cpu-time"),
			new LqnXmlToEmfMap("systemCpuTime", "system-cpu-time"),
			new LqnXmlToEmfMap("mvaInfo", "mva-info")*/
			
	};
	
	static private LqnXmlToEmfMap[] lqnTermsToReplaceToEmf = {
			/* both conv_val and conv-val are mapped to convVal */
			//new LqnXmlToEmfMap("convVal", "conv-val"),
			//new LqnXmlToEmfMap("convVal", "conv_val")
			//new LqnXmlToEmfMap("lqn:LqnModelType", "lqn-model"),
			new LqnXmlToEmfMap("LqnModelType", "lqn-model")
	};
	
	static private LqnXmlToEmfMap[] lqnTermsToReplaceToXml = {
			/* in generated lqn files, only conv_val is needed (conv-val is for results)*/
			new LqnXmlToEmfMap("LqnModelType", "lqn-model"),
			//new LqnXmlToEmfMap("convVal", "conv_val")
	};
	

	public LqnXmlHandler(LqnModelType anLqnModel) {
		lqnModel = anLqnModel;
	}
	
	protected LqnPackage lqnPackage = LqnPackage.eINSTANCE;
	protected LqnFactory lqnFactory = lqnPackage.getLqnFactory();
	
	/** copied from org.palladiosimulator.solver.lqn.presentation.LqnModelWizard */
	protected EObject createInitialModel() {
		EClass eClass = ExtendedMetaData.INSTANCE.getDocumentRoot(lqnPackage);
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature("lqnModel");
		EObject rootObject = lqnFactory.create(eClass);
		rootObject.eSet(eStructuralFeature, EcoreUtil.create((EClass) eStructuralFeature.getEType()));
		return rootObject;
	}

	public void saveModelToXMI(String fileName) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

//		// Register the default resource factory -- only needed for stand-alone!
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//						new XMIResourceFactoryImpl());
		
		URI fileURI = URI.createFileURI(new File(fileName).getAbsolutePath());

		//LqnResourceFactoryImpl factory = new LqnResourceFactoryImpl();

		Resource resource = resourceSet.createResource(fileURI);
		//Resource resource = factory.createResource(fileURI);
		
		//Resource resource = resourceSet.createResource(fileURI);
		//XMIResource resource = (XMIResource) resourceSet.createResource(fileURI);
		
		DocumentRoot rootObject = (DocumentRoot) createInitialModel();
		rootObject.setLqnModel(lqnModel);
		
		resource.getContents().add(rootObject);
		
		//resource.getDefaultSaveOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, true);
		
		Map<String, Boolean> options = new HashMap();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		
		try {
			resource.save(options);
			
		} catch (IOException e) {
			logger.error(e.getMessage());
		}

		
		//fixXMLFile(fileName);
		
	}
	
	/**
	 * Restores the corresponding Ecore model, previously serialized via
	 * {@link #saveModelToXMI(String)}.
	 * 
	 * @param fileName
	 * @return A representation of the model object 'LQN Model Type'; null if
	 *         the file don't exists or when there were problems reading the
	 *         file.
	 */
	public static LqnModelType loadModelFromXMI(String fileName) {
		// Revert the Ecore tag names
		revertXMLFile(fileName);
		
		LqnModelType lqnModel = null;
		
		try {
			Resource resource = loadIntoResourceSet(fileName);
			DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
			lqnModel = documentRoot.getLqnModel();
			
		} catch (IOException e) {
			logger.error(e.getMessage());
//			if (e.getCause() instanceof FeatureNotFoundException){
//				String missingFeature = extractMissingFeature((FeatureNotFoundException) e.getCause());
//				repairXmlFile(fileName, missingFeature);
//			}
			
		}
		
		// Can be null if there were problems retrieving the model
		return lqnModel;
	}
	
	private static String extractMissingFeature(FeatureNotFoundException e){
		String message = e.getMessage();
		int firstQuoteIndex = message.indexOf("'");
		int secondQuoteIndex = message.indexOf("'", firstQuoteIndex+1);
		String missingFeature = message.substring(firstQuoteIndex+1, secondQuoteIndex);
		return missingFeature;
	}
	
	private static void repairXmlFile(String fileName, String missingFeature){
		
		if (missingFeature.indexOf("-") != -1){
			
			//replace all dashes
			//missingFeature.replaceAll("([^_A-Z])([A-Z])", "$1_$2");
		}
		
		String content = readContentFromFile(fileName);
		
		
		
		writeContentToFile(fileName, content);
		
	}
	
	private static Resource loadIntoResourceSet(String fileName) throws IOException{
		
		
		URI fileURI = URI.createFileURI(new File(fileName).getAbsolutePath());
		
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		
		//LqnResourceFactoryImpl factory = new LqnResourceFactoryImpl();

//		// Register the default resource factory -- only needed for stand-alone!
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put("lqxo",
//						new LqnResourceFactoryImpl());
		
		//Resource resource = factory.createResource(fileURI);
		
		Resource resource = resourceSet.createResource(fileURI);

		//Map<String, Boolean> options = new HashMap();
		//options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		
		resource.load(Collections.EMPTY_MAP);

		return resource;

		
	}

	/**
	 * Changes the XML-tag names to their original names. They had
	 * formerly been changed by the LQN-to-Ecore mapping.
	 * 
	 * @param filename
	 */
	public static void fixXMLFile(String filename) {
		String content = readContentFromFile(filename);
		
		//TODO: remove hard coded path to xsd file.
		
		/* Only when fixing the LQN file for lqns / lqsim, not on the way back (as this would destroy XML comments and names with dashes, too) */
		//content = content.replaceAll("_", "-");
		
		/* Possibly only needed for LINE */
		content = content.replaceAll("xml version=\"1.0\" encoding=\"ASCII\"", "xml version=\"1.0\" encoding=\"us-ascii\"");
		
		String lqnDir = System.getenv("LQNDIR");
		if (lqnDir != null && lqnDir !=""){
			lqnDir = lqnDir.replaceAll("\\\\", "/");
			lqnDir = lqnDir.replaceAll(" ", "%20");
			content = content.replaceAll("xmlns:lqn=\"http://palladiosimulator.org/Solver/LQN/2.0", "xsi:noNamespaceSchemaLocation=\"file:///"+lqnDir+"lqn-core.xsd\"");
		} else {
			content = content.replaceAll("xmlns:lqn=\"http://palladiosimulator.org/Solver/LQN/2.0", "xsi:noNamespaceSchemaLocation=\"file:/C:/Program Files/LQNSolvers/lqn-core.xsd");
		}
		
		for (LqnXmlToEmfMap term : lqnTermsToReplace) {
			content = content.replaceAll(term.getLqnEmfTerm(), term.getLqnXmlTerm());
		}
		
		for (LqnXmlToEmfMap term : lqnTermsToReplaceToXml) {
			content = content.replaceAll(term.getLqnEmfTerm(), term.getLqnXmlTerm());
		}
		
		
		writeContentToFile(filename, content);

	}

	private static void writeContentToFile(String filename, String content) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			fos.write(content.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String readContentFromFile(String filename) {
		FileInputStream fis = null;
		byte b[]= null;
		try {
			fis = new FileInputStream(filename);
			int x = 0;
			x = fis.available();
			b= new byte[x];
			fis.read(b);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String content = new String(b);
		return content;
	}
	
	/**
	 * Revert the previously changed XML-tag names to their corresponding Ecore
	 * names. The renaming is required before the model can be restored from an
	 * XML file.
	 * 
	 * @param filename
	 */
	private static void revertXMLFile(String filename) {
		String content = readContentFromFile(filename);
		
		String lqnDir = System.getenv("LQNDIR");
		if (lqnDir != null && lqnDir !=""){
			
			lqnDir = lqnDir.replaceAll("\\\\", "/");
			lqnDir = lqnDir.replaceAll(" ", "%20");
			content = content.replaceAll("xmlns:lqn=\"file:///"+lqnDir+"lqn.xsd\"", "xmlns:lqn=\"http://palladiosimulator.org/Solver/LQN/2.0");
			content = content.replaceAll("xmlns:lqn=\"file:///"+lqnDir+"lqn-core.xsd\"", "xmlns:lqn=\"http://palladiosimulator.org/Solver/LQN/2.0");
		} else {
			//content = content.replaceAll("xsi:noNamespaceSchemaLocation=\"file:/.*/lqn-core.xsd", "xmlns:lqn=\"http://palladiosimulator.org/Solver/LQN/2.0");
			//content = content.replaceAll("xsi:noNamespaceSchemaLocation=\"file:/.*/lqn.xsd", "xmlns:lqn=\"http://palladiosimulator.org/Solver/LQN/2.0");
			//content = content.replaceAll("xsi:noNamespaceSchemaLocation=\"file:/.*/lqn.xsd", "xsi:schemaLocation=\"null http://palladiosimulator.org/Solver/LQN/2.0");
			//content = content.replaceAll("xsi:noNamespaceSchemaLocation=\"file:/.*/lqn.xsd\"", "xmlns=\"http://palladiosimulator.org/Solver/LQN/2.0\"");
			content = content.replaceAll("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"file:///C:/Program Files/LQN Solvers/lqn.xsd\"", "");
			
		}
				
//		for (LqnXmlToEmfMap term : lqnTermsToReplace) {
//			content = content.replaceAll(term.getLqnXmlTerm(), term.getLqnEmfTerm());
//		}
//		
//		for (LqnXmlToEmfMap term : lqnTermsToReplaceToEmf) {
//			content = content.replaceAll(term.getLqnXmlTerm(), term.getLqnEmfTerm());
//		}
		
		
		writeContentToFile(filename, content);
	}
	
	
}

class LqnXmlToEmfMap {
	String lqnXmlTerm = "";
	String lqnEmfTerm = "";
	
	public LqnXmlToEmfMap (String lqnEmfTerm, String lqnXmlTerm){
		this.lqnXmlTerm = lqnXmlTerm;
		this.lqnEmfTerm = lqnEmfTerm;
	}
	
	public String getLqnXmlTerm() {
		return lqnXmlTerm;
	}

	public String getLqnEmfTerm() {
		return lqnEmfTerm;
	}	

}
