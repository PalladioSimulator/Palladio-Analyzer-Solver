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
import org.palladiosimulator.solver.lqn.AxisType;
import org.palladiosimulator.solver.lqn.BindType;
import org.palladiosimulator.solver.lqn.CallListType;
import org.palladiosimulator.solver.lqn.CallOrderType;
import org.palladiosimulator.solver.lqn.DocumentRoot;
import org.palladiosimulator.solver.lqn.EntryActivityDefType;
import org.palladiosimulator.solver.lqn.EntryActivityGraph;
import org.palladiosimulator.solver.lqn.EntryMakingCallType;
import org.palladiosimulator.solver.lqn.EntryType;
import org.palladiosimulator.solver.lqn.FirstPlotType;
import org.palladiosimulator.solver.lqn.HistogramBinType;
import org.palladiosimulator.solver.lqn.InPortType;
import org.palladiosimulator.solver.lqn.InterfaceType;
import org.palladiosimulator.solver.lqn.LqnCoreType;
import org.palladiosimulator.solver.lqn.LqnFactory;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.lqn.LqnPackage;
import org.palladiosimulator.solver.lqn.MakingCallType;
import org.palladiosimulator.solver.lqn.OrListType;
import org.palladiosimulator.solver.lqn.OutPortType;
import org.palladiosimulator.solver.lqn.OutputDistributionType;
import org.palladiosimulator.solver.lqn.OutputEntryDistributionType;
import org.palladiosimulator.solver.lqn.OutputResultForwardingANDJoinDelay;
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
import org.palladiosimulator.solver.lqn.XmlDebugType;
import org.palladiosimulator.solver.lqn.util.LqnValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class LqnPackageImpl extends EPackageImpl implements LqnPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityDefBaseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityDefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityGraphBaseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityLoopListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityLoopTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityMakingCallTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityOrTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityPhasesTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass activityTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass andJoinListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass asynchCallTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass bindTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass callListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass entryActivityDefTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass entryActivityGraphEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass entryMakingCallTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass entryTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass firstPlotTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass histogramBinTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass inPortTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass interfaceTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass lqnCoreTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass lqnModelTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass makingCallTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass orListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass outPortTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass outputDistributionTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass outputEntryDistributionTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass outputResultForwardingANDJoinDelayEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass outputResultTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass parameterTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass paraTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass phaseActivitiesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass plotControlTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass plotTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass portBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pragmaTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass precedenceTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass processorBindingTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass processorTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass replyActivityTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass replyEntryTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resultConf95TypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resultConf95Type1EClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resultConf99TypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resultConf99Type1EClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resultGeneralTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass runControlTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass serviceTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass singleActivityListTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass slotTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass solverParamsTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass synchCallTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass taskActivityGraphEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass taskTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum axisTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum callOrderTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum schedulingTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum semaphoreTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum taskOptionTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum taskSchedulingTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum typeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum validTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum xmlDebugTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType axisTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType callOrderTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType connectFromTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType connectToTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType phaseTypeEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType schedulingTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType sciNotationEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType semaphoreTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType srvnFloatEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType taskOptionTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType taskSchedulingTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType typeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType validTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType xmlDebugTypeObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.solver.lqn.LqnPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private LqnPackageImpl() {
        super(eNS_URI, LqnFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link LqnPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static LqnPackage init() {
        if (isInited) {
            return (LqnPackage) EPackage.Registry.INSTANCE.getEPackage(LqnPackage.eNS_URI);
        }

        // Obtain or create and register package
        final LqnPackageImpl theLqnPackage = (LqnPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof LqnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new LqnPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theLqnPackage.createPackageContents();

        // Initialize created meta-data
        theLqnPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put(theLqnPackage, new EValidator.Descriptor() {

            @Override
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityDefBase() {
        return this.activityDefBaseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefBase_ResultJoinDelay() {
        return (EReference) this.activityDefBaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefBase_ResultForwarding() {
        return (EReference) this.activityDefBaseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefBase_ServiceTimeDistribution() {
        return (EReference) this.activityDefBaseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefBase_ResultActivity() {
        return (EReference) this.activityDefBaseEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefBase_CallOrder() {
        return (EAttribute) this.activityDefBaseEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefBase_HostDemandCvsq() {
        return (EAttribute) this.activityDefBaseEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefBase_HostDemandMean() {
        return (EAttribute) this.activityDefBaseEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefBase_MaxServiceTime() {
        return (EAttribute) this.activityDefBaseEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefBase_Name() {
        return (EAttribute) this.activityDefBaseEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefBase_ThinkTime() {
        return (EAttribute) this.activityDefBaseEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityDefType() {
        return this.activityDefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefType_CallList() {
        return (EReference) this.activityDefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefType_Group() {
        return (EAttribute) this.activityDefTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefType_SynchCall() {
        return (EReference) this.activityDefTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityDefType_AsynchCall() {
        return (EReference) this.activityDefTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityDefType_BoundToEntry() {
        return (EAttribute) this.activityDefTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityGraphBase() {
        return this.activityGraphBaseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityGraphBase_Activity() {
        return (EReference) this.activityGraphBaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityGraphBase_Precedence() {
        return (EReference) this.activityGraphBaseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityListType() {
        return this.activityListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityListType_Activity() {
        return (EReference) this.activityListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityLoopListType() {
        return this.activityLoopListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityLoopListType_Activity() {
        return (EReference) this.activityLoopListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityLoopListType_End() {
        return (EAttribute) this.activityLoopListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityLoopType() {
        return this.activityLoopTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityLoopType_Count() {
        return (EAttribute) this.activityLoopTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityMakingCallType() {
        return this.activityMakingCallTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityMakingCallType_CallsMean() {
        return (EAttribute) this.activityMakingCallTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityOrType() {
        return this.activityOrTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityOrType_Prob() {
        return (EAttribute) this.activityOrTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityPhasesType() {
        return this.activityPhasesTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityPhasesType_CallList() {
        return (EReference) this.activityPhasesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityPhasesType_Group() {
        return (EAttribute) this.activityPhasesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityPhasesType_SynchCall() {
        return (EReference) this.activityPhasesTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getActivityPhasesType_AsynchCall() {
        return (EReference) this.activityPhasesTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityPhasesType_Phase() {
        return (EAttribute) this.activityPhasesTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getActivityType() {
        return this.activityTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getActivityType_Name() {
        return (EAttribute) this.activityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAndJoinListType() {
        return this.andJoinListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAndJoinListType_Activity() {
        return (EReference) this.andJoinListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAndJoinListType_Quorum() {
        return (EAttribute) this.andJoinListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAsynchCallType() {
        return this.asynchCallTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAsynchCallType_Dest() {
        return (EAttribute) this.asynchCallTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAsynchCallType_Fanin() {
        return (EAttribute) this.asynchCallTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAsynchCallType_Fanout() {
        return (EAttribute) this.asynchCallTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBindType() {
        return this.bindTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBindType_Parameter() {
        return (EReference) this.bindTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBindType_ProcessorBinding() {
        return (EReference) this.bindTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBindType_PortBinding() {
        return (EReference) this.bindTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCallListType() {
        return this.callListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCallListType_SynchCall() {
        return (EReference) this.callListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCallListType_AsynchCall() {
        return (EReference) this.callListTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDocumentRoot() {
        return this.documentRootEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute) this.documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference) this.documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference) this.documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDocumentRoot_LqnCore() {
        return (EReference) this.documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDocumentRoot_LqnModel() {
        return (EReference) this.documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEntryActivityDefType() {
        return this.entryActivityDefTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryActivityDefType_CallList() {
        return (EReference) this.entryActivityDefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryActivityDefType_Group() {
        return (EAttribute) this.entryActivityDefTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryActivityDefType_SynchCall() {
        return (EReference) this.entryActivityDefTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryActivityDefType_AsynchCall() {
        return (EReference) this.entryActivityDefTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryActivityDefType_FirstActivity() {
        return (EAttribute) this.entryActivityDefTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEntryActivityGraph() {
        return this.entryActivityGraphEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryActivityGraph_ReplyActivity() {
        return (EReference) this.entryActivityGraphEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEntryMakingCallType() {
        return this.entryMakingCallTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryMakingCallType_Prob() {
        return (EAttribute) this.entryMakingCallTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEntryType() {
        return this.entryTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryType_ResultEntry() {
        return (EReference) this.entryTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryType_ServiceTimeDistribution() {
        return (EReference) this.entryTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryType_Forwarding() {
        return (EReference) this.entryTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryType_EntryActivityGraph() {
        return (EReference) this.entryTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEntryType_EntryPhaseActivities() {
        return (EReference) this.entryTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryType_Name() {
        return (EAttribute) this.entryTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryType_OpenArrivalRate() {
        return (EAttribute) this.entryTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryType_Priority() {
        return (EAttribute) this.entryTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryType_Semaphore() {
        return (EAttribute) this.entryTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEntryType_Type() {
        return (EAttribute) this.entryTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFirstPlotType() {
        return this.firstPlotTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFirstPlotType_Variable() {
        return (EAttribute) this.firstPlotTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getHistogramBinType() {
        return this.histogramBinTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getHistogramBinType_Begin() {
        return (EAttribute) this.histogramBinTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getHistogramBinType_Conf95() {
        return (EAttribute) this.histogramBinTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getHistogramBinType_Conf99() {
        return (EAttribute) this.histogramBinTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getHistogramBinType_End() {
        return (EAttribute) this.histogramBinTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getHistogramBinType_Prob() {
        return (EAttribute) this.histogramBinTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInPortType() {
        return this.inPortTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getInPortType_ConnectFrom() {
        return (EAttribute) this.inPortTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getInPortType_Description() {
        return (EAttribute) this.inPortTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getInPortType_Name() {
        return (EAttribute) this.inPortTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInterfaceType() {
        return this.interfaceTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInterfaceType_InPort() {
        return (EReference) this.interfaceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInterfaceType_OutPort() {
        return (EReference) this.interfaceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLqnCoreType() {
        return this.lqnCoreTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnCoreType_Processor() {
        return (EReference) this.lqnCoreTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnCoreType_Slot() {
        return (EReference) this.lqnCoreTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLqnModelType() {
        return this.lqnModelTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnModelType_RunControl() {
        return (EReference) this.lqnModelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnModelType_PlotControl() {
        return (EReference) this.lqnModelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnModelType_SolverParams() {
        return (EReference) this.lqnModelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnModelType_Processor() {
        return (EReference) this.lqnModelTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLqnModelType_Slot() {
        return (EReference) this.lqnModelTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLqnModelType_Description() {
        return (EAttribute) this.lqnModelTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLqnModelType_LqncoreSchemaVersion() {
        return (EAttribute) this.lqnModelTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLqnModelType_LqnSchemaVersion() {
        return (EAttribute) this.lqnModelTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLqnModelType_Name() {
        return (EAttribute) this.lqnModelTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLqnModelType_XmlDebug() {
        return (EAttribute) this.lqnModelTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMakingCallType() {
        return this.makingCallTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMakingCallType_ResultCall() {
        return (EReference) this.makingCallTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMakingCallType_Dest() {
        return (EAttribute) this.makingCallTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMakingCallType_Fanin() {
        return (EAttribute) this.makingCallTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMakingCallType_Fanout() {
        return (EAttribute) this.makingCallTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOrListType() {
        return this.orListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOrListType_Activity() {
        return (EReference) this.orListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOutPortType() {
        return this.outPortTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutPortType_ConnectTo() {
        return (EAttribute) this.outPortTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutPortType_Description() {
        return (EAttribute) this.outPortTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutPortType_Name() {
        return (EAttribute) this.outPortTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOutputDistributionType() {
        return this.outputDistributionTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputDistributionType_UnderflowBin() {
        return (EReference) this.outputDistributionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputDistributionType_HistogramBin() {
        return (EReference) this.outputDistributionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputDistributionType_OverflowBin() {
        return (EReference) this.outputDistributionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_BinSize() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_Kurtosis() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_Max() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_Mean() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_MidPoint() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_Min() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_NumberBins() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_Skew() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_StdDev() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputDistributionType_XSamples() {
        return (EAttribute) this.outputDistributionTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOutputEntryDistributionType() {
        return this.outputEntryDistributionTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputEntryDistributionType_Phase() {
        return (EAttribute) this.outputEntryDistributionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOutputResultForwardingANDJoinDelay() {
        return this.outputResultForwardingANDJoinDelayEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputResultForwardingANDJoinDelay_ResultConf95() {
        return (EReference) this.outputResultForwardingANDJoinDelayEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputResultForwardingANDJoinDelay_ResultConf99() {
        return (EReference) this.outputResultForwardingANDJoinDelayEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultForwardingANDJoinDelay_Dest() {
        return (EAttribute) this.outputResultForwardingANDJoinDelayEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultForwardingANDJoinDelay_JoinVariance() {
        return (EAttribute) this.outputResultForwardingANDJoinDelayEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultForwardingANDJoinDelay_JoinWaiting() {
        return (EAttribute) this.outputResultForwardingANDJoinDelayEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultForwardingANDJoinDelay_Waiting() {
        return (EAttribute) this.outputResultForwardingANDJoinDelayEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOutputResultType() {
        return this.outputResultTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputResultType_ResultConf95() {
        return (EReference) this.outputResultTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOutputResultType_ResultConf99() {
        return (EReference) this.outputResultTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_OpenWaitTime() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase1ProcWaiting() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase1ServiceTime() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase1ServiceTimeVariance() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase1Utilization() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase2ProcWaiting() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase2ServiceTime() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase2ServiceTimeVariance() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase2Utilization() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase3ProcWaiting() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase3ServiceTime() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase3ServiceTimeVariance() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Phase3Utilization() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_ProbExceedMaxServiceTime() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_ProcUtilization() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_ProcWaiting() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_ServiceTime() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_ServiceTimeVariance() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_SquaredCoeffVariation() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Throughput() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_ThroughputBound() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Utilization() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_Waiting() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOutputResultType_WaitingVariance() {
        return (EAttribute) this.outputResultTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getParameterType() {
        return this.parameterTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParameterType_Name() {
        return (EAttribute) this.parameterTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParameterType_Value() {
        return (EAttribute) this.parameterTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getParaType() {
        return this.paraTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParaType_StartValue() {
        return (EAttribute) this.paraTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParaType_EndValue() {
        return (EAttribute) this.paraTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParaType_StepValue() {
        return (EAttribute) this.paraTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParaType_Value() {
        return (EAttribute) this.paraTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPhaseActivities() {
        return this.phaseActivitiesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPhaseActivities_Activity() {
        return (EReference) this.phaseActivitiesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPlotControlType() {
        return this.plotControlTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPlotControlType_FirstPlot() {
        return (EReference) this.plotControlTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPlotControlType_Plot() {
        return (EReference) this.plotControlTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPlotType() {
        return this.plotTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPlotType_Variable() {
        return (EAttribute) this.plotTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPortBindingType() {
        return this.portBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPortBindingType_Source() {
        return (EAttribute) this.portBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPortBindingType_Target() {
        return (EAttribute) this.portBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPragmaType() {
        return this.pragmaTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPragmaType_Param() {
        return (EAttribute) this.pragmaTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPragmaType_Value() {
        return (EAttribute) this.pragmaTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPrecedenceType() {
        return this.precedenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_Pre() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_PreOR() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_PreAND() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_Post() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_PostOR() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_PostAND() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPrecedenceType_PostLOOP() {
        return (EReference) this.precedenceTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getProcessorBindingType() {
        return this.processorBindingTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorBindingType_Source() {
        return (EAttribute) this.processorBindingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorBindingType_Target() {
        return (EAttribute) this.processorBindingTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getProcessorType() {
        return this.processorTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getProcessorType_ResultProcessor() {
        return (EReference) this.processorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getProcessorType_Task() {
        return (EReference) this.processorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorType_Multiplicity() {
        return (EAttribute) this.processorTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorType_Name() {
        return (EAttribute) this.processorTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorType_Quantum() {
        return (EAttribute) this.processorTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorType_Replication() {
        return (EAttribute) this.processorTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorType_Scheduling() {
        return (EAttribute) this.processorTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getProcessorType_SpeedFactor() {
        return (EAttribute) this.processorTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getReplyActivityType() {
        return this.replyActivityTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getReplyActivityType_Name() {
        return (EAttribute) this.replyActivityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getReplyEntryType() {
        return this.replyEntryTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getReplyEntryType_ReplyActivity() {
        return (EReference) this.replyEntryTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getReplyEntryType_Name() {
        return (EAttribute) this.replyEntryTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResultConf95Type() {
        return this.resultConf95TypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type_JoinVariance() {
        return (EAttribute) this.resultConf95TypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type_JoinWaiting() {
        return (EAttribute) this.resultConf95TypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type_Waiting() {
        return (EAttribute) this.resultConf95TypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResultConf95Type1() {
        return this.resultConf95Type1EClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_OpenWaitTime() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase1ProcWaiting() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase1ServiceTime() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase1ServiceTimeVariance() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase1Utilization() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase2ProcWaiting() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase2ServiceTime() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase2ServiceTimeVariance() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase2Utilization() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase3ProcWaiting() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase3ServiceTime() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase3ServiceTimeVariance() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Phase3Utilization() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_ProbExceedMaxServiceTime() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_ProcUtilization() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_ProcWaiting() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_ServiceTime() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_ServiceTimeVariance() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_SquaredCoeffVariation() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Throughput() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_ThroughputBound() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Utilization() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_Waiting() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf95Type1_WaitingVariance() {
        return (EAttribute) this.resultConf95Type1EClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResultConf99Type() {
        return this.resultConf99TypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type_JoinVariance() {
        return (EAttribute) this.resultConf99TypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type_JoinWaiting() {
        return (EAttribute) this.resultConf99TypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type_Waiting() {
        return (EAttribute) this.resultConf99TypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResultConf99Type1() {
        return this.resultConf99Type1EClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_OpenWaitTime() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase1ProcWaiting() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase1ServiceTime() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase1ServiceTimeVariance() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase1Utilization() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase2ProcWaiting() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase2ServiceTime() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase2ServiceTimeVariance() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase2Utilization() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase3ProcWaiting() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase3ServiceTime() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase3ServiceTimeVariance() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Phase3Utilization() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_ProbExceedMaxServiceTime() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_ProcUtilization() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_ProcWaiting() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_ServiceTime() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_ServiceTimeVariance() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_SquaredCoeffVariation() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Throughput() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_ThroughputBound() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Utilization() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_Waiting() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultConf99Type1_WaitingVariance() {
        return (EAttribute) this.resultConf99Type1EClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResultGeneralType() {
        return this.resultGeneralTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_ConvVal() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_ElapsedTime() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_Iterations() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_PlatformInfo() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_SolverInfo() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_SystemCpuTime() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_UserCpuTime() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResultGeneralType_Valid() {
        return (EAttribute) this.resultGeneralTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRunControlType() {
        return this.runControlTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRunControlType_Para() {
        return (EReference) this.runControlTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getServiceType() {
        return this.serviceTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getServiceType_Name() {
        return (EAttribute) this.serviceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSingleActivityListType() {
        return this.singleActivityListTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSingleActivityListType_Activity() {
        return (EReference) this.singleActivityListTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSlotType() {
        return this.slotTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSlotType_Interface() {
        return (EReference) this.slotTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSlotType_Binding() {
        return (EReference) this.slotTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSlotType_BindTarget() {
        return (EAttribute) this.slotTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSlotType_Id() {
        return (EAttribute) this.slotTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSlotType_ReplicNum() {
        return (EAttribute) this.slotTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSolverParamsType() {
        return this.solverParamsTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSolverParamsType_ResultGeneral() {
        return (EReference) this.solverParamsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSolverParamsType_Pragma() {
        return (EReference) this.solverParamsTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSolverParamsType_Comment() {
        return (EAttribute) this.solverParamsTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSolverParamsType_ConvVal() {
        return (EAttribute) this.solverParamsTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSolverParamsType_ItLimit() {
        return (EAttribute) this.solverParamsTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSolverParamsType_PrintInt() {
        return (EAttribute) this.solverParamsTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSolverParamsType_UnderrelaxCoeff() {
        return (EAttribute) this.solverParamsTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSynchCallType() {
        return this.synchCallTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSynchCallType_Dest() {
        return (EAttribute) this.synchCallTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSynchCallType_Fanin() {
        return (EAttribute) this.synchCallTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSynchCallType_Fanout() {
        return (EAttribute) this.synchCallTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTaskActivityGraph() {
        return this.taskActivityGraphEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTaskActivityGraph_ReplyEntry() {
        return (EReference) this.taskActivityGraphEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTaskType() {
        return this.taskTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTaskType_ResultTask() {
        return (EReference) this.taskTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTaskType_Entry() {
        return (EReference) this.taskTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTaskType_Service() {
        return (EReference) this.taskTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTaskType_TaskActivities() {
        return (EReference) this.taskTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_ActivityGraph() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_Multiplicity() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_Name() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_Priority() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_QueueLength() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_Replication() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_Scheduling() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTaskType_ThinkTime() {
        return (EAttribute) this.taskTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getAxisType() {
        return this.axisTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getCallOrderType() {
        return this.callOrderTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getSchedulingType() {
        return this.schedulingTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getSemaphoreType() {
        return this.semaphoreTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getTaskOptionType() {
        return this.taskOptionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getTaskSchedulingType() {
        return this.taskSchedulingTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getTypeType() {
        return this.typeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getValidType() {
        return this.validTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getXmlDebugType() {
        return this.xmlDebugTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getAxisTypeObject() {
        return this.axisTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getCallOrderTypeObject() {
        return this.callOrderTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getConnectFromType() {
        return this.connectFromTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getConnectToType() {
        return this.connectToTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getPhaseType() {
        return this.phaseTypeEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getSchedulingTypeObject() {
        return this.schedulingTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getSciNotation() {
        return this.sciNotationEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getSemaphoreTypeObject() {
        return this.semaphoreTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getSrvnFloat() {
        return this.srvnFloatEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getTaskOptionTypeObject() {
        return this.taskOptionTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getTaskSchedulingTypeObject() {
        return this.taskSchedulingTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getTypeTypeObject() {
        return this.typeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getValidTypeObject() {
        return this.validTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getXmlDebugTypeObject() {
        return this.xmlDebugTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LqnFactory getLqnFactory() {
        return (LqnFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.activityDefBaseEClass = this.createEClass(ACTIVITY_DEF_BASE);
        this.createEReference(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY);
        this.createEReference(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__RESULT_FORWARDING);
        this.createEReference(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION);
        this.createEReference(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__RESULT_ACTIVITY);
        this.createEAttribute(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__CALL_ORDER);
        this.createEAttribute(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ);
        this.createEAttribute(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN);
        this.createEAttribute(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__MAX_SERVICE_TIME);
        this.createEAttribute(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__NAME);
        this.createEAttribute(this.activityDefBaseEClass, ACTIVITY_DEF_BASE__THINK_TIME);

        this.activityDefTypeEClass = this.createEClass(ACTIVITY_DEF_TYPE);
        this.createEReference(this.activityDefTypeEClass, ACTIVITY_DEF_TYPE__CALL_LIST);
        this.createEAttribute(this.activityDefTypeEClass, ACTIVITY_DEF_TYPE__GROUP);
        this.createEReference(this.activityDefTypeEClass, ACTIVITY_DEF_TYPE__SYNCH_CALL);
        this.createEReference(this.activityDefTypeEClass, ACTIVITY_DEF_TYPE__ASYNCH_CALL);
        this.createEAttribute(this.activityDefTypeEClass, ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY);

        this.activityGraphBaseEClass = this.createEClass(ACTIVITY_GRAPH_BASE);
        this.createEReference(this.activityGraphBaseEClass, ACTIVITY_GRAPH_BASE__ACTIVITY);
        this.createEReference(this.activityGraphBaseEClass, ACTIVITY_GRAPH_BASE__PRECEDENCE);

        this.activityListTypeEClass = this.createEClass(ACTIVITY_LIST_TYPE);
        this.createEReference(this.activityListTypeEClass, ACTIVITY_LIST_TYPE__ACTIVITY);

        this.activityLoopListTypeEClass = this.createEClass(ACTIVITY_LOOP_LIST_TYPE);
        this.createEReference(this.activityLoopListTypeEClass, ACTIVITY_LOOP_LIST_TYPE__ACTIVITY);
        this.createEAttribute(this.activityLoopListTypeEClass, ACTIVITY_LOOP_LIST_TYPE__END);

        this.activityLoopTypeEClass = this.createEClass(ACTIVITY_LOOP_TYPE);
        this.createEAttribute(this.activityLoopTypeEClass, ACTIVITY_LOOP_TYPE__COUNT);

        this.activityMakingCallTypeEClass = this.createEClass(ACTIVITY_MAKING_CALL_TYPE);
        this.createEAttribute(this.activityMakingCallTypeEClass, ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN);

        this.activityOrTypeEClass = this.createEClass(ACTIVITY_OR_TYPE);
        this.createEAttribute(this.activityOrTypeEClass, ACTIVITY_OR_TYPE__PROB);

        this.activityPhasesTypeEClass = this.createEClass(ACTIVITY_PHASES_TYPE);
        this.createEReference(this.activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__CALL_LIST);
        this.createEAttribute(this.activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__GROUP);
        this.createEReference(this.activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__SYNCH_CALL);
        this.createEReference(this.activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__ASYNCH_CALL);
        this.createEAttribute(this.activityPhasesTypeEClass, ACTIVITY_PHASES_TYPE__PHASE);

        this.activityTypeEClass = this.createEClass(ACTIVITY_TYPE);
        this.createEAttribute(this.activityTypeEClass, ACTIVITY_TYPE__NAME);

        this.andJoinListTypeEClass = this.createEClass(AND_JOIN_LIST_TYPE);
        this.createEReference(this.andJoinListTypeEClass, AND_JOIN_LIST_TYPE__ACTIVITY);
        this.createEAttribute(this.andJoinListTypeEClass, AND_JOIN_LIST_TYPE__QUORUM);

        this.asynchCallTypeEClass = this.createEClass(ASYNCH_CALL_TYPE);
        this.createEAttribute(this.asynchCallTypeEClass, ASYNCH_CALL_TYPE__DEST);
        this.createEAttribute(this.asynchCallTypeEClass, ASYNCH_CALL_TYPE__FANIN);
        this.createEAttribute(this.asynchCallTypeEClass, ASYNCH_CALL_TYPE__FANOUT);

        this.bindTypeEClass = this.createEClass(BIND_TYPE);
        this.createEReference(this.bindTypeEClass, BIND_TYPE__PARAMETER);
        this.createEReference(this.bindTypeEClass, BIND_TYPE__PROCESSOR_BINDING);
        this.createEReference(this.bindTypeEClass, BIND_TYPE__PORT_BINDING);

        this.callListTypeEClass = this.createEClass(CALL_LIST_TYPE);
        this.createEReference(this.callListTypeEClass, CALL_LIST_TYPE__SYNCH_CALL);
        this.createEReference(this.callListTypeEClass, CALL_LIST_TYPE__ASYNCH_CALL);

        this.documentRootEClass = this.createEClass(DOCUMENT_ROOT);
        this.createEAttribute(this.documentRootEClass, DOCUMENT_ROOT__MIXED);
        this.createEReference(this.documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        this.createEReference(this.documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        this.createEReference(this.documentRootEClass, DOCUMENT_ROOT__LQN_CORE);
        this.createEReference(this.documentRootEClass, DOCUMENT_ROOT__LQN_MODEL);

        this.entryActivityDefTypeEClass = this.createEClass(ENTRY_ACTIVITY_DEF_TYPE);
        this.createEReference(this.entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST);
        this.createEAttribute(this.entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__GROUP);
        this.createEReference(this.entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL);
        this.createEReference(this.entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL);
        this.createEAttribute(this.entryActivityDefTypeEClass, ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY);

        this.entryActivityGraphEClass = this.createEClass(ENTRY_ACTIVITY_GRAPH);
        this.createEReference(this.entryActivityGraphEClass, ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY);

        this.entryMakingCallTypeEClass = this.createEClass(ENTRY_MAKING_CALL_TYPE);
        this.createEAttribute(this.entryMakingCallTypeEClass, ENTRY_MAKING_CALL_TYPE__PROB);

        this.entryTypeEClass = this.createEClass(ENTRY_TYPE);
        this.createEReference(this.entryTypeEClass, ENTRY_TYPE__RESULT_ENTRY);
        this.createEReference(this.entryTypeEClass, ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION);
        this.createEReference(this.entryTypeEClass, ENTRY_TYPE__FORWARDING);
        this.createEReference(this.entryTypeEClass, ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH);
        this.createEReference(this.entryTypeEClass, ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES);
        this.createEAttribute(this.entryTypeEClass, ENTRY_TYPE__NAME);
        this.createEAttribute(this.entryTypeEClass, ENTRY_TYPE__OPEN_ARRIVAL_RATE);
        this.createEAttribute(this.entryTypeEClass, ENTRY_TYPE__PRIORITY);
        this.createEAttribute(this.entryTypeEClass, ENTRY_TYPE__SEMAPHORE);
        this.createEAttribute(this.entryTypeEClass, ENTRY_TYPE__TYPE);

        this.firstPlotTypeEClass = this.createEClass(FIRST_PLOT_TYPE);
        this.createEAttribute(this.firstPlotTypeEClass, FIRST_PLOT_TYPE__VARIABLE);

        this.histogramBinTypeEClass = this.createEClass(HISTOGRAM_BIN_TYPE);
        this.createEAttribute(this.histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__BEGIN);
        this.createEAttribute(this.histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__CONF95);
        this.createEAttribute(this.histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__CONF99);
        this.createEAttribute(this.histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__END);
        this.createEAttribute(this.histogramBinTypeEClass, HISTOGRAM_BIN_TYPE__PROB);

        this.inPortTypeEClass = this.createEClass(IN_PORT_TYPE);
        this.createEAttribute(this.inPortTypeEClass, IN_PORT_TYPE__CONNECT_FROM);
        this.createEAttribute(this.inPortTypeEClass, IN_PORT_TYPE__DESCRIPTION);
        this.createEAttribute(this.inPortTypeEClass, IN_PORT_TYPE__NAME);

        this.interfaceTypeEClass = this.createEClass(INTERFACE_TYPE);
        this.createEReference(this.interfaceTypeEClass, INTERFACE_TYPE__IN_PORT);
        this.createEReference(this.interfaceTypeEClass, INTERFACE_TYPE__OUT_PORT);

        this.lqnCoreTypeEClass = this.createEClass(LQN_CORE_TYPE);
        this.createEReference(this.lqnCoreTypeEClass, LQN_CORE_TYPE__PROCESSOR);
        this.createEReference(this.lqnCoreTypeEClass, LQN_CORE_TYPE__SLOT);

        this.lqnModelTypeEClass = this.createEClass(LQN_MODEL_TYPE);
        this.createEReference(this.lqnModelTypeEClass, LQN_MODEL_TYPE__RUN_CONTROL);
        this.createEReference(this.lqnModelTypeEClass, LQN_MODEL_TYPE__PLOT_CONTROL);
        this.createEReference(this.lqnModelTypeEClass, LQN_MODEL_TYPE__SOLVER_PARAMS);
        this.createEReference(this.lqnModelTypeEClass, LQN_MODEL_TYPE__PROCESSOR);
        this.createEReference(this.lqnModelTypeEClass, LQN_MODEL_TYPE__SLOT);
        this.createEAttribute(this.lqnModelTypeEClass, LQN_MODEL_TYPE__DESCRIPTION);
        this.createEAttribute(this.lqnModelTypeEClass, LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION);
        this.createEAttribute(this.lqnModelTypeEClass, LQN_MODEL_TYPE__LQN_SCHEMA_VERSION);
        this.createEAttribute(this.lqnModelTypeEClass, LQN_MODEL_TYPE__NAME);
        this.createEAttribute(this.lqnModelTypeEClass, LQN_MODEL_TYPE__XML_DEBUG);

        this.makingCallTypeEClass = this.createEClass(MAKING_CALL_TYPE);
        this.createEReference(this.makingCallTypeEClass, MAKING_CALL_TYPE__RESULT_CALL);
        this.createEAttribute(this.makingCallTypeEClass, MAKING_CALL_TYPE__DEST);
        this.createEAttribute(this.makingCallTypeEClass, MAKING_CALL_TYPE__FANIN);
        this.createEAttribute(this.makingCallTypeEClass, MAKING_CALL_TYPE__FANOUT);

        this.orListTypeEClass = this.createEClass(OR_LIST_TYPE);
        this.createEReference(this.orListTypeEClass, OR_LIST_TYPE__ACTIVITY);

        this.outPortTypeEClass = this.createEClass(OUT_PORT_TYPE);
        this.createEAttribute(this.outPortTypeEClass, OUT_PORT_TYPE__CONNECT_TO);
        this.createEAttribute(this.outPortTypeEClass, OUT_PORT_TYPE__DESCRIPTION);
        this.createEAttribute(this.outPortTypeEClass, OUT_PORT_TYPE__NAME);

        this.outputDistributionTypeEClass = this.createEClass(OUTPUT_DISTRIBUTION_TYPE);
        this.createEReference(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN);
        this.createEReference(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN);
        this.createEReference(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__KURTOSIS);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MAX);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MEAN);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MID_POINT);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__MIN);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__SKEW);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__STD_DEV);
        this.createEAttribute(this.outputDistributionTypeEClass, OUTPUT_DISTRIBUTION_TYPE__XSAMPLES);

        this.outputEntryDistributionTypeEClass = this.createEClass(OUTPUT_ENTRY_DISTRIBUTION_TYPE);
        this.createEAttribute(this.outputEntryDistributionTypeEClass, OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE);

        this.outputResultForwardingANDJoinDelayEClass = this.createEClass(OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY);
        this.createEReference(this.outputResultForwardingANDJoinDelayEClass,
                OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95);
        this.createEReference(this.outputResultForwardingANDJoinDelayEClass,
                OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99);
        this.createEAttribute(this.outputResultForwardingANDJoinDelayEClass,
                OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST);
        this.createEAttribute(this.outputResultForwardingANDJoinDelayEClass,
                OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE);
        this.createEAttribute(this.outputResultForwardingANDJoinDelayEClass,
                OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING);
        this.createEAttribute(this.outputResultForwardingANDJoinDelayEClass,
                OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING);

        this.outputResultTypeEClass = this.createEClass(OUTPUT_RESULT_TYPE);
        this.createEReference(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__RESULT_CONF95);
        this.createEReference(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__RESULT_CONF99);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PROC_UTILIZATION);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__PROC_WAITING);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__SERVICE_TIME);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__THROUGHPUT);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__UTILIZATION);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__WAITING);
        this.createEAttribute(this.outputResultTypeEClass, OUTPUT_RESULT_TYPE__WAITING_VARIANCE);

        this.parameterTypeEClass = this.createEClass(PARAMETER_TYPE);
        this.createEAttribute(this.parameterTypeEClass, PARAMETER_TYPE__NAME);
        this.createEAttribute(this.parameterTypeEClass, PARAMETER_TYPE__VALUE);

        this.paraTypeEClass = this.createEClass(PARA_TYPE);
        this.createEAttribute(this.paraTypeEClass, PARA_TYPE__START_VALUE);
        this.createEAttribute(this.paraTypeEClass, PARA_TYPE__END_VALUE);
        this.createEAttribute(this.paraTypeEClass, PARA_TYPE__STEP_VALUE);
        this.createEAttribute(this.paraTypeEClass, PARA_TYPE__VALUE);

        this.phaseActivitiesEClass = this.createEClass(PHASE_ACTIVITIES);
        this.createEReference(this.phaseActivitiesEClass, PHASE_ACTIVITIES__ACTIVITY);

        this.plotControlTypeEClass = this.createEClass(PLOT_CONTROL_TYPE);
        this.createEReference(this.plotControlTypeEClass, PLOT_CONTROL_TYPE__FIRST_PLOT);
        this.createEReference(this.plotControlTypeEClass, PLOT_CONTROL_TYPE__PLOT);

        this.plotTypeEClass = this.createEClass(PLOT_TYPE);
        this.createEAttribute(this.plotTypeEClass, PLOT_TYPE__VARIABLE);

        this.portBindingTypeEClass = this.createEClass(PORT_BINDING_TYPE);
        this.createEAttribute(this.portBindingTypeEClass, PORT_BINDING_TYPE__SOURCE);
        this.createEAttribute(this.portBindingTypeEClass, PORT_BINDING_TYPE__TARGET);

        this.pragmaTypeEClass = this.createEClass(PRAGMA_TYPE);
        this.createEAttribute(this.pragmaTypeEClass, PRAGMA_TYPE__PARAM);
        this.createEAttribute(this.pragmaTypeEClass, PRAGMA_TYPE__VALUE);

        this.precedenceTypeEClass = this.createEClass(PRECEDENCE_TYPE);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__PRE);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__PRE_OR);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__PRE_AND);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__POST);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__POST_OR);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__POST_AND);
        this.createEReference(this.precedenceTypeEClass, PRECEDENCE_TYPE__POST_LOOP);

        this.processorBindingTypeEClass = this.createEClass(PROCESSOR_BINDING_TYPE);
        this.createEAttribute(this.processorBindingTypeEClass, PROCESSOR_BINDING_TYPE__SOURCE);
        this.createEAttribute(this.processorBindingTypeEClass, PROCESSOR_BINDING_TYPE__TARGET);

        this.processorTypeEClass = this.createEClass(PROCESSOR_TYPE);
        this.createEReference(this.processorTypeEClass, PROCESSOR_TYPE__RESULT_PROCESSOR);
        this.createEReference(this.processorTypeEClass, PROCESSOR_TYPE__TASK);
        this.createEAttribute(this.processorTypeEClass, PROCESSOR_TYPE__MULTIPLICITY);
        this.createEAttribute(this.processorTypeEClass, PROCESSOR_TYPE__NAME);
        this.createEAttribute(this.processorTypeEClass, PROCESSOR_TYPE__QUANTUM);
        this.createEAttribute(this.processorTypeEClass, PROCESSOR_TYPE__REPLICATION);
        this.createEAttribute(this.processorTypeEClass, PROCESSOR_TYPE__SCHEDULING);
        this.createEAttribute(this.processorTypeEClass, PROCESSOR_TYPE__SPEED_FACTOR);

        this.replyActivityTypeEClass = this.createEClass(REPLY_ACTIVITY_TYPE);
        this.createEAttribute(this.replyActivityTypeEClass, REPLY_ACTIVITY_TYPE__NAME);

        this.replyEntryTypeEClass = this.createEClass(REPLY_ENTRY_TYPE);
        this.createEReference(this.replyEntryTypeEClass, REPLY_ENTRY_TYPE__REPLY_ACTIVITY);
        this.createEAttribute(this.replyEntryTypeEClass, REPLY_ENTRY_TYPE__NAME);

        this.resultConf95TypeEClass = this.createEClass(RESULT_CONF95_TYPE);
        this.createEAttribute(this.resultConf95TypeEClass, RESULT_CONF95_TYPE__JOIN_VARIANCE);
        this.createEAttribute(this.resultConf95TypeEClass, RESULT_CONF95_TYPE__JOIN_WAITING);
        this.createEAttribute(this.resultConf95TypeEClass, RESULT_CONF95_TYPE__WAITING);

        this.resultConf95Type1EClass = this.createEClass(RESULT_CONF95_TYPE1);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__OPEN_WAIT_TIME);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE1_UTILIZATION);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE2_UTILIZATION);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PHASE3_UTILIZATION);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PROC_UTILIZATION);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__PROC_WAITING);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__SERVICE_TIME);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__THROUGHPUT);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__THROUGHPUT_BOUND);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__UTILIZATION);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__WAITING);
        this.createEAttribute(this.resultConf95Type1EClass, RESULT_CONF95_TYPE1__WAITING_VARIANCE);

        this.resultConf99TypeEClass = this.createEClass(RESULT_CONF99_TYPE);
        this.createEAttribute(this.resultConf99TypeEClass, RESULT_CONF99_TYPE__JOIN_VARIANCE);
        this.createEAttribute(this.resultConf99TypeEClass, RESULT_CONF99_TYPE__JOIN_WAITING);
        this.createEAttribute(this.resultConf99TypeEClass, RESULT_CONF99_TYPE__WAITING);

        this.resultConf99Type1EClass = this.createEClass(RESULT_CONF99_TYPE1);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__OPEN_WAIT_TIME);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE1_UTILIZATION);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE2_UTILIZATION);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PHASE3_UTILIZATION);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PROC_UTILIZATION);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__PROC_WAITING);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__SERVICE_TIME);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__THROUGHPUT);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__THROUGHPUT_BOUND);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__UTILIZATION);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__WAITING);
        this.createEAttribute(this.resultConf99Type1EClass, RESULT_CONF99_TYPE1__WAITING_VARIANCE);

        this.resultGeneralTypeEClass = this.createEClass(RESULT_GENERAL_TYPE);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__CONV_VAL);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__ELAPSED_TIME);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__ITERATIONS);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__PLATFORM_INFO);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__SOLVER_INFO);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__USER_CPU_TIME);
        this.createEAttribute(this.resultGeneralTypeEClass, RESULT_GENERAL_TYPE__VALID);

        this.runControlTypeEClass = this.createEClass(RUN_CONTROL_TYPE);
        this.createEReference(this.runControlTypeEClass, RUN_CONTROL_TYPE__PARA);

        this.serviceTypeEClass = this.createEClass(SERVICE_TYPE);
        this.createEAttribute(this.serviceTypeEClass, SERVICE_TYPE__NAME);

        this.singleActivityListTypeEClass = this.createEClass(SINGLE_ACTIVITY_LIST_TYPE);
        this.createEReference(this.singleActivityListTypeEClass, SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY);

        this.slotTypeEClass = this.createEClass(SLOT_TYPE);
        this.createEReference(this.slotTypeEClass, SLOT_TYPE__INTERFACE);
        this.createEReference(this.slotTypeEClass, SLOT_TYPE__BINDING);
        this.createEAttribute(this.slotTypeEClass, SLOT_TYPE__BIND_TARGET);
        this.createEAttribute(this.slotTypeEClass, SLOT_TYPE__ID);
        this.createEAttribute(this.slotTypeEClass, SLOT_TYPE__REPLIC_NUM);

        this.solverParamsTypeEClass = this.createEClass(SOLVER_PARAMS_TYPE);
        this.createEReference(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__RESULT_GENERAL);
        this.createEReference(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__PRAGMA);
        this.createEAttribute(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__COMMENT);
        this.createEAttribute(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__CONV_VAL);
        this.createEAttribute(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__IT_LIMIT);
        this.createEAttribute(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__PRINT_INT);
        this.createEAttribute(this.solverParamsTypeEClass, SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF);

        this.synchCallTypeEClass = this.createEClass(SYNCH_CALL_TYPE);
        this.createEAttribute(this.synchCallTypeEClass, SYNCH_CALL_TYPE__DEST);
        this.createEAttribute(this.synchCallTypeEClass, SYNCH_CALL_TYPE__FANIN);
        this.createEAttribute(this.synchCallTypeEClass, SYNCH_CALL_TYPE__FANOUT);

        this.taskActivityGraphEClass = this.createEClass(TASK_ACTIVITY_GRAPH);
        this.createEReference(this.taskActivityGraphEClass, TASK_ACTIVITY_GRAPH__REPLY_ENTRY);

        this.taskTypeEClass = this.createEClass(TASK_TYPE);
        this.createEReference(this.taskTypeEClass, TASK_TYPE__RESULT_TASK);
        this.createEReference(this.taskTypeEClass, TASK_TYPE__ENTRY);
        this.createEReference(this.taskTypeEClass, TASK_TYPE__SERVICE);
        this.createEReference(this.taskTypeEClass, TASK_TYPE__TASK_ACTIVITIES);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__ACTIVITY_GRAPH);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__MULTIPLICITY);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__NAME);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__PRIORITY);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__QUEUE_LENGTH);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__REPLICATION);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__SCHEDULING);
        this.createEAttribute(this.taskTypeEClass, TASK_TYPE__THINK_TIME);

        // Create enums
        this.axisTypeEEnum = this.createEEnum(AXIS_TYPE);
        this.callOrderTypeEEnum = this.createEEnum(CALL_ORDER_TYPE);
        this.schedulingTypeEEnum = this.createEEnum(SCHEDULING_TYPE);
        this.semaphoreTypeEEnum = this.createEEnum(SEMAPHORE_TYPE);
        this.taskOptionTypeEEnum = this.createEEnum(TASK_OPTION_TYPE);
        this.taskSchedulingTypeEEnum = this.createEEnum(TASK_SCHEDULING_TYPE);
        this.typeTypeEEnum = this.createEEnum(TYPE_TYPE);
        this.validTypeEEnum = this.createEEnum(VALID_TYPE);
        this.xmlDebugTypeEEnum = this.createEEnum(XML_DEBUG_TYPE);

        // Create data types
        this.axisTypeObjectEDataType = this.createEDataType(AXIS_TYPE_OBJECT);
        this.callOrderTypeObjectEDataType = this.createEDataType(CALL_ORDER_TYPE_OBJECT);
        this.connectFromTypeEDataType = this.createEDataType(CONNECT_FROM_TYPE);
        this.connectToTypeEDataType = this.createEDataType(CONNECT_TO_TYPE);
        this.phaseTypeEDataType = this.createEDataType(PHASE_TYPE);
        this.schedulingTypeObjectEDataType = this.createEDataType(SCHEDULING_TYPE_OBJECT);
        this.sciNotationEDataType = this.createEDataType(SCI_NOTATION);
        this.semaphoreTypeObjectEDataType = this.createEDataType(SEMAPHORE_TYPE_OBJECT);
        this.srvnFloatEDataType = this.createEDataType(SRVN_FLOAT);
        this.taskOptionTypeObjectEDataType = this.createEDataType(TASK_OPTION_TYPE_OBJECT);
        this.taskSchedulingTypeObjectEDataType = this.createEDataType(TASK_SCHEDULING_TYPE_OBJECT);
        this.typeTypeObjectEDataType = this.createEDataType(TYPE_TYPE_OBJECT);
        this.validTypeObjectEDataType = this.createEDataType(VALID_TYPE_OBJECT);
        this.xmlDebugTypeObjectEDataType = this.createEDataType(XML_DEBUG_TYPE_OBJECT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
                .getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.activityDefTypeEClass.getESuperTypes().add(this.getActivityDefBase());
        this.activityLoopTypeEClass.getESuperTypes().add(this.getActivityType());
        this.activityMakingCallTypeEClass.getESuperTypes().add(this.getMakingCallType());
        this.activityOrTypeEClass.getESuperTypes().add(this.getActivityType());
        this.activityPhasesTypeEClass.getESuperTypes().add(this.getActivityDefBase());
        this.entryActivityDefTypeEClass.getESuperTypes().add(this.getActivityDefBase());
        this.entryActivityGraphEClass.getESuperTypes().add(this.getActivityGraphBase());
        this.entryMakingCallTypeEClass.getESuperTypes().add(this.getMakingCallType());
        this.outputEntryDistributionTypeEClass.getESuperTypes().add(this.getOutputDistributionType());
        this.taskActivityGraphEClass.getESuperTypes().add(this.getActivityGraphBase());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.activityDefBaseEClass, ActivityDefBase.class, "ActivityDefBase", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getActivityDefBase_ResultJoinDelay(), this.getOutputResultForwardingANDJoinDelay(),
                null, "resultJoinDelay", null, 0, -1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityDefBase_ResultForwarding(), this.getOutputResultForwardingANDJoinDelay(),
                null, "resultForwarding", null, 0, -1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityDefBase_ServiceTimeDistribution(), this.getOutputDistributionType(), null,
                "serviceTimeDistribution", null, 0, -1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityDefBase_ResultActivity(), this.getOutputResultType(), null,
                "resultActivity", null, 0, -1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefBase_CallOrder(), this.getCallOrderType(), "callOrder", "STOCHASTIC", 0,
                1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefBase_HostDemandCvsq(), this.getSrvnFloat(), "hostDemandCvsq", null, 0, 1,
                ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefBase_HostDemandMean(), this.getSrvnFloat(), "hostDemandMean", null, 1, 1,
                ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefBase_MaxServiceTime(), this.getSrvnFloat(), "maxServiceTime", null, 0, 1,
                ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefBase_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefBase_ThinkTime(), this.getSrvnFloat(), "thinkTime", null, 0, 1,
                ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityDefTypeEClass, ActivityDefType.class, "ActivityDefType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getActivityDefType_CallList(), this.getCallListType(), null, "callList", null, 0, -1,
                ActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefType_Group(), this.ecorePackage.getEFeatureMapEntry(), "group", null, 0,
                -1, ActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityDefType_SynchCall(), this.getActivityMakingCallType(), null, "synchCall",
                null, 0, -1, ActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityDefType_AsynchCall(), this.getActivityMakingCallType(), null, "asynchCall",
                null, 0, -1, ActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityDefType_BoundToEntry(), theXMLTypePackage.getString(), "boundToEntry", null,
                0, 1, ActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityGraphBaseEClass, ActivityGraphBase.class, "ActivityGraphBase", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getActivityGraphBase_Activity(), this.getActivityDefType(), null, "activity", null, 1,
                -1, ActivityGraphBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityGraphBase_Precedence(), this.getPrecedenceType(), null, "precedence", null,
                0, -1, ActivityGraphBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityListTypeEClass, ActivityListType.class, "ActivityListType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getActivityListType_Activity(), this.getActivityType(), null, "activity", null, 1, -1,
                ActivityListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityLoopListTypeEClass, ActivityLoopListType.class, "ActivityLoopListType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getActivityLoopListType_Activity(), this.getActivityLoopType(), null, "activity", null,
                1, -1, ActivityLoopListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityLoopListType_End(), theXMLTypePackage.getString(), "end", null, 0, 1,
                ActivityLoopListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityLoopTypeEClass, ActivityLoopType.class, "ActivityLoopType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getActivityLoopType_Count(), this.getSrvnFloat(), "count", null, 1, 1,
                ActivityLoopType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityMakingCallTypeEClass, ActivityMakingCallType.class, "ActivityMakingCallType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getActivityMakingCallType_CallsMean(), this.getSrvnFloat(), "callsMean", null, 1, 1,
                ActivityMakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityOrTypeEClass, ActivityOrType.class, "ActivityOrType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getActivityOrType_Prob(), theXMLTypePackage.getString(), "prob", "1", 0, 1,
                ActivityOrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityPhasesTypeEClass, ActivityPhasesType.class, "ActivityPhasesType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getActivityPhasesType_CallList(), this.getCallListType(), null, "callList", null, 0,
                -1, ActivityPhasesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityPhasesType_Group(), this.ecorePackage.getEFeatureMapEntry(), "group", null,
                0, -1, ActivityPhasesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityPhasesType_SynchCall(), this.getActivityMakingCallType(), null, "synchCall",
                null, 0, -1, ActivityPhasesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getActivityPhasesType_AsynchCall(), this.getActivityMakingCallType(), null,
                "asynchCall", null, 0, -1, ActivityPhasesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getActivityPhasesType_Phase(), this.getPhaseType(), "phase", null, 1, 1,
                ActivityPhasesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.activityTypeEClass, ActivityType.class, "ActivityType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.andJoinListTypeEClass, AndJoinListType.class, "AndJoinListType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAndJoinListType_Activity(), this.getActivityType(), null, "activity", null, 1, -1,
                AndJoinListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getAndJoinListType_Quorum(), theXMLTypePackage.getNonNegativeInteger(), "quorum", "0",
                0, 1, AndJoinListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.asynchCallTypeEClass, AsynchCallType.class, "AsynchCallType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getAsynchCallType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1,
                AsynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getAsynchCallType_Fanin(), theXMLTypePackage.getInt(), "fanin", null, 0, 1,
                AsynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getAsynchCallType_Fanout(), theXMLTypePackage.getInt(), "fanout", null, 0, 1,
                AsynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.bindTypeEClass, BindType.class, "BindType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getBindType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1,
                BindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getBindType_ProcessorBinding(), this.getProcessorBindingType(), null,
                "processorBinding", null, 0, -1, BindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getBindType_PortBinding(), this.getPortBindingType(), null, "portBinding", null, 0, -1,
                BindType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.callListTypeEClass, CallListType.class, "CallListType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCallListType_SynchCall(), this.getSynchCallType(), null, "synchCall", null, 0, -1,
                CallListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getCallListType_AsynchCall(), this.getAsynchCallType(), null, "asynchCall", null, 0,
                -1, CallListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDocumentRoot_Mixed(), this.ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1,
                null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEReference(this.getDocumentRoot_XMLNSPrefixMap(), this.ecorePackage.getEStringToStringMapEntry(), null,
                "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getDocumentRoot_XSISchemaLocation(), this.ecorePackage.getEStringToStringMapEntry(),
                null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getDocumentRoot_LqnCore(), this.getLqnCoreType(), null, "lqnCore", null, 0, -2, null,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getDocumentRoot_LqnModel(), this.getLqnModelType(), null, "lqnModel", null, 0, -2,
                null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        this.initEClass(this.entryActivityDefTypeEClass, EntryActivityDefType.class, "EntryActivityDefType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEntryActivityDefType_CallList(), this.getCallListType(), null, "callList", null, 0,
                -1, EntryActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryActivityDefType_Group(), this.ecorePackage.getEFeatureMapEntry(), "group",
                null, 0, -1, EntryActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEntryActivityDefType_SynchCall(), this.getActivityMakingCallType(), null,
                "synchCall", null, 0, -1, EntryActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEntryActivityDefType_AsynchCall(), this.getActivityMakingCallType(), null,
                "asynchCall", null, 0, -1, EntryActivityDefType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryActivityDefType_FirstActivity(), theXMLTypePackage.getString(),
                "firstActivity", null, 0, 1, EntryActivityDefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.entryActivityGraphEClass, EntryActivityGraph.class, "EntryActivityGraph", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEntryActivityGraph_ReplyActivity(), this.getReplyActivityType(), null,
                "replyActivity", null, 1, -1, EntryActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.entryMakingCallTypeEClass, EntryMakingCallType.class, "EntryMakingCallType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEntryMakingCallType_Prob(), this.getSrvnFloat(), "prob", null, 1, 1,
                EntryMakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEntryType_ResultEntry(), this.getOutputResultType(), null, "resultEntry", null, 0,
                -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEntryType_ServiceTimeDistribution(), this.getOutputEntryDistributionType(), null,
                "serviceTimeDistribution", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEntryType_Forwarding(), this.getEntryMakingCallType(), null, "forwarding", null, 0,
                -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEntryType_EntryActivityGraph(), this.getEntryActivityGraph(), null,
                "entryActivityGraph", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEntryType_EntryPhaseActivities(), this.getPhaseActivities(), null,
                "entryPhaseActivities", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryType_OpenArrivalRate(), this.getSrvnFloat(), "openArrivalRate", null, 0, 1,
                EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryType_Priority(), theXMLTypePackage.getInt(), "priority", null, 0, 1,
                EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryType_Semaphore(), this.getSemaphoreType(), "semaphore", "signal", 0, 1,
                EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEntryType_Type(), this.getTypeType(), "type", "PH1PH2", 1, 1, EntryType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.firstPlotTypeEClass, FirstPlotType.class, "FirstPlotType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getFirstPlotType_Variable(), theXMLTypePackage.getString(), "variable", null, 0, 1,
                FirstPlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.histogramBinTypeEClass, HistogramBinType.class, "HistogramBinType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getHistogramBinType_Begin(), this.getSrvnFloat(), "begin", null, 1, 1,
                HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getHistogramBinType_Conf95(), this.getSrvnFloat(), "conf95", null, 0, 1,
                HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getHistogramBinType_Conf99(), this.getSrvnFloat(), "conf99", null, 0, 1,
                HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getHistogramBinType_End(), this.getSrvnFloat(), "end", null, 0, 1,
                HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getHistogramBinType_Prob(), this.getSrvnFloat(), "prob", null, 1, 1,
                HistogramBinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.inPortTypeEClass, InPortType.class, "InPortType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getInPortType_ConnectFrom(), this.getConnectFromType(), "connectFrom", null, 0, 1,
                InPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getInPortType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
                InPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getInPortType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                InPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.interfaceTypeEClass, InterfaceType.class, "InterfaceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getInterfaceType_InPort(), this.getInPortType(), null, "inPort", null, 0, -1,
                InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getInterfaceType_OutPort(), this.getOutPortType(), null, "outPort", null, 0, -1,
                InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.lqnCoreTypeEClass, LqnCoreType.class, "LqnCoreType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getLqnCoreType_Processor(), this.getProcessorType(), null, "processor", null, 1, -1,
                LqnCoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getLqnCoreType_Slot(), this.getSlotType(), null, "slot", null, 0, -1,
                LqnCoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.lqnModelTypeEClass, LqnModelType.class, "LqnModelType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getLqnModelType_RunControl(), this.getRunControlType(), null, "runControl", null, 0, 1,
                LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getLqnModelType_PlotControl(), this.getPlotControlType(), null, "plotControl", null, 0,
                1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getLqnModelType_SolverParams(), this.getSolverParamsType(), null, "solverParams", null,
                1, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getLqnModelType_Processor(), this.getProcessorType(), null, "processor", null, 1, -1,
                LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getLqnModelType_Slot(), this.getSlotType(), null, "slot", null, 0, -1,
                LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLqnModelType_Description(), theXMLTypePackage.getString(), "description", null, 0,
                1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLqnModelType_LqncoreSchemaVersion(), theXMLTypePackage.getDecimal(),
                "lqncoreSchemaVersion", "1.0", 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLqnModelType_LqnSchemaVersion(), theXMLTypePackage.getDecimal(), "lqnSchemaVersion",
                "1.0", 0, 1, LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLqnModelType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
                LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getLqnModelType_XmlDebug(), this.getXmlDebugType(), "xmlDebug", "true", 0, 1,
                LqnModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.makingCallTypeEClass, MakingCallType.class, "MakingCallType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMakingCallType_ResultCall(), this.getOutputResultType(), null, "resultCall", null,
                0, -1, MakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMakingCallType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1,
                MakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMakingCallType_Fanin(), theXMLTypePackage.getInt(), "fanin", null, 0, 1,
                MakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMakingCallType_Fanout(), theXMLTypePackage.getInt(), "fanout", null, 0, 1,
                MakingCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.orListTypeEClass, OrListType.class, "OrListType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOrListType_Activity(), this.getActivityOrType(), null, "activity", null, 1, -1,
                OrListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.outPortTypeEClass, OutPortType.class, "OutPortType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getOutPortType_ConnectTo(), this.getConnectToType(), "connectTo", null, 0, 1,
                OutPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutPortType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1,
                OutPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutPortType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                OutPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.outputDistributionTypeEClass, OutputDistributionType.class, "OutputDistributionType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOutputDistributionType_UnderflowBin(), this.getHistogramBinType(), null,
                "underflowBin", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getOutputDistributionType_HistogramBin(), this.getHistogramBinType(), null,
                "histogramBin", null, 0, -1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getOutputDistributionType_OverflowBin(), this.getHistogramBinType(), null,
                "overflowBin", null, 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_BinSize(), this.getSrvnFloat(), "binSize", null, 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_Kurtosis(), this.getSrvnFloat(), "kurtosis", null, 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_Max(), this.getSrvnFloat(), "max", null, 1, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_Mean(), this.getSrvnFloat(), "mean", null, 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_MidPoint(), this.getSrvnFloat(), "midPoint", null, 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_Min(), this.getSrvnFloat(), "min", null, 1, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_NumberBins(), theXMLTypePackage.getNonNegativeInteger(),
                "numberBins", "20", 0, 1, OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_Skew(), this.getSrvnFloat(), "skew", null, 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_StdDev(), this.getSrvnFloat(), "stdDev", null, 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputDistributionType_XSamples(), this.getAxisType(), "xSamples", "linear", 0, 1,
                OutputDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.outputEntryDistributionTypeEClass, OutputEntryDistributionType.class,
                "OutputEntryDistributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getOutputEntryDistributionType_Phase(), theXMLTypePackage.getNonNegativeInteger(),
                "phase", null, 1, 1, OutputEntryDistributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.outputResultForwardingANDJoinDelayEClass, OutputResultForwardingANDJoinDelay.class,
                "OutputResultForwardingANDJoinDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOutputResultForwardingANDJoinDelay_ResultConf95(), this.getResultConf95Type(), null,
                "resultConf95", null, 0, -1, OutputResultForwardingANDJoinDelay.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getOutputResultForwardingANDJoinDelay_ResultConf99(), this.getResultConf99Type(), null,
                "resultConf99", null, 0, -1, OutputResultForwardingANDJoinDelay.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultForwardingANDJoinDelay_Dest(), theXMLTypePackage.getString(), "dest",
                null, 1, 1, OutputResultForwardingANDJoinDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultForwardingANDJoinDelay_JoinVariance(), this.getSrvnFloat(),
                "joinVariance", null, 0, 1, OutputResultForwardingANDJoinDelay.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultForwardingANDJoinDelay_JoinWaiting(), this.getSrvnFloat(),
                "joinWaiting", null, 0, 1, OutputResultForwardingANDJoinDelay.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultForwardingANDJoinDelay_Waiting(), this.getSrvnFloat(), "waiting", null,
                0, 1, OutputResultForwardingANDJoinDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.outputResultTypeEClass, OutputResultType.class, "OutputResultType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOutputResultType_ResultConf95(), this.getResultConf95Type1(), null, "resultConf95",
                null, 0, -1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getOutputResultType_ResultConf99(), this.getResultConf99Type1(), null, "resultConf99",
                null, 0, -1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_OpenWaitTime(), this.getSrvnFloat(), "openWaitTime", null, 0, 1,
                OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase1ProcWaiting(), this.getSrvnFloat(), "phase1ProcWaiting",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase1ServiceTime(), this.getSrvnFloat(), "phase1ServiceTime",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase1ServiceTimeVariance(), this.getSrvnFloat(),
                "phase1ServiceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase1Utilization(), this.getSrvnFloat(), "phase1Utilization",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase2ProcWaiting(), this.getSrvnFloat(), "phase2ProcWaiting",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase2ServiceTime(), this.getSrvnFloat(), "phase2ServiceTime",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase2ServiceTimeVariance(), this.getSrvnFloat(),
                "phase2ServiceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase2Utilization(), this.getSrvnFloat(), "phase2Utilization",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase3ProcWaiting(), this.getSrvnFloat(), "phase3ProcWaiting",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase3ServiceTime(), this.getSrvnFloat(), "phase3ServiceTime",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase3ServiceTimeVariance(), this.getSrvnFloat(),
                "phase3ServiceTimeVariance", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Phase3Utilization(), this.getSrvnFloat(), "phase3Utilization",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_ProbExceedMaxServiceTime(), this.getSrvnFloat(),
                "probExceedMaxServiceTime", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_ProcUtilization(), this.getSrvnFloat(), "procUtilization", null, 0,
                1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_ProcWaiting(), this.getSrvnFloat(), "procWaiting", null, 0, 1,
                OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_ServiceTime(), this.getSrvnFloat(), "serviceTime", null, 0, 1,
                OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_ServiceTimeVariance(), this.getSrvnFloat(), "serviceTimeVariance",
                null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_SquaredCoeffVariation(), this.getSrvnFloat(),
                "squaredCoeffVariation", null, 0, 1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Throughput(), this.getSrvnFloat(), "throughput", null, 0, 1,
                OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_ThroughputBound(), this.getSrvnFloat(), "throughputBound", null, 0,
                1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Utilization(), this.getSrvnFloat(), "utilization", null, 0, 1,
                OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_Waiting(), this.getSrvnFloat(), "waiting", null, 0, 1,
                OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getOutputResultType_WaitingVariance(), this.getSrvnFloat(), "waitingVariance", null, 0,
                1, OutputResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getParameterType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getParameterType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1,
                ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.paraTypeEClass, ParaType.class, "ParaType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getParaType_StartValue(), theXMLTypePackage.getInt(), "startValue", null, 0, 1,
                ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getParaType_EndValue(), theXMLTypePackage.getInt(), "endValue", null, 0, 1,
                ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getParaType_StepValue(), theXMLTypePackage.getInt(), "stepValue", null, 0, 1,
                ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getParaType_Value(), theXMLTypePackage.getInt(), "value", null, 0, -1, ParaType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        this.initEClass(this.phaseActivitiesEClass, PhaseActivities.class, "PhaseActivities", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getPhaseActivities_Activity(), this.getActivityPhasesType(), null, "activity", null, 1,
                3, PhaseActivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.plotControlTypeEClass, PlotControlType.class, "PlotControlType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getPlotControlType_FirstPlot(), this.getFirstPlotType(), null, "firstPlot", null, 1, 1,
                PlotControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPlotControlType_Plot(), this.getPlotType(), null, "plot", null, 1, -1,
                PlotControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.plotTypeEClass, PlotType.class, "PlotType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getPlotType_Variable(), theXMLTypePackage.getString(), "variable", null, 0, 1,
                PlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.portBindingTypeEClass, PortBindingType.class, "PortBindingType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getPortBindingType_Source(), theXMLTypePackage.getString(), "source", null, 1, 1,
                PortBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getPortBindingType_Target(), theXMLTypePackage.getString(), "target", null, 1, 1,
                PortBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.pragmaTypeEClass, PragmaType.class, "PragmaType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getPragmaType_Param(), theXMLTypePackage.getString(), "param", null, 1, 1,
                PragmaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getPragmaType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1,
                PragmaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.precedenceTypeEClass, PrecedenceType.class, "PrecedenceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getPrecedenceType_Pre(), this.getSingleActivityListType(), null, "pre", null, 0, 1,
                PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPrecedenceType_PreOR(), this.getActivityListType(), null, "preOR", null, 0, 1,
                PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPrecedenceType_PreAND(), this.getAndJoinListType(), null, "preAND", null, 0, 1,
                PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPrecedenceType_Post(), this.getSingleActivityListType(), null, "post", null, 0, 1,
                PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPrecedenceType_PostOR(), this.getOrListType(), null, "postOR", null, 0, 1,
                PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPrecedenceType_PostAND(), this.getActivityListType(), null, "postAND", null, 0, 1,
                PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getPrecedenceType_PostLOOP(), this.getActivityLoopListType(), null, "postLOOP", null,
                0, 1, PrecedenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.processorBindingTypeEClass, ProcessorBindingType.class, "ProcessorBindingType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getProcessorBindingType_Source(), theXMLTypePackage.getString(), "source", null, 1, 1,
                ProcessorBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorBindingType_Target(), theXMLTypePackage.getString(), "target", null, 1, 1,
                ProcessorBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.processorTypeEClass, ProcessorType.class, "ProcessorType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProcessorType_ResultProcessor(), this.getOutputResultType(), null,
                "resultProcessor", null, 0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getProcessorType_Task(), this.getTaskType(), null, "task", null, 1, -1,
                ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorType_Multiplicity(), theXMLTypePackage.getNonNegativeInteger(),
                "multiplicity", "1", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorType_Quantum(), this.getSrvnFloat(), "quantum", "0", 0, 1,
                ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorType_Replication(), theXMLTypePackage.getNonNegativeInteger(),
                "replication", "1", 0, 1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorType_Scheduling(), this.getSchedulingType(), "scheduling", "fcfs", 0, 1,
                ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getProcessorType_SpeedFactor(), this.getSrvnFloat(), "speedFactor", "1", 0, 1,
                ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.replyActivityTypeEClass, ReplyActivityType.class, "ReplyActivityType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getReplyActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ReplyActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.replyEntryTypeEClass, ReplyEntryType.class, "ReplyEntryType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getReplyEntryType_ReplyActivity(), this.getReplyActivityType(), null, "replyActivity",
                null, 1, -1, ReplyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getReplyEntryType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ReplyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resultConf95TypeEClass, ResultConf95Type.class, "ResultConf95Type", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResultConf95Type_JoinVariance(), this.getSrvnFloat(), "joinVariance", null, 0, 1,
                ResultConf95Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type_JoinWaiting(), this.getSrvnFloat(), "joinWaiting", null, 0, 1,
                ResultConf95Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type_Waiting(), this.getSrvnFloat(), "waiting", null, 0, 1,
                ResultConf95Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resultConf95Type1EClass, ResultConf95Type1.class, "ResultConf95Type1", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResultConf95Type1_OpenWaitTime(), this.getSrvnFloat(), "openWaitTime", null, 0, 1,
                ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase1ProcWaiting(), this.getSrvnFloat(), "phase1ProcWaiting",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase1ServiceTime(), this.getSrvnFloat(), "phase1ServiceTime",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase1ServiceTimeVariance(), this.getSrvnFloat(),
                "phase1ServiceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase1Utilization(), this.getSrvnFloat(), "phase1Utilization",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase2ProcWaiting(), this.getSrvnFloat(), "phase2ProcWaiting",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase2ServiceTime(), this.getSrvnFloat(), "phase2ServiceTime",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase2ServiceTimeVariance(), this.getSrvnFloat(),
                "phase2ServiceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase2Utilization(), this.getSrvnFloat(), "phase2Utilization",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase3ProcWaiting(), this.getSrvnFloat(), "phase3ProcWaiting",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase3ServiceTime(), this.getSrvnFloat(), "phase3ServiceTime",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase3ServiceTimeVariance(), this.getSrvnFloat(),
                "phase3ServiceTimeVariance", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Phase3Utilization(), this.getSrvnFloat(), "phase3Utilization",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_ProbExceedMaxServiceTime(), this.getSrvnFloat(),
                "probExceedMaxServiceTime", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_ProcUtilization(), this.getSrvnFloat(), "procUtilization", null,
                0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_ProcWaiting(), this.getSrvnFloat(), "procWaiting", null, 0, 1,
                ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_ServiceTime(), this.getSrvnFloat(), "serviceTime", null, 0, 1,
                ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_ServiceTimeVariance(), this.getSrvnFloat(), "serviceTimeVariance",
                null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_SquaredCoeffVariation(), this.getSrvnFloat(),
                "squaredCoeffVariation", null, 0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Throughput(), this.getSrvnFloat(), "throughput", null, 0, 1,
                ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_ThroughputBound(), this.getSrvnFloat(), "throughputBound", null,
                0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Utilization(), this.getSrvnFloat(), "utilization", null, 0, 1,
                ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_Waiting(), this.getSrvnFloat(), "waiting", null, 0, 1,
                ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf95Type1_WaitingVariance(), this.getSrvnFloat(), "waitingVariance", null,
                0, 1, ResultConf95Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resultConf99TypeEClass, ResultConf99Type.class, "ResultConf99Type", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResultConf99Type_JoinVariance(), this.getSrvnFloat(), "joinVariance", null, 0, 1,
                ResultConf99Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type_JoinWaiting(), this.getSrvnFloat(), "joinWaiting", null, 0, 1,
                ResultConf99Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type_Waiting(), this.getSrvnFloat(), "waiting", null, 0, 1,
                ResultConf99Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resultConf99Type1EClass, ResultConf99Type1.class, "ResultConf99Type1", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResultConf99Type1_OpenWaitTime(), this.getSrvnFloat(), "openWaitTime", null, 0, 1,
                ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase1ProcWaiting(), this.getSrvnFloat(), "phase1ProcWaiting",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase1ServiceTime(), this.getSrvnFloat(), "phase1ServiceTime",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase1ServiceTimeVariance(), this.getSrvnFloat(),
                "phase1ServiceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase1Utilization(), this.getSrvnFloat(), "phase1Utilization",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase2ProcWaiting(), this.getSrvnFloat(), "phase2ProcWaiting",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase2ServiceTime(), this.getSrvnFloat(), "phase2ServiceTime",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase2ServiceTimeVariance(), this.getSrvnFloat(),
                "phase2ServiceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase2Utilization(), this.getSrvnFloat(), "phase2Utilization",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase3ProcWaiting(), this.getSrvnFloat(), "phase3ProcWaiting",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase3ServiceTime(), this.getSrvnFloat(), "phase3ServiceTime",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase3ServiceTimeVariance(), this.getSrvnFloat(),
                "phase3ServiceTimeVariance", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Phase3Utilization(), this.getSrvnFloat(), "phase3Utilization",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_ProbExceedMaxServiceTime(), this.getSrvnFloat(),
                "probExceedMaxServiceTime", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_ProcUtilization(), this.getSrvnFloat(), "procUtilization", null,
                0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_ProcWaiting(), this.getSrvnFloat(), "procWaiting", null, 0, 1,
                ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_ServiceTime(), this.getSrvnFloat(), "serviceTime", null, 0, 1,
                ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_ServiceTimeVariance(), this.getSrvnFloat(), "serviceTimeVariance",
                null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_SquaredCoeffVariation(), this.getSrvnFloat(),
                "squaredCoeffVariation", null, 0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Throughput(), this.getSrvnFloat(), "throughput", null, 0, 1,
                ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_ThroughputBound(), this.getSrvnFloat(), "throughputBound", null,
                0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Utilization(), this.getSrvnFloat(), "utilization", null, 0, 1,
                ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_Waiting(), this.getSrvnFloat(), "waiting", null, 0, 1,
                ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultConf99Type1_WaitingVariance(), this.getSrvnFloat(), "waitingVariance", null,
                0, 1, ResultConf99Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resultGeneralTypeEClass, ResultGeneralType.class, "ResultGeneralType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResultGeneralType_ConvVal(), this.getSrvnFloat(), "convVal", null, 1, 1,
                ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_ElapsedTime(), theXMLTypePackage.getString(), "elapsedTime", null,
                0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_Iterations(), this.getSrvnFloat(), "iterations", null, 0, 1,
                ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_PlatformInfo(), theXMLTypePackage.getString(), "platformInfo",
                null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_SolverInfo(), theXMLTypePackage.getString(), "solverInfo", null,
                0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_SystemCpuTime(), theXMLTypePackage.getString(), "systemCpuTime",
                null, 0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_UserCpuTime(), theXMLTypePackage.getString(), "userCpuTime", null,
                0, 1, ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getResultGeneralType_Valid(), this.getValidType(), "valid", "YES", 1, 1,
                ResultGeneralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.runControlTypeEClass, RunControlType.class, "RunControlType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRunControlType_Para(), this.getParaType(), null, "para", null, 0, -1,
                RunControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getServiceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
                ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.singleActivityListTypeEClass, SingleActivityListType.class, "SingleActivityListType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSingleActivityListType_Activity(), this.getActivityType(), null, "activity", null,
                1, 1, SingleActivityListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.slotTypeEClass, SlotType.class, "SlotType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSlotType_Interface(), this.getInterfaceType(), null, "interface", null, 1, 1,
                SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getSlotType_Binding(), this.getBindType(), null, "binding", null, 1, -1,
                SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSlotType_BindTarget(), theXMLTypePackage.getString(), "bindTarget", null, 1, 1,
                SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSlotType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, SlotType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSlotType_ReplicNum(), theXMLTypePackage.getInt(), "replicNum", null, 0, 1,
                SlotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.solverParamsTypeEClass, SolverParamsType.class, "SolverParamsType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSolverParamsType_ResultGeneral(), this.getResultGeneralType(), null,
                "resultGeneral", null, 0, 1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getSolverParamsType_Pragma(), this.getPragmaType(), null, "pragma", null, 0, -1,
                SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSolverParamsType_Comment(), theXMLTypePackage.getString(), "comment", "", 0, 1,
                SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSolverParamsType_ConvVal(), this.getSrvnFloat(), "convVal", "1", 0, 1,
                SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSolverParamsType_ItLimit(), theXMLTypePackage.getInt(), "itLimit", "50", 0, 1,
                SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSolverParamsType_PrintInt(), theXMLTypePackage.getInt(), "printInt", "0", 0, 1,
                SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSolverParamsType_UnderrelaxCoeff(), this.getSrvnFloat(), "underrelaxCoeff", "1", 0,
                1, SolverParamsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.synchCallTypeEClass, SynchCallType.class, "SynchCallType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getSynchCallType_Dest(), theXMLTypePackage.getString(), "dest", null, 1, 1,
                SynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSynchCallType_Fanin(), theXMLTypePackage.getInt(), "fanin", null, 0, 1,
                SynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getSynchCallType_Fanout(), theXMLTypePackage.getInt(), "fanout", null, 0, 1,
                SynchCallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.taskActivityGraphEClass, TaskActivityGraph.class, "TaskActivityGraph", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTaskActivityGraph_ReplyEntry(), this.getReplyEntryType(), null, "replyEntry", null,
                0, -1, TaskActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTaskType_ResultTask(), this.getOutputResultType(), null, "resultTask", null, 0, -1,
                TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getTaskType_Entry(), this.getEntryType(), null, "entry", null, 1, -1, TaskType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getTaskType_Service(), this.getServiceType(), null, "service", null, 0, -1,
                TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getTaskType_TaskActivities(), this.getTaskActivityGraph(), null, "taskActivities",
                null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_ActivityGraph(), this.getTaskOptionType(), "activityGraph", "YES", 0, 1,
                TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_Multiplicity(), theXMLTypePackage.getNonNegativeInteger(), "multiplicity",
                "1", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TaskType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_Priority(), theXMLTypePackage.getNonNegativeInteger(), "priority", "0", 0,
                1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_QueueLength(), theXMLTypePackage.getNonNegativeInteger(), "queueLength",
                "0", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_Replication(), theXMLTypePackage.getNonNegativeInteger(), "replication",
                "1", 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_Scheduling(), this.getTaskSchedulingType(), "scheduling", "fcfs", 0, 1,
                TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTaskType_ThinkTime(), this.getSrvnFloat(), "thinkTime", "0", 0, 1, TaskType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.axisTypeEEnum, AxisType.class, "AxisType");
        this.addEEnumLiteral(this.axisTypeEEnum, AxisType.LINEAR);
        this.addEEnumLiteral(this.axisTypeEEnum, AxisType.LOG);

        this.initEEnum(this.callOrderTypeEEnum, CallOrderType.class, "CallOrderType");
        this.addEEnumLiteral(this.callOrderTypeEEnum, CallOrderType.STOCHASTIC);
        this.addEEnumLiteral(this.callOrderTypeEEnum, CallOrderType.DETERMINISTIC);
        this.addEEnumLiteral(this.callOrderTypeEEnum, CallOrderType.LIST);

        this.initEEnum(this.schedulingTypeEEnum, SchedulingType.class, "SchedulingType");
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.FCFS);
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.PS);
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.PP);
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.RAND);
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.HOL);
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.PS_HOL);
        this.addEEnumLiteral(this.schedulingTypeEEnum, SchedulingType.PS_PP);

        this.initEEnum(this.semaphoreTypeEEnum, SemaphoreType.class, "SemaphoreType");
        this.addEEnumLiteral(this.semaphoreTypeEEnum, SemaphoreType.SIGNAL);
        this.addEEnumLiteral(this.semaphoreTypeEEnum, SemaphoreType.WAIT);

        this.initEEnum(this.taskOptionTypeEEnum, TaskOptionType.class, "TaskOptionType");
        this.addEEnumLiteral(this.taskOptionTypeEEnum, TaskOptionType.YES);
        this.addEEnumLiteral(this.taskOptionTypeEEnum, TaskOptionType.NO);

        this.initEEnum(this.taskSchedulingTypeEEnum, TaskSchedulingType.class, "TaskSchedulingType");
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.REF);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.FCFS);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.PRI);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.HOL);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.BURST);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.POLL);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.INF);
        this.addEEnumLiteral(this.taskSchedulingTypeEEnum, TaskSchedulingType.SEMAPHORE);

        this.initEEnum(this.typeTypeEEnum, TypeType.class, "TypeType");
        this.addEEnumLiteral(this.typeTypeEEnum, TypeType.PH1PH2);
        this.addEEnumLiteral(this.typeTypeEEnum, TypeType.GRAPH);
        this.addEEnumLiteral(this.typeTypeEEnum, TypeType.NONE);

        this.initEEnum(this.validTypeEEnum, ValidType.class, "ValidType");
        this.addEEnumLiteral(this.validTypeEEnum, ValidType.YES);
        this.addEEnumLiteral(this.validTypeEEnum, ValidType.NO);

        this.initEEnum(this.xmlDebugTypeEEnum, XmlDebugType.class, "XmlDebugType");
        this.addEEnumLiteral(this.xmlDebugTypeEEnum, XmlDebugType.TRUE);
        this.addEEnumLiteral(this.xmlDebugTypeEEnum, XmlDebugType.FALSE);

        // Initialize data types
        this.initEDataType(this.axisTypeObjectEDataType, AxisType.class, "AxisTypeObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.callOrderTypeObjectEDataType, CallOrderType.class, "CallOrderTypeObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.connectFromTypeEDataType, List.class, "ConnectFromType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.connectToTypeEDataType, List.class, "ConnectToType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.phaseTypeEDataType, BigInteger.class, "PhaseType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.schedulingTypeObjectEDataType, SchedulingType.class, "SchedulingTypeObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.sciNotationEDataType, String.class, "SciNotation", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.semaphoreTypeObjectEDataType, SemaphoreType.class, "SemaphoreTypeObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.srvnFloatEDataType, Object.class, "SrvnFloat", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.taskOptionTypeObjectEDataType, TaskOptionType.class, "TaskOptionTypeObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.taskSchedulingTypeObjectEDataType, TaskSchedulingType.class, "TaskSchedulingTypeObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.validTypeObjectEDataType, ValidType.class, "ValidTypeObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.xmlDebugTypeObjectEDataType, XmlDebugType.class, "XmlDebugTypeObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        this.createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        this.addAnnotation(this, source, new String[] { "qualified", "false" });
        this.addAnnotation(this.activityDefBaseEClass, source,
                new String[] { "name", "ActivityDefBase", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityDefBase_ResultJoinDelay(), source,
                new String[] { "kind", "element", "name", "result-join-delay", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_ResultForwarding(), source,
                new String[] { "kind", "element", "name", "result-forwarding", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_ServiceTimeDistribution(), source, new String[] { "kind", "element",
                "name", "service-time-distribution", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_ResultActivity(), source,
                new String[] { "kind", "element", "name", "result-activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_CallOrder(), source,
                new String[] { "kind", "attribute", "name", "call-order", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_HostDemandCvsq(), source,
                new String[] { "kind", "attribute", "name", "host-demand-cvsq", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_HostDemandMean(), source,
                new String[] { "kind", "attribute", "name", "host-demand-mean", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_MaxServiceTime(), source,
                new String[] { "kind", "attribute", "name", "max-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefBase_ThinkTime(), source,
                new String[] { "kind", "attribute", "name", "think-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityDefTypeEClass, source,
                new String[] { "name", "ActivityDefType", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityDefType_CallList(), source,
                new String[] { "kind", "element", "name", "call-list", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityDefType_Group(), source,
                new String[] { "kind", "group", "name", "group:11" });
        this.addAnnotation(this.getActivityDefType_SynchCall(), source, new String[] { "kind", "element", "name",
                "synch-call", "namespace", "##targetNamespace", "group", "group:11" });
        this.addAnnotation(this.getActivityDefType_AsynchCall(), source, new String[] { "kind", "element", "name",
                "asynch-call", "namespace", "##targetNamespace", "group", "group:11" });
        this.addAnnotation(this.getActivityDefType_BoundToEntry(), source,
                new String[] { "kind", "attribute", "name", "bound-to-entry", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityGraphBaseEClass, source,
                new String[] { "name", "ActivityGraphBase", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityGraphBase_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityGraphBase_Precedence(), source,
                new String[] { "kind", "element", "name", "precedence", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityListTypeEClass, source,
                new String[] { "name", "ActivityListType", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityListType_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityLoopListTypeEClass, source,
                new String[] { "name", "ActivityLoopListType", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityLoopListType_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityLoopListType_End(), source,
                new String[] { "kind", "attribute", "name", "end", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityLoopTypeEClass, source,
                new String[] { "name", "ActivityLoopType", "kind", "empty" });
        this.addAnnotation(this.getActivityLoopType_Count(), source,
                new String[] { "kind", "attribute", "name", "count", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityMakingCallTypeEClass, source,
                new String[] { "name", "ActivityMakingCallType", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityMakingCallType_CallsMean(), source,
                new String[] { "kind", "attribute", "name", "calls-mean", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityOrTypeEClass, source,
                new String[] { "name", "ActivityOrType", "kind", "empty" });
        this.addAnnotation(this.getActivityOrType_Prob(), source,
                new String[] { "kind", "attribute", "name", "prob", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityPhasesTypeEClass, source,
                new String[] { "name", "ActivityPhasesType", "kind", "elementOnly" });
        this.addAnnotation(this.getActivityPhasesType_CallList(), source,
                new String[] { "kind", "element", "name", "call-list", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getActivityPhasesType_Group(), source,
                new String[] { "kind", "group", "name", "group:11" });
        this.addAnnotation(this.getActivityPhasesType_SynchCall(), source, new String[] { "kind", "element", "name",
                "synch-call", "namespace", "##targetNamespace", "group", "group:11" });
        this.addAnnotation(this.getActivityPhasesType_AsynchCall(), source, new String[] { "kind", "element", "name",
                "asynch-call", "namespace", "##targetNamespace", "group", "group:11" });
        this.addAnnotation(this.getActivityPhasesType_Phase(), source,
                new String[] { "kind", "attribute", "name", "phase", "namespace", "##targetNamespace" });
        this.addAnnotation(this.activityTypeEClass, source, new String[] { "name", "ActivityType", "kind", "empty" });
        this.addAnnotation(this.getActivityType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.andJoinListTypeEClass, source,
                new String[] { "name", "AndJoinListType", "kind", "elementOnly" });
        this.addAnnotation(this.getAndJoinListType_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getAndJoinListType_Quorum(), source,
                new String[] { "kind", "attribute", "name", "quorum", "namespace", "##targetNamespace" });
        this.addAnnotation(this.asynchCallTypeEClass, source,
                new String[] { "name", "asynch-call_._type", "kind", "empty" });
        this.addAnnotation(this.getAsynchCallType_Dest(), source,
                new String[] { "kind", "attribute", "name", "dest", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getAsynchCallType_Fanin(), source,
                new String[] { "kind", "attribute", "name", "fanin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getAsynchCallType_Fanout(), source,
                new String[] { "kind", "attribute", "name", "fanout", "namespace", "##targetNamespace" });
        this.addAnnotation(this.axisTypeEEnum, source, new String[] { "name", "AxisType" });
        this.addAnnotation(this.axisTypeObjectEDataType, source,
                new String[] { "name", "AxisType:Object", "baseType", "AxisType" });
        this.addAnnotation(this.bindTypeEClass, source, new String[] { "name", "BindType", "kind", "elementOnly" });
        this.addAnnotation(this.getBindType_Parameter(), source,
                new String[] { "kind", "element", "name", "parameter", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getBindType_ProcessorBinding(), source,
                new String[] { "kind", "element", "name", "processor-binding", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getBindType_PortBinding(), source,
                new String[] { "kind", "element", "name", "port-binding", "namespace", "##targetNamespace" });
        this.addAnnotation(this.callListTypeEClass, source,
                new String[] { "name", "call-list_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getCallListType_SynchCall(), source,
                new String[] { "kind", "element", "name", "synch-call", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getCallListType_AsynchCall(), source,
                new String[] { "kind", "element", "name", "asynch-call", "namespace", "##targetNamespace" });
        this.addAnnotation(this.callOrderTypeEEnum, source, new String[] { "name", "CallOrderType" });
        this.addAnnotation(this.callOrderTypeObjectEDataType, source,
                new String[] { "name", "CallOrderType:Object", "baseType", "CallOrderType" });
        this.addAnnotation(this.connectFromTypeEDataType, source, new String[] { "name", "connect-from_._type",
                "itemType", "http://www.eclipse.org/emf/2003/XMLType#string" });
        this.addAnnotation(this.connectToTypeEDataType, source, new String[] { "name", "connect-to_._type", "itemType",
                "http://www.eclipse.org/emf/2003/XMLType#string" });
        this.addAnnotation(this.documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
        this.addAnnotation(this.getDocumentRoot_Mixed(), source,
                new String[] { "kind", "elementWildcard", "name", ":mixed" });
        this.addAnnotation(this.getDocumentRoot_XMLNSPrefixMap(), source,
                new String[] { "kind", "attribute", "name", "xmlns:prefix" });
        this.addAnnotation(this.getDocumentRoot_XSISchemaLocation(), source,
                new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
        this.addAnnotation(this.getDocumentRoot_LqnCore(), source,
                new String[] { "kind", "element", "name", "lqn-core", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getDocumentRoot_LqnModel(), source,
                new String[] { "kind", "element", "name", "lqn-model", "namespace", "##targetNamespace" });
        this.addAnnotation(this.entryActivityDefTypeEClass, source,
                new String[] { "name", "EntryActivityDefType", "kind", "elementOnly" });
        this.addAnnotation(this.getEntryActivityDefType_CallList(), source,
                new String[] { "kind", "element", "name", "call-list", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryActivityDefType_Group(), source,
                new String[] { "kind", "group", "name", "group:11" });
        this.addAnnotation(this.getEntryActivityDefType_SynchCall(), source, new String[] { "kind", "element", "name",
                "synch-call", "namespace", "##targetNamespace", "group", "group:11" });
        this.addAnnotation(this.getEntryActivityDefType_AsynchCall(), source, new String[] { "kind", "element", "name",
                "asynch-call", "namespace", "##targetNamespace", "group", "group:11" });
        this.addAnnotation(this.getEntryActivityDefType_FirstActivity(), source,
                new String[] { "kind", "attribute", "name", "first-activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.entryActivityGraphEClass, source,
                new String[] { "name", "EntryActivityGraph", "kind", "elementOnly" });
        this.addAnnotation(this.getEntryActivityGraph_ReplyActivity(), source,
                new String[] { "kind", "element", "name", "reply-activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.entryMakingCallTypeEClass, source,
                new String[] { "name", "EntryMakingCallType", "kind", "elementOnly" });
        this.addAnnotation(this.getEntryMakingCallType_Prob(), source,
                new String[] { "kind", "attribute", "name", "prob", "namespace", "##targetNamespace" });
        this.addAnnotation(this.entryTypeEClass, source, new String[] { "name", "EntryType", "kind", "elementOnly" });
        this.addAnnotation(this.getEntryType_ResultEntry(), source,
                new String[] { "kind", "element", "name", "result-entry", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_ServiceTimeDistribution(), source, new String[] { "kind", "element",
                "name", "service-time-distribution", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_Forwarding(), source,
                new String[] { "kind", "element", "name", "forwarding", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_EntryActivityGraph(), source,
                new String[] { "kind", "element", "name", "entry-activity-graph", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_EntryPhaseActivities(), source,
                new String[] { "kind", "element", "name", "entry-phase-activities", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_OpenArrivalRate(), source,
                new String[] { "kind", "attribute", "name", "open-arrival-rate", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_Priority(), source,
                new String[] { "kind", "attribute", "name", "priority", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_Semaphore(), source,
                new String[] { "kind", "attribute", "name", "semaphore", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getEntryType_Type(), source,
                new String[] { "kind", "attribute", "name", "type", "namespace", "##targetNamespace" });
        this.addAnnotation(this.firstPlotTypeEClass, source,
                new String[] { "name", "first-plot_._type", "kind", "empty" });
        this.addAnnotation(this.getFirstPlotType_Variable(), source,
                new String[] { "kind", "attribute", "name", "variable", "namespace", "##targetNamespace" });
        this.addAnnotation(this.histogramBinTypeEClass, source,
                new String[] { "name", "HistogramBinType", "kind", "empty" });
        this.addAnnotation(this.getHistogramBinType_Begin(), source,
                new String[] { "kind", "attribute", "name", "begin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getHistogramBinType_Conf95(), source,
                new String[] { "kind", "attribute", "name", "conf-95", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getHistogramBinType_Conf99(), source,
                new String[] { "kind", "attribute", "name", "conf-99", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getHistogramBinType_End(), source,
                new String[] { "kind", "attribute", "name", "end", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getHistogramBinType_Prob(), source,
                new String[] { "kind", "attribute", "name", "prob", "namespace", "##targetNamespace" });
        this.addAnnotation(this.inPortTypeEClass, source, new String[] { "name", "in-port_._type", "kind", "empty" });
        this.addAnnotation(this.getInPortType_ConnectFrom(), source,
                new String[] { "kind", "attribute", "name", "connect-from", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getInPortType_Description(), source,
                new String[] { "kind", "attribute", "name", "description", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getInPortType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.interfaceTypeEClass, source,
                new String[] { "name", "Interface_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getInterfaceType_InPort(), source,
                new String[] { "kind", "element", "name", "in-port", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getInterfaceType_OutPort(), source,
                new String[] { "kind", "element", "name", "out-port", "namespace", "##targetNamespace" });
        this.addAnnotation(this.lqnCoreTypeEClass, source,
                new String[] { "name", "Lqn-CoreType", "kind", "elementOnly" });
        this.addAnnotation(this.getLqnCoreType_Processor(), source,
                new String[] { "kind", "element", "name", "processor", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnCoreType_Slot(), source,
                new String[] { "kind", "element", "name", "slot", "namespace", "##targetNamespace" });
        this.addAnnotation(this.lqnModelTypeEClass, source,
                new String[] { "name", "LqnModelType", "kind", "elementOnly" });
        this.addAnnotation(this.getLqnModelType_RunControl(), source,
                new String[] { "kind", "element", "name", "run-control", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_PlotControl(), source,
                new String[] { "kind", "element", "name", "plot-control", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_SolverParams(), source,
                new String[] { "kind", "element", "name", "solver-params", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_Processor(), source,
                new String[] { "kind", "element", "name", "processor", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_Slot(), source,
                new String[] { "kind", "element", "name", "slot", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_Description(), source,
                new String[] { "kind", "attribute", "name", "description", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_LqncoreSchemaVersion(), source, new String[] { "kind", "attribute",
                "name", "lqncore-schema-version", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_LqnSchemaVersion(), source,
                new String[] { "kind", "attribute", "name", "lqn-schema-version", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getLqnModelType_XmlDebug(), source,
                new String[] { "kind", "attribute", "name", "xml-debug", "namespace", "##targetNamespace" });
        this.addAnnotation(this.makingCallTypeEClass, source,
                new String[] { "name", "MakingCallType", "kind", "elementOnly" });
        this.addAnnotation(this.getMakingCallType_ResultCall(), source,
                new String[] { "kind", "element", "name", "result-call", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getMakingCallType_Dest(), source,
                new String[] { "kind", "attribute", "name", "dest", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getMakingCallType_Fanin(), source,
                new String[] { "kind", "attribute", "name", "fanin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getMakingCallType_Fanout(), source,
                new String[] { "kind", "attribute", "name", "fanout", "namespace", "##targetNamespace" });
        this.addAnnotation(this.orListTypeEClass, source, new String[] { "name", "OrListType", "kind", "elementOnly" });
        this.addAnnotation(this.getOrListType_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.outPortTypeEClass, source, new String[] { "name", "out-port_._type", "kind", "empty" });
        this.addAnnotation(this.getOutPortType_ConnectTo(), source,
                new String[] { "kind", "attribute", "name", "connect-to", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutPortType_Description(), source,
                new String[] { "kind", "attribute", "name", "description", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutPortType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.outputDistributionTypeEClass, source,
                new String[] { "name", "OutputDistributionType", "kind", "elementOnly" });
        this.addAnnotation(this.getOutputDistributionType_UnderflowBin(), source,
                new String[] { "kind", "element", "name", "underflow-bin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_HistogramBin(), source,
                new String[] { "kind", "element", "name", "histogram-bin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_OverflowBin(), source,
                new String[] { "kind", "element", "name", "overflow-bin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_BinSize(), source,
                new String[] { "kind", "attribute", "name", "bin-size", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_Kurtosis(), source,
                new String[] { "kind", "attribute", "name", "kurtosis", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_Max(), source,
                new String[] { "kind", "attribute", "name", "max", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_Mean(), source,
                new String[] { "kind", "attribute", "name", "mean", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_MidPoint(), source,
                new String[] { "kind", "attribute", "name", "mid-point", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_Min(), source,
                new String[] { "kind", "attribute", "name", "min", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_NumberBins(), source,
                new String[] { "kind", "attribute", "name", "number-bins", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_Skew(), source,
                new String[] { "kind", "attribute", "name", "skew", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_StdDev(), source,
                new String[] { "kind", "attribute", "name", "std-dev", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputDistributionType_XSamples(), source,
                new String[] { "kind", "attribute", "name", "x-samples", "namespace", "##targetNamespace" });
        this.addAnnotation(this.outputEntryDistributionTypeEClass, source,
                new String[] { "name", "OutputEntryDistributionType", "kind", "elementOnly" });
        this.addAnnotation(this.getOutputEntryDistributionType_Phase(), source,
                new String[] { "kind", "attribute", "name", "phase", "namespace", "##targetNamespace" });
        this.addAnnotation(this.outputResultForwardingANDJoinDelayEClass, source,
                new String[] { "name", "OutputResultForwardingANDJoinDelay", "kind", "elementOnly" });
        this.addAnnotation(this.getOutputResultForwardingANDJoinDelay_ResultConf95(), source,
                new String[] { "kind", "element", "name", "result-conf-95", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultForwardingANDJoinDelay_ResultConf99(), source,
                new String[] { "kind", "element", "name", "result-conf-99", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultForwardingANDJoinDelay_Dest(), source,
                new String[] { "kind", "attribute", "name", "dest", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultForwardingANDJoinDelay_JoinVariance(), source,
                new String[] { "kind", "attribute", "name", "join-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultForwardingANDJoinDelay_JoinWaiting(), source,
                new String[] { "kind", "attribute", "name", "join-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultForwardingANDJoinDelay_Waiting(), source,
                new String[] { "kind", "attribute", "name", "waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.outputResultTypeEClass, source,
                new String[] { "name", "OutputResultType", "kind", "elementOnly" });
        this.addAnnotation(this.getOutputResultType_ResultConf95(), source,
                new String[] { "kind", "element", "name", "result-conf-95", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ResultConf99(), source,
                new String[] { "kind", "element", "name", "result-conf-99", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_OpenWaitTime(), source,
                new String[] { "kind", "attribute", "name", "open-wait-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase1ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase1-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase1ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase1-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase1ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase1-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase1Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase1-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase2ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase2-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase2ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase2-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase2ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase2-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase2Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase2-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase3ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase3-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase3ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase3-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase3ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase3-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Phase3Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase3-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ProbExceedMaxServiceTime(), source, new String[] { "kind",
                "attribute", "name", "prob-exceed-max-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ProcUtilization(), source,
                new String[] { "kind", "attribute", "name", "proc-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ServiceTimeVariance(), source, new String[] { "kind", "attribute",
                "name", "service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_SquaredCoeffVariation(), source, new String[] { "kind", "attribute",
                "name", "squared-coeff-variation", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Throughput(), source,
                new String[] { "kind", "attribute", "name", "throughput", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_ThroughputBound(), source,
                new String[] { "kind", "attribute", "name", "throughput-bound", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Utilization(), source,
                new String[] { "kind", "attribute", "name", "utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_Waiting(), source,
                new String[] { "kind", "attribute", "name", "waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getOutputResultType_WaitingVariance(), source,
                new String[] { "kind", "attribute", "name", "waiting-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.parameterTypeEClass, source,
                new String[] { "name", "parameter_._type", "kind", "empty" });
        this.addAnnotation(this.getParameterType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getParameterType_Value(), source,
                new String[] { "kind", "attribute", "name", "value", "namespace", "##targetNamespace" });
        this.addAnnotation(this.paraTypeEClass, source, new String[] { "name", "para_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getParaType_StartValue(), source,
                new String[] { "kind", "element", "name", "start-value", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getParaType_EndValue(), source,
                new String[] { "kind", "element", "name", "end-value", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getParaType_StepValue(), source,
                new String[] { "kind", "element", "name", "step-value", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getParaType_Value(), source,
                new String[] { "kind", "element", "name", "value", "namespace", "##targetNamespace" });
        this.addAnnotation(this.phaseActivitiesEClass, source,
                new String[] { "name", "PhaseActivities", "kind", "elementOnly" });
        this.addAnnotation(this.getPhaseActivities_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.phaseTypeEDataType, source,
                new String[] { "name", "phase_._type", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#positiveInteger", "minInclusive", "1", "maxInclusive",
                        "3" });
        this.addAnnotation(this.plotControlTypeEClass, source,
                new String[] { "name", "plot-control_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getPlotControlType_FirstPlot(), source,
                new String[] { "kind", "element", "name", "first-plot", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPlotControlType_Plot(), source,
                new String[] { "kind", "element", "name", "plot", "namespace", "##targetNamespace" });
        this.addAnnotation(this.plotTypeEClass, source, new String[] { "name", "plot_._type", "kind", "empty" });
        this.addAnnotation(this.getPlotType_Variable(), source,
                new String[] { "kind", "attribute", "name", "variable", "namespace", "##targetNamespace" });
        this.addAnnotation(this.portBindingTypeEClass, source,
                new String[] { "name", "port-binding_._type", "kind", "empty" });
        this.addAnnotation(this.getPortBindingType_Source(), source,
                new String[] { "kind", "attribute", "name", "source", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPortBindingType_Target(), source,
                new String[] { "kind", "attribute", "name", "target", "namespace", "##targetNamespace" });
        this.addAnnotation(this.pragmaTypeEClass, source, new String[] { "name", "pragma_._type", "kind", "empty" });
        this.addAnnotation(this.getPragmaType_Param(), source,
                new String[] { "kind", "attribute", "name", "param", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPragmaType_Value(), source,
                new String[] { "kind", "attribute", "name", "value", "namespace", "##targetNamespace" });
        this.addAnnotation(this.precedenceTypeEClass, source,
                new String[] { "name", "PrecedenceType", "kind", "elementOnly" });
        this.addAnnotation(this.getPrecedenceType_Pre(), source,
                new String[] { "kind", "element", "name", "pre", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPrecedenceType_PreOR(), source,
                new String[] { "kind", "element", "name", "pre-OR", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPrecedenceType_PreAND(), source,
                new String[] { "kind", "element", "name", "pre-AND", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPrecedenceType_Post(), source,
                new String[] { "kind", "element", "name", "post", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPrecedenceType_PostOR(), source,
                new String[] { "kind", "element", "name", "post-OR", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPrecedenceType_PostAND(), source,
                new String[] { "kind", "element", "name", "post-AND", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getPrecedenceType_PostLOOP(), source,
                new String[] { "kind", "element", "name", "post-LOOP", "namespace", "##targetNamespace" });
        this.addAnnotation(this.processorBindingTypeEClass, source,
                new String[] { "name", "processor-binding_._type", "kind", "empty" });
        this.addAnnotation(this.getProcessorBindingType_Source(), source,
                new String[] { "kind", "attribute", "name", "source", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorBindingType_Target(), source,
                new String[] { "kind", "attribute", "name", "target", "namespace", "##targetNamespace" });
        this.addAnnotation(this.processorTypeEClass, source,
                new String[] { "name", "ProcessorType", "kind", "elementOnly" });
        this.addAnnotation(this.getProcessorType_ResultProcessor(), source,
                new String[] { "kind", "element", "name", "result-processor", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_Task(), source,
                new String[] { "kind", "element", "name", "task", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_Multiplicity(), source,
                new String[] { "kind", "attribute", "name", "multiplicity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_Quantum(), source,
                new String[] { "kind", "attribute", "name", "quantum", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_Replication(), source,
                new String[] { "kind", "attribute", "name", "replication", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_Scheduling(), source,
                new String[] { "kind", "attribute", "name", "scheduling", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getProcessorType_SpeedFactor(), source,
                new String[] { "kind", "attribute", "name", "speed-factor", "namespace", "##targetNamespace" });
        this.addAnnotation(this.replyActivityTypeEClass, source,
                new String[] { "name", "reply-activity_._type", "kind", "empty" });
        this.addAnnotation(this.getReplyActivityType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.replyEntryTypeEClass, source,
                new String[] { "name", "reply-entry_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getReplyEntryType_ReplyActivity(), source,
                new String[] { "kind", "element", "name", "reply-activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getReplyEntryType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.resultConf95TypeEClass, source,
                new String[] { "name", "result-conf-95_._type", "kind", "empty" });
        this.addAnnotation(this.getResultConf95Type_JoinVariance(), source,
                new String[] { "kind", "attribute", "name", "join-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type_JoinWaiting(), source,
                new String[] { "kind", "attribute", "name", "join-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type_Waiting(), source,
                new String[] { "kind", "attribute", "name", "waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.resultConf95Type1EClass, source,
                new String[] { "name", "result-conf-95_._1_._type", "kind", "empty" });
        this.addAnnotation(this.getResultConf95Type1_OpenWaitTime(), source,
                new String[] { "kind", "attribute", "name", "open-wait-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase1ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase1-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase1ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase1-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase1ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase1-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase1Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase1-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase2ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase2-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase2ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase2-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase2ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase2-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase2Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase2-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase3ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase3-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase3ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase3-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase3ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase3-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Phase3Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase3-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_ProbExceedMaxServiceTime(), source, new String[] { "kind",
                "attribute", "name", "prob-exceed-max-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_ProcUtilization(), source,
                new String[] { "kind", "attribute", "name", "proc-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_ServiceTimeVariance(), source, new String[] { "kind", "attribute",
                "name", "service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_SquaredCoeffVariation(), source, new String[] { "kind",
                "attribute", "name", "squared-coeff-variation", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Throughput(), source,
                new String[] { "kind", "attribute", "name", "throughput", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_ThroughputBound(), source,
                new String[] { "kind", "attribute", "name", "throughput-bound", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Utilization(), source,
                new String[] { "kind", "attribute", "name", "utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_Waiting(), source,
                new String[] { "kind", "attribute", "name", "waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf95Type1_WaitingVariance(), source,
                new String[] { "kind", "attribute", "name", "waiting-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.resultConf99TypeEClass, source,
                new String[] { "name", "result-conf-99_._type", "kind", "empty" });
        this.addAnnotation(this.getResultConf99Type_JoinVariance(), source,
                new String[] { "kind", "attribute", "name", "join-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type_JoinWaiting(), source,
                new String[] { "kind", "attribute", "name", "join-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type_Waiting(), source,
                new String[] { "kind", "attribute", "name", "waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.resultConf99Type1EClass, source,
                new String[] { "name", "result-conf-99_._1_._type", "kind", "empty" });
        this.addAnnotation(this.getResultConf99Type1_OpenWaitTime(), source,
                new String[] { "kind", "attribute", "name", "open-wait-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase1ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase1-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase1ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase1-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase1ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase1-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase1Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase1-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase2ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase2-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase2ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase2-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase2ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase2-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase2Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase2-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase3ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "phase3-proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase3ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "phase3-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase3ServiceTimeVariance(), source, new String[] { "kind",
                "attribute", "name", "phase3-service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Phase3Utilization(), source,
                new String[] { "kind", "attribute", "name", "phase3-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_ProbExceedMaxServiceTime(), source, new String[] { "kind",
                "attribute", "name", "prob-exceed-max-service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_ProcUtilization(), source,
                new String[] { "kind", "attribute", "name", "proc-utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_ProcWaiting(), source,
                new String[] { "kind", "attribute", "name", "proc-waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_ServiceTime(), source,
                new String[] { "kind", "attribute", "name", "service-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_ServiceTimeVariance(), source, new String[] { "kind", "attribute",
                "name", "service-time-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_SquaredCoeffVariation(), source, new String[] { "kind",
                "attribute", "name", "squared-coeff-variation", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Throughput(), source,
                new String[] { "kind", "attribute", "name", "throughput", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_ThroughputBound(), source,
                new String[] { "kind", "attribute", "name", "throughput-bound", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Utilization(), source,
                new String[] { "kind", "attribute", "name", "utilization", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_Waiting(), source,
                new String[] { "kind", "attribute", "name", "waiting", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultConf99Type1_WaitingVariance(), source,
                new String[] { "kind", "attribute", "name", "waiting-variance", "namespace", "##targetNamespace" });
        this.addAnnotation(this.resultGeneralTypeEClass, source,
                new String[] { "name", "result-general_._type", "kind", "empty" });
        this.addAnnotation(this.getResultGeneralType_ConvVal(), source,
                new String[] { "kind", "attribute", "name", "conv-val", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_ElapsedTime(), source,
                new String[] { "kind", "attribute", "name", "elapsed-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_Iterations(), source,
                new String[] { "kind", "attribute", "name", "iterations", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_PlatformInfo(), source,
                new String[] { "kind", "attribute", "name", "platform-info", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_SolverInfo(), source,
                new String[] { "kind", "attribute", "name", "solver-info", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_SystemCpuTime(), source,
                new String[] { "kind", "attribute", "name", "system-cpu-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_UserCpuTime(), source,
                new String[] { "kind", "attribute", "name", "user-cpu-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getResultGeneralType_Valid(), source,
                new String[] { "kind", "attribute", "name", "valid", "namespace", "##targetNamespace" });
        this.addAnnotation(this.runControlTypeEClass, source,
                new String[] { "name", "run-control_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getRunControlType_Para(), source,
                new String[] { "kind", "element", "name", "para", "namespace", "##targetNamespace" });
        this.addAnnotation(this.schedulingTypeEEnum, source, new String[] { "name", "SchedulingType" });
        this.addAnnotation(this.schedulingTypeObjectEDataType, source,
                new String[] { "name", "SchedulingType:Object", "baseType", "SchedulingType" });
        this.addAnnotation(this.sciNotationEDataType, source,
                new String[] { "name", "SciNotation", "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
                        "pattern", "[\\+|\\-]?\\d+((\\.\\d+)?[e|E][\\+|\\-]\\d+)?" });
        this.addAnnotation(this.semaphoreTypeEEnum, source, new String[] { "name", "SemaphoreType" });
        this.addAnnotation(this.semaphoreTypeObjectEDataType, source,
                new String[] { "name", "SemaphoreType:Object", "baseType", "SemaphoreType" });
        this.addAnnotation(this.serviceTypeEClass, source, new String[] { "name", "ServiceType", "kind", "empty" });
        this.addAnnotation(this.getServiceType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.singleActivityListTypeEClass, source,
                new String[] { "name", "SingleActivityListType", "kind", "elementOnly" });
        this.addAnnotation(this.getSingleActivityListType_Activity(), source,
                new String[] { "kind", "element", "name", "activity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.slotTypeEClass, source, new String[] { "name", "SlotType", "kind", "elementOnly" });
        this.addAnnotation(this.getSlotType_Interface(), source,
                new String[] { "kind", "element", "name", "Interface", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSlotType_Binding(), source,
                new String[] { "kind", "element", "name", "binding", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSlotType_BindTarget(), source,
                new String[] { "kind", "attribute", "name", "bind-target", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSlotType_Id(), source,
                new String[] { "kind", "attribute", "name", "id", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSlotType_ReplicNum(), source,
                new String[] { "kind", "attribute", "name", "replic_num", "namespace", "##targetNamespace" });
        this.addAnnotation(this.solverParamsTypeEClass, source,
                new String[] { "name", "solver-params_._type", "kind", "elementOnly" });
        this.addAnnotation(this.getSolverParamsType_ResultGeneral(), source,
                new String[] { "kind", "element", "name", "result-general", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSolverParamsType_Pragma(), source,
                new String[] { "kind", "element", "name", "pragma", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSolverParamsType_Comment(), source,
                new String[] { "kind", "attribute", "name", "comment", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSolverParamsType_ConvVal(), source,
                new String[] { "kind", "attribute", "name", "conv_val", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSolverParamsType_ItLimit(), source,
                new String[] { "kind", "attribute", "name", "it_limit", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSolverParamsType_PrintInt(), source,
                new String[] { "kind", "attribute", "name", "print_int", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSolverParamsType_UnderrelaxCoeff(), source,
                new String[] { "kind", "attribute", "name", "underrelax_coeff", "namespace", "##targetNamespace" });
        this.addAnnotation(this.srvnFloatEDataType, source, new String[] { "name", "SrvnFloat", "memberTypes",
                "SciNotation http://www.eclipse.org/emf/2003/XMLType#decimal" });
        this.addAnnotation(this.synchCallTypeEClass, source,
                new String[] { "name", "synch-call_._type", "kind", "empty" });
        this.addAnnotation(this.getSynchCallType_Dest(), source,
                new String[] { "kind", "attribute", "name", "dest", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSynchCallType_Fanin(), source,
                new String[] { "kind", "attribute", "name", "fanin", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getSynchCallType_Fanout(), source,
                new String[] { "kind", "attribute", "name", "fanout", "namespace", "##targetNamespace" });
        this.addAnnotation(this.taskActivityGraphEClass, source,
                new String[] { "name", "TaskActivityGraph", "kind", "elementOnly" });
        this.addAnnotation(this.getTaskActivityGraph_ReplyEntry(), source,
                new String[] { "kind", "element", "name", "reply-entry", "namespace", "##targetNamespace" });
        this.addAnnotation(this.taskOptionTypeEEnum, source, new String[] { "name", "TaskOptionType" });
        this.addAnnotation(this.taskOptionTypeObjectEDataType, source,
                new String[] { "name", "TaskOptionType:Object", "baseType", "TaskOptionType" });
        this.addAnnotation(this.taskSchedulingTypeEEnum, source, new String[] { "name", "TaskSchedulingType" });
        this.addAnnotation(this.taskSchedulingTypeObjectEDataType, source,
                new String[] { "name", "TaskSchedulingType:Object", "baseType", "TaskSchedulingType" });
        this.addAnnotation(this.taskTypeEClass, source, new String[] { "name", "TaskType", "kind", "elementOnly" });
        this.addAnnotation(this.getTaskType_ResultTask(), source,
                new String[] { "kind", "element", "name", "result-task", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Entry(), source,
                new String[] { "kind", "element", "name", "entry", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Service(), source,
                new String[] { "kind", "element", "name", "service", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_TaskActivities(), source,
                new String[] { "kind", "element", "name", "task-activities", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_ActivityGraph(), source,
                new String[] { "kind", "attribute", "name", "activity-graph", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Multiplicity(), source,
                new String[] { "kind", "attribute", "name", "multiplicity", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Name(), source,
                new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Priority(), source,
                new String[] { "kind", "attribute", "name", "priority", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_QueueLength(), source,
                new String[] { "kind", "attribute", "name", "queue-length", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Replication(), source,
                new String[] { "kind", "attribute", "name", "replication", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_Scheduling(), source,
                new String[] { "kind", "attribute", "name", "scheduling", "namespace", "##targetNamespace" });
        this.addAnnotation(this.getTaskType_ThinkTime(), source,
                new String[] { "kind", "attribute", "name", "think-time", "namespace", "##targetNamespace" });
        this.addAnnotation(this.typeTypeEEnum, source, new String[] { "name", "type_._type" });
        this.addAnnotation(this.typeTypeObjectEDataType, source,
                new String[] { "name", "type_._type:Object", "baseType", "type_._type" });
        this.addAnnotation(this.validTypeEEnum, source, new String[] { "name", "valid_._type" });
        this.addAnnotation(this.validTypeObjectEDataType, source,
                new String[] { "name", "valid_._type:Object", "baseType", "valid_._type" });
        this.addAnnotation(this.xmlDebugTypeEEnum, source, new String[] { "name", "xml-debug_._type" });
        this.addAnnotation(this.xmlDebugTypeObjectEDataType, source,
                new String[] { "name", "xml-debug_._type:Object", "baseType", "xml-debug_._type" });
    }

} // LqnPackageImpl
