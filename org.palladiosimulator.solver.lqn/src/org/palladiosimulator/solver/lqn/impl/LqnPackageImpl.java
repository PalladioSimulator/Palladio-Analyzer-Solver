/**
 */
package org.palladiosimulator.solver.lqn.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.solver.lqn.ActivityDefBase;
import org.palladiosimulator.solver.lqn.ActivityDefType;
import org.palladiosimulator.solver.lqn.ActivityGraphBase;
import org.palladiosimulator.solver.lqn.ActivityListType;
import org.palladiosimulator.solver.lqn.ActivityLoopListType;
import org.palladiosimulator.solver.lqn.ActivityLoopType;
import org.palladiosimulator.solver.lqn.ActivityMakingCallType;
import org.palladiosimulator.solver.lqn.ActivityOrType;
import org.palladiosimulator.solver.lqn.ActivityPhasesType;
import org.palladiosimulator.solver.lqn.ActivityType;
import org.palladiosimulator.solver.lqn.AndJoinListType;
import org.palladiosimulator.solver.lqn.AsynchCallType;
import org.palladiosimulator.solver.lqn.BindType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.CallOrderType;
import org.palladiosimulator.solver.lqn.DocumentRoot;
import org.palladiosimulator.solver.lqn.EntryActivityDefType;
import org.palladiosimulator.solver.lqn.EntryActivityGraph;
import org.palladiosimulator.solver.lqn.EntryMakingCallType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.FanInType;
import org.palladiosimulator.solver.lqn.FanOutType;
import org.palladiosimulator.solver.lqn.FirstPlotType;
import org.palladiosimulator.solver.lqn.GroupType;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnCoreType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.MakingCallType;
import org.palladiosimulator.solver.lqn.MvaInfoType;
import org.palladiosimulator.solver.lqn.OrListType;
import org.palladiosimulator.solver.lqn.OutPortType;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultJoinDelayType;
import org.palladiosimulator.solver.lqn.OutputResultType;
import org.palladiosimulator.solver.lqn.ParaType;
import org.palladiosimulator.solver.lqn.ParameterType;
import org.palladiosimulator.solver.lqn.PhaseActivities;
import org.palladiosimulator.solver.lqn.PlotControlType;
import org.palladiosimulator.solver.lqn.PlotType;
import org.palladiosimulator.solver.lqn.PortBindingType;
import org.palladiosimulator.solver.lqn.PragmaType;
import org.palladiosimulator.solver.lqn.PrecedenceType;
import org.palladiosimulator.solver.lqn.ProcessorBindingType;
import org.palladiosimulator.solver.lqn.ProcessorType;
import org.palladiosimulator.solver.lqn.RWLockType;
import org.palladiosimulator.solver.lqn.ReplyActivityType;
import org.palladiosimulator.solver.lqn.ReplyEntryType;
import org.palladiosimulator.solver.lqn.ResultConf95Type;
import org.palladiosimulator.solver.lqn.ResultConf95Type1;
import org.palladiosimulator.solver.lqn.ResultConf99Type;
import org.palladiosimulator.solver.lqn.ResultConf99Type1;
import org.palladiosimulator.solver.lqn.ResultGeneralType;
import org.palladiosimulator.solver.lqn.RunControlType;
import org.palladiosimulator.solver.lqn.SchedulingType;
import org.palladiosimulator.solver.lqn.SemaphoreType;
import org.palladiosimulator.solver.lqn.ServiceType;
import org.palladiosimulator.solver.lqn.SingleActivityListType;
import org.palladiosimulator.solver.lqn.SlotType;
import org.palladiosimulator.solver.lqn.SolverParamsType;
import org.palladiosimulator.solver.lqn.SynchCallType;
import org.palladiosimulator.solver.lqn.TaskActivityGraph;
import org.palladiosimulator.solver.lqn.TaskOptionType;
import org.palladiosimulator.solver.lqn.TaskSchedulingType;
import org.palladiosimulator.solver.lqn.TaskType;
import org.palladiosimulator.solver.lqn.TypeType;
import org.palladiosimulator.solver.lqn.ValidType;

