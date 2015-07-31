package org.palladiosimulator.solver.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.PhaseActivities;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.SchedulingType;
import org.palladiosimulator.solver.lqn.SolverParamsType;
import org.palladiosimulator.solver.lqn.TaskSchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;
import org.palladiosimulator.solver.lqn.TypeType;
import org.palladiosimulator.solver.transformations.pcm2lqn.LqnXmlHandler;

import junit.framework.JUnit4TestAdapter;

public class LQNTest {

	private static Logger logger = Logger.getLogger(LQNTest.class.getName());
    private static final String FILENAME_INPUT = "C:\\Temp\\test.lqxo";
    private static final String FILENAME_RESULT = "C:\\Temp\\test.out.lqxo";
    
    @Before
    public void setUp() {

    }

    @Test
    public void handle() throws IOException {

        final LqnFactory fac = LqnFactory.eINSTANCE;
        final LqnModelType lmt = fac.createLqnModelType();
        lmt.setName("cmpdesign");

        final SolverParamsType spt = fac.createSolverParamsType();
        spt.setComment("Design Comparison Heiko");
        spt.setConvVal(1e-005);
        spt.setItLimit(50);
        spt.setPrintInt(10);
        spt.setUnderrelaxCoeff(0.5);
        lmt.setSolverParams(spt);

        getProcessor1(fac, lmt);
        getProcessor2(fac, lmt);
        getProcessor3(fac, lmt);

        LqnXmlHandler handler = new LqnXmlHandler(lmt);
        handler.saveModelToXMI(FILENAME_INPUT);
        LqnXmlHandler.fixXMLFile(FILENAME_INPUT);
        
        LqnXmlHandler.loadModelFromXMI(FILENAME_INPUT);
        
        /* removed actually running lqns as that needs to be available in the environment */
        //runLqnTools();

        //printResultToConsole();

    }

    private void printResultToConsole() throws IOException {
        FileInputStream fis = null;
        byte b[] = null;

        fis = new FileInputStream(FILENAME_RESULT);
        int x = 0;
        x = fis.available();
        b = new byte[x];
        fis.read(b);
        fis.close();

        final String content = new String(b);
        System.out.println(content);
    }

    private void runLqnTools() {
        try {
           Runtime.getRuntime().exec("lqns -x -o" + FILENAME_RESULT + " " + FILENAME_INPUT);

        } catch (final IOException e) {
            e.printStackTrace();
        } 
    }

    private void getProcessor3(final LqnFactory fac, final LqnModelType lmt) {

        final ProcessorType pt = fac.createProcessorType();
        pt.setName("FileServer");
        pt.setMultiplicity(new BigInteger("200"));
        pt.setScheduling(SchedulingType.FCFS);
        lmt.getProcessor().add(pt);

        final TaskType tt = fac.createTaskType();
        tt.setName("FileServer");
        tt.setMultiplicity(new BigInteger("200"));
        tt.setScheduling(TaskSchedulingType.FCFS);
        pt.getTask().add(tt);

        final EntryType et = fac.createEntryType();
        et.setName("FileServer_Screen");
        et.setType(TypeType.PH1PH2);
        tt.getEntry().add(et);

        final PhaseActivities pa = fac.createPhaseActivities();
        et.setEntryPhaseActivities(pa);

        final ActivityPhasesType apt = fac.createActivityPhasesType();
        apt.setName("FileServer_Screen_ph1");
        apt.setPhase(new BigInteger("1"));
        apt.setHostDemandMean("0.4");
        pa.getActivity().add(apt);

        final ActivityPhasesType apt2 = fac.createActivityPhasesType();
        apt2.setName("FileServer_Screen_ph2");
        apt2.setPhase(new BigInteger("2"));
        apt2.setHostDemandMean("0.1");
        pa.getActivity().add(apt2);

        final EntryType et2 = fac.createEntryType();
        et2.setName("FileServer_Data");
        et2.setType(TypeType.PH1PH2);
        tt.getEntry().add(et2);

        final PhaseActivities pa2 = fac.createPhaseActivities();
        et2.setEntryPhaseActivities(pa2);

        final ActivityPhasesType apt3 = fac.createActivityPhasesType();
        apt3.setName("FileServer_Data_ph1");
        apt3.setPhase(new BigInteger("1"));
        apt3.setHostDemandMean("0.4");
        pa2.getActivity().add(apt3);

        final ActivityPhasesType apt4 = fac.createActivityPhasesType();
        apt4.setName("FileServer_Data_ph1");
        apt4.setPhase(new BigInteger("2"));
        apt4.setHostDemandMean("0.1");
        pa2.getActivity().add(apt4);
    }

