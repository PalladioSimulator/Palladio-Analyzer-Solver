package org.palladiosimulator.solver.tests;

import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LqnTransformTest {

	private Properties props = new Properties();
	
//	private static final String PATH = "D:\\Diss\\svn\\code\\" +
//			"PalladioCM.PCMSolver\\trunk\\org.palladiosimulator.solver\\" +
//			"src\\de\\uka\\ipd\\sdq\\pcmsolver\\tests\\MediaStore";
	private static final String PATH = "D:\\Diss\\svn\\code\\" +
	"PalladioCM.PCMSolver\\trunk\\org.palladiosimulator.solver\\" +
	"src\\de\\uka\\ipd\\sdq\\pcmsolver\\tests\\MediaStore2";

	@BeforeEach
	public void setUp(){
		props.setProperty("Filename_Allocation", PATH+"\\MediaStore.allocation");
		props.setProperty("Filename_Repository", PATH+"\\MediaStore.repository");
		props.setProperty("Filename_ResourceEnvironment", PATH+"\\MediaStore.resourceenvironment");
		props.setProperty("Filename_ResourceType", PATH+"\\MediaStore.resourcetype");
		props.setProperty("Filename_System", PATH+"\\MediaStore.system");
		props.setProperty("Filename_UsageModel", PATH+"\\MediaStore.usagemodel");
		props.setProperty("Storage_Path", PATH);
	}
	
	@Test
	public void runLqnTransform(){
		// PCMSolver solver = new PCMSolver(props);
	}

}
;