import org.palladiosimulator.solver.lqn.util.LqnValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LqnPackageImpl extends EPackageImpl implements LqnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGraphBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLoopListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLoopTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityMakingCallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityOrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPhasesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJoinListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchCallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryActivityDefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryActivityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryMakingCallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fanInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fanOutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstPlotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramBinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lqnCoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lqnModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makingCallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mvaInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDistributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEntryDistributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputResultJoinDelayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pragmaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConf95TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConf95Type1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConf99TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConf99Type1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultGeneralTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleActivityListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solverParamsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchCallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskActivityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rwLockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semaphoreTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskOptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskSchedulingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType callOrderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectFromTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectToTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extVariableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phaseTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rwLockTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schedulingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType semaphoreTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType srvnFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType srvnNonNegativeIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskOptionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskSchedulingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType validTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.solver.lqn.LqnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LqnPackageImpl() {
		super(eNS_URI, LqnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LqnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LqnPackage init() {
		if (isInited) return (LqnPackage)EPackage.Registry.INSTANCE.getEPackage(LqnPackage.eNS_URI);

		// Obtain or create and register package
		LqnPackageImpl theLqnPackage = (LqnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LqnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LqnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLqnPackage.createPackageContents();

		// Initialize created meta-data
		theLqnPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLqnPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LqnValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLqnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LqnPackage.eNS_URI, theLqnPackage);
		return theLqnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDefBase() {
		return activityDefBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefBase_ServiceTimeDistribution() {
		return (EReference)activityDefBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefBase_ResultActivity() {
		return (EReference)activityDefBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_CallOrder() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_HostDemandCvsq() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_HostDemandMean() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_MaxServiceTime() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_Name() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_ThinkTime() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDefType() {
		return activityDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefType_CallList() {
		return (EReference)activityDefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefType_Group() {
		return (EAttribute)activityDefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefType_SynchCall() {
		return (EReference)activityDefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefType_AsynchCall() {
		return (EReference)activityDefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefType_BoundToEntry() {
		return (EAttribute)activityDefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGraphBase() {
		return activityGraphBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGraphBase_Activity() {
		return (EReference)activityGraphBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGraphBase_Precedence() {
		return (EReference)activityGraphBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityListType() {
		return activityListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityListType_Activity() {
		return (EReference)activityListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLoopListType() {
		return activityLoopListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLoopListType_Activity() {
		return (EReference)activityLoopListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityLoopListType_End() {
		return (EAttribute)activityLoopListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLoopType() {
		return activityLoopTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityLoopType_Count() {
		return (EAttribute)activityLoopTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityMakingCallType() {
		return activityMakingCallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityMakingCallType_CallsMean() {
		return (EAttribute)activityMakingCallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityOrType() {
		return activityOrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityOrType_Prob() {
		return (EAttribute)activityOrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPhasesType() {
		return activityPhasesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPhasesType_CallList() {
		return (EReference)activityPhasesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPhasesType_Group() {
		return (EAttribute)activityPhasesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPhasesType_SynchCall() {
		return (EReference)activityPhasesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPhasesType_AsynchCall() {
		return (EReference)activityPhasesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPhasesType_Phase() {
		return (EAttribute)activityPhasesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityType() {
		return activityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_Name() {
		return (EAttribute)activityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndJoinListType() {
		return andJoinListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndJoinListType_ResultJoinDelay() {
		return (EReference)andJoinListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndJoinListType_ServiceTimeDistribution() {
		return (EReference)andJoinListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndJoinListType_Activity() {
		return (EReference)andJoinListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndJoinListType_Quorum() {
		return (EAttribute)andJoinListTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchCallType() {
		return asynchCallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsynchCallType_Dest() {
		return (EAttribute)asynchCallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindType() {
		return bindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_Parameter() {
		return (EReference)bindTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_ProcessorBinding() {
		return (EReference)bindTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindType_PortBinding() {
		return (EReference)bindTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallListType() {
		return callListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallListType_SynchCall() {
		return (EReference)callListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallListType_AsynchCall() {
		return (EReference)callListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LqnCore() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LqnModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryActivityDefType() {
		return entryActivityDefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityDefType_CallList() {
		return (EReference)entryActivityDefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryActivityDefType_Group() {
		return (EAttribute)entryActivityDefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityDefType_SynchCall() {
		return (EReference)entryActivityDefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityDefType_AsynchCall() {
		return (EReference)entryActivityDefTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryActivityDefType_FirstActivity() {
		return (EAttribute)entryActivityDefTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryActivityGraph() {
		return entryActivityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityGraph_ReplyActivity() {
		return (EReference)entryActivityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryMakingCallType() {
		return entryMakingCallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryMakingCallType_Prob() {
		return (EAttribute)entryMakingCallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_ResultEntry() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_ServiceTimeDistribution() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Forwarding() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_EntryActivityGraph() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_EntryPhaseActivities() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Name() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_OpenArrivalRate() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Priority() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Rwlock() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Semaphore() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Type() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFanInType() {
		return fanInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFanInType_Source() {
		return (EAttribute)fanInTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFanInType_Value() {
		return (EAttribute)fanInTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFanOutType() {
		return fanOutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFanOutType_Dest() {
		return (EAttribute)fanOutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFanOutType_Value() {
		return (EAttribute)fanOutTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstPlotType() {
		return firstPlotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstPlotType_Variable() {
		return (EAttribute)firstPlotTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupType() {
		return groupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_ResultGroup() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Task() {
		return (EReference)groupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Cap() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Name() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Share() {
		return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogramBinType() {
		return histogramBinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramBinType_Begin() {
		return (EAttribute)histogramBinTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramBinType_Conf95() {
		return (EAttribute)histogramBinTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramBinType_Conf99() {
		return (EAttribute)histogramBinTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramBinType_End() {
		return (EAttribute)histogramBinTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramBinType_Prob() {
		return (EAttribute)histogramBinTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPortType() {
		return inPortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInPortType_ConnectFrom() {
		return (EAttribute)inPortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInPortType_Description() {
		return (EAttribute)inPortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInPortType_Name() {
		return (EAttribute)inPortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceType() {
		return interfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_InPort() {
		return (EReference)interfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceType_OutPort() {
		return (EReference)interfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLqnCoreType() {
		return lqnCoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnCoreType_Processor() {
		return (EReference)lqnCoreTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnCoreType_Slot() {
		return (EReference)lqnCoreTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLqnModelType() {
		return lqnModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnModelType_RunControl() {
		return (EReference)lqnModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnModelType_PlotControl() {
		return (EReference)lqnModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnModelType_SolverParams() {
		return (EReference)lqnModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnModelType_Processor() {
		return (EReference)lqnModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnModelType_Slot() {
		return (EReference)lqnModelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModelType_Lqx() {
		return (EAttribute)lqnModelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModelType_Description() {
		return (EAttribute)lqnModelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModelType_LqnSchemaVersion() {
		return (EAttribute)lqnModelTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModelType_LqncoreSchemaVersion() {
		return (EAttribute)lqnModelTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModelType_Name() {
		return (EAttribute)lqnModelTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModelType_XmlDebug() {
		return (EAttribute)lqnModelTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakingCallType() {
		return makingCallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMakingCallType_ResultCall() {
		return (EReference)makingCallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMakingCallType_Dest() {
		return (EAttribute)makingCallTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMvaInfoType() {
		return mvaInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_Core() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_Faults() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_Step() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_StepSquared() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_Submodels() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_Wait() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMvaInfoType_WaitSquared() {
		return (EAttribute)mvaInfoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrListType() {
		return orListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrListType_Activity() {
		return (EReference)orListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPortType() {
		return outPortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutPortType_ConnectTo() {
		return (EAttribute)outPortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutPortType_Description() {
		return (EAttribute)outPortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutPortType_Name() {
		return (EAttribute)outPortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDistributionType() {
		return outputDistributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDistributionType_UnderflowBin() {
		return (EReference)outputDistributionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDistributionType_HistogramBin() {
		return (EReference)outputDistributionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDistributionType_OverflowBin() {
		return (EReference)outputDistributionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_BinSize() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_Kurtosis() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_Max() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_Mean() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_MidPoint() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_Min() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_NumberBins() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_Skew() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDistributionType_StdDev() {
		return (EAttribute)outputDistributionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputEntryDistributionType() {
		return outputEntryDistributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputEntryDistributionType_Phase() {
		return (EAttribute)outputEntryDistributionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputResultJoinDelayType() {
		return outputResultJoinDelayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputResultJoinDelayType_ResultConf95() {
		return (EReference)outputResultJoinDelayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputResultJoinDelayType_ResultConf99() {
		return (EReference)outputResultJoinDelayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultJoinDelayType_JoinVariance() {
		return (EAttribute)outputResultJoinDelayTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultJoinDelayType_JoinWaiting() {
		return (EAttribute)outputResultJoinDelayTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputResultType() {
		return outputResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputResultType_ResultConf95() {
		return (EReference)outputResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputResultType_ResultConf99() {
		return (EReference)outputResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_LossProbability() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_OpenWaitTime() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase1ProcWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase1ServiceTime() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase1ServiceTimeVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase1Utilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase1Waiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase1WaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase2ProcWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase2ServiceTime() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase2ServiceTimeVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase2Utilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase2Waiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase2WaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase3ProcWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase3ServiceTime() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase3ServiceTimeVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase3Utilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase3Waiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Phase3WaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_ProbExceedMaxServiceTime() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_ProcUtilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_ProcWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockReaderHolding() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockReaderUtilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockReaderWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockReaderWaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockWriterHolding() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockWriterUtilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockWriterWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_RwlockWriterWaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_SemaphoreUtilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_SemaphoreWaiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_SemaphoreWaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_ServiceTime() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_ServiceTimeVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_SquaredCoeffVariation() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Throughput() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_ThroughputBound() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Utilization() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_Waiting() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputResultType_WaitingVariance() {
		return (EAttribute)outputResultTypeEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Name() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Value() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParaType() {
		return paraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_StartValue() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_EndValue() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_StepValue() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Value() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseActivities() {
		return phaseActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseActivities_Activity() {
		return (EReference)phaseActivitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlotControlType() {
		return plotControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotControlType_FirstPlot() {
		return (EReference)plotControlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotControlType_Plot() {
		return (EReference)plotControlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlotType() {
		return plotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotType_Variable() {
		return (EAttribute)plotTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortBindingType() {
		return portBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortBindingType_Source() {
		return (EAttribute)portBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortBindingType_Target() {
		return (EAttribute)portBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPragmaType() {
		return pragmaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPragmaType_Param() {
		return (EAttribute)pragmaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPragmaType_Value() {
		return (EAttribute)pragmaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedenceType() {
		return precedenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_Pre() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_PreOR() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_PreAND() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_Post() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_PostOR() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_PostAND() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceType_PostLOOP() {
		return (EReference)precedenceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorBindingType() {
		return processorBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorBindingType_Source() {
		return (EAttribute)processorBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorBindingType_Target() {
		return (EAttribute)processorBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorType() {
		return processorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorType_ResultProcessor() {
		return (EReference)processorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorType_Group() {
		return (EReference)processorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorType_Task() {
		return (EReference)processorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorType_Multiplicity() {
		return (EAttribute)processorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorType_Name() {
		return (EAttribute)processorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorType_Quantum() {
		return (EAttribute)processorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorType_Replication() {
		return (EAttribute)processorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorType_Scheduling() {
		return (EAttribute)processorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorType_SpeedFactor() {
		return (EAttribute)processorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyActivityType() {
		return replyActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyActivityType_Name() {
		return (EAttribute)replyActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyEntryType() {
		return replyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyEntryType_ReplyActivity() {
		return (EReference)replyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyEntryType_Name() {
		return (EAttribute)replyEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultConf95Type() {
		return resultConf95TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type_JoinVariance() {
		return (EAttribute)resultConf95TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type_JoinWaiting() {
		return (EAttribute)resultConf95TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultConf95Type1() {
		return resultConf95Type1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_LossProbability() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_OpenWaitTime() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase1ProcWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase1ServiceTime() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase1ServiceTimeVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase1Utilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase1Waiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase1WaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase2ProcWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase2ServiceTime() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase2ServiceTimeVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase2Utilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase2Waiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase2WaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase3ProcWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase3ServiceTime() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase3ServiceTimeVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase3Utilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase3Waiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Phase3WaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_ProbExceedMaxServiceTime() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_ProcUtilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_ProcWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockReaderHolding() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockReaderUtilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockReaderWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockReaderWaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockWriterHolding() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockWriterUtilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockWriterWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_RwlockWriterWaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_SemaphoreUtilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_SemaphoreWaiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_SemaphoreWaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_ServiceTime() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_ServiceTimeVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_SquaredCoeffVariation() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Throughput() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_ThroughputBound() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Utilization() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_Waiting() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf95Type1_WaitingVariance() {
		return (EAttribute)resultConf95Type1EClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultConf99Type() {
		return resultConf99TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type_JoinVariance() {
		return (EAttribute)resultConf99TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type_JoinWaiting() {
		return (EAttribute)resultConf99TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultConf99Type1() {
		return resultConf99Type1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_LossProbability() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_OpenWaitTime() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase1ProcWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase1ServiceTime() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase1ServiceTimeVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase1Utilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase1Waiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase1WaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase2ProcWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase2ServiceTime() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase2ServiceTimeVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase2Utilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase2Waiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase2WaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase3ProcWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase3ServiceTime() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase3ServiceTimeVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase3Utilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase3Waiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Phase3WaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_ProbExceedMaxServiceTime() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_ProcUtilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_ProcWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockReaderHolding() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockReaderUtilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockReaderWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockReaderWaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockWriterHolding() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockWriterUtilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockWriterWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_RwlockWriterWaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_SemaphoreUtilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_SemaphoreWaiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_SemaphoreWaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_ServiceTime() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_ServiceTimeVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_SquaredCoeffVariation() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Throughput() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_ThroughputBound() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Utilization() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_Waiting() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultConf99Type1_WaitingVariance() {
		return (EAttribute)resultConf99Type1EClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultGeneralType() {
		return resultGeneralTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultGeneralType_MvaInfo() {
		return (EReference)resultGeneralTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_ConvVal() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_ElapsedTime() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_Iterations() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_PlatformInfo() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_SolverInfo() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_SystemCpuTime() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_UserCpuTime() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultGeneralType_Valid() {
		return (EAttribute)resultGeneralTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunControlType() {
		return runControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunControlType_Para() {
		return (EReference)runControlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_Name() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleActivityListType() {
		return singleActivityListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActivityListType_Activity() {
		return (EReference)singleActivityListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotType() {
		return slotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotType_Interface() {
		return (EReference)slotTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotType_Binding() {
		return (EReference)slotTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_BindTarget() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_Id() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotType_ReplicNum() {
		return (EAttribute)slotTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolverParamsType() {
		return solverParamsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverParamsType_ResultGeneral() {
		return (EReference)solverParamsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolverParamsType_Pragma() {
		return (EReference)solverParamsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverParamsType_Comment() {
		return (EAttribute)solverParamsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverParamsType_ConvVal() {
		return (EAttribute)solverParamsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverParamsType_ItLimit() {
		return (EAttribute)solverParamsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverParamsType_PrintInt() {
		return (EAttribute)solverParamsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolverParamsType_UnderrelaxCoeff() {
		return (EAttribute)solverParamsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchCallType() {
		return synchCallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchCallType_Dest() {
		return (EAttribute)synchCallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskActivityGraph() {
		return taskActivityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskActivityGraph_ReplyEntry() {
		return (EReference)taskActivityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType() {
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_ResultTask() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_ServiceTimeDistribution() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_FanOut() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_FanIn() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Entry() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Service() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_TaskActivities() {
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActivityGraph() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Initially() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Multiplicity() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Name() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Priority() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_QueueLength() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Replication() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Scheduling() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ThinkTime() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallOrderType() {
		return callOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRWLockType() {
		return rwLockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingType() {
		return schedulingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemaphoreType() {
		return semaphoreTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskOptionType() {
		return taskOptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskSchedulingType() {
		return taskSchedulingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidType() {
		return validTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCallOrderTypeObject() {
		return callOrderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectFromType() {
		return connectFromTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectToType() {
		return connectToTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtVariable() {
		return extVariableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPhaseType() {
		return phaseTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRWLockTypeObject() {
		return rwLockTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSchedulingTypeObject() {
		return schedulingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSemaphoreTypeObject() {
		return semaphoreTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSrvnFloat() {
		return srvnFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSrvnNonNegativeInteger() {
		return srvnNonNegativeIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaskOptionTypeObject() {
		return taskOptionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaskSchedulingTypeObject() {
		return taskSchedulingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValidTypeObject() {
		return validTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnFactory getLqnFactory() {
		return (LqnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityDefBaseEClass = createEClass(ACTIVITY_DEF_BASE);
		createEReference(activityDefBaseEClass, ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION);
		createEReference(activityDefBaseEClass, ACTIVITY_DEF_BASE__RESULT_ACTIVITY);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__CALL_ORDER);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__MAX_SERVICE_TIME);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__NAME);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__THINK_TIME);

		activityDefTypeEClass = createEClass(ACTIVITY_DEF_TYPE);
		createEReference(activityDefTypeEClass, ACTIVITY_DEF_TYPE__CALL_LIST);
		createEAttribute(activityDefTypeEClass, ACTIVITY_DEF_TYPE__GROUP);
		createEReference(activityDefTypeEClass, ACTIVITY_DEF_TYPE__SYNCH_CALL);
		createEReference(activityDefTypeEClass, ACTIVITY_DEF_TYPE__ASYNCH_CALL);
		createEAttribute(activityDefTypeEClass, ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY);

		activityGraphBaseEClass = createEClass(ACTIVITY_GRAPH_BASE);
		createEReference(activityGraphBaseEClass, ACTIVITY_GRAPH_BASE__ACTIVITY);
		createEReference(activityGraphBaseEClass, ACTIVITY_GRAPH_BASE__PRECEDENCE);

		activityListTypeEClass = createEClass(ACTIVITY_LIST_TYPE);
		createEReference(activityListTypeEClass, ACTIVITY_LIST_TYPE__ACTIVITY);

		activityLoopListTypeEClass = createEClass(ACTIVITY_LOOP_LIST_TYPE);
		createEReference(activityLoopListTypeEClass, ACTIVITY_LOOP_LIST_TYPE__ACTIVITY);
		createEAttribute(activityLoopListTypeEClass, ACTIVITY_LOOP_LIST_TYPE__END);

		activityLoopTypeEClass = createEClass(ACTIVITY_LOOP_TYPE);
		createEAttribute(activityLoopTypeEClass, ACTIVITY_LOOP_TYPE__COUNT);

		activityMakingCallTypeEClass = createEClass(ACTIVITY_MAKING_CALL_TYPE);
		createEAttribute(activityMakingCallTypeEClass, ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN);

		activityOrTypeEClass = createEClass(ACTIVITY_OR_TYPE);
		createEAttribute(activityOrTypeEClass, ACTIVITY_OR_TYPE__PROB);

		activityPhasesTypeEClass = createEClass(ACTIVITY_PHASES_TYPE);
		createEReference(activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__CALL_LIST);
		createEAttribute(activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__GROUP);
		createEReference(activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__SYNCH_CALL);
		createEReference(activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__ASYNCH_CALL);
		createEAttribute(activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__PHASE);

		activityTypeEClass = createEClass(ACTIVITY_TYPE);
		createEAttribute(activityTypeEClass, ACTIVITY_TYPE__NAME);

		andJoinListTypeEClass = createEClass(AND_JOIN_LIST_TYPE);
		createEReference(andJoinListTypeEClass, AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY);
		createEReference(andJoinListTypeEClass, AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION);
		createEReference(andJoinListTypeEClass, AND_JOIN_LIST_TYPE__ACTIVITY);
		createEAttribute(andJoinListTypeEClass, AND_JOIN_LIST_TYPE__QUORUM);

		asynchCallTypeEClass = createEClass(ASYNCH_CALL_TYPE);
		createEAttribute(asynchCallTypeEClass, ASYNCH_CALL_TYPE__DEST);

		bindTypeEClass = createEClass(BIND_TYPE);
		createEReference(bindTypeEClass, BIND_TYPE__PARAMETER);
		createEReference(bindTypeEClass, BIND_TYPE__PROCESSOR_BINDING);
		createEReference(bindTypeEClass, BIND_TYPE__PORT_BINDING);

		callListTypeEClass = createEClass(CALL_LIST_TYPE);
		createEReference(callListTypeEClass, CALL_LIST_TYPE__SYNCH_CALL);
		createEReference(callListTypeEClass, CALL_LIST_TYPE__ASYNCH_CALL);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LQN_CORE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LQN_MODEL);

		entryActivityDefTypeEClass = createEClass(ENTRY_ACTIVITY_DEF_TYPE);
		createEReference(entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST);
		createEAttribute(entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__GROUP);
		createEReference(entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL);
		createEReference(entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL);
		createEAttribute(entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY);

		entryActivityGraphEClass = createEClass(ENTRY_ACTIVITY_GRAPH);
		createEReference(entryActivityGraphEClass, ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY);

		entryMakingCallTypeEClass = createEClass(ENTRY_MAKING_CALL_TYPE);
		createEAttribute(entryMakingCallTypeEClass, ENTRY_MAKING_CALL_TYPE__PROB);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEReference(entryTypeEClass, ENTRY_TYPE__RESULT_ENTRY);
		createEReference(entryTypeEClass, ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION);
		createEReference(entryTypeEClass, ENTRY_TYPE__FORWARDING);
		createEReference(entryTypeEClass, ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH);
		createEReference(entryTypeEClass, ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__NAME);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__OPEN_ARRIVAL_RATE);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__PRIORITY);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__RWLOCK);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__SEMAPHORE);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__TYPE);

		fanInTypeEClass = createEClass(FAN_IN_TYPE);
		createEAttribute(fanInTypeEClass, FAN_IN_TYPE__SOURCE);
		createEAttribute(fanInTypeEClass, FAN_IN_TYPE__VALUE);

		fanOutTypeEClass = createEClass(FAN_OUT_TYPE);
		createEAttribute(fanOutTypeEClass, FAN_OUT_TYPE__DEST);
		createEAttribute(fanOutTypeEClass, FAN_OUT_TYPE__VALUE);

		firstPlotTypeEClass = createEClass(FIRST_PLOT_TYPE);
		createEAttribute(firstPlotTypeEClass, FIRST_PLOT_TYPE__VARIABLE);

		groupTypeEClass = createEClass(GROUP_TYPE);
		createEReference(groupTypeEClass, GROUP_TYPE__RESULT_GROUP);
		createEReference(groupTypeEClass, GROUP_TYPE__TASK);
		createEAttribute(groupTypeEClass, GROUP_TYPE__CAP);
		createEAttribute(groupTypeEClass, GROUP_TYPE__NAME);
		createEAttribute(groupTypeEClass, GROUP_TYPE__SHARE);

		histogramBinTypeEClass = createEClass(HISTOGRAM_BIN_TYPE);
		createEAttribute(histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__BEGIN);
		createEAttribute(histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__CONF95);
		createEAttribute(histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__CONF99);
		createEAttribute(histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__END);
		createEAttribute(histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__PROB);

		inPortTypeEClass = createEClass(IN_PORT_TYPE);
		createEAttribute(inPortTypeEClass, IN_PORT_TYPE__CONNECT_FROM);
		createEAttribute(inPortTypeEClass, IN_PORT_TYPE__DESCRIPTION);
		createEAttribute(inPortTypeEClass, IN_PORT_TYPE__NAME);

		interfaceTypeEClass = createEClass(INTERFACE_TYPE);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__IN_PORT);
		createEReference(interfaceTypeEClass, INTERFACE_TYPE__OUT_PORT);

		lqnCoreTypeEClass = createEClass(LQN_CORE_TYPE);
		createEReference(lqnCoreTypeEClass, LQN_CORE_TYPE__PROCESSOR);
		createEReference(lqnCoreTypeEClass, LQN_CORE_TYPE__SLOT);

		lqnModelTypeEClass = createEClass(LQN_MODEL_TYPE);
		createEReference(lqnModelTypeEClass, LQN_MODEL_TYPE__RUN_CONTROL);
		createEReference(lqnModelTypeEClass, LQN_MODEL_TYPE__PLOT_CONTROL);
		createEReference(lqnModelTypeEClass, LQN_MODEL_TYPE__SOLVER_PARAMS);
		createEReference(lqnModelTypeEClass, LQN_MODEL_TYPE__PROCESSOR);
		createEReference(lqnModelTypeEClass, LQN_MODEL_TYPE__SLOT);
		createEAttribute(lqnModelTypeEClass, LQN_MODEL_TYPE__LQX);
		createEAttribute(lqnModelTypeEClass, LQN_MODEL_TYPE__DESCRIPTION);
		createEAttribute(lqnModelTypeEClass, LQN_MODEL_TYPE__LQN_SCHEMA_VERSION);
		createEAttribute(lqnModelTypeEClass, LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION);
		createEAttribute(lqnModelTypeEClass, LQN_MODEL_TYPE__NAME);
		createEAttribute(lqnModelTypeEClass, LQN_MODEL_TYPE__XML_DEBUG);

		makingCallTypeEClass = createEClass(MAKING_CALL_TYPE);
		createEReference(makingCallTypeEClass, MAKING_CALL_TYPE__RESULT_CALL);
		createEAttribute(makingCallTypeEClass, MAKING_CALL_TYPE__DEST);

		mvaInfoTypeEClass = createEClass(MVA_INFO_TYPE);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__CORE);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__FAULTS);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__STEP);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__STEP_SQUARED);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__SUBMODELS);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__WAIT);
		createEAttribute(mvaInfoTypeEClass, MVA_INFO_TYPE__WAIT_SQUARED);

		orListTypeEClass = createEClass(OR_LIST_TYPE);
		createEReference(orListTypeEClass, OR_LIST_TYPE__ACTIVITY);

		outPortTypeEClass = createEClass(OUT_PORT_TYPE);
		createEAttribute(outPortTypeEClass, OUT_PORT_TYPE__CONNECT_TO);
		createEAttribute(outPortTypeEClass, OUT_PORT_TYPE__DESCRIPTION);
		createEAttribute(outPortTypeEClass, OUT_PORT_TYPE__NAME);

		outputDistributionTypeEClass = createEClass(OUTPUT_DISTRIBUTION_TYPE);
		createEReference(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN);
		createEReference(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN);
		createEReference(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__KURTOSIS);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MAX);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MEAN);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MID_POINT);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MIN);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__SKEW);
		createEAttribute(outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__STD_DEV);

		outputEntryDistributionTypeEClass = createEClass(OUTPUT_ENTRY_DISTRIBUTION_TYPE);
		createEAttribute(outputEntryDistributionTypeEClass, OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE);

		outputResultJoinDelayTypeEClass = createEClass(OUTPUT_RESULT_JOIN_DELAY_TYPE);
		createEReference(outputResultJoinDelayTypeEClass, OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95);
		createEReference(outputResultJoinDelayTypeEClass, OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99);
		createEAttribute(outputResultJoinDelayTypeEClass, OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE);
		createEAttribute(outputResultJoinDelayTypeEClass, OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING);

		outputResultTypeEClass = createEClass(OUTPUT_RESULT_TYPE);
		createEReference(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RESULT_CONF95);
		createEReference(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RESULT_CONF99);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__LOSS_PROBABILITY);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PROC_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__PROC_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__SERVICE_TIME);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__THROUGHPUT);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__UTILIZATION);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__WAITING);
		createEAttribute(outputResultTypeEClass, OUTPUT_RESULT_TYPE__WAITING_VARIANCE);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);

		paraTypeEClass = createEClass(PARA_TYPE);
		createEAttribute(paraTypeEClass, PARA_TYPE__START_VALUE);
		createEAttribute(paraTypeEClass, PARA_TYPE__END_VALUE);
		createEAttribute(paraTypeEClass, PARA_TYPE__STEP_VALUE);
		createEAttribute(paraTypeEClass, PARA_TYPE__VALUE);

		phaseActivitiesEClass = createEClass(PHASE_ACTIVITIES);
		createEReference(phaseActivitiesEClass, PHASE_ACTIVITIES__ACTIVITY);

		plotControlTypeEClass = createEClass(PLOT_CONTROL_TYPE);
		createEReference(plotControlTypeEClass, PLOT_CONTROL_TYPE__FIRST_PLOT);
		createEReference(plotControlTypeEClass, PLOT_CONTROL_TYPE__PLOT);

		plotTypeEClass = createEClass(PLOT_TYPE);
		createEAttribute(plotTypeEClass, PLOT_TYPE__VARIABLE);

		portBindingTypeEClass = createEClass(PORT_BINDING_TYPE);
		createEAttribute(portBindingTypeEClass, PORT_BINDING_TYPE__SOURCE);
		createEAttribute(portBindingTypeEClass, PORT_BINDING_TYPE__TARGET);

		pragmaTypeEClass = createEClass(PRAGMA_TYPE);
		createEAttribute(pragmaTypeEClass, PRAGMA_TYPE__PARAM);
		createEAttribute(pragmaTypeEClass, PRAGMA_TYPE__VALUE);

		precedenceTypeEClass = createEClass(PRECEDENCE_TYPE);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__PRE);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__PRE_OR);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__PRE_AND);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__POST);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__POST_OR);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__POST_AND);
		createEReference(precedenceTypeEClass, PRECEDENCE_TYPE__POST_LOOP);

		processorBindingTypeEClass = createEClass(PROCESSOR_BINDING_TYPE);
		createEAttribute(processorBindingTypeEClass, PROCESSOR_BINDING_TYPE__SOURCE);
		createEAttribute(processorBindingTypeEClass, PROCESSOR_BINDING_TYPE__TARGET);

		processorTypeEClass = createEClass(PROCESSOR_TYPE);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__RESULT_PROCESSOR);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__GROUP);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__TASK);
		createEAttribute(processorTypeEClass, PROCESSOR_TYPE__MULTIPLICITY);
		createEAttribute(processorTypeEClass, PROCESSOR_TYPE__NAME);
		createEAttribute(processorTypeEClass, PROCESSOR_TYPE__QUANTUM);
		createEAttribute(processorTypeEClass, PROCESSOR_TYPE__REPLICATION);
		createEAttribute(processorTypeEClass, PROCESSOR_TYPE__SCHEDULING);
		createEAttribute(processorTypeEClass, PROCESSOR_TYPE__SPEED_FACTOR);

		replyActivityTypeEClass = createEClass(REPLY_ACTIVITY_TYPE);
		createEAttribute(replyActivityTypeEClass, REPLY_ACTIVITY_TYPE__NAME);

		replyEntryTypeEClass = createEClass(REPLY_ENTRY_TYPE);
		createEReference(replyEntryTypeEClass, REPLY_ENTRY_TYPE__REPLY_ACTIVITY);
		createEAttribute(replyEntryTypeEClass, REPLY_ENTRY_TYPE__NAME);

		resultConf95TypeEClass = createEClass(RESULT_CONF95_TYPE);
		createEAttribute(resultConf95TypeEClass, RESULT_CONF95_TYPE__JOIN_VARIANCE);
		createEAttribute(resultConf95TypeEClass, RESULT_CONF95_TYPE__JOIN_WAITING);

		resultConf95Type1EClass = createEClass(RESULT_CONF95_TYPE1);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__LOSS_PROBABILITY);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__OPEN_WAIT_TIME);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_WAITING_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_WAITING_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_WAITING_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PROC_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__PROC_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_READER_HOLDING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_READER_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_WRITER_HOLDING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_WRITER_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__SEMAPHORE_UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__SEMAPHORE_WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__SEMAPHORE_WAITING_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__SERVICE_TIME);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__THROUGHPUT);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__THROUGHPUT_BOUND);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__UTILIZATION);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__WAITING);
		createEAttribute(resultConf95Type1EClass, RESULT_CONF95_TYPE1__WAITING_VARIANCE);

		resultConf99TypeEClass = createEClass(RESULT_CONF99_TYPE);
		createEAttribute(resultConf99TypeEClass, RESULT_CONF99_TYPE__JOIN_VARIANCE);
		createEAttribute(resultConf99TypeEClass, RESULT_CONF99_TYPE__JOIN_WAITING);

		resultConf99Type1EClass = createEClass(RESULT_CONF99_TYPE1);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__LOSS_PROBABILITY);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__OPEN_WAIT_TIME);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PROC_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__PROC_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__SEMAPHORE_WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__SERVICE_TIME);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__THROUGHPUT);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__THROUGHPUT_BOUND);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__UTILIZATION);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__WAITING);
		createEAttribute(resultConf99Type1EClass, RESULT_CONF99_TYPE1__WAITING_VARIANCE);

		resultGeneralTypeEClass = createEClass(RESULT_GENERAL_TYPE);
		createEReference(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__MVA_INFO);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__CONV_VAL);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__ELAPSED_TIME);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__ITERATIONS);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__PLATFORM_INFO);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__SOLVER_INFO);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__USER_CPU_TIME);
		createEAttribute(resultGeneralTypeEClass, RESULT_GENERAL_TYPE__VALID);

		runControlTypeEClass = createEClass(RUN_CONTROL_TYPE);
		createEReference(runControlTypeEClass, RUN_CONTROL_TYPE__PARA);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__NAME);

		singleActivityListTypeEClass = createEClass(SINGLE_ACTIVITY_LIST_TYPE);
		createEReference(singleActivityListTypeEClass, SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY);

		slotTypeEClass = createEClass(SLOT_TYPE);
		createEReference(slotTypeEClass, SLOT_TYPE__INTERFACE);
		createEReference(slotTypeEClass, SLOT_TYPE__BINDING);
		createEAttribute(slotTypeEClass, SLOT_TYPE__BIND_TARGET);
		createEAttribute(slotTypeEClass, SLOT_TYPE__ID);
		createEAttribute(slotTypeEClass, SLOT_TYPE__REPLIC_NUM);

		solverParamsTypeEClass = createEClass(SOLVER_PARAMS_TYPE);
		createEReference(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__RESULT_GENERAL);
		createEReference(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__PRAGMA);
		createEAttribute(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__COMMENT);
		createEAttribute(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__CONV_VAL);
		createEAttribute(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__IT_LIMIT);
		createEAttribute(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__PRINT_INT);
		createEAttribute(solverParamsTypeEClass, SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF);

		synchCallTypeEClass = createEClass(SYNCH_CALL_TYPE);
		createEAttribute(synchCallTypeEClass, SYNCH_CALL_TYPE__DEST);

		taskActivityGraphEClass = createEClass(TASK_ACTIVITY_GRAPH);
		createEReference(taskActivityGraphEClass, TASK_ACTIVITY_GRAPH__REPLY_ENTRY);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEReference(taskTypeEClass, TASK_TYPE__RESULT_TASK);
		createEReference(taskTypeEClass, TASK_TYPE__SERVICE_TIME_DISTRIBUTION);
		createEReference(taskTypeEClass, TASK_TYPE__FAN_OUT);
		createEReference(taskTypeEClass, TASK_TYPE__FAN_IN);
		createEReference(taskTypeEClass, TASK_TYPE__ENTRY);
		createEReference(taskTypeEClass, TASK_TYPE__SERVICE);
		createEReference(taskTypeEClass, TASK_TYPE__TASK_ACTIVITIES);
		createEAttribute(taskTypeEClass, TASK_TYPE__ACTIVITY_GRAPH);
		createEAttribute(taskTypeEClass, TASK_TYPE__INITIALLY);
		createEAttribute(taskTypeEClass, TASK_TYPE__MULTIPLICITY);
		createEAttribute(taskTypeEClass, TASK_TYPE__NAME);
		createEAttribute(taskTypeEClass, TASK_TYPE__PRIORITY);
		createEAttribute(taskTypeEClass, TASK_TYPE__QUEUE_LENGTH);
		createEAttribute(taskTypeEClass, TASK_TYPE__REPLICATION);
		createEAttribute(taskTypeEClass, TASK_TYPE__SCHEDULING);
		createEAttribute(taskTypeEClass, TASK_TYPE__THINK_TIME);

		// Create enums
		callOrderTypeEEnum = createEEnum(CALL_ORDER_TYPE);
		rwLockTypeEEnum = createEEnum(RW_LOCK_TYPE);
		schedulingTypeEEnum = createEEnum(SCHEDULING_TYPE);
		semaphoreTypeEEnum = createEEnum(SEMAPHORE_TYPE);
		taskOptionTypeEEnum = createEEnum(TASK_OPTION_TYPE);
		taskSchedulingTypeEEnum = createEEnum(TASK_SCHEDULING_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);
		validTypeEEnum = createEEnum(VALID_TYPE);

		// Create data types
		callOrderTypeObjectEDataType = createEDataType(CALL_ORDER_TYPE_OBJECT);
		connectFromTypeEDataType = createEDataType(CONNECT_FROM_TYPE);
		connectToTypeEDataType = createEDataType(CONNECT_TO_TYPE);
		extVariableEDataType = createEDataType(EXT_VARIABLE);
		phaseTypeEDataType = createEDataType(PHASE_TYPE);
		rwLockTypeObjectEDataType = createEDataType(RW_LOCK_TYPE_OBJECT);
		schedulingTypeObjectEDataType = createEDataType(SCHEDULING_TYPE_OBJECT);
		semaphoreTypeObjectEDataType = createEDataType(SEMAPHORE_TYPE_OBJECT);
		srvnFloatEDataType = createEDataType(SRVN_FLOAT);
		srvnNonNegativeIntegerEDataType = createEDataType(SRVN_NON_NEGATIVE_INTEGER);
		taskOptionTypeObjectEDataType = createEDataType(TASK_OPTION_TYPE_OBJECT);
		taskSchedulingTypeObjectEDataType = createEDataType(TASK_SCHEDULING_TYPE_OBJECT);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
		validTypeObjectEDataType = createEDataType(VALID_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityDefTypeEClass.getESuperTypes().add(this.getActivityDefBase());
		activityLoopTypeEClass.getESuperTypes().add(this.getActivityType());
		activityMakingCallTypeEClass.getESuperTypes().add(this.getMakingCallType());
		activityOrTypeEClass.getESuperTypes().add(this.getActivityType());
		activityPhasesTypeEClass.getESuperTypes().add(this.getActivityDefBase());
		entryActivityDefTypeEClass.getESuperTypes().add(this.getActivityDefBase());
		entryActivityGraphEClass.getESuperTypes().add(this.getActivityGraphBase());
		entryMakingCallTypeEClass.getESuperTypes().add(this.getMakingCallType());
		outputEntryDistributionTypeEClass.getESuperTypes().add(this.getOutputDistributionType());
		taskActivityGraphEClass.getESuperTypes().add(this.getActivityGraphBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityDefBaseEClass, ActivityDefBase.class, "ActivityDefBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityDefBase_ServiceTimeDistribution(), this.getOutputDistributionType(), null, "serviceTimeDistribution", null, 0, -1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDefBase_ResultActivity(), this.getOutputResultType(), null, "resultActivity", null, 0, -1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_CallOrder(), this.getCallOrderType(), "callOrder", "STOCHASTIC", 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_HostDemandCvsq(), this.getSrvnFloat(), "hostDemandCvsq", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_HostDemandMean(), this.getSrvnFloat(), "hostDemandMean", null, 1, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_MaxServiceTime(), this.getSrvnFloat(), "maxServiceTime", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_ThinkTime(), this.getSrvnFloat(), "thinkTime", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityDefTypeEClass, ActivityDefType.class, "ActivityDefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityDefType_CallList(), this.getCallListType(), null, "callList", null, 0, -1, ActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDefType_SynchCall(), this.getActivityMakingCallType(), null, "synchCall", null, 0, -1, ActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDefType_AsynchCall(), this.getActivityMakingCallType(), null, "asynchCall", null, 0, -1, ActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefType_BoundToEntry(), theXMLTypePackage.getString(), "boundToEntry", null, 0, 1, ActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityGraphBaseEClass, ActivityGraphBase.class, "ActivityGraphBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGraphBase_Activity(), this.getActivityDefType(), null, "activity", null, 1, -1, ActivityGraphBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGraphBase_Precedence(), this.getPrecedenceType(), null, "precedence", null, 0, -1, ActivityGraphBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityListTypeEClass, ActivityListType.class, "ActivityListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityListType_Activity(), this.getActivityType(), null, "activity", null, 1, -1, ActivityListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityLoopListTypeEClass, ActivityLoopListType.class, "ActivityLoopListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityLoopListType_Activity(), this.getActivityLoopType(), null, "activity", null, 1, -1, ActivityLoopListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityLoopListType_End(), theXMLTypePackage.getString(), "end", null, 0, 1, ActivityLoopListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityLoopTypeEClass, ActivityLoopType.class, "ActivityLoopType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityLoopType_Count(), this.getSrvnFloat(), "count", null, 1, 1, ActivityLoopType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityMakingCallTypeEClass, ActivityMakingCallType.class, "ActivityMakingCallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityMakingCallType_CallsMean(), this.getSrvnFloat(), "callsMean", null, 1, 1, ActivityMakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityOrTypeEClass, ActivityOrType.class, "ActivityOrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityOrType_Prob(), theXMLTypePackage.getString(), "prob", "1", 0, 1, ActivityOrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityPhasesTypeEClass, ActivityPhasesType.class, "ActivityPhasesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityPhasesType_CallList(), this.getCallListType(), null, "callList", null, 0, -1, ActivityPhasesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityPhasesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ActivityPhasesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPhasesType_SynchCall(), this.getActivityMakingCallType(), null, "synchCall", null, 0, -1, ActivityPhasesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPhasesType_AsynchCall(), this.getActivityMakingCallType(), null, "asynchCall", null, 0, -1, ActivityPhasesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityPhasesType_Phase(), this.getPhaseType(), "phase", null, 1, 1, ActivityPhasesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityTypeEClass, ActivityType.class, "ActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andJoinListTypeEClass, AndJoinListType.class, "AndJoinListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndJoinListType_ResultJoinDelay(), this.getOutputResultJoinDelayType(), null, "resultJoinDelay", null, 0, -1, AndJoinListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndJoinListType_ServiceTimeDistribution(), this.getOutputDistributionType(), null, "serviceTimeDistribution", null, 0, -1, AndJoinListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndJoinListType_Activity(), this.getActivityType(), null, "activity", null, 1, -1, AndJoinListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndJoinListType_Quorum(), theXMLTypePackage.getNonNegativeInteger(), "quorum", "0", 0, 1, AndJoinListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchCallTypeEClass, AsynchCallType.class, "AsynchCallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsynchCallType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1, AsynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindTypeEClass, BindType.class, "BindType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, BindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindType_ProcessorBinding(), this.getProcessorBindingType(), null, "processorBinding", null, 0, -1, BindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindType_PortBinding(), this.getPortBindingType(), null, "portBinding", null, 0, -1, BindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callListTypeEClass, CallListType.class, "CallListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallListType_SynchCall(), this.getSynchCallType(), null, "synchCall", null, 0, -1, CallListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallListType_AsynchCall(), this.getAsynchCallType(), null, "asynchCall", null, 0, -1, CallListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LqnCore(), this.getLqnCoreType(), null, "lqnCore", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LqnModel(), this.getLqnModelType(), null, "lqnModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entryActivityDefTypeEClass, EntryActivityDefType.class, "EntryActivityDefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryActivityDefType_CallList(), this.getCallListType(), null, "callList", null, 0, -1, EntryActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryActivityDefType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EntryActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryActivityDefType_SynchCall(), this.getActivityMakingCallType(), null, "synchCall", null, 0, -1, EntryActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntryActivityDefType_AsynchCall(), this.getActivityMakingCallType(), null, "asynchCall", null, 0, -1, EntryActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryActivityDefType_FirstActivity(), theXMLTypePackage.getString(), "firstActivity", null, 0, 1, EntryActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryActivityGraphEClass, EntryActivityGraph.class, "EntryActivityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryActivityGraph_ReplyActivity(), this.getReplyActivityType(), null, "replyActivity", null, 1, -1, EntryActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryMakingCallTypeEClass, EntryMakingCallType.class, "EntryMakingCallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryMakingCallType_Prob(), this.getSrvnFloat(), "prob", null, 1, 1, EntryMakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType_ResultEntry(), this.getOutputResultType(), null, "resultEntry", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_ServiceTimeDistribution(), this.getOutputEntryDistributionType(), null, "serviceTimeDistribution", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Forwarding(), this.getEntryMakingCallType(), null, "forwarding", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_EntryActivityGraph(), this.getEntryActivityGraph(), null, "entryActivityGraph", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_EntryPhaseActivities(), this.getPhaseActivities(), null, "entryPhaseActivities", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_OpenArrivalRate(), this.getSrvnFloat(), "openArrivalRate", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Priority(), theXMLTypePackage.getInt(), "priority", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Rwlock(), this.getRWLockType(), "rwlock", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Semaphore(), this.getSemaphoreType(), "semaphore", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Type(), this.getTypeType(), "type", null, 1, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fanInTypeEClass, FanInType.class, "FanInType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFanInType_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, FanInType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFanInType_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 1, 1, FanInType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fanOutTypeEClass, FanOutType.class, "FanOutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFanOutType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1, FanOutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFanOutType_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 1, 1, FanOutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firstPlotTypeEClass, FirstPlotType.class, "FirstPlotType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstPlotType_Variable(), theXMLTypePackage.getString(), "variable", null, 0, 1, FirstPlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupTypeEClass, GroupType.class, "GroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupType_ResultGroup(), this.getOutputResultType(), null, "resultGroup", null, 0, -1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupType_Task(), this.getTaskType(), null, "task", null, 1, -1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Cap(), theXMLTypePackage.getBoolean(), "cap", "false", 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupType_Share(), this.getSrvnFloat(), "share", null, 1, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramBinTypeEClass, HistogramBinType.class, "HistogramBinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistogramBinType_Begin(), theXMLTypePackage.getDouble(), "begin", null, 1, 1, HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramBinType_Conf95(), theXMLTypePackage.getDouble(), "conf95", null, 0, 1, HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramBinType_Conf99(), theXMLTypePackage.getDouble(), "conf99", null, 0, 1, HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramBinType_End(), theXMLTypePackage.getDouble(), "end", null, 0, 1, HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramBinType_Prob(), theXMLTypePackage.getDouble(), "prob", null, 1, 1, HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inPortTypeEClass, InPortType.class, "InPortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInPortType_ConnectFrom(), this.getConnectFromType(), "connectFrom", null, 0, 1, InPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInPortType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, InPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInPortType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, InPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceTypeEClass, InterfaceType.class, "InterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceType_InPort(), this.getInPortType(), null, "inPort", null, 0, -1, InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceType_OutPort(), this.getOutPortType(), null, "outPort", null, 0, -1, InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lqnCoreTypeEClass, LqnCoreType.class, "LqnCoreType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLqnCoreType_Processor(), this.getProcessorType(), null, "processor", null, 1, -1, LqnCoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLqnCoreType_Slot(), this.getSlotType(), null, "slot", null, 0, -1, LqnCoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lqnModelTypeEClass, LqnModelType.class, "LqnModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLqnModelType_RunControl(), this.getRunControlType(), null, "runControl", null, 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLqnModelType_PlotControl(), this.getPlotControlType(), null, "plotControl", null, 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLqnModelType_SolverParams(), this.getSolverParamsType(), null, "solverParams", null, 1, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLqnModelType_Processor(), this.getProcessorType(), null, "processor", null, 1, -1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLqnModelType_Slot(), this.getSlotType(), null, "slot", null, 0, -1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModelType_Lqx(), theXMLTypePackage.getString(), "lqx", null, 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModelType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModelType_LqnSchemaVersion(), theXMLTypePackage.getDecimal(), "lqnSchemaVersion", "1.0", 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModelType_LqncoreSchemaVersion(), theXMLTypePackage.getDecimal(), "lqncoreSchemaVersion", "1.1", 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModelType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModelType_XmlDebug(), theXMLTypePackage.getBoolean(), "xmlDebug", null, 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makingCallTypeEClass, MakingCallType.class, "MakingCallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMakingCallType_ResultCall(), this.getOutputResultType(), null, "resultCall", null, 0, -1, MakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMakingCallType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1, MakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mvaInfoTypeEClass, MvaInfoType.class, "MvaInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMvaInfoType_Core(), theXMLTypePackage.getNonNegativeInteger(), "core", null, 1, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMvaInfoType_Faults(), theXMLTypePackage.getNonNegativeInteger(), "faults", null, 0, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMvaInfoType_Step(), theXMLTypePackage.getDouble(), "step", null, 1, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMvaInfoType_StepSquared(), theXMLTypePackage.getDouble(), "stepSquared", null, 0, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMvaInfoType_Submodels(), theXMLTypePackage.getNonNegativeInteger(), "submodels", null, 1, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMvaInfoType_Wait(), theXMLTypePackage.getDouble(), "wait", null, 1, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMvaInfoType_WaitSquared(), theXMLTypePackage.getDouble(), "waitSquared", null, 0, 1, MvaInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orListTypeEClass, OrListType.class, "OrListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrListType_Activity(), this.getActivityOrType(), null, "activity", null, 1, -1, OrListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outPortTypeEClass, OutPortType.class, "OutPortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutPortType_ConnectTo(), this.getConnectToType(), "connectTo", null, 0, 1, OutPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutPortType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, OutPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutPortType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OutPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDistributionTypeEClass, OutputDistributionType.class, "OutputDistributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputDistributionType_UnderflowBin(), this.getHistogramBinType(), null, "underflowBin", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDistributionType_HistogramBin(), this.getHistogramBinType(), null, "histogramBin", null, 0, -1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDistributionType_OverflowBin(), this.getHistogramBinType(), null, "overflowBin", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_BinSize(), theXMLTypePackage.getDouble(), "binSize", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_Kurtosis(), theXMLTypePackage.getDouble(), "kurtosis", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_Max(), theXMLTypePackage.getDouble(), "max", null, 1, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_Mean(), theXMLTypePackage.getDouble(), "mean", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_MidPoint(), theXMLTypePackage.getDouble(), "midPoint", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_Min(), theXMLTypePackage.getDouble(), "min", null, 1, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_NumberBins(), theXMLTypePackage.getNonNegativeInteger(), "numberBins", "20", 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_Skew(), theXMLTypePackage.getDouble(), "skew", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputDistributionType_StdDev(), theXMLTypePackage.getDouble(), "stdDev", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEntryDistributionTypeEClass, OutputEntryDistributionType.class, "OutputEntryDistributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputEntryDistributionType_Phase(), theXMLTypePackage.getNonNegativeInteger(), "phase", null, 1, 1, OutputEntryDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputResultJoinDelayTypeEClass, OutputResultJoinDelayType.class, "OutputResultJoinDelayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputResultJoinDelayType_ResultConf95(), this.getResultConf95Type(), null, "resultConf95", null, 0, 1, OutputResultJoinDelayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputResultJoinDelayType_ResultConf99(), this.getResultConf99Type(), null, "resultConf99", null, 0, 1, OutputResultJoinDelayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultJoinDelayType_JoinVariance(), theXMLTypePackage.getDouble(), "joinVariance", null, 0, 1, OutputResultJoinDelayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultJoinDelayType_JoinWaiting(), theXMLTypePackage.getDouble(), "joinWaiting", null, 0, 1, OutputResultJoinDelayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputResultTypeEClass, OutputResultType.class, "OutputResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputResultType_ResultConf95(), this.getResultConf95Type1(), null, "resultConf95", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputResultType_ResultConf99(), this.getResultConf99Type1(), null, "resultConf99", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_LossProbability(), theXMLTypePackage.getDouble(), "lossProbability", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_OpenWaitTime(), theXMLTypePackage.getDouble(), "openWaitTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase1ProcWaiting(), theXMLTypePackage.getDouble(), "phase1ProcWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase1ServiceTime(), theXMLTypePackage.getDouble(), "phase1ServiceTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase1ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase1ServiceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase1Utilization(), theXMLTypePackage.getDouble(), "phase1Utilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase1Waiting(), theXMLTypePackage.getDouble(), "phase1Waiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase1WaitingVariance(), theXMLTypePackage.getDouble(), "phase1WaitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase2ProcWaiting(), theXMLTypePackage.getDouble(), "phase2ProcWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase2ServiceTime(), theXMLTypePackage.getDouble(), "phase2ServiceTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase2ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase2ServiceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase2Utilization(), theXMLTypePackage.getDouble(), "phase2Utilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase2Waiting(), theXMLTypePackage.getDouble(), "phase2Waiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase2WaitingVariance(), theXMLTypePackage.getDouble(), "phase2WaitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase3ProcWaiting(), theXMLTypePackage.getDouble(), "phase3ProcWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase3ServiceTime(), theXMLTypePackage.getDouble(), "phase3ServiceTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase3ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase3ServiceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase3Utilization(), theXMLTypePackage.getDouble(), "phase3Utilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase3Waiting(), theXMLTypePackage.getDouble(), "phase3Waiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Phase3WaitingVariance(), theXMLTypePackage.getDouble(), "phase3WaitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_ProbExceedMaxServiceTime(), theXMLTypePackage.getDouble(), "probExceedMaxServiceTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_ProcUtilization(), theXMLTypePackage.getDouble(), "procUtilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_ProcWaiting(), theXMLTypePackage.getDouble(), "procWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockReaderHolding(), theXMLTypePackage.getDouble(), "rwlockReaderHolding", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockReaderUtilization(), theXMLTypePackage.getDouble(), "rwlockReaderUtilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockReaderWaiting(), theXMLTypePackage.getDouble(), "rwlockReaderWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockReaderWaitingVariance(), theXMLTypePackage.getDouble(), "rwlockReaderWaitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockWriterHolding(), theXMLTypePackage.getDouble(), "rwlockWriterHolding", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockWriterUtilization(), theXMLTypePackage.getDouble(), "rwlockWriterUtilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockWriterWaiting(), theXMLTypePackage.getDouble(), "rwlockWriterWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_RwlockWriterWaitingVariance(), theXMLTypePackage.getDouble(), "rwlockWriterWaitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_SemaphoreUtilization(), theXMLTypePackage.getDouble(), "semaphoreUtilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_SemaphoreWaiting(), theXMLTypePackage.getDouble(), "semaphoreWaiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_SemaphoreWaitingVariance(), theXMLTypePackage.getDouble(), "semaphoreWaitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_ServiceTime(), theXMLTypePackage.getDouble(), "serviceTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_ServiceTimeVariance(), theXMLTypePackage.getDouble(), "serviceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_SquaredCoeffVariation(), theXMLTypePackage.getDouble(), "squaredCoeffVariation", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Throughput(), theXMLTypePackage.getDouble(), "throughput", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_ThroughputBound(), theXMLTypePackage.getDouble(), "throughputBound", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Utilization(), theXMLTypePackage.getDouble(), "utilization", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_Waiting(), theXMLTypePackage.getDouble(), "waiting", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputResultType_WaitingVariance(), theXMLTypePackage.getDouble(), "waitingVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paraTypeEClass, ParaType.class, "ParaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParaType_StartValue(), theXMLTypePackage.getInt(), "startValue", null, 0, 1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_EndValue(), theXMLTypePackage.getInt(), "endValue", null, 0, 1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_StepValue(), theXMLTypePackage.getInt(), "stepValue", null, 0, 1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_Value(), theXMLTypePackage.getInt(), "value", null, 0, -1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseActivitiesEClass, PhaseActivities.class, "PhaseActivities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhaseActivities_Activity(), this.getActivityPhasesType(), null, "activity", null, 1, 3, PhaseActivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plotControlTypeEClass, PlotControlType.class, "PlotControlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlotControlType_FirstPlot(), this.getFirstPlotType(), null, "firstPlot", null, 1, 1, PlotControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotControlType_Plot(), this.getPlotType(), null, "plot", null, 1, -1, PlotControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plotTypeEClass, PlotType.class, "PlotType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlotType_Variable(), theXMLTypePackage.getString(), "variable", null, 0, 1, PlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portBindingTypeEClass, PortBindingType.class, "PortBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortBindingType_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, PortBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBindingType_Target(), theXMLTypePackage.getString(), "target", null, 1, 1, PortBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pragmaTypeEClass, PragmaType.class, "PragmaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPragmaType_Param(), theXMLTypePackage.getString(), "param", null, 1, 1, PragmaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPragmaType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PragmaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceTypeEClass, PrecedenceType.class, "PrecedenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedenceType_Pre(), this.getSingleActivityListType(), null, "pre", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceType_PreOR(), this.getActivityListType(), null, "preOR", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceType_PreAND(), this.getAndJoinListType(), null, "preAND", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceType_Post(), this.getSingleActivityListType(), null, "post", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceType_PostOR(), this.getOrListType(), null, "postOR", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceType_PostAND(), this.getActivityListType(), null, "postAND", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceType_PostLOOP(), this.getActivityLoopListType(), null, "postLOOP", null, 0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorBindingTypeEClass, ProcessorBindingType.class, "ProcessorBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessorBindingType_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, ProcessorBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorBindingType_Target(), theXMLTypePackage.getString(), "target", null, 1, 1, ProcessorBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorTypeEClass, ProcessorType.class, "ProcessorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorType_ResultProcessor(), this.getOutputResultType(), null, "resultProcessor", null, 0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessorType_Group(), this.getGroupType(), null, "group", null, 0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessorType_Task(), this.getTaskType(), null, "task", null, 0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorType_Multiplicity(), this.getSrvnNonNegativeInteger(), "multiplicity", "1", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorType_Quantum(), this.getSrvnFloat(), "quantum", "0", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorType_Replication(), theXMLTypePackage.getNonNegativeInteger(), "replication", "1", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorType_Scheduling(), this.getSchedulingType(), "scheduling", "fcfs", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorType_SpeedFactor(), this.getSrvnFloat(), "speedFactor", "1", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replyActivityTypeEClass, ReplyActivityType.class, "ReplyActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplyActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ReplyActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replyEntryTypeEClass, ReplyEntryType.class, "ReplyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplyEntryType_ReplyActivity(), this.getReplyActivityType(), null, "replyActivity", null, 1, -1, ReplyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplyEntryType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ReplyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultConf95TypeEClass, ResultConf95Type.class, "ResultConf95Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultConf95Type_JoinVariance(), theXMLTypePackage.getDouble(), "joinVariance", null, 0, 1, ResultConf95Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type_JoinWaiting(), theXMLTypePackage.getDouble(), "joinWaiting", null, 0, 1, ResultConf95Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultConf95Type1EClass, ResultConf95Type1.class, "ResultConf95Type1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultConf95Type1_LossProbability(), theXMLTypePackage.getDouble(), "lossProbability", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_OpenWaitTime(), theXMLTypePackage.getDouble(), "openWaitTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase1ProcWaiting(), theXMLTypePackage.getDouble(), "phase1ProcWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase1ServiceTime(), theXMLTypePackage.getDouble(), "phase1ServiceTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase1ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase1ServiceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase1Utilization(), theXMLTypePackage.getDouble(), "phase1Utilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase1Waiting(), theXMLTypePackage.getDouble(), "phase1Waiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase1WaitingVariance(), theXMLTypePackage.getDouble(), "phase1WaitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase2ProcWaiting(), theXMLTypePackage.getDouble(), "phase2ProcWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase2ServiceTime(), theXMLTypePackage.getDouble(), "phase2ServiceTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase2ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase2ServiceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase2Utilization(), theXMLTypePackage.getDouble(), "phase2Utilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase2Waiting(), theXMLTypePackage.getDouble(), "phase2Waiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase2WaitingVariance(), theXMLTypePackage.getDouble(), "phase2WaitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase3ProcWaiting(), theXMLTypePackage.getDouble(), "phase3ProcWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase3ServiceTime(), theXMLTypePackage.getDouble(), "phase3ServiceTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase3ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase3ServiceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase3Utilization(), theXMLTypePackage.getDouble(), "phase3Utilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase3Waiting(), theXMLTypePackage.getDouble(), "phase3Waiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Phase3WaitingVariance(), theXMLTypePackage.getDouble(), "phase3WaitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_ProbExceedMaxServiceTime(), theXMLTypePackage.getDouble(), "probExceedMaxServiceTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_ProcUtilization(), theXMLTypePackage.getDouble(), "procUtilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_ProcWaiting(), theXMLTypePackage.getDouble(), "procWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockReaderHolding(), theXMLTypePackage.getDouble(), "rwlockReaderHolding", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockReaderUtilization(), theXMLTypePackage.getDouble(), "rwlockReaderUtilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockReaderWaiting(), theXMLTypePackage.getDouble(), "rwlockReaderWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockReaderWaitingVariance(), theXMLTypePackage.getDouble(), "rwlockReaderWaitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockWriterHolding(), theXMLTypePackage.getDouble(), "rwlockWriterHolding", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockWriterUtilization(), theXMLTypePackage.getDouble(), "rwlockWriterUtilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockWriterWaiting(), theXMLTypePackage.getDouble(), "rwlockWriterWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_RwlockWriterWaitingVariance(), theXMLTypePackage.getDouble(), "rwlockWriterWaitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_SemaphoreUtilization(), theXMLTypePackage.getDouble(), "semaphoreUtilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_SemaphoreWaiting(), theXMLTypePackage.getDouble(), "semaphoreWaiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_SemaphoreWaitingVariance(), theXMLTypePackage.getDouble(), "semaphoreWaitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_ServiceTime(), theXMLTypePackage.getDouble(), "serviceTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_ServiceTimeVariance(), theXMLTypePackage.getDouble(), "serviceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_SquaredCoeffVariation(), theXMLTypePackage.getDouble(), "squaredCoeffVariation", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Throughput(), theXMLTypePackage.getDouble(), "throughput", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_ThroughputBound(), theXMLTypePackage.getDouble(), "throughputBound", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Utilization(), theXMLTypePackage.getDouble(), "utilization", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_Waiting(), theXMLTypePackage.getDouble(), "waiting", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf95Type1_WaitingVariance(), theXMLTypePackage.getDouble(), "waitingVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultConf99TypeEClass, ResultConf99Type.class, "ResultConf99Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultConf99Type_JoinVariance(), theXMLTypePackage.getDouble(), "joinVariance", null, 0, 1, ResultConf99Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type_JoinWaiting(), theXMLTypePackage.getDouble(), "joinWaiting", null, 0, 1, ResultConf99Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultConf99Type1EClass, ResultConf99Type1.class, "ResultConf99Type1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultConf99Type1_LossProbability(), theXMLTypePackage.getDouble(), "lossProbability", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_OpenWaitTime(), theXMLTypePackage.getDouble(), "openWaitTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase1ProcWaiting(), theXMLTypePackage.getDouble(), "phase1ProcWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase1ServiceTime(), theXMLTypePackage.getDouble(), "phase1ServiceTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase1ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase1ServiceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase1Utilization(), theXMLTypePackage.getDouble(), "phase1Utilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase1Waiting(), theXMLTypePackage.getDouble(), "phase1Waiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase1WaitingVariance(), theXMLTypePackage.getDouble(), "phase1WaitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase2ProcWaiting(), theXMLTypePackage.getDouble(), "phase2ProcWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase2ServiceTime(), theXMLTypePackage.getDouble(), "phase2ServiceTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase2ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase2ServiceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase2Utilization(), theXMLTypePackage.getDouble(), "phase2Utilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase2Waiting(), theXMLTypePackage.getDouble(), "phase2Waiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase2WaitingVariance(), theXMLTypePackage.getDouble(), "phase2WaitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase3ProcWaiting(), theXMLTypePackage.getDouble(), "phase3ProcWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase3ServiceTime(), theXMLTypePackage.getDouble(), "phase3ServiceTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase3ServiceTimeVariance(), theXMLTypePackage.getDouble(), "phase3ServiceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase3Utilization(), theXMLTypePackage.getDouble(), "phase3Utilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase3Waiting(), theXMLTypePackage.getDouble(), "phase3Waiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Phase3WaitingVariance(), theXMLTypePackage.getDouble(), "phase3WaitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_ProbExceedMaxServiceTime(), theXMLTypePackage.getDouble(), "probExceedMaxServiceTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_ProcUtilization(), theXMLTypePackage.getDouble(), "procUtilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_ProcWaiting(), theXMLTypePackage.getDouble(), "procWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockReaderHolding(), theXMLTypePackage.getDouble(), "rwlockReaderHolding", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockReaderUtilization(), theXMLTypePackage.getDouble(), "rwlockReaderUtilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockReaderWaiting(), theXMLTypePackage.getDouble(), "rwlockReaderWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockReaderWaitingVariance(), theXMLTypePackage.getDouble(), "rwlockReaderWaitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockWriterHolding(), theXMLTypePackage.getDouble(), "rwlockWriterHolding", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockWriterUtilization(), theXMLTypePackage.getDouble(), "rwlockWriterUtilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockWriterWaiting(), theXMLTypePackage.getDouble(), "rwlockWriterWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_RwlockWriterWaitingVariance(), theXMLTypePackage.getDouble(), "rwlockWriterWaitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_SemaphoreUtilization(), theXMLTypePackage.getDouble(), "semaphoreUtilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_SemaphoreWaiting(), theXMLTypePackage.getDouble(), "semaphoreWaiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_SemaphoreWaitingVariance(), theXMLTypePackage.getDouble(), "semaphoreWaitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_ServiceTime(), theXMLTypePackage.getDouble(), "serviceTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_ServiceTimeVariance(), theXMLTypePackage.getDouble(), "serviceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_SquaredCoeffVariation(), theXMLTypePackage.getDouble(), "squaredCoeffVariation", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Throughput(), theXMLTypePackage.getDouble(), "throughput", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_ThroughputBound(), theXMLTypePackage.getDouble(), "throughputBound", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Utilization(), theXMLTypePackage.getDouble(), "utilization", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_Waiting(), theXMLTypePackage.getDouble(), "waiting", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultConf99Type1_WaitingVariance(), theXMLTypePackage.getDouble(), "waitingVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultGeneralTypeEClass, ResultGeneralType.class, "ResultGeneralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultGeneralType_MvaInfo(), this.getMvaInfoType(), null, "mvaInfo", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_ConvVal(), theXMLTypePackage.getDouble(), "convVal", null, 1, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_ElapsedTime(), theXMLTypePackage.getTime(), "elapsedTime", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_Iterations(), theXMLTypePackage.getDouble(), "iterations", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_PlatformInfo(), theXMLTypePackage.getString(), "platformInfo", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_SolverInfo(), theXMLTypePackage.getString(), "solverInfo", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_SystemCpuTime(), theXMLTypePackage.getTime(), "systemCpuTime", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_UserCpuTime(), theXMLTypePackage.getTime(), "userCpuTime", null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultGeneralType_Valid(), this.getValidType(), "valid", null, 1, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runControlTypeEClass, RunControlType.class, "RunControlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunControlType_Para(), this.getParaType(), null, "para", null, 0, -1, RunControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleActivityListTypeEClass, SingleActivityListType.class, "SingleActivityListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleActivityListType_Activity(), this.getActivityType(), null, "activity", null, 1, 1, SingleActivityListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotTypeEClass, SlotType.class, "SlotType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotType_Interface(), this.getInterfaceType(), null, "interface", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlotType_Binding(), this.getBindType(), null, "binding", null, 1, -1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType_BindTarget(), theXMLTypePackage.getString(), "bindTarget", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotType_ReplicNum(), theXMLTypePackage.getInt(), "replicNum", null, 0, 1, SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solverParamsTypeEClass, SolverParamsType.class, "SolverParamsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolverParamsType_ResultGeneral(), this.getResultGeneralType(), null, "resultGeneral", null, 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolverParamsType_Pragma(), this.getPragmaType(), null, "pragma", null, 0, -1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverParamsType_Comment(), theXMLTypePackage.getString(), "comment", "", 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverParamsType_ConvVal(), theXMLTypePackage.getDouble(), "convVal", "1", 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverParamsType_ItLimit(), theXMLTypePackage.getInt(), "itLimit", "50", 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverParamsType_PrintInt(), theXMLTypePackage.getInt(), "printInt", "0", 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolverParamsType_UnderrelaxCoeff(), theXMLTypePackage.getDouble(), "underrelaxCoeff", "0.9", 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchCallTypeEClass, SynchCallType.class, "SynchCallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchCallType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1, SynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskActivityGraphEClass, TaskActivityGraph.class, "TaskActivityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskActivityGraph_ReplyEntry(), this.getReplyEntryType(), null, "replyEntry", null, 0, -1, TaskActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskType_ResultTask(), this.getOutputResultType(), null, "resultTask", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_ServiceTimeDistribution(), this.getOutputDistributionType(), null, "serviceTimeDistribution", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_FanOut(), this.getFanOutType(), null, "fanOut", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_FanIn(), this.getFanInType(), null, "fanIn", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Entry(), this.getEntryType(), null, "entry", null, 1, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Service(), this.getServiceType(), null, "service", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_TaskActivities(), this.getTaskActivityGraph(), null, "taskActivities", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_ActivityGraph(), this.getTaskOptionType(), "activityGraph", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Initially(), theXMLTypePackage.getNonNegativeInteger(), "initially", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Multiplicity(), this.getSrvnNonNegativeInteger(), "multiplicity", "1", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Priority(), theXMLTypePackage.getNonNegativeInteger(), "priority", "0", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_QueueLength(), theXMLTypePackage.getNonNegativeInteger(), "queueLength", "0", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Replication(), theXMLTypePackage.getNonNegativeInteger(), "replication", "1", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Scheduling(), this.getTaskSchedulingType(), "scheduling", "fcfs", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_ThinkTime(), this.getSrvnFloat(), "thinkTime", "0", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(callOrderTypeEEnum, CallOrderType.class, "CallOrderType");
		addEEnumLiteral(callOrderTypeEEnum, CallOrderType.STOCHASTIC);
		addEEnumLiteral(callOrderTypeEEnum, CallOrderType.DETERMINISTIC);
		addEEnumLiteral(callOrderTypeEEnum, CallOrderType.LIST);

		initEEnum(rwLockTypeEEnum, RWLockType.class, "RWLockType");
		addEEnumLiteral(rwLockTypeEEnum, RWLockType.RUNLOCK);
		addEEnumLiteral(rwLockTypeEEnum, RWLockType.RLOCK);
		addEEnumLiteral(rwLockTypeEEnum, RWLockType.WUNLOCK);
		addEEnumLiteral(rwLockTypeEEnum, RWLockType.WLOCK);

		initEEnum(schedulingTypeEEnum, SchedulingType.class, "SchedulingType");
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.FCFS);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PS);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PP);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.INF);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.RAND);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.HOL);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PS_HOL);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PS_PP);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.CFS);

		initEEnum(semaphoreTypeEEnum, SemaphoreType.class, "SemaphoreType");
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.SIGNAL);
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.WAIT);

		initEEnum(taskOptionTypeEEnum, TaskOptionType.class, "TaskOptionType");
		addEEnumLiteral(taskOptionTypeEEnum, TaskOptionType.YES);
		addEEnumLiteral(taskOptionTypeEEnum, TaskOptionType.NO);

		initEEnum(taskSchedulingTypeEEnum, TaskSchedulingType.class, "TaskSchedulingType");
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.REF);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.FCFS);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.PRI);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.HOL);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.BURST);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.UNIFORM);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.POLL);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.INF);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.SEMAPHORE);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.RWLOCK);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.PH1PH2);
		addEEnumLiteral(typeTypeEEnum, TypeType.GRAPH);
		addEEnumLiteral(typeTypeEEnum, TypeType.NONE);

		initEEnum(validTypeEEnum, ValidType.class, "ValidType");
		addEEnumLiteral(validTypeEEnum, ValidType.YES);
		addEEnumLiteral(validTypeEEnum, ValidType.NO);

		// Initialize data types
		initEDataType(callOrderTypeObjectEDataType, CallOrderType.class, "CallOrderTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectFromTypeEDataType, List.class, "ConnectFromType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectToTypeEDataType, List.class, "ConnectToType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(extVariableEDataType, String.class, "ExtVariable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(phaseTypeEDataType, BigInteger.class, "PhaseType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rwLockTypeObjectEDataType, RWLockType.class, "RWLockTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schedulingTypeObjectEDataType, SchedulingType.class, "SchedulingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(semaphoreTypeObjectEDataType, SemaphoreType.class, "SemaphoreTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(srvnFloatEDataType, Object.class, "SrvnFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(srvnNonNegativeIntegerEDataType, Object.class, "SrvnNonNegativeInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taskOptionTypeObjectEDataType, TaskOptionType.class, "TaskOptionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taskSchedulingTypeObjectEDataType, TaskSchedulingType.class, "TaskSchedulingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(validTypeObjectEDataType, ValidType.class, "ValidTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (activityDefBaseEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityDefBase",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityDefBase_ServiceTimeDistribution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service-time-distribution",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_ResultActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_CallOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "call-order",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_HostDemandCvsq(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "host-demand-cvsq",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_HostDemandMean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "host-demand-mean",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_MaxServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefBase_ThinkTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "think-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityDefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityDefType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityDefType_CallList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-list",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityDefType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:9"
		   });	
		addAnnotation
		  (getActivityDefType_SynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synch-call",
			 "namespace", "##targetNamespace",
			 "group", "group:9"
		   });	
		addAnnotation
		  (getActivityDefType_AsynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asynch-call",
			 "namespace", "##targetNamespace",
			 "group", "group:9"
		   });	
		addAnnotation
		  (getActivityDefType_BoundToEntry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bound-to-entry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityGraphBaseEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityGraphBase",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityGraphBase_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityGraphBase_Precedence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "precedence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityListType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityListType_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityLoopListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityLoopListType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityLoopListType_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityLoopListType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityLoopTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityLoopType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getActivityLoopType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityMakingCallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityMakingCallType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityMakingCallType_CallsMean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calls-mean",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityOrTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityOrType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getActivityOrType_Prob(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prob",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityPhasesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityPhasesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActivityPhasesType_CallList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-list",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActivityPhasesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:9"
		   });	
		addAnnotation
		  (getActivityPhasesType_SynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synch-call",
			 "namespace", "##targetNamespace",
			 "group", "group:9"
		   });	
		addAnnotation
		  (getActivityPhasesType_AsynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asynch-call",
			 "namespace", "##targetNamespace",
			 "group", "group:9"
		   });	
		addAnnotation
		  (getActivityPhasesType_Phase(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (activityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getActivityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (andJoinListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AndJoinListType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAndJoinListType_ResultJoinDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-join-delay",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAndJoinListType_ServiceTimeDistribution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service-time-distribution",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAndJoinListType_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAndJoinListType_Quorum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quorum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (asynchCallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "asynch-call_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAsynchCallType_Dest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dest",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (bindTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BindType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBindType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBindType_ProcessorBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processor-binding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBindType_PortBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "port-binding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (callListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "call-list_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCallListType_SynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synch-call",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCallListType_AsynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asynch-call",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (callOrderTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CallOrderType"
		   });	
		addAnnotation
		  (callOrderTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CallOrderType:Object",
			 "baseType", "CallOrderType"
		   });	
		addAnnotation
		  (connectFromTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "connect-from_._type",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (connectToTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "connect-to_._type",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_LqnCore(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lqn-core",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LqnModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lqn-model",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (entryActivityDefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntryActivityDefType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEntryActivityDefType_CallList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-list",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryActivityDefType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:9"
		   });	
		addAnnotation
		  (getEntryActivityDefType_SynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synch-call",
			 "namespace", "##targetNamespace",
			 "group", "group:9"
		   });	
		addAnnotation
		  (getEntryActivityDefType_AsynchCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asynch-call",
			 "namespace", "##targetNamespace",
			 "group", "group:9"
		   });	
		addAnnotation
		  (getEntryActivityDefType_FirstActivity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "first-activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (entryActivityGraphEClass, 
		   source, 
		   new String[] {
			 "name", "EntryActivityGraph",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEntryActivityGraph_ReplyActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reply-activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (entryMakingCallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntryMakingCallType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEntryMakingCallType_Prob(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prob",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (entryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EntryType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEntryType_ResultEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-entry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_ServiceTimeDistribution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service-time-distribution",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_Forwarding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "forwarding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_EntryActivityGraph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry-activity-graph",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_EntryPhaseActivities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry-phase-activities",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_OpenArrivalRate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "open-arrival-rate",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_Rwlock(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_Semaphore(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEntryType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (extVariableEDataType, 
		   source, 
		   new String[] {
			 "name", "ExtVariable",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "$(_|[a-zA-Z])(([a-zA-Z]|[0-9]|_)+)?"
		   });	
		addAnnotation
		  (fanInTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FanInType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFanInType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFanInType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (fanOutTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FanOutType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFanOutType_Dest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dest",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFanOutType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (firstPlotTypeEClass, 
		   source, 
		   new String[] {
			 "name", "first-plot_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFirstPlotType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (groupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GroupType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGroupType_ResultGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGroupType_Task(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "task",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGroupType_Cap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cap",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGroupType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGroupType_Share(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "share",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (histogramBinTypeEClass, 
		   source, 
		   new String[] {
			 "name", "HistogramBinType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getHistogramBinType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHistogramBinType_Conf95(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conf-95",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHistogramBinType_Conf99(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conf-99",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHistogramBinType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHistogramBinType_Prob(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prob",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (inPortTypeEClass, 
		   source, 
		   new String[] {
			 "name", "in-port_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getInPortType_ConnectFrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connect-from",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInPortType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInPortType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (interfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Interface_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInterfaceType_InPort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "in-port",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInterfaceType_OutPort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "out-port",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (lqnCoreTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Lqn-CoreType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLqnCoreType_Processor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnCoreType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "slot",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (lqnModelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LqnModelType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLqnModelType_RunControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "run-control",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_PlotControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plot-control",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_SolverParams(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "solver-params",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_Processor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_Slot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "slot",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_Lqx(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lqx",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_LqnSchemaVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lqn-schema-version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_LqncoreSchemaVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lqncore-schema-version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLqnModelType_XmlDebug(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xml-debug",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (makingCallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MakingCallType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMakingCallType_ResultCall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-call",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMakingCallType_Dest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dest",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (mvaInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mva-info_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMvaInfoType_Core(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "core",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMvaInfoType_Faults(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "faults",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMvaInfoType_Step(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "step",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMvaInfoType_StepSquared(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "step-squared",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMvaInfoType_Submodels(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "submodels",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMvaInfoType_Wait(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wait",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMvaInfoType_WaitSquared(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wait-squared",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (orListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrListType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrListType_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (outPortTypeEClass, 
		   source, 
		   new String[] {
			 "name", "out-port_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOutPortType_ConnectTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connect-to",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutPortType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutPortType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (outputDistributionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OutputDistributionType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOutputDistributionType_UnderflowBin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "underflow-bin",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_HistogramBin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "histogram-bin",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_OverflowBin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overflow-bin",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_BinSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bin-size",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_Kurtosis(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kurtosis",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_Mean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mean",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_MidPoint(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mid-point",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_NumberBins(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "number-bins",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_Skew(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "skew",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputDistributionType_StdDev(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "std-dev",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (outputEntryDistributionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OutputEntryDistributionType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOutputEntryDistributionType_Phase(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (outputResultJoinDelayTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OutputResultJoinDelayType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOutputResultJoinDelayType_ResultConf95(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-conf-95",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultJoinDelayType_ResultConf99(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-conf-99",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultJoinDelayType_JoinVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "join-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultJoinDelayType_JoinWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "join-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (outputResultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OutputResultType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOutputResultType_ResultConf95(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-conf-95",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ResultConf99(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-conf-99",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_LossProbability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "loss-probability",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_OpenWaitTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "open-wait-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase1ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase1ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase1ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase1Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase1Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase1WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase2ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase2ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase2ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase2Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase2Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase2WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase3ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase3ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase3ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase3Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase3Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Phase3WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ProbExceedMaxServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prob-exceed-max-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ProcUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proc-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockReaderHolding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-holding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockReaderUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockReaderWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockReaderWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockWriterHolding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-holding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockWriterUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockWriterWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_RwlockWriterWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_SemaphoreUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_SemaphoreWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_SemaphoreWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_SquaredCoeffVariation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "squared-coeff-variation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Throughput(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "throughput",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_ThroughputBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "throughput-bound",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOutputResultType_WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (parameterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parameter_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getParameterType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParameterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (paraTypeEClass, 
		   source, 
		   new String[] {
			 "name", "para_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getParaType_StartValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "start-value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParaType_EndValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "end-value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParaType_StepValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParaType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (phaseActivitiesEClass, 
		   source, 
		   new String[] {
			 "name", "PhaseActivities",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPhaseActivities_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (phaseTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "phase_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger",
			 "minInclusive", "1",
			 "maxInclusive", "3"
		   });	
		addAnnotation
		  (plotControlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "plot-control_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPlotControlType_FirstPlot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "first-plot",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPlotControlType_Plot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plot",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (plotTypeEClass, 
		   source, 
		   new String[] {
			 "name", "plot_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPlotType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (portBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "port-binding_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPortBindingType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPortBindingType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (pragmaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "pragma_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPragmaType_Param(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPragmaType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (precedenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PrecedenceType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPrecedenceType_Pre(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrecedenceType_PreOR(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-OR",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrecedenceType_PreAND(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-AND",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrecedenceType_Post(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrecedenceType_PostOR(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-OR",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrecedenceType_PostAND(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-AND",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrecedenceType_PostLOOP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-LOOP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (processorBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "processor-binding_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getProcessorBindingType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorBindingType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (processorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessorType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProcessorType_ResultProcessor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-processor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Task(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "task",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Multiplicity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "multiplicity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Quantum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Replication(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "replication",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_Scheduling(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scheduling",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessorType_SpeedFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed-factor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (replyActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "reply-activity_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getReplyActivityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (replyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "reply-entry_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReplyEntryType_ReplyActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reply-activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReplyEntryType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resultConf95TypeEClass, 
		   source, 
		   new String[] {
			 "name", "result-conf-95_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResultConf95Type_JoinVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "join-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type_JoinWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "join-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resultConf95Type1EClass, 
		   source, 
		   new String[] {
			 "name", "result-conf-95_._1_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResultConf95Type1_LossProbability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "loss-probability",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_OpenWaitTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "open-wait-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase1ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase1ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase1ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase1Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase1Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase1WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase2ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase2ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase2ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase2Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase2Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase2WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase3ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase3ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase3ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase3Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase3Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Phase3WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_ProbExceedMaxServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prob-exceed-max-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_ProcUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proc-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockReaderHolding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-holding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockReaderUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockReaderWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockReaderWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockWriterHolding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-holding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockWriterUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockWriterWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_RwlockWriterWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_SemaphoreUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_SemaphoreWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_SemaphoreWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_SquaredCoeffVariation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "squared-coeff-variation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Throughput(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "throughput",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_ThroughputBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "throughput-bound",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf95Type1_WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resultConf99TypeEClass, 
		   source, 
		   new String[] {
			 "name", "result-conf-99_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResultConf99Type_JoinVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "join-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type_JoinWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "join-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resultConf99Type1EClass, 
		   source, 
		   new String[] {
			 "name", "result-conf-99_._1_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getResultConf99Type1_LossProbability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "loss-probability",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_OpenWaitTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "open-wait-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase1ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase1ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase1ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase1Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase1Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase1WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase1-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase2ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase2ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase2ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase2Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase2Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase2WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase2-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase3ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase3ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase3ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase3Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase3Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Phase3WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "phase3-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_ProbExceedMaxServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prob-exceed-max-service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_ProcUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proc-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_ProcWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proc-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockReaderHolding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-holding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockReaderUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockReaderWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockReaderWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-reader-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockWriterHolding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-holding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockWriterUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockWriterWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_RwlockWriterWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rwlock-writer-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_SemaphoreUtilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_SemaphoreWaiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_SemaphoreWaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "semaphore-waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_ServiceTimeVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "service-time-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_SquaredCoeffVariation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "squared-coeff-variation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Throughput(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "throughput",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_ThroughputBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "throughput-bound",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Utilization(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_Waiting(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waiting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultConf99Type1_WaitingVariance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waiting-variance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resultGeneralTypeEClass, 
		   source, 
		   new String[] {
			 "name", "result-general_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResultGeneralType_MvaInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mva-info",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_ConvVal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conv-val",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_ElapsedTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elapsed-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_Iterations(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "iterations",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_PlatformInfo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "platform-info",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_SolverInfo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "solver-info",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_SystemCpuTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "system-cpu-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_UserCpuTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user-cpu-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResultGeneralType_Valid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (runControlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "run-control_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRunControlType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rwLockTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RWLockType"
		   });	
		addAnnotation
		  (rwLockTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RWLockType:Object",
			 "baseType", "RWLockType"
		   });	
		addAnnotation
		  (schedulingTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "SchedulingType"
		   });	
		addAnnotation
		  (schedulingTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SchedulingType:Object",
			 "baseType", "SchedulingType"
		   });	
		addAnnotation
		  (semaphoreTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "SemaphoreType"
		   });	
		addAnnotation
		  (semaphoreTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SemaphoreType:Object",
			 "baseType", "SemaphoreType"
		   });	
		addAnnotation
		  (serviceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getServiceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (singleActivityListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SingleActivityListType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSingleActivityListType_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (slotTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SlotType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSlotType_Interface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Interface",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSlotType_Binding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSlotType_BindTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bind-target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSlotType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSlotType_ReplicNum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "replic_num",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (solverParamsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "solver-params_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSolverParamsType_ResultGeneral(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-general",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSolverParamsType_Pragma(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pragma",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSolverParamsType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSolverParamsType_ConvVal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conv_val",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSolverParamsType_ItLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "it_limit",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSolverParamsType_PrintInt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "print_int",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSolverParamsType_UnderrelaxCoeff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "underrelax_coeff",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (srvnFloatEDataType, 
		   source, 
		   new String[] {
			 "name", "SrvnFloat",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#double http://www.eclipse.org/emf/2003/XMLType#decimal ExtVariable"
		   });	
		addAnnotation
		  (srvnNonNegativeIntegerEDataType, 
		   source, 
		   new String[] {
			 "name", "SrvnNonNegativeInteger",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger ExtVariable"
		   });	
		addAnnotation
		  (synchCallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "synch-call_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSynchCallType_Dest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dest",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (taskActivityGraphEClass, 
		   source, 
		   new String[] {
			 "name", "TaskActivityGraph",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTaskActivityGraph_ReplyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reply-entry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (taskOptionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TaskOptionType"
		   });	
		addAnnotation
		  (taskOptionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TaskOptionType:Object",
			 "baseType", "TaskOptionType"
		   });	
		addAnnotation
		  (taskSchedulingTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TaskSchedulingType"
		   });	
		addAnnotation
		  (taskSchedulingTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TaskSchedulingType:Object",
			 "baseType", "TaskSchedulingType"
		   });	
		addAnnotation
		  (taskTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TaskType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTaskType_ResultTask(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-task",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_ServiceTimeDistribution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service-time-distribution",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_FanOut(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fan-out",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_FanIn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fan-in",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_TaskActivities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "task-activities",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_ActivityGraph(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "activity-graph",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Initially(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initially",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Multiplicity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "multiplicity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_QueueLength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queue-length",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Replication(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "replication",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Scheduling(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scheduling",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_ThinkTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "think-time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (typeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });	
		addAnnotation
		  (typeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });	
		addAnnotation
		  (validTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "valid_._type"
		   });	
		addAnnotation
		  (validTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "valid_._type:Object",
			 "baseType", "valid_._type"
		   });
	}

} //LqnPackageImpl