    private void getProcessor2(final LqnFactory fac, final LqnModelType lmt) {
        final ProcessorType pt2 = fac.createProcessorType();
        pt2.setName("Application");
        pt2.setMultiplicity(new BigInteger("200"));
        pt2.setScheduling(SchedulingType.FCFS);
        lmt.getProcessor().add(pt2);

        final TaskType tt2 = fac.createTaskType();
        tt2.setName("Application");
        tt2.setMultiplicity(new BigInteger("200"));
        tt2.setScheduling(TaskSchedulingType.FCFS);
        pt2.getTask().add(tt2);

        final EntryType et2 = fac.createEntryType();
        et2.setName("Application_Rqst");
        et2.setType(TypeType.PH1PH2);
        tt2.getEntry().add(et2);

        final PhaseActivities pa2 = fac.createPhaseActivities();
        et2.setEntryPhaseActivities(pa2);

        final ActivityPhasesType apt2 = fac.createActivityPhasesType();
        apt2.setName("Application_Rqst_ph1");
        apt2.setPhase(new BigInteger("1"));
        apt2.setHostDemandMean("0.7");
        pa2.getActivity().add(apt2);

        final ActivityMakingCallType amct3 = fac.createActivityMakingCallType();
        amct3.setCallsMean("1");
        amct3.setDest("FileServer_Data");
        apt2.getSynchCall().add(amct3);

        final ActivityPhasesType apt3 = fac.createActivityPhasesType();
        apt3.setName("Application_Rqst_ph2");
        apt3.setPhase(new BigInteger("2"));
        apt3.setHostDemandMean("0.3");
        pa2.getActivity().add(apt3);
    }

    private void getProcessor1(final LqnFactory fac, final LqnModelType lmt) {
        final ProcessorType pt = fac.createProcessorType();
        pt.setName("Clients");
        pt.setMultiplicity(new BigInteger("0"));
        pt.setScheduling(SchedulingType.FCFS);
        lmt.getProcessor().add(pt);

        final TaskType tt = fac.createTaskType();
        tt.setName("Clients");
        tt.setMultiplicity(new BigInteger("4"));
        tt.setScheduling(TaskSchedulingType.REF);
        pt.getTask().add(tt);

        final EntryType et = fac.createEntryType();
        et.setName("Clients");
        et.setType(TypeType.PH1PH2);
        tt.getEntry().add(et);

        final PhaseActivities pa = fac.createPhaseActivities();
        et.setEntryPhaseActivities(pa);

        final ActivityPhasesType apt = fac.createActivityPhasesType();
        apt.setName("Clients_ph2");
        apt.setPhase(new BigInteger("2"));
        apt.setHostDemandMean("10");
        pa.getActivity().add(apt);

        final ActivityMakingCallType amct = fac.createActivityMakingCallType();
        amct.setCallsMean("5");
        amct.setDest("FileServer_Screen");
        apt.getSynchCall().add(amct);

        final ActivityMakingCallType amct2 = fac.createActivityMakingCallType();
        amct2.setCallsMean("2");
        amct2.setDest("Application_Rqst");
        apt.getSynchCall().add(amct2);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(LQNTest.class);
    }
}