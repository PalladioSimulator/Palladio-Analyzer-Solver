package org.palladiosimulator.solver.transformations.pcm2lqn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

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
import org.palladiosimulator.solver.lqn.DocumentRoot;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;

public class LqnXmlHandler {

	private static Logger logger = Logger.getLogger(LqnXmlHandler.class.getName());
	
	LqnModelType lqnModel;
	

	public LqnXmlHandler(LqnModelType anLqnModel) {
		lqnModel = anLqnModel;
	}
	

	/** copied from org.palladiosimulator.solver.lqn.presentation.LqnModelWizard */
	protected EObject createInitialModel() {
		
		LqnPackage lqnPackage = LqnPackage.eINSTANCE;
		LqnFactory lqnFactory = lqnPackage.getLqnFactory();
		
		EClass eClass = ExtendedMetaData.INSTANCE.getDocumentRoot(lqnPackage);
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature("lqnModel");
		EObject rootObject = lqnFactory.create(eClass);
		rootObject.eSet(eStructuralFeature, EcoreUtil.create((EClass) eStructuralFeature.getEType()));
		return rootObject;
	}

	public void saveModelToXMI(String fileName) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		URI fileURI = URI.createFileURI(new File(fileName).getAbsolutePath());

		Resource resource = resourceSet.createResource(fileURI);
		
		DocumentRoot rootObject = (DocumentRoot) createInitialModel();
		rootObject.setLqnModel(lqnModel);
		
		resource.getContents().add(rootObject);
		
		try {
			resource.save(Collections.EMPTY_MAP);
			
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		
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
		
		LqnModelType lqnModel = null;
		
		try {
			Resource resource = loadIntoResourceSet(fileName);
			DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
			lqnModel = documentRoot.getLqnModel();
			
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		
		// Can be null if there were problems retrieving the model
		return lqnModel;
	}
	
	
	private static Resource loadIntoResourceSet(String fileName) throws IOException{
		
		URI fileURI = URI.createFileURI(new File(fileName).getAbsolutePath());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Resource resource = resourceSet.createResource(fileURI);
		
		resource.load(Collections.EMPTY_MAP);

		return resource;

		
	}

	/**
	 * Fix encoding line (fix proposed by Greg Franks for LINE solver, not clear whether still needed).
	 * 
	 * @param filename
	 */
	public static void fixXMLFile(String filename) {
		String content = readContentFromFile(filename);
		
		/* Possibly only needed for LINE */
		content = content.replaceAll("xml version=\"1.0\" encoding=\"ASCII\"", "xml version=\"1.0\" encoding=\"us-ascii\"");
			
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
	
	
}

