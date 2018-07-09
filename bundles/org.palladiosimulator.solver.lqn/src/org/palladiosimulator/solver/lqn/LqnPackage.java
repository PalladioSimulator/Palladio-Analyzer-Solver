/**
 */
package org.palladiosimulator.solver.lqn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.solver.lqn.LqnFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface LqnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lqn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/Solver/LQN/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lqn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	LqnPackage eINSTANCE = org.palladiosimulator.solver.lqn.impl.LqnPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl <em>Activity Def Base</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityDefBase()
	 * @generated
	 */
	int ACTIVITY_DEF_BASE = 0;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__RESULT_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__CALL_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ = 3;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN = 4;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__MAX_SERVICE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__THINK_TIME = 7;

	/**
	 * The number of structural features of the '<em>Activity Def Base</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Activity Def Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl <em>Activity Def Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityDefType()
	 * @generated
	 */
	int ACTIVITY_DEF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__SERVICE_TIME_DISTRIBUTION = ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__RESULT_ACTIVITY = ACTIVITY_DEF_BASE__RESULT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__GROUP = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bound To Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Def Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE_OPERATION_COUNT = ACTIVITY_DEF_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityGraphBaseImpl <em>Activity Graph Base</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityGraphBaseImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityGraphBase()
	 * @generated
	 */
	int ACTIVITY_GRAPH_BASE = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE__PRECEDENCE = 1;

	/**
	 * The number of structural features of the '<em>Activity Graph Base</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity Graph Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityListTypeImpl <em>Activity List Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityListTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityListType()
	 * @generated
	 */
	int ACTIVITY_LIST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Activity List Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityLoopListTypeImpl <em>Activity Loop List Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityLoopListTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityLoopListType()
	 * @generated
	 */
	int ACTIVITY_LOOP_LIST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE__END = 1;

	/**
	 * The number of structural features of the '<em>Activity Loop List Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity Loop List Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityLoopTypeImpl <em>Activity Loop Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityLoopTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityLoopType()
	 * @generated
	 */
	int ACTIVITY_LOOP_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE__NAME = ACTIVITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE__COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Loop Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Loop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE_OPERATION_COUNT = ACTIVITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl <em>Making Call Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getMakingCallType()
	 * @generated
	 */
	int MAKING_CALL_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Result Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__RESULT_CALL = 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__DEST = 1;

	/**
	 * The number of structural features of the '<em>Making Call Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityMakingCallTypeImpl <em>Activity Making Call Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityMakingCallTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityMakingCallType()
	 * @generated
	 */
	int ACTIVITY_MAKING_CALL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Result Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__RESULT_CALL = MAKING_CALL_TYPE__RESULT_CALL;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__DEST = MAKING_CALL_TYPE__DEST;

	/**
	 * The feature id for the '<em><b>Calls Mean</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN = MAKING_CALL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Making Call Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE_FEATURE_COUNT = MAKING_CALL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Making Call Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE_OPERATION_COUNT = MAKING_CALL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityOrTypeImpl <em>Activity Or Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityOrTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityOrType()
	 * @generated
	 */
	int ACTIVITY_OR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE__NAME = ACTIVITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE__PROB = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Or Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE_OPERATION_COUNT = ACTIVITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityPhasesTypeImpl <em>Activity Phases Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ActivityPhasesTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityPhasesType()
	 * @generated
	 */
	int ACTIVITY_PHASES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__SERVICE_TIME_DISTRIBUTION = ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__RESULT_ACTIVITY = ACTIVITY_DEF_BASE__RESULT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__GROUP = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__PHASE = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Phases Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Phases Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE_OPERATION_COUNT = ACTIVITY_DEF_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl <em>And Join List Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getAndJoinListType()
	 * @generated
	 */
	int AND_JOIN_LIST_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Result Join Delay</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY = 0;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Quorum</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__QUORUM = 3;

	/**
	 * The number of structural features of the '<em>And Join List Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>And Join List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.AsynchCallTypeImpl <em>Asynch Call Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.AsynchCallTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getAsynchCallType()
	 * @generated
	 */
	int ASYNCH_CALL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE__DEST = 0;

	/**
	 * The number of structural features of the '<em>Asynch Call Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asynch Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.BindTypeImpl <em>Bind Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.BindTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getBindType()
	 * @generated
	 */
	int BIND_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Processor Binding</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__PROCESSOR_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Port Binding</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__PORT_BINDING = 2;

	/**
	 * The number of structural features of the '<em>Bind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bind Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.CallListTypeImpl <em>Call List Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.CallListTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getCallListType()
	 * @generated
	 */
	int CALL_LIST_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE__SYNCH_CALL = 0;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE__ASYNCH_CALL = 1;

	/**
	 * The number of structural features of the '<em>Call List Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Call List Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.DocumentRootImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Lqn Core</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LQN_CORE = 3;

	/**
	 * The feature id for the '<em><b>Lqn Model</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LQN_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl <em>Entry Activity Def Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryActivityDefType()
	 * @generated
	 */
	int ENTRY_ACTIVITY_DEF_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__SERVICE_TIME_DISTRIBUTION = ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__RESULT_ACTIVITY = ACTIVITY_DEF_BASE__RESULT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__GROUP = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entry Activity Def Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Entry Activity Def Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE_OPERATION_COUNT = ACTIVITY_DEF_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.EntryActivityGraphImpl <em>Entry Activity Graph</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.EntryActivityGraphImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryActivityGraph()
	 * @generated
	 */
	int ENTRY_ACTIVITY_GRAPH = 16;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__ACTIVITY = ACTIVITY_GRAPH_BASE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__PRECEDENCE = ACTIVITY_GRAPH_BASE__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Reply Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Activity Graph</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH_FEATURE_COUNT = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entry Activity Graph</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH_OPERATION_COUNT = ACTIVITY_GRAPH_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.EntryMakingCallTypeImpl <em>Entry Making Call Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.EntryMakingCallTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryMakingCallType()
	 * @generated
	 */
	int ENTRY_MAKING_CALL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Result Call</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__RESULT_CALL = MAKING_CALL_TYPE__RESULT_CALL;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__DEST = MAKING_CALL_TYPE__DEST;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__PROB = MAKING_CALL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Making Call Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE_FEATURE_COUNT = MAKING_CALL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entry Making Call Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE_OPERATION_COUNT = MAKING_CALL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.EntryTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Result Entry</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__RESULT_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Forwarding</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__FORWARDING = 2;

	/**
	 * The feature id for the '<em><b>Entry Activity Graph</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Entry Phase Activities</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Open Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__OPEN_ARRIVAL_RATE = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__PRIORITY = 7;

	/**
	 * The feature id for the '<em><b>Rwlock</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__RWLOCK = 8;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__SEMAPHORE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.FanInTypeImpl <em>Fan In Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.FanInTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getFanInType()
	 * @generated
	 */
	int FAN_IN_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_IN_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_IN_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Fan In Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_IN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fan In Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_IN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.FanOutTypeImpl <em>Fan Out Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.FanOutTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getFanOutType()
	 * @generated
	 */
	int FAN_OUT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_OUT_TYPE__DEST = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_OUT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Fan Out Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_OUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fan Out Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_OUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.FirstPlotTypeImpl <em>First Plot Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.FirstPlotTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getFirstPlotType()
	 * @generated
	 */
	int FIRST_PLOT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>First Plot Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>First Plot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.GroupTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Result Group</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__RESULT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__TASK = 1;

	/**
	 * The feature id for the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__CAP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__SHARE = 4;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl <em>Histogram Bin Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getHistogramBinType()
	 * @generated
	 */
	int HISTOGRAM_BIN_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>Conf95</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__CONF95 = 1;

	/**
	 * The feature id for the '<em><b>Conf99</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__CONF99 = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__END = 3;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__PROB = 4;

	/**
	 * The number of structural features of the '<em>Histogram Bin Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Histogram Bin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.InPortTypeImpl <em>In Port Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.InPortTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getInPortType()
	 * @generated
	 */
	int IN_PORT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__CONNECT_FROM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>In Port Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>In Port Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__IN_PORT = 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__OUT_PORT = 1;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.LqnCoreTypeImpl <em>Core Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.LqnCoreTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getLqnCoreType()
	 * @generated
	 */
	int LQN_CORE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE__PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE__SLOT = 1;

	/**
	 * The number of structural features of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getLqnModelType()
	 * @generated
	 */
	int LQN_MODEL_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Run Control</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__RUN_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Plot Control</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__PLOT_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Solver Params</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__SOLVER_PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__SLOT = 4;

	/**
	 * The feature id for the '<em><b>Lqx</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__LQX = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Lqn Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__LQN_SCHEMA_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Lqncore Schema Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Xml Debug</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__XML_DEBUG = 10;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl <em>Mva Info Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getMvaInfoType()
	 * @generated
	 */
	int MVA_INFO_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Core</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__CORE = 0;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__FAULTS = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__STEP = 2;

	/**
	 * The feature id for the '<em><b>Step Squared</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__STEP_SQUARED = 3;

	/**
	 * The feature id for the '<em><b>Submodels</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__SUBMODELS = 4;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__WAIT = 5;

	/**
	 * The feature id for the '<em><b>Wait Squared</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE__WAIT_SQUARED = 6;

	/**
	 * The number of structural features of the '<em>Mva Info Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Mva Info Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVA_INFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.OrListTypeImpl <em>Or List Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.OrListTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOrListType()
	 * @generated
	 */
	int OR_LIST_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Or List Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Or List Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl <em>Out Port Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutPortType()
	 * @generated
	 */
	int OUT_PORT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__CONNECT_TO = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Out Port Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Out Port Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl <em>Output Distribution Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputDistributionType()
	 * @generated
	 */
	int OUTPUT_DISTRIBUTION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Underflow Bin</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN = 0;

	/**
	 * The feature id for the '<em><b>Histogram Bin</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN = 1;

	/**
	 * The feature id for the '<em><b>Overflow Bin</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN = 2;

	/**
	 * The feature id for the '<em><b>Bin Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Kurtosis</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__KURTOSIS = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MAX = 5;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MEAN = 6;

	/**
	 * The feature id for the '<em><b>Mid Point</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MID_POINT = 7;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MIN = 8;

	/**
	 * The feature id for the '<em><b>Number Bins</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS = 9;

	/**
	 * The feature id for the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__SKEW = 10;

	/**
	 * The feature id for the '<em><b>Std Dev</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__STD_DEV = 11;

	/**
	 * The number of structural features of the '<em>Output Distribution Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Output Distribution Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.palladiosimulator.solver.lqn.impl.OutputEntryDistributionTypeImpl
	 * <em>Output Entry Distribution Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.palladiosimulator.solver.lqn.impl.OutputEntryDistributionTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputEntryDistributionType()
	 * @generated
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Underflow Bin</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__UNDERFLOW_BIN = OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN;

	/**
	 * The feature id for the '<em><b>Histogram Bin</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__HISTOGRAM_BIN = OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN;

	/**
	 * The feature id for the '<em><b>Overflow Bin</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__OVERFLOW_BIN = OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN;

	/**
	 * The feature id for the '<em><b>Bin Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__BIN_SIZE = OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE;

	/**
	 * The feature id for the '<em><b>Kurtosis</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__KURTOSIS = OUTPUT_DISTRIBUTION_TYPE__KURTOSIS;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MAX = OUTPUT_DISTRIBUTION_TYPE__MAX;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MEAN = OUTPUT_DISTRIBUTION_TYPE__MEAN;

	/**
	 * The feature id for the '<em><b>Mid Point</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MID_POINT = OUTPUT_DISTRIBUTION_TYPE__MID_POINT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MIN = OUTPUT_DISTRIBUTION_TYPE__MIN;

	/**
	 * The feature id for the '<em><b>Number Bins</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__NUMBER_BINS = OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS;

	/**
	 * The feature id for the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__SKEW = OUTPUT_DISTRIBUTION_TYPE__SKEW;

	/**
	 * The feature id for the '<em><b>Std Dev</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__STD_DEV = OUTPUT_DISTRIBUTION_TYPE__STD_DEV;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE = OUTPUT_DISTRIBUTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Entry Distribution Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE_FEATURE_COUNT = OUTPUT_DISTRIBUTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Entry Distribution Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE_OPERATION_COUNT = OUTPUT_DISTRIBUTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl <em>Output Result Join Delay Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputResultJoinDelayType()
	 * @generated
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Result Conf95</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95 = 0;

	/**
	 * The feature id for the '<em><b>Result Conf99</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99 = 1;

	/**
	 * The feature id for the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE = 2;

	/**
	 * The feature id for the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING = 3;

	/**
	 * The number of structural features of the '<em>Output Result Join Delay Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Output Result Join Delay Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_JOIN_DELAY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl <em>Output Result Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputResultType()
	 * @generated
	 */
	int OUTPUT_RESULT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Result Conf95</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RESULT_CONF95 = 0;

	/**
	 * The feature id for the '<em><b>Result Conf99</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RESULT_CONF99 = 1;

	/**
	 * The feature id for the '<em><b>Loss Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__LOSS_PROBABILITY = 2;

	/**
	 * The feature id for the '<em><b>Open Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME = 3;

	/**
	 * The feature id for the '<em><b>Phase1 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING = 4;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE = 6;

	/**
	 * The feature id for the '<em><b>Phase1 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION = 7;

	/**
	 * The feature id for the '<em><b>Phase1 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_WAITING = 8;

	/**
	 * The feature id for the '<em><b>Phase1 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE = 9;

	/**
	 * The feature id for the '<em><b>Phase2 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING = 10;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME = 11;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE = 12;

	/**
	 * The feature id for the '<em><b>Phase2 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION = 13;

	/**
	 * The feature id for the '<em><b>Phase2 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_WAITING = 14;

	/**
	 * The feature id for the '<em><b>Phase2 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE = 15;

	/**
	 * The feature id for the '<em><b>Phase3 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING = 16;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME = 17;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE = 18;

	/**
	 * The feature id for the '<em><b>Phase3 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION = 19;

	/**
	 * The feature id for the '<em><b>Phase3 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_WAITING = 20;

	/**
	 * The feature id for the '<em><b>Phase3 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE = 21;

	/**
	 * The feature id for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME = 22;

	/**
	 * The feature id for the '<em><b>Proc Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PROC_UTILIZATION = 23;

	/**
	 * The feature id for the '<em><b>Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PROC_WAITING = 24;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Holding</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING = 25;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Utilization</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION = 26;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING = 27;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE = 28;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Holding</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING = 29;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Utilization</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION = 30;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING = 31;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE = 32;

	/**
	 * The feature id for the '<em><b>Semaphore Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION = 33;

	/**
	 * The feature id for the '<em><b>Semaphore Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING = 34;

	/**
	 * The feature id for the '<em><b>Semaphore Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE = 35;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SERVICE_TIME = 36;

	/**
	 * The feature id for the '<em><b>Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE = 37;

	/**
	 * The feature id for the '<em><b>Squared Coeff Variation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION = 38;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__THROUGHPUT = 39;

	/**
	 * The feature id for the '<em><b>Throughput Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND = 40;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__UTILIZATION = 41;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__WAITING = 42;

	/**
	 * The feature id for the '<em><b>Waiting Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__WAITING_VARIANCE = 43;

	/**
	 * The feature id for the '<em><b>Bottleneck Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH = 44;

	/**
	 * The number of structural features of the '<em>Output Result Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE_FEATURE_COUNT = 45;

	/**
	 * The number of operations of the '<em>Output Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ParameterTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ParaTypeImpl <em>Para Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ParaTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getParaType()
	 * @generated
	 */
	int PARA_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__START_VALUE = 0;

	/**
	 * The feature id for the '<em><b>End Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__END_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__STEP_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Para Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Para Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.PhaseActivitiesImpl <em>Phase Activities</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.PhaseActivitiesImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPhaseActivities()
	 * @generated
	 */
	int PHASE_ACTIVITIES = 38;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Phase Activities</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Phase Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.PlotControlTypeImpl <em>Plot Control Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.PlotControlTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPlotControlType()
	 * @generated
	 */
	int PLOT_CONTROL_TYPE = 39;

	/**
	 * The feature id for the '<em><b>First Plot</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE__FIRST_PLOT = 0;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE__PLOT = 1;

	/**
	 * The number of structural features of the '<em>Plot Control Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plot Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.PlotTypeImpl <em>Plot Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.PlotTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPlotType()
	 * @generated
	 */
	int PLOT_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Plot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plot Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.PortBindingTypeImpl <em>Port Binding Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.PortBindingTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPortBindingType()
	 * @generated
	 */
	int PORT_BINDING_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Port Binding Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.PragmaTypeImpl <em>Pragma Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.PragmaTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPragmaType()
	 * @generated
	 */
	int PRAGMA_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pragma Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pragma Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl <em>Precedence Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPrecedenceType()
	 * @generated
	 */
	int PRECEDENCE_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__PRE = 0;

	/**
	 * The feature id for the '<em><b>Pre OR</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__PRE_OR = 1;

	/**
	 * The feature id for the '<em><b>Pre AND</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__PRE_AND = 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST = 3;

	/**
	 * The feature id for the '<em><b>Post OR</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST_OR = 4;

	/**
	 * The feature id for the '<em><b>Post AND</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST_AND = 5;

	/**
	 * The feature id for the '<em><b>Post LOOP</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST_LOOP = 6;

	/**
	 * The number of structural features of the '<em>Precedence Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Precedence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ProcessorBindingTypeImpl <em>Processor Binding Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ProcessorBindingTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getProcessorBindingType()
	 * @generated
	 */
	int PROCESSOR_BINDING_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Processor Binding Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processor Binding Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getProcessorType()
	 * @generated
	 */
	int PROCESSOR_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Result Processor</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__RESULT_PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__TASK = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__MULTIPLICITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Quantum</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__QUANTUM = 5;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__REPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__SCHEDULING = 7;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__SPEED_FACTOR = 8;

	/**
	 * The number of structural features of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ReplyActivityTypeImpl <em>Reply Activity Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ReplyActivityTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getReplyActivityType()
	 * @generated
	 */
	int REPLY_ACTIVITY_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reply Activity Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reply Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ReplyEntryTypeImpl <em>Reply Entry Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ReplyEntryTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getReplyEntryType()
	 * @generated
	 */
	int REPLY_ENTRY_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Reply Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE__REPLY_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Reply Entry Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reply Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl <em>Result Conf95 Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf95Type()
	 * @generated
	 */
	int RESULT_CONF95_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE__JOIN_VARIANCE = 0;

	/**
	 * The feature id for the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE__JOIN_WAITING = 1;

	/**
	 * The number of structural features of the '<em>Result Conf95 Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result Conf95 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf95Type1Impl <em>Result Conf95 Type1</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ResultConf95Type1Impl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf95Type1()
	 * @generated
	 */
	int RESULT_CONF95_TYPE1 = 49;

	/**
	 * The feature id for the '<em><b>Loss Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__LOSS_PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Open Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__OPEN_WAIT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Phase1 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING = 2;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = 4;

	/**
	 * The feature id for the '<em><b>Phase1 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_UTILIZATION = 5;

	/**
	 * The feature id for the '<em><b>Phase1 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_WAITING = 6;

	/**
	 * The feature id for the '<em><b>Phase1 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_WAITING_VARIANCE = 7;

	/**
	 * The feature id for the '<em><b>Phase2 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING = 8;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME = 9;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = 10;

	/**
	 * The feature id for the '<em><b>Phase2 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_UTILIZATION = 11;

	/**
	 * The feature id for the '<em><b>Phase2 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_WAITING = 12;

	/**
	 * The feature id for the '<em><b>Phase2 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_WAITING_VARIANCE = 13;

	/**
	 * The feature id for the '<em><b>Phase3 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING = 14;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME = 15;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = 16;

	/**
	 * The feature id for the '<em><b>Phase3 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_UTILIZATION = 17;

	/**
	 * The feature id for the '<em><b>Phase3 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_WAITING = 18;

	/**
	 * The feature id for the '<em><b>Phase3 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_WAITING_VARIANCE = 19;

	/**
	 * The feature id for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = 20;

	/**
	 * The feature id for the '<em><b>Proc Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PROC_UTILIZATION = 21;

	/**
	 * The feature id for the '<em><b>Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PROC_WAITING = 22;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Holding</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_READER_HOLDING = 23;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Utilization</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_READER_UTILIZATION = 24;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING = 25;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING_VARIANCE = 26;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Holding</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_WRITER_HOLDING = 27;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Utilization</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_WRITER_UTILIZATION = 28;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING = 29;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE = 30;

	/**
	 * The feature id for the '<em><b>Semaphore Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SEMAPHORE_UTILIZATION = 31;

	/**
	 * The feature id for the '<em><b>Semaphore Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SEMAPHORE_WAITING = 32;

	/**
	 * The feature id for the '<em><b>Semaphore Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SEMAPHORE_WAITING_VARIANCE = 33;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SERVICE_TIME = 34;

	/**
	 * The feature id for the '<em><b>Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE = 35;

	/**
	 * The feature id for the '<em><b>Squared Coeff Variation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION = 36;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__THROUGHPUT = 37;

	/**
	 * The feature id for the '<em><b>Throughput Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__THROUGHPUT_BOUND = 38;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__UTILIZATION = 39;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__WAITING = 40;

	/**
	 * The feature id for the '<em><b>Waiting Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__WAITING_VARIANCE = 41;

	/**
	 * The number of structural features of the '<em>Result Conf95 Type1</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Result Conf95 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf99TypeImpl <em>Result Conf99 Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ResultConf99TypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf99Type()
	 * @generated
	 */
	int RESULT_CONF99_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE__JOIN_VARIANCE = 0;

	/**
	 * The feature id for the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE__JOIN_WAITING = 1;

	/**
	 * The number of structural features of the '<em>Result Conf99 Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result Conf99 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl <em>Result Conf99 Type1</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf99Type1()
	 * @generated
	 */
	int RESULT_CONF99_TYPE1 = 51;

	/**
	 * The feature id for the '<em><b>Loss Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__LOSS_PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Open Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__OPEN_WAIT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Phase1 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING = 2;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = 4;

	/**
	 * The feature id for the '<em><b>Phase1 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_UTILIZATION = 5;

	/**
	 * The feature id for the '<em><b>Phase1 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_WAITING = 6;

	/**
	 * The feature id for the '<em><b>Phase1 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE = 7;

	/**
	 * The feature id for the '<em><b>Phase2 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING = 8;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME = 9;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = 10;

	/**
	 * The feature id for the '<em><b>Phase2 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_UTILIZATION = 11;

	/**
	 * The feature id for the '<em><b>Phase2 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_WAITING = 12;

	/**
	 * The feature id for the '<em><b>Phase2 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE = 13;

	/**
	 * The feature id for the '<em><b>Phase3 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING = 14;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME = 15;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = 16;

	/**
	 * The feature id for the '<em><b>Phase3 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_UTILIZATION = 17;

	/**
	 * The feature id for the '<em><b>Phase3 Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_WAITING = 18;

	/**
	 * The feature id for the '<em><b>Phase3 Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE = 19;

	/**
	 * The feature id for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = 20;

	/**
	 * The feature id for the '<em><b>Proc Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PROC_UTILIZATION = 21;

	/**
	 * The feature id for the '<em><b>Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PROC_WAITING = 22;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Holding</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING = 23;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Utilization</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION = 24;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING = 25;

	/**
	 * The feature id for the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE = 26;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Holding</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING = 27;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Utilization</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION = 28;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Waiting</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING = 29;

	/**
	 * The feature id for the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE = 30;

	/**
	 * The feature id for the '<em><b>Semaphore Utilization</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION = 31;

	/**
	 * The feature id for the '<em><b>Semaphore Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SEMAPHORE_WAITING = 32;

	/**
	 * The feature id for the '<em><b>Semaphore Waiting Variance</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE = 33;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SERVICE_TIME = 34;

	/**
	 * The feature id for the '<em><b>Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE = 35;

	/**
	 * The feature id for the '<em><b>Squared Coeff Variation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION = 36;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__THROUGHPUT = 37;

	/**
	 * The feature id for the '<em><b>Throughput Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__THROUGHPUT_BOUND = 38;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__UTILIZATION = 39;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__WAITING = 40;

	/**
	 * The feature id for the '<em><b>Waiting Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__WAITING_VARIANCE = 41;

	/**
	 * The number of structural features of the '<em>Result Conf99 Type1</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Result Conf99 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl <em>Result General Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultGeneralType()
	 * @generated
	 */
	int RESULT_GENERAL_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Mva Info</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__MVA_INFO = 0;

	/**
	 * The feature id for the '<em><b>Conv Val</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__CONV_VAL = 1;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__ELAPSED_TIME = 2;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__ITERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Platform Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__PLATFORM_INFO = 4;

	/**
	 * The feature id for the '<em><b>Solver Info</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__SOLVER_INFO = 5;

	/**
	 * The feature id for the '<em><b>System Cpu Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME = 6;

	/**
	 * The feature id for the '<em><b>User Cpu Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__USER_CPU_TIME = 7;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__VALID = 8;

	/**
	 * The number of structural features of the '<em>Result General Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Result General Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.RunControlTypeImpl <em>Run Control Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.RunControlTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getRunControlType()
	 * @generated
	 */
	int RUN_CONTROL_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE__PARA = 0;

	/**
	 * The number of structural features of the '<em>Run Control Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Run Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.ServiceTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.SingleActivityListTypeImpl <em>Single Activity List Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.SingleActivityListTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSingleActivityListType()
	 * @generated
	 */
	int SINGLE_ACTIVITY_LIST_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Single Activity List Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Single Activity List Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl <em>Slot Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.SlotTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSlotType()
	 * @generated
	 */
	int SLOT_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__BINDING = 1;

	/**
	 * The feature id for the '<em><b>Bind Target</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__BIND_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Replic Num</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__REPLIC_NUM = 4;

	/**
	 * The number of structural features of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl <em>Solver Params Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSolverParamsType()
	 * @generated
	 */
	int SOLVER_PARAMS_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Result General</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__RESULT_GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Pragma</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__PRAGMA = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Conv Val</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__CONV_VAL = 3;

	/**
	 * The feature id for the '<em><b>It Limit</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__IT_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Print Int</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__PRINT_INT = 5;

	/**
	 * The feature id for the '<em><b>Underrelax Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF = 6;

	/**
	 * The number of structural features of the '<em>Solver Params Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Solver Params Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl <em>Synch Call Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSynchCallType()
	 * @generated
	 */
	int SYNCH_CALL_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE__DEST = 0;

	/**
	 * The number of structural features of the '<em>Synch Call Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Synch Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.TaskActivityGraphImpl <em>Task Activity Graph</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.TaskActivityGraphImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskActivityGraph()
	 * @generated
	 */
	int TASK_ACTIVITY_GRAPH = 59;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__ACTIVITY = ACTIVITY_GRAPH_BASE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__PRECEDENCE = ACTIVITY_GRAPH_BASE__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Reply Entry</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__REPLY_ENTRY = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Activity Graph</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH_FEATURE_COUNT = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH_OPERATION_COUNT = ACTIVITY_GRAPH_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.impl.TaskTypeImpl
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Result Task</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RESULT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SERVICE_TIME_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Fan Out</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FAN_OUT = 2;

	/**
	 * The feature id for the '<em><b>Fan In</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FAN_IN = 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Task Activities</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TASK_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Activity Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTIVITY_GRAPH = 7;

	/**
	 * The feature id for the '<em><b>Initially</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__INITIALLY = 8;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__MULTIPLICITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRIORITY = 11;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__QUEUE_LENGTH = 12;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REPLICATION = 13;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SCHEDULING = 14;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__THINK_TIME = 15;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.CallOrderType <em>Call Order Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.CallOrderType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getCallOrderType()
	 * @generated
	 */
	int CALL_ORDER_TYPE = 61;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.RWLockType <em>RW Lock Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.RWLockType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getRWLockType()
	 * @generated
	 */
	int RW_LOCK_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.SchedulingType <em>Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.SchedulingType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSchedulingType()
	 * @generated
	 */
	int SCHEDULING_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.SemaphoreType <em>Semaphore Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.SemaphoreType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSemaphoreType()
	 * @generated
	 */
	int SEMAPHORE_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.TaskOptionType <em>Task Option Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.TaskOptionType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskOptionType()
	 * @generated
	 */
	int TASK_OPTION_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.TaskSchedulingType <em>Task Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.TaskSchedulingType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskSchedulingType()
	 * @generated
	 */
	int TASK_SCHEDULING_TYPE = 66;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.TypeType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.solver.lqn.ValidType <em>Valid Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.ValidType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getValidType()
	 * @generated
	 */
	int VALID_TYPE = 68;

	/**
	 * The meta object id for the '<em>Call Order Type Object</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.CallOrderType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getCallOrderTypeObject()
	 * @generated
	 */
	int CALL_ORDER_TYPE_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Connect From Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getConnectFromType()
	 * @generated
	 */
	int CONNECT_FROM_TYPE = 70;

	/**
	 * The meta object id for the '<em>Connect To Type</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see java.util.List
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getConnectToType()
	 * @generated
	 */
	int CONNECT_TO_TYPE = 71;

	/**
	 * The meta object id for the '<em>Ext Variable</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see java.lang.String
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getExtVariable()
	 * @generated
	 */
	int EXT_VARIABLE = 72;

	/**
	 * The meta object id for the '<em>Phase Type</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPhaseType()
	 * @generated
	 */
	int PHASE_TYPE = 73;

	/**
	 * The meta object id for the '<em>RW Lock Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.RWLockType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getRWLockTypeObject()
	 * @generated
	 */
	int RW_LOCK_TYPE_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Scheduling Type Object</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.SchedulingType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSchedulingTypeObject()
	 * @generated
	 */
	int SCHEDULING_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Semaphore Type Object</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.SemaphoreType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSemaphoreTypeObject()
	 * @generated
	 */
	int SEMAPHORE_TYPE_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Srvn Float</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see java.lang.Object
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSrvnFloat()
	 * @generated
	 */
	int SRVN_FLOAT = 77;

	/**
	 * The meta object id for the '<em>Srvn Non Negative Integer</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.Object
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSrvnNonNegativeInteger()
	 * @generated
	 */
	int SRVN_NON_NEGATIVE_INTEGER = 78;

	/**
	 * The meta object id for the '<em>Task Option Type Object</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.TaskOptionType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskOptionTypeObject()
	 * @generated
	 */
	int TASK_OPTION_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Task Scheduling Type Object</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.palladiosimulator.solver.lqn.TaskSchedulingType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskSchedulingTypeObject()
	 * @generated
	 */
	int TASK_SCHEDULING_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.TypeType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Valid Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.solver.lqn.ValidType
	 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getValidTypeObject()
	 * @generated
	 */
	int VALID_TYPE_OBJECT = 82;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityDefBase <em>Activity Def Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def Base</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase
	 * @generated
	 */
	EClass getActivityDefBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getServiceTimeDistribution <em>Service Time Distribution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Time Distribution</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getServiceTimeDistribution()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EReference getActivityDefBase_ServiceTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getResultActivity <em>Result Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getResultActivity()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EReference getActivityDefBase_ResultActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Order</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getCallOrder()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_CallOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand Cvsq</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandCvsq()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_HostDemandCvsq();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand Mean</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getHostDemandMean()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_HostDemandMean();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getMaxServiceTime()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_MaxServiceTime();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ActivityDefBase#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getName()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityDefBase#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefBase#getThinkTime()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_ThinkTime();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityDefType <em>Activity Def Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType
	 * @generated
	 */
	EClass getActivityDefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityDefType#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType#getCallList()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EReference getActivityDefType_CallList();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.palladiosimulator.solver.lqn.ActivityDefType#getGroup <em>Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType#getGroup()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EAttribute getActivityDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityDefType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType#getSynchCall()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EReference getActivityDefType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityDefType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType#getAsynchCall()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EReference getActivityDefType_AsynchCall();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityDefType#getBoundToEntry <em>Bound To Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound To Entry</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityDefType#getBoundToEntry()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EAttribute getActivityDefType_BoundToEntry();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityGraphBase <em>Activity Graph Base</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Graph Base</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityGraphBase
	 * @generated
	 */
	EClass getActivityGraphBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityGraphBase#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityGraphBase#getActivity()
	 * @see #getActivityGraphBase()
	 * @generated
	 */
	EReference getActivityGraphBase_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityGraphBase#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precedence</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityGraphBase#getPrecedence()
	 * @see #getActivityGraphBase()
	 * @generated
	 */
	EReference getActivityGraphBase_Precedence();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityListType <em>Activity List Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity List Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityListType
	 * @generated
	 */
	EClass getActivityListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityListType#getActivity()
	 * @see #getActivityListType()
	 * @generated
	 */
	EReference getActivityListType_Activity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityLoopListType <em>Activity Loop List Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Loop List Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopListType
	 * @generated
	 */
	EClass getActivityLoopListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityLoopListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopListType#getActivity()
	 * @see #getActivityLoopListType()
	 * @generated
	 */
	EReference getActivityLoopListType_Activity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ActivityLoopListType#getEnd <em>End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopListType#getEnd()
	 * @see #getActivityLoopListType()
	 * @generated
	 */
	EAttribute getActivityLoopListType_End();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityLoopType <em>Activity Loop Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Loop Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopType
	 * @generated
	 */
	EClass getActivityLoopType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ActivityLoopType#getCount <em>Count</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityLoopType#getCount()
	 * @see #getActivityLoopType()
	 * @generated
	 */
	EAttribute getActivityLoopType_Count();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityMakingCallType <em>Activity Making Call Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Making Call Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityMakingCallType
	 * @generated
	 */
	EClass getActivityMakingCallType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ActivityMakingCallType#getCallsMean <em>Calls Mean</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Mean</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityMakingCallType#getCallsMean()
	 * @see #getActivityMakingCallType()
	 * @generated
	 */
	EAttribute getActivityMakingCallType_CallsMean();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityOrType <em>Activity Or Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Or Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityOrType
	 * @generated
	 */
	EClass getActivityOrType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ActivityOrType#getProb <em>Prob</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityOrType#getProb()
	 * @see #getActivityOrType()
	 * @generated
	 */
	EAttribute getActivityOrType_Prob();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityPhasesType <em>Activity Phases Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Phases Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType
	 * @generated
	 */
	EClass getActivityPhasesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityPhasesType#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType#getCallList()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EReference getActivityPhasesType_CallList();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.palladiosimulator.solver.lqn.ActivityPhasesType#getGroup <em>Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType#getGroup()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EAttribute getActivityPhasesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityPhasesType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType#getSynchCall()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EReference getActivityPhasesType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ActivityPhasesType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType#getAsynchCall()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EReference getActivityPhasesType_AsynchCall();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ActivityPhasesType#getPhase <em>Phase</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityPhasesType#getPhase()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EAttribute getActivityPhasesType_Phase();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityType
	 * @generated
	 */
	EClass getActivityType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ActivityType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ActivityType#getName()
	 * @see #getActivityType()
	 * @generated
	 */
	EAttribute getActivityType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.AndJoinListType <em>And Join List Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join List Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.AndJoinListType
	 * @generated
	 */
	EClass getAndJoinListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.AndJoinListType#getResultJoinDelay <em>Result Join Delay</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Join Delay</em>'.
	 * @see org.palladiosimulator.solver.lqn.AndJoinListType#getResultJoinDelay()
	 * @see #getAndJoinListType()
	 * @generated
	 */
	EReference getAndJoinListType_ResultJoinDelay();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.AndJoinListType#getServiceTimeDistribution <em>Service Time Distribution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Time Distribution</em>'.
	 * @see org.palladiosimulator.solver.lqn.AndJoinListType#getServiceTimeDistribution()
	 * @see #getAndJoinListType()
	 * @generated
	 */
	EReference getAndJoinListType_ServiceTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.AndJoinListType#getActivity <em>Activity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.AndJoinListType#getActivity()
	 * @see #getAndJoinListType()
	 * @generated
	 */
	EReference getAndJoinListType_Activity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.AndJoinListType#getQuorum <em>Quorum</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Quorum</em>'.
	 * @see org.palladiosimulator.solver.lqn.AndJoinListType#getQuorum()
	 * @see #getAndJoinListType()
	 * @generated
	 */
	EAttribute getAndJoinListType_Quorum();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.AsynchCallType <em>Asynch Call Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynch Call Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.AsynchCallType
	 * @generated
	 */
	EClass getAsynchCallType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.AsynchCallType#getDest <em>Dest</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see org.palladiosimulator.solver.lqn.AsynchCallType#getDest()
	 * @see #getAsynchCallType()
	 * @generated
	 */
	EAttribute getAsynchCallType_Dest();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.BindType <em>Bind Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.BindType
	 * @generated
	 */
	EClass getBindType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.BindType#getParameter <em>Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.palladiosimulator.solver.lqn.BindType#getParameter()
	 * @see #getBindType()
	 * @generated
	 */
	EReference getBindType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.BindType#getProcessorBinding <em>Processor Binding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor Binding</em>'.
	 * @see org.palladiosimulator.solver.lqn.BindType#getProcessorBinding()
	 * @see #getBindType()
	 * @generated
	 */
	EReference getBindType_ProcessorBinding();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.BindType#getPortBinding <em>Port Binding</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Port Binding</em>'.
	 * @see org.palladiosimulator.solver.lqn.BindType#getPortBinding()
	 * @see #getBindType()
	 * @generated
	 */
	EReference getBindType_PortBinding();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.CallListType <em>Call List Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call List Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.CallListType
	 * @generated
	 */
	EClass getCallListType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.CallListType#getSynchCall <em>Synch Call</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.CallListType#getSynchCall()
	 * @see #getCallListType()
	 * @generated
	 */
	EReference getCallListType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.CallListType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.CallListType#getAsynchCall()
	 * @see #getCallListType()
	 * @generated
	 */
	EReference getCallListType_AsynchCall();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.palladiosimulator.solver.lqn.DocumentRoot#getMixed <em>Mixed</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.palladiosimulator.solver.lqn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.palladiosimulator.solver.lqn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.DocumentRoot#getLqnCore <em>Lqn Core</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Lqn Core</em>'.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot#getLqnCore()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LqnCore();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.DocumentRoot#getLqnModel <em>Lqn Model</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Lqn Model</em>'.
	 * @see org.palladiosimulator.solver.lqn.DocumentRoot#getLqnModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LqnModel();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.EntryActivityDefType <em>Entry Activity Def Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Activity Def Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType
	 * @generated
	 */
	EClass getEntryActivityDefType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType#getCallList()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EReference getEntryActivityDefType_CallList();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getGroup <em>Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType#getGroup()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EAttribute getEntryActivityDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType#getSynchCall()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EReference getEntryActivityDefType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType#getAsynchCall()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EReference getEntryActivityDefType_AsynchCall();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.EntryActivityDefType#getFirstActivity <em>First Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityDefType#getFirstActivity()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EAttribute getEntryActivityDefType_FirstActivity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.EntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Activity Graph</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityGraph
	 * @generated
	 */
	EClass getEntryActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.EntryActivityGraph#getReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryActivityGraph#getReplyActivity()
	 * @see #getEntryActivityGraph()
	 * @generated
	 */
	EReference getEntryActivityGraph_ReplyActivity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.EntryMakingCallType <em>Entry Making Call Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Making Call Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryMakingCallType
	 * @generated
	 */
	EClass getEntryMakingCallType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.EntryMakingCallType#getProb <em>Prob</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryMakingCallType#getProb()
	 * @see #getEntryMakingCallType()
	 * @generated
	 */
	EAttribute getEntryMakingCallType_Prob();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.EntryType#getResultEntry <em>Result Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Entry</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getResultEntry()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_ResultEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.EntryType#getServiceTimeDistribution <em>Service Time Distribution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Time Distribution</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getServiceTimeDistribution()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_ServiceTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.EntryType#getForwarding <em>Forwarding</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Forwarding</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getForwarding()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Forwarding();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.EntryType#getEntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Activity Graph</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getEntryActivityGraph()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_EntryActivityGraph();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.EntryType#getEntryPhaseActivities <em>Entry Phase Activities</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Phase Activities</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getEntryPhaseActivities()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_EntryPhaseActivities();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.EntryType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getName()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.EntryType#getOpenArrivalRate <em>Open Arrival Rate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Arrival Rate</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getOpenArrivalRate()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_OpenArrivalRate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.EntryType#getPriority <em>Priority</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getPriority()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Priority();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.EntryType#getRwlock <em>Rwlock</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Rwlock</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getRwlock()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Rwlock();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.EntryType#getSemaphore <em>Semaphore</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Semaphore</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getSemaphore()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Semaphore();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.EntryType#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.EntryType#getType()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Type();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.FanInType <em>Fan In Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fan In Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.FanInType
	 * @generated
	 */
	EClass getFanInType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.FanInType#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.palladiosimulator.solver.lqn.FanInType#getSource()
	 * @see #getFanInType()
	 * @generated
	 */
	EAttribute getFanInType_Source();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.FanInType#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.FanInType#getValue()
	 * @see #getFanInType()
	 * @generated
	 */
	EAttribute getFanInType_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.FanOutType <em>Fan Out Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fan Out Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.FanOutType
	 * @generated
	 */
	EClass getFanOutType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.FanOutType#getDest <em>Dest</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see org.palladiosimulator.solver.lqn.FanOutType#getDest()
	 * @see #getFanOutType()
	 * @generated
	 */
	EAttribute getFanOutType_Dest();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.FanOutType#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.FanOutType#getValue()
	 * @see #getFanOutType()
	 * @generated
	 */
	EAttribute getFanOutType_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.FirstPlotType <em>First Plot Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Plot Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.FirstPlotType
	 * @generated
	 */
	EClass getFirstPlotType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.FirstPlotType#getVariable <em>Variable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.palladiosimulator.solver.lqn.FirstPlotType#getVariable()
	 * @see #getFirstPlotType()
	 * @generated
	 */
	EAttribute getFirstPlotType_Variable();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.GroupType
	 * @generated
	 */
	EClass getGroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.GroupType#getResultGroup <em>Result Group</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Group</em>'.
	 * @see org.palladiosimulator.solver.lqn.GroupType#getResultGroup()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_ResultGroup();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.GroupType#getTask <em>Task</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see org.palladiosimulator.solver.lqn.GroupType#getTask()
	 * @see #getGroupType()
	 * @generated
	 */
	EReference getGroupType_Task();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.GroupType#isCap <em>Cap</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap</em>'.
	 * @see org.palladiosimulator.solver.lqn.GroupType#isCap()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Cap();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.GroupType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.GroupType#getName()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.GroupType#getShare <em>Share</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Share</em>'.
	 * @see org.palladiosimulator.solver.lqn.GroupType#getShare()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Share();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.HistogramBinType <em>Histogram Bin Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram Bin Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType
	 * @generated
	 */
	EClass getHistogramBinType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getBegin <em>Begin</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType#getBegin()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Begin();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf95 <em>Conf95</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Conf95</em>'.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType#getConf95()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Conf95();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getConf99 <em>Conf99</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Conf99</em>'.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType#getConf99()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Conf99();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getEnd <em>End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType#getEnd()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_End();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.HistogramBinType#getProb <em>Prob</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see org.palladiosimulator.solver.lqn.HistogramBinType#getProb()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Prob();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.InPortType <em>In Port Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.InPortType
	 * @generated
	 */
	EClass getInPortType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.InPortType#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect From</em>'.
	 * @see org.palladiosimulator.solver.lqn.InPortType#getConnectFrom()
	 * @see #getInPortType()
	 * @generated
	 */
	EAttribute getInPortType_ConnectFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.InPortType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.palladiosimulator.solver.lqn.InPortType#getDescription()
	 * @see #getInPortType()
	 * @generated
	 */
	EAttribute getInPortType_Description();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.InPortType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.InPortType#getName()
	 * @see #getInPortType()
	 * @generated
	 */
	EAttribute getInPortType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.InterfaceType#getInPort <em>In Port</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>In Port</em>'.
	 * @see org.palladiosimulator.solver.lqn.InterfaceType#getInPort()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_InPort();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.InterfaceType#getOutPort <em>Out Port</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Out Port</em>'.
	 * @see org.palladiosimulator.solver.lqn.InterfaceType#getOutPort()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_OutPort();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.LqnCoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnCoreType
	 * @generated
	 */
	EClass getLqnCoreType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.LqnCoreType#getProcessor <em>Processor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnCoreType#getProcessor()
	 * @see #getLqnCoreType()
	 * @generated
	 */
	EReference getLqnCoreType_Processor();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.LqnCoreType#getSlot <em>Slot</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnCoreType#getSlot()
	 * @see #getLqnCoreType()
	 * @generated
	 */
	EReference getLqnCoreType_Slot();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.LqnModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType
	 * @generated
	 */
	EClass getLqnModelType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.LqnModelType#getRunControl <em>Run Control</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Control</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getRunControl()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_RunControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.LqnModelType#getPlotControl <em>Plot Control</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plot Control</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getPlotControl()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_PlotControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.LqnModelType#getSolverParams <em>Solver Params</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solver Params</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getSolverParams()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_SolverParams();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.LqnModelType#getProcessor <em>Processor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getProcessor()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_Processor();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.LqnModelType#getSlot <em>Slot</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getSlot()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_Slot();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.LqnModelType#getLqx <em>Lqx</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Lqx</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getLqx()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_Lqx();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.LqnModelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getDescription()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.LqnModelType#getLqnSchemaVersion <em>Lqn Schema Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqn Schema Version</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getLqnSchemaVersion()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_LqnSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.LqnModelType#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqncore Schema Version</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getLqncoreSchemaVersion()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_LqncoreSchemaVersion();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.LqnModelType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#getName()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.LqnModelType#isXmlDebug <em>Xml Debug</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Xml Debug</em>'.
	 * @see org.palladiosimulator.solver.lqn.LqnModelType#isXmlDebug()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_XmlDebug();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.MakingCallType <em>Making Call Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Making Call Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.MakingCallType
	 * @generated
	 */
	EClass getMakingCallType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.MakingCallType#getResultCall <em>Result Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Call</em>'.
	 * @see org.palladiosimulator.solver.lqn.MakingCallType#getResultCall()
	 * @see #getMakingCallType()
	 * @generated
	 */
	EReference getMakingCallType_ResultCall();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.MakingCallType#getDest <em>Dest</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see org.palladiosimulator.solver.lqn.MakingCallType#getDest()
	 * @see #getMakingCallType()
	 * @generated
	 */
	EAttribute getMakingCallType_Dest();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.MvaInfoType <em>Mva Info Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mva Info Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType
	 * @generated
	 */
	EClass getMvaInfoType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.MvaInfoType#getCore <em>Core</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Core</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getCore()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_Core();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.MvaInfoType#getFaults <em>Faults</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Faults</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getFaults()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_Faults();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.MvaInfoType#getStep <em>Step</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getStep()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_Step();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getStepSquared <em>Step Squared</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Squared</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getStepSquared()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_StepSquared();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.MvaInfoType#getSubmodels <em>Submodels</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Submodels</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getSubmodels()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_Submodels();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.MvaInfoType#getWait <em>Wait</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Wait</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getWait()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_Wait();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.MvaInfoType#getWaitSquared <em>Wait Squared</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait Squared</em>'.
	 * @see org.palladiosimulator.solver.lqn.MvaInfoType#getWaitSquared()
	 * @see #getMvaInfoType()
	 * @generated
	 */
	EAttribute getMvaInfoType_WaitSquared();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.OrListType <em>Or List Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or List Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.OrListType
	 * @generated
	 */
	EClass getOrListType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.OrListType#getActivity <em>Activity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.OrListType#getActivity()
	 * @see #getOrListType()
	 * @generated
	 */
	EReference getOrListType_Activity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.OutPortType <em>Out Port Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutPortType
	 * @generated
	 */
	EClass getOutPortType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutPortType#getConnectTo <em>Connect To</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Connect To</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutPortType#getConnectTo()
	 * @see #getOutPortType()
	 * @generated
	 */
	EAttribute getOutPortType_ConnectTo();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutPortType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutPortType#getDescription()
	 * @see #getOutPortType()
	 * @generated
	 */
	EAttribute getOutPortType_Description();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutPortType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutPortType#getName()
	 * @see #getOutPortType()
	 * @generated
	 */
	EAttribute getOutPortType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.OutputDistributionType <em>Output Distribution Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Distribution Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType
	 * @generated
	 */
	EClass getOutputDistributionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getUnderflowBin <em>Underflow Bin</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Underflow Bin</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getUnderflowBin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EReference getOutputDistributionType_UnderflowBin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getHistogramBin <em>Histogram Bin</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Histogram Bin</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getHistogramBin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EReference getOutputDistributionType_HistogramBin();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getOverflowBin <em>Overflow Bin</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overflow Bin</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getOverflowBin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EReference getOutputDistributionType_OverflowBin();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getBinSize <em>Bin Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin Size</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getBinSize()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_BinSize();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getKurtosis <em>Kurtosis</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurtosis</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getKurtosis()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Kurtosis();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMax <em>Max</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getMax()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Max();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMean <em>Mean</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getMean()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMidPoint <em>Mid Point</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid Point</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getMidPoint()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_MidPoint();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutputDistributionType#getMin <em>Min</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getMin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getNumberBins <em>Number Bins</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Bins</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getNumberBins()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_NumberBins();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutputDistributionType#getSkew <em>Skew</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Skew</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getSkew()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Skew();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputDistributionType#getStdDev <em>Std Dev</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Dev</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputDistributionType#getStdDev()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_StdDev();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.OutputEntryDistributionType <em>Output Entry Distribution Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Entry Distribution Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputEntryDistributionType
	 * @generated
	 */
	EClass getOutputEntryDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputEntryDistributionType#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputEntryDistributionType#getPhase()
	 * @see #getOutputEntryDistributionType()
	 * @generated
	 */
	EAttribute getOutputEntryDistributionType_Phase();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType <em>Output Result Join Delay Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Result Join Delay Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultJoinDelayType
	 * @generated
	 */
	EClass getOutputResultJoinDelayType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf95 <em>Result Conf95</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Conf95</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf95()
	 * @see #getOutputResultJoinDelayType()
	 * @generated
	 */
	EReference getOutputResultJoinDelayType_ResultConf95();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf99 <em>Result Conf99</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Conf99</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getResultConf99()
	 * @see #getOutputResultJoinDelayType()
	 * @generated
	 */
	EReference getOutputResultJoinDelayType_ResultConf99();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinVariance <em>Join Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinVariance()
	 * @see #getOutputResultJoinDelayType()
	 * @generated
	 */
	EAttribute getOutputResultJoinDelayType_JoinVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinWaiting <em>Join Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultJoinDelayType#getJoinWaiting()
	 * @see #getOutputResultJoinDelayType()
	 * @generated
	 */
	EAttribute getOutputResultJoinDelayType_JoinWaiting();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.OutputResultType <em>Output Result Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Result Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType
	 * @generated
	 */
	EClass getOutputResultType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.OutputResultType#getResultConf95 <em>Result Conf95</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Conf95</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getResultConf95()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EReference getOutputResultType_ResultConf95();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.OutputResultType#getResultConf99 <em>Result Conf99</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Conf99</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getResultConf99()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EReference getOutputResultType_ResultConf99();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getLossProbability <em>Loss Probability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss Probability</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getLossProbability()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_LossProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getOpenWaitTime <em>Open Wait Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Wait Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getOpenWaitTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_OpenWaitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTime <em>Phase1 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase1ServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1Utilization <em>Phase1 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase1Utilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1Waiting <em>Phase1 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase1Waiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase1WaitingVariance <em>Phase1 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase1WaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTime <em>Phase2 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase2ServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2Utilization <em>Phase2 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase2Utilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2Waiting <em>Phase2 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase2Waiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase2WaitingVariance <em>Phase2 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase2WaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTime <em>Phase3 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase3ServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3Utilization <em>Phase3 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase3Utilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3Waiting <em>Phase3 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase3Waiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getPhase3WaitingVariance <em>Phase3 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getPhase3WaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Exceed Max Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getProbExceedMaxServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ProbExceedMaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getProcUtilization <em>Proc Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getProcUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ProcUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getProcWaiting <em>Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderHolding <em>Rwlock Reader Holding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Holding</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderHolding()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockReaderHolding();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderUtilization <em>Rwlock Reader Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockReaderUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderWaiting <em>Rwlock Reader Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockReaderWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderWaitingVariance <em>Rwlock Reader Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockReaderWaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockReaderWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterHolding <em>Rwlock Writer Holding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Holding</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterHolding()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockWriterHolding();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterUtilization <em>Rwlock Writer Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockWriterUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterWaiting <em>Rwlock Writer Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockWriterWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterWaitingVariance <em>Rwlock Writer Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getRwlockWriterWaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_RwlockWriterWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getSemaphoreUtilization <em>Semaphore Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getSemaphoreUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_SemaphoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getSemaphoreWaiting <em>Semaphore Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getSemaphoreWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_SemaphoreWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getSemaphoreWaitingVariance <em>Semaphore Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getSemaphoreWaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_SemaphoreWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getServiceTimeVariance <em>Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squared Coeff Variation</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getSquaredCoeffVariation()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_SquaredCoeffVariation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getThroughput()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getThroughputBound <em>Throughput Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Bound</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getThroughputBound()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ThroughputBound();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Utilization();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.OutputResultType#getWaiting <em>Waiting</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getWaitingVariance <em>Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getWaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.OutputResultType#getBottleneckStrength <em>Bottleneck Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottleneck Strength</em>'.
	 * @see org.palladiosimulator.solver.lqn.OutputResultType#getBottleneckStrength()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_BottleneckStrength();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ParameterType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ParameterType#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParameterType#getValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ParaType <em>Para Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Para Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParaType
	 * @generated
	 */
	EClass getParaType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ParaType#getStartValue <em>Start Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParaType#getStartValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_StartValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ParaType#getEndValue <em>End Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>End Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParaType#getEndValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_EndValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ParaType#getStepValue <em>Step Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Step Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParaType#getStepValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_StepValue();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.palladiosimulator.solver.lqn.ParaType#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.ParaType#getValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.PhaseActivities <em>Phase Activities</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Activities</em>'.
	 * @see org.palladiosimulator.solver.lqn.PhaseActivities
	 * @generated
	 */
	EClass getPhaseActivities();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.PhaseActivities#getActivity <em>Activity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.PhaseActivities#getActivity()
	 * @see #getPhaseActivities()
	 * @generated
	 */
	EReference getPhaseActivities_Activity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.PlotControlType <em>Plot Control Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot Control Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.PlotControlType
	 * @generated
	 */
	EClass getPlotControlType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.PlotControlType#getFirstPlot <em>First Plot</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Plot</em>'.
	 * @see org.palladiosimulator.solver.lqn.PlotControlType#getFirstPlot()
	 * @see #getPlotControlType()
	 * @generated
	 */
	EReference getPlotControlType_FirstPlot();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.PlotControlType#getPlot <em>Plot</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Plot</em>'.
	 * @see org.palladiosimulator.solver.lqn.PlotControlType#getPlot()
	 * @see #getPlotControlType()
	 * @generated
	 */
	EReference getPlotControlType_Plot();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.PlotType <em>Plot Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.PlotType
	 * @generated
	 */
	EClass getPlotType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.PlotType#getVariable <em>Variable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.palladiosimulator.solver.lqn.PlotType#getVariable()
	 * @see #getPlotType()
	 * @generated
	 */
	EAttribute getPlotType_Variable();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.PortBindingType <em>Port Binding Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Binding Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.PortBindingType
	 * @generated
	 */
	EClass getPortBindingType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.PortBindingType#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.palladiosimulator.solver.lqn.PortBindingType#getSource()
	 * @see #getPortBindingType()
	 * @generated
	 */
	EAttribute getPortBindingType_Source();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.PortBindingType#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.palladiosimulator.solver.lqn.PortBindingType#getTarget()
	 * @see #getPortBindingType()
	 * @generated
	 */
	EAttribute getPortBindingType_Target();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.PragmaType <em>Pragma Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.PragmaType
	 * @generated
	 */
	EClass getPragmaType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.PragmaType#getParam <em>Param</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see org.palladiosimulator.solver.lqn.PragmaType#getParam()
	 * @see #getPragmaType()
	 * @generated
	 */
	EAttribute getPragmaType_Param();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.PragmaType#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.palladiosimulator.solver.lqn.PragmaType#getValue()
	 * @see #getPragmaType()
	 * @generated
	 */
	EAttribute getPragmaType_Value();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.PrecedenceType <em>Precedence Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType
	 * @generated
	 */
	EClass getPrecedenceType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPre <em>Pre</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPre()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_Pre();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPreOR <em>Pre OR</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Pre OR</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPreOR()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PreOR();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPreAND <em>Pre AND</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Pre AND</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPreAND()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PreAND();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPost <em>Post</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPost()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_Post();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPostOR <em>Post OR</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Post OR</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPostOR()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PostOR();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPostAND <em>Post AND</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Post AND</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPostAND()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PostAND();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.PrecedenceType#getPostLOOP <em>Post LOOP</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Post LOOP</em>'.
	 * @see org.palladiosimulator.solver.lqn.PrecedenceType#getPostLOOP()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PostLOOP();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ProcessorBindingType <em>Processor Binding Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Binding Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorBindingType
	 * @generated
	 */
	EClass getProcessorBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ProcessorBindingType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorBindingType#getSource()
	 * @see #getProcessorBindingType()
	 * @generated
	 */
	EAttribute getProcessorBindingType_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ProcessorBindingType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorBindingType#getTarget()
	 * @see #getProcessorBindingType()
	 * @generated
	 */
	EAttribute getProcessorBindingType_Target();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType
	 * @generated
	 */
	EClass getProcessorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ProcessorType#getResultProcessor <em>Result Processor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Processor</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getResultProcessor()
	 * @see #getProcessorType()
	 * @generated
	 */
	EReference getProcessorType_ResultProcessor();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.ProcessorType#getGroup <em>Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getGroup()
	 * @see #getProcessorType()
	 * @generated
	 */
	EReference getProcessorType_Group();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.ProcessorType#getTask <em>Task</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getTask()
	 * @see #getProcessorType()
	 * @generated
	 */
	EReference getProcessorType_Task();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ProcessorType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getMultiplicity()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Multiplicity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ProcessorType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getName()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ProcessorType#getQuantum <em>Quantum</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Quantum</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getQuantum()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Quantum();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ProcessorType#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getReplication()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Replication();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ProcessorType#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getScheduling()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ProcessorType#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see org.palladiosimulator.solver.lqn.ProcessorType#getSpeedFactor()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_SpeedFactor();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ReplyActivityType <em>Reply Activity Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Activity Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ReplyActivityType
	 * @generated
	 */
	EClass getReplyActivityType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ReplyActivityType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ReplyActivityType#getName()
	 * @see #getReplyActivityType()
	 * @generated
	 */
	EAttribute getReplyActivityType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ReplyEntryType <em>Reply Entry Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Entry Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ReplyEntryType
	 * @generated
	 */
	EClass getReplyEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.ReplyEntryType#getReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.ReplyEntryType#getReplyActivity()
	 * @see #getReplyEntryType()
	 * @generated
	 */
	EReference getReplyEntryType_ReplyActivity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ReplyEntryType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ReplyEntryType#getName()
	 * @see #getReplyEntryType()
	 * @generated
	 */
	EAttribute getReplyEntryType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ResultConf95Type <em>Result Conf95 Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf95 Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type
	 * @generated
	 */
	EClass getResultConf95Type();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type#getJoinVariance <em>Join Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type#getJoinVariance()
	 * @see #getResultConf95Type()
	 * @generated
	 */
	EAttribute getResultConf95Type_JoinVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type#getJoinWaiting <em>Join Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type#getJoinWaiting()
	 * @see #getResultConf95Type()
	 * @generated
	 */
	EAttribute getResultConf95Type_JoinWaiting();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1 <em>Result Conf95 Type1</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf95 Type1</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1
	 * @generated
	 */
	EClass getResultConf95Type1();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getLossProbability <em>Loss Probability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss Probability</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getLossProbability()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_LossProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getOpenWaitTime <em>Open Wait Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Wait Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getOpenWaitTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_OpenWaitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTime <em>Phase1 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1ServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Utilization <em>Phase1 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Utilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Waiting <em>Phase1 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1Waiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1WaitingVariance <em>Phase1 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase1WaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTime <em>Phase2 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2ServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Utilization <em>Phase2 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Utilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Waiting <em>Phase2 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2Waiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2WaitingVariance <em>Phase2 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase2WaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTime <em>Phase3 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3ServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Utilization <em>Phase3 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Utilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Waiting <em>Phase3 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3Waiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3WaitingVariance <em>Phase3 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getPhase3WaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Exceed Max Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getProbExceedMaxServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ProbExceedMaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcUtilization <em>Proc Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ProcUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcWaiting <em>Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderHolding <em>Rwlock Reader Holding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Holding</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderHolding()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockReaderHolding();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderUtilization <em>Rwlock Reader Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockReaderUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaiting <em>Rwlock Reader Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockReaderWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaitingVariance <em>Rwlock Reader Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockReaderWaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockReaderWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterHolding <em>Rwlock Writer Holding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Holding</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterHolding()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockWriterHolding();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterUtilization <em>Rwlock Writer Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockWriterUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaiting <em>Rwlock Writer Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockWriterWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaitingVariance <em>Rwlock Writer Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getRwlockWriterWaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_RwlockWriterWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreUtilization <em>Semaphore Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_SemaphoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaiting <em>Semaphore Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_SemaphoreWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaitingVariance <em>Semaphore Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getSemaphoreWaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_SemaphoreWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTimeVariance <em>Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squared Coeff Variation</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getSquaredCoeffVariation()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_SquaredCoeffVariation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughput()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughputBound <em>Throughput Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Bound</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getThroughputBound()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ThroughputBound();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Utilization();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaiting <em>Waiting</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaitingVariance <em>Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf95Type1#getWaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_WaitingVariance();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ResultConf99Type <em>Result Conf99 Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf99 Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type
	 * @generated
	 */
	EClass getResultConf99Type();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinVariance <em>Join Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinVariance()
	 * @see #getResultConf99Type()
	 * @generated
	 */
	EAttribute getResultConf99Type_JoinVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinWaiting <em>Join Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type#getJoinWaiting()
	 * @see #getResultConf99Type()
	 * @generated
	 */
	EAttribute getResultConf99Type_JoinWaiting();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1 <em>Result Conf99 Type1</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf99 Type1</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1
	 * @generated
	 */
	EClass getResultConf99Type1();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getLossProbability <em>Loss Probability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss Probability</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getLossProbability()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_LossProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getOpenWaitTime <em>Open Wait Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Wait Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getOpenWaitTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_OpenWaitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1ProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1ServiceTime <em>Phase1 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1ServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1ServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1Utilization <em>Phase1 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1Utilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1Waiting <em>Phase1 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1Waiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1WaitingVariance <em>Phase1 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase1WaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2ProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2ServiceTime <em>Phase2 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2ServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2ServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2Utilization <em>Phase2 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2Utilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2Waiting <em>Phase2 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2Waiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2WaitingVariance <em>Phase2 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase2WaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3ProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3ServiceTime <em>Phase3 Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3ServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3ServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3Utilization <em>Phase3 Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3Utilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3Utilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3Waiting <em>Phase3 Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3Waiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3WaitingVariance <em>Phase3 Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getPhase3WaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3WaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Exceed Max Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getProbExceedMaxServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ProbExceedMaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getProcUtilization <em>Proc Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getProcUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ProcUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getProcWaiting <em>Proc Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderHolding <em>Rwlock Reader Holding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Holding</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderHolding()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockReaderHolding();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderUtilization <em>Rwlock Reader Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockReaderUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderWaiting <em>Rwlock Reader Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockReaderWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderWaitingVariance <em>Rwlock Reader Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Reader Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockReaderWaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockReaderWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterHolding <em>Rwlock Writer Holding</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Holding</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterHolding()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockWriterHolding();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterUtilization <em>Rwlock Writer Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockWriterUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterWaiting <em>Rwlock Writer Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockWriterWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterWaitingVariance <em>Rwlock Writer Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rwlock Writer Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getRwlockWriterWaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_RwlockWriterWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getSemaphoreUtilization <em>Semaphore Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getSemaphoreUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_SemaphoreUtilization();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getSemaphoreWaiting <em>Semaphore Waiting</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getSemaphoreWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_SemaphoreWaiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getSemaphoreWaitingVariance <em>Semaphore Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getSemaphoreWaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_SemaphoreWaitingVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getServiceTimeVariance <em>Service Time Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squared Coeff Variation</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getSquaredCoeffVariation()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_SquaredCoeffVariation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getThroughput()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getThroughputBound <em>Throughput Bound</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Bound</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getThroughputBound()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ThroughputBound();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Utilization();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getWaiting <em>Waiting</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Waiting();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultConf99Type1#getWaitingVariance <em>Waiting Variance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Variance</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultConf99Type1#getWaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_WaitingVariance();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ResultGeneralType <em>Result General Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result General Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType
	 * @generated
	 */
	EClass getResultGeneralType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getMvaInfo <em>Mva Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mva Info</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getMvaInfo()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EReference getResultGeneralType_MvaInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal <em>Conv Val</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Val</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getConvVal()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_ConvVal();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getElapsedTime()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_ElapsedTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getIterations()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getPlatformInfo <em>Platform Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Info</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getPlatformInfo()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_PlatformInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSolverInfo <em>Solver Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Info</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getSolverInfo()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_SolverInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getSystemCpuTime <em>System Cpu Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Cpu Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getSystemCpuTime()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_SystemCpuTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.ResultGeneralType#getUserCpuTime <em>User Cpu Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Cpu Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getUserCpuTime()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_UserCpuTime();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ResultGeneralType#getValid <em>Valid</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see org.palladiosimulator.solver.lqn.ResultGeneralType#getValid()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_Valid();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.RunControlType <em>Run Control Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Control Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.RunControlType
	 * @generated
	 */
	EClass getRunControlType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.RunControlType#getPara <em>Para</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.palladiosimulator.solver.lqn.RunControlType#getPara()
	 * @see #getRunControlType()
	 * @generated
	 */
	EReference getRunControlType_Para();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.ServiceType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.ServiceType#getName()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.SingleActivityListType <em>Single Activity List Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Activity List Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.SingleActivityListType
	 * @generated
	 */
	EClass getSingleActivityListType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.SingleActivityListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.palladiosimulator.solver.lqn.SingleActivityListType#getActivity()
	 * @see #getSingleActivityListType()
	 * @generated
	 */
	EReference getSingleActivityListType_Activity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.SlotType
	 * @generated
	 */
	EClass getSlotType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.palladiosimulator.solver.lqn.SlotType#getInterface <em>Interface</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.palladiosimulator.solver.lqn.SlotType#getInterface()
	 * @see #getSlotType()
	 * @generated
	 */
	EReference getSlotType_Interface();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.SlotType#getBinding <em>Binding</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see org.palladiosimulator.solver.lqn.SlotType#getBinding()
	 * @see #getSlotType()
	 * @generated
	 */
	EReference getSlotType_Binding();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.SlotType#getBindTarget <em>Bind Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Bind Target</em>'.
	 * @see org.palladiosimulator.solver.lqn.SlotType#getBindTarget()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_BindTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.SlotType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.palladiosimulator.solver.lqn.SlotType#getId()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.SlotType#getReplicNum <em>Replic Num</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Replic Num</em>'.
	 * @see org.palladiosimulator.solver.lqn.SlotType#getReplicNum()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_ReplicNum();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.SolverParamsType <em>Solver Params Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver Params Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType
	 * @generated
	 */
	EClass getSolverParamsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getResultGeneral <em>Result General</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result General</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getResultGeneral()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EReference getSolverParamsType_ResultGeneral();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.SolverParamsType#getPragma <em>Pragma</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Pragma</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getPragma()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EReference getSolverParamsType_Pragma();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.SolverParamsType#getComment <em>Comment</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getComment()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_Comment();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.SolverParamsType#getConvVal <em>Conv Val</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Conv Val</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getConvVal()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_ConvVal();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.SolverParamsType#getItLimit <em>It Limit</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>It Limit</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getItLimit()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_ItLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getPrintInt <em>Print Int</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Int</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getPrintInt()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_PrintInt();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.SolverParamsType#getUnderrelaxCoeff <em>Underrelax Coeff</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underrelax Coeff</em>'.
	 * @see org.palladiosimulator.solver.lqn.SolverParamsType#getUnderrelaxCoeff()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_UnderrelaxCoeff();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.SynchCallType <em>Synch Call Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synch Call Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.SynchCallType
	 * @generated
	 */
	EClass getSynchCallType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.SynchCallType#getDest <em>Dest</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see org.palladiosimulator.solver.lqn.SynchCallType#getDest()
	 * @see #getSynchCallType()
	 * @generated
	 */
	EAttribute getSynchCallType_Dest();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.TaskActivityGraph <em>Task Activity Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Activity Graph</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskActivityGraph
	 * @generated
	 */
	EClass getTaskActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.TaskActivityGraph#getReplyEntry <em>Reply Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Entry</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskActivityGraph#getReplyEntry()
	 * @see #getTaskActivityGraph()
	 * @generated
	 */
	EReference getTaskActivityGraph_ReplyEntry();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.solver.lqn.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getResultTask <em>Result Task</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Result Task</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getResultTask()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_ResultTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.solver.lqn.TaskType#getServiceTimeDistribution <em>Service Time Distribution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Time Distribution</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getServiceTimeDistribution()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_ServiceTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getFanOut <em>Fan Out</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Fan Out</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getFanOut()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_FanOut();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getFanIn <em>Fan In</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Fan In</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getFanIn()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_FanIn();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getEntry <em>Entry</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getEntry()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Entry();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getService <em>Service</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getService()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Service();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.solver.lqn.TaskType#getTaskActivities <em>Task Activities</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Activities</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getTaskActivities()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_TaskActivities();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.TaskType#getActivityGraph <em>Activity Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Graph</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getActivityGraph()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActivityGraph();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getInitially <em>Initially</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Initially</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getInitially()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Initially();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.TaskType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getMultiplicity()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.solver.lqn.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getPriority <em>Priority</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getPriority()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Priority();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getQueueLength <em>Queue Length</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getQueueLength()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_QueueLength();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getReplication <em>Replication</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getReplication()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Replication();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getScheduling <em>Scheduling</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getScheduling()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Scheduling();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.solver.lqn.TaskType#getThinkTime <em>Think Time</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskType#getThinkTime()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ThinkTime();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.CallOrderType <em>Call Order Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Order Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.CallOrderType
	 * @generated
	 */
	EEnum getCallOrderType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.RWLockType <em>RW Lock Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RW Lock Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.RWLockType
	 * @generated
	 */
	EEnum getRWLockType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.SchedulingType <em>Scheduling Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.SchedulingType
	 * @generated
	 */
	EEnum getSchedulingType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.SemaphoreType <em>Semaphore Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semaphore Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.SemaphoreType
	 * @generated
	 */
	EEnum getSemaphoreType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.TaskOptionType <em>Task Option Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Option Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskOptionType
	 * @generated
	 */
	EEnum getTaskOptionType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.TaskSchedulingType <em>Task Scheduling Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Scheduling Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskSchedulingType
	 * @generated
	 */
	EEnum getTaskSchedulingType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.solver.lqn.ValidType <em>Valid Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valid Type</em>'.
	 * @see org.palladiosimulator.solver.lqn.ValidType
	 * @generated
	 */
	EEnum getValidType();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.CallOrderType <em>Call Order Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Call Order Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.CallOrderType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.CallOrderType"
	 *        extendedMetaData="name='CallOrderType:Object' baseType='CallOrderType'"
	 * @generated
	 */
	EDataType getCallOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Connect From Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connect From Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='connect-from_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getConnectFromType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Connect To Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Connect To Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" extendedMetaData=
	 *        "name='connect-to_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getConnectToType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ext Variable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Ext Variable</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String" extendedMetaData=
	 *        "name='ExtVariable' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='$(_|[a-zA-Z])(([a-zA-Z]|[0-9]|_)+)?'"
	 * @generated
	 */
	EDataType getExtVariable();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Phase Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phase Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='phase_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='3'"
	 * @generated
	 */
	EDataType getPhaseType();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.RWLockType <em>RW Lock Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RW Lock Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.RWLockType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.RWLockType"
	 *        extendedMetaData="name='RWLockType:Object' baseType='RWLockType'"
	 * @generated
	 */
	EDataType getRWLockTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.SchedulingType <em>Scheduling Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scheduling Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.SchedulingType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.SchedulingType"
	 *        extendedMetaData="name='SchedulingType:Object' baseType='SchedulingType'"
	 * @generated
	 */
	EDataType getSchedulingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.SemaphoreType <em>Semaphore Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Semaphore Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.SemaphoreType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.SemaphoreType"
	 *        extendedMetaData="name='SemaphoreType:Object' baseType='SemaphoreType'"
	 * @generated
	 */
	EDataType getSemaphoreTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Srvn Float</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Srvn Float</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" extendedMetaData=
	 *        "name='SrvnFloat' memberTypes='http://www.eclipse.org/emf/2003/XMLType#double http://www.eclipse.org/emf/2003/XMLType#decimal ExtVariable'"
	 * @generated
	 */
	EDataType getSrvnFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Srvn Non Negative Integer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Srvn Non Negative Integer</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='SrvnNonNegativeInteger' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger ExtVariable'"
	 * @generated
	 */
	EDataType getSrvnNonNegativeInteger();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.TaskOptionType <em>Task Option Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Option Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskOptionType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.TaskOptionType"
	 *        extendedMetaData="name='TaskOptionType:Object' baseType='TaskOptionType'"
	 * @generated
	 */
	EDataType getTaskOptionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.TaskSchedulingType <em>Task Scheduling Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Scheduling Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.TaskSchedulingType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.TaskSchedulingType"
	 *        extendedMetaData="name='TaskSchedulingType:Object' baseType='TaskSchedulingType'"
	 * @generated
	 */
	EDataType getTaskSchedulingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.TypeType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.palladiosimulator.solver.lqn.ValidType <em>Valid Type Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valid Type Object</em>'.
	 * @see org.palladiosimulator.solver.lqn.ValidType
	 * @model instanceClass="org.palladiosimulator.solver.lqn.ValidType"
	 *        extendedMetaData="name='valid_._type:Object' baseType='valid_._type'"
	 * @generated
	 */
	EDataType getValidTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LqnFactory getLqnFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl <em>Activity Def Base</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityDefBaseImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityDefBase()
		 * @generated
		 */
		EClass ACTIVITY_DEF_BASE = eINSTANCE.getActivityDefBase();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION = eINSTANCE
				.getActivityDefBase_ServiceTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Result Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_BASE__RESULT_ACTIVITY = eINSTANCE
				.getActivityDefBase_ResultActivity();

		/**
		 * The meta object literal for the '<em><b>Call Order</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__CALL_ORDER = eINSTANCE
				.getActivityDefBase_CallOrder();

		/**
		 * The meta object literal for the '<em><b>Host Demand Cvsq</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ = eINSTANCE
				.getActivityDefBase_HostDemandCvsq();

		/**
		 * The meta object literal for the '<em><b>Host Demand Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN = eINSTANCE
				.getActivityDefBase_HostDemandMean();

		/**
		 * The meta object literal for the '<em><b>Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__MAX_SERVICE_TIME = eINSTANCE
				.getActivityDefBase_MaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__NAME = eINSTANCE
				.getActivityDefBase_Name();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__THINK_TIME = eINSTANCE
				.getActivityDefBase_ThinkTime();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl <em>Activity Def Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityDefTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityDefType()
		 * @generated
		 */
		EClass ACTIVITY_DEF_TYPE = eINSTANCE.getActivityDefType();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_TYPE__CALL_LIST = eINSTANCE
				.getActivityDefType_CallList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_TYPE__GROUP = eINSTANCE
				.getActivityDefType_Group();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_TYPE__SYNCH_CALL = eINSTANCE
				.getActivityDefType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_TYPE__ASYNCH_CALL = eINSTANCE
				.getActivityDefType_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Bound To Entry</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY = eINSTANCE
				.getActivityDefType_BoundToEntry();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityGraphBaseImpl <em>Activity Graph Base</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityGraphBaseImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityGraphBase()
		 * @generated
		 */
		EClass ACTIVITY_GRAPH_BASE = eINSTANCE.getActivityGraphBase();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GRAPH_BASE__ACTIVITY = eINSTANCE
				.getActivityGraphBase_Activity();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GRAPH_BASE__PRECEDENCE = eINSTANCE
				.getActivityGraphBase_Precedence();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityListTypeImpl <em>Activity List Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityListTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityListType()
		 * @generated
		 */
		EClass ACTIVITY_LIST_TYPE = eINSTANCE.getActivityListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LIST_TYPE__ACTIVITY = eINSTANCE
				.getActivityListType_Activity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityLoopListTypeImpl <em>Activity Loop List Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityLoopListTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityLoopListType()
		 * @generated
		 */
		EClass ACTIVITY_LOOP_LIST_TYPE = eINSTANCE.getActivityLoopListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOOP_LIST_TYPE__ACTIVITY = eINSTANCE
				.getActivityLoopListType_Activity();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_LOOP_LIST_TYPE__END = eINSTANCE
				.getActivityLoopListType_End();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityLoopTypeImpl <em>Activity Loop Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityLoopTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityLoopType()
		 * @generated
		 */
		EClass ACTIVITY_LOOP_TYPE = eINSTANCE.getActivityLoopType();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_LOOP_TYPE__COUNT = eINSTANCE
				.getActivityLoopType_Count();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityMakingCallTypeImpl <em>Activity Making Call Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityMakingCallTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityMakingCallType()
		 * @generated
		 */
		EClass ACTIVITY_MAKING_CALL_TYPE = eINSTANCE
				.getActivityMakingCallType();

		/**
		 * The meta object literal for the '<em><b>Calls Mean</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN = eINSTANCE
				.getActivityMakingCallType_CallsMean();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityOrTypeImpl <em>Activity Or Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityOrTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityOrType()
		 * @generated
		 */
		EClass ACTIVITY_OR_TYPE = eINSTANCE.getActivityOrType();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_OR_TYPE__PROB = eINSTANCE.getActivityOrType_Prob();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityPhasesTypeImpl <em>Activity Phases Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityPhasesTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityPhasesType()
		 * @generated
		 */
		EClass ACTIVITY_PHASES_TYPE = eINSTANCE.getActivityPhasesType();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASES_TYPE__CALL_LIST = eINSTANCE
				.getActivityPhasesType_CallList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_PHASES_TYPE__GROUP = eINSTANCE
				.getActivityPhasesType_Group();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASES_TYPE__SYNCH_CALL = eINSTANCE
				.getActivityPhasesType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASES_TYPE__ASYNCH_CALL = eINSTANCE
				.getActivityPhasesType_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_PHASES_TYPE__PHASE = eINSTANCE
				.getActivityPhasesType_Phase();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ActivityTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getActivityType()
		 * @generated
		 */
		EClass ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ACTIVITY_TYPE__NAME = eINSTANCE.getActivityType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl <em>And Join List Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.AndJoinListTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getAndJoinListType()
		 * @generated
		 */
		EClass AND_JOIN_LIST_TYPE = eINSTANCE.getAndJoinListType();

		/**
		 * The meta object literal for the '<em><b>Result Join Delay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_JOIN_LIST_TYPE__RESULT_JOIN_DELAY = eINSTANCE
				.getAndJoinListType_ResultJoinDelay();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_JOIN_LIST_TYPE__SERVICE_TIME_DISTRIBUTION = eINSTANCE
				.getAndJoinListType_ServiceTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_JOIN_LIST_TYPE__ACTIVITY = eINSTANCE
				.getAndJoinListType_Activity();

		/**
		 * The meta object literal for the '<em><b>Quorum</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute AND_JOIN_LIST_TYPE__QUORUM = eINSTANCE
				.getAndJoinListType_Quorum();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.AsynchCallTypeImpl <em>Asynch Call Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.AsynchCallTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getAsynchCallType()
		 * @generated
		 */
		EClass ASYNCH_CALL_TYPE = eINSTANCE.getAsynchCallType();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ASYNCH_CALL_TYPE__DEST = eINSTANCE.getAsynchCallType_Dest();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.BindTypeImpl <em>Bind Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.BindTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getBindType()
		 * @generated
		 */
		EClass BIND_TYPE = eINSTANCE.getBindType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_TYPE__PARAMETER = eINSTANCE.getBindType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Processor Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_TYPE__PROCESSOR_BINDING = eINSTANCE
				.getBindType_ProcessorBinding();

		/**
		 * The meta object literal for the '<em><b>Port Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_TYPE__PORT_BINDING = eINSTANCE
				.getBindType_PortBinding();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.CallListTypeImpl <em>Call List Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.CallListTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getCallListType()
		 * @generated
		 */
		EClass CALL_LIST_TYPE = eINSTANCE.getCallListType();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_LIST_TYPE__SYNCH_CALL = eINSTANCE
				.getCallListType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_LIST_TYPE__ASYNCH_CALL = eINSTANCE
				.getCallListType_AsynchCall();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.DocumentRootImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE
				.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE
				.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Lqn Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LQN_CORE = eINSTANCE
				.getDocumentRoot_LqnCore();

		/**
		 * The meta object literal for the '<em><b>Lqn Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LQN_MODEL = eINSTANCE
				.getDocumentRoot_LqnModel();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl <em>Entry Activity Def Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.EntryActivityDefTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryActivityDefType()
		 * @generated
		 */
		EClass ENTRY_ACTIVITY_DEF_TYPE = eINSTANCE.getEntryActivityDefType();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST = eINSTANCE
				.getEntryActivityDefType_CallList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_ACTIVITY_DEF_TYPE__GROUP = eINSTANCE
				.getEntryActivityDefType_Group();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL = eINSTANCE
				.getEntryActivityDefType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL = eINSTANCE
				.getEntryActivityDefType_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>First Activity</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY = eINSTANCE
				.getEntryActivityDefType_FirstActivity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.EntryActivityGraphImpl <em>Entry Activity Graph</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.EntryActivityGraphImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryActivityGraph()
		 * @generated
		 */
		EClass ENTRY_ACTIVITY_GRAPH = eINSTANCE.getEntryActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Reply Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY = eINSTANCE
				.getEntryActivityGraph_ReplyActivity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.EntryMakingCallTypeImpl <em>Entry Making Call Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.EntryMakingCallTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryMakingCallType()
		 * @generated
		 */
		EClass ENTRY_MAKING_CALL_TYPE = eINSTANCE.getEntryMakingCallType();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_MAKING_CALL_TYPE__PROB = eINSTANCE
				.getEntryMakingCallType_Prob();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.EntryTypeImpl <em>Entry Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.EntryTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getEntryType()
		 * @generated
		 */
		EClass ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '<em><b>Result Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__RESULT_ENTRY = eINSTANCE
				.getEntryType_ResultEntry();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION = eINSTANCE
				.getEntryType_ServiceTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Forwarding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__FORWARDING = eINSTANCE.getEntryType_Forwarding();

		/**
		 * The meta object literal for the '<em><b>Entry Activity Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH = eINSTANCE
				.getEntryType_EntryActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Entry Phase Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES = eINSTANCE
				.getEntryType_EntryPhaseActivities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_TYPE__NAME = eINSTANCE.getEntryType_Name();

		/**
		 * The meta object literal for the '<em><b>Open Arrival Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__OPEN_ARRIVAL_RATE = eINSTANCE
				.getEntryType_OpenArrivalRate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_TYPE__PRIORITY = eINSTANCE.getEntryType_Priority();

		/**
		 * The meta object literal for the '<em><b>Rwlock</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_TYPE__RWLOCK = eINSTANCE.getEntryType_Rwlock();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_TYPE__SEMAPHORE = eINSTANCE.getEntryType_Semaphore();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENTRY_TYPE__TYPE = eINSTANCE.getEntryType_Type();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.FanInTypeImpl <em>Fan In Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.FanInTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getFanInType()
		 * @generated
		 */
		EClass FAN_IN_TYPE = eINSTANCE.getFanInType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FAN_IN_TYPE__SOURCE = eINSTANCE.getFanInType_Source();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FAN_IN_TYPE__VALUE = eINSTANCE.getFanInType_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.FanOutTypeImpl <em>Fan Out Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.FanOutTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getFanOutType()
		 * @generated
		 */
		EClass FAN_OUT_TYPE = eINSTANCE.getFanOutType();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FAN_OUT_TYPE__DEST = eINSTANCE.getFanOutType_Dest();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FAN_OUT_TYPE__VALUE = eINSTANCE.getFanOutType_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.FirstPlotTypeImpl <em>First Plot Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.FirstPlotTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getFirstPlotType()
		 * @generated
		 */
		EClass FIRST_PLOT_TYPE = eINSTANCE.getFirstPlotType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FIRST_PLOT_TYPE__VARIABLE = eINSTANCE
				.getFirstPlotType_Variable();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.GroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.GroupTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getGroupType()
		 * @generated
		 */
		EClass GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '<em><b>Result Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__RESULT_GROUP = eINSTANCE
				.getGroupType_ResultGroup();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TYPE__TASK = eINSTANCE.getGroupType_Task();

		/**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GROUP_TYPE__CAP = eINSTANCE.getGroupType_Cap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GROUP_TYPE__NAME = eINSTANCE.getGroupType_Name();

		/**
		 * The meta object literal for the '<em><b>Share</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute GROUP_TYPE__SHARE = eINSTANCE.getGroupType_Share();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl <em>Histogram Bin Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.HistogramBinTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getHistogramBinType()
		 * @generated
		 */
		EClass HISTOGRAM_BIN_TYPE = eINSTANCE.getHistogramBinType();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__BEGIN = eINSTANCE
				.getHistogramBinType_Begin();

		/**
		 * The meta object literal for the '<em><b>Conf95</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__CONF95 = eINSTANCE
				.getHistogramBinType_Conf95();

		/**
		 * The meta object literal for the '<em><b>Conf99</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__CONF99 = eINSTANCE
				.getHistogramBinType_Conf99();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__END = eINSTANCE
				.getHistogramBinType_End();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__PROB = eINSTANCE
				.getHistogramBinType_Prob();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.InPortTypeImpl <em>In Port Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.InPortTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getInPortType()
		 * @generated
		 */
		EClass IN_PORT_TYPE = eINSTANCE.getInPortType();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IN_PORT_TYPE__CONNECT_FROM = eINSTANCE
				.getInPortType_ConnectFrom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IN_PORT_TYPE__DESCRIPTION = eINSTANCE
				.getInPortType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IN_PORT_TYPE__NAME = eINSTANCE.getInPortType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.InterfaceTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getInterfaceType()
		 * @generated
		 */
		EClass INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__IN_PORT = eINSTANCE
				.getInterfaceType_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__OUT_PORT = eINSTANCE
				.getInterfaceType_OutPort();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.LqnCoreTypeImpl <em>Core Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.LqnCoreTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getLqnCoreType()
		 * @generated
		 */
		EClass LQN_CORE_TYPE = eINSTANCE.getLqnCoreType();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_CORE_TYPE__PROCESSOR = eINSTANCE
				.getLqnCoreType_Processor();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_CORE_TYPE__SLOT = eINSTANCE.getLqnCoreType_Slot();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.LqnModelTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getLqnModelType()
		 * @generated
		 */
		EClass LQN_MODEL_TYPE = eINSTANCE.getLqnModelType();

		/**
		 * The meta object literal for the '<em><b>Run Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__RUN_CONTROL = eINSTANCE
				.getLqnModelType_RunControl();

		/**
		 * The meta object literal for the '<em><b>Plot Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__PLOT_CONTROL = eINSTANCE
				.getLqnModelType_PlotControl();

		/**
		 * The meta object literal for the '<em><b>Solver Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__SOLVER_PARAMS = eINSTANCE
				.getLqnModelType_SolverParams();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__PROCESSOR = eINSTANCE
				.getLqnModelType_Processor();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__SLOT = eINSTANCE.getLqnModelType_Slot();

		/**
		 * The meta object literal for the '<em><b>Lqx</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__LQX = eINSTANCE.getLqnModelType_Lqx();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__DESCRIPTION = eINSTANCE
				.getLqnModelType_Description();

		/**
		 * The meta object literal for the '<em><b>Lqn Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__LQN_SCHEMA_VERSION = eINSTANCE
				.getLqnModelType_LqnSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Lqncore Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION = eINSTANCE
				.getLqnModelType_LqncoreSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__NAME = eINSTANCE.getLqnModelType_Name();

		/**
		 * The meta object literal for the '<em><b>Xml Debug</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__XML_DEBUG = eINSTANCE
				.getLqnModelType_XmlDebug();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl <em>Making Call Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.MakingCallTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getMakingCallType()
		 * @generated
		 */
		EClass MAKING_CALL_TYPE = eINSTANCE.getMakingCallType();

		/**
		 * The meta object literal for the '<em><b>Result Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKING_CALL_TYPE__RESULT_CALL = eINSTANCE
				.getMakingCallType_ResultCall();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MAKING_CALL_TYPE__DEST = eINSTANCE.getMakingCallType_Dest();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl <em>Mva Info Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.MvaInfoTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getMvaInfoType()
		 * @generated
		 */
		EClass MVA_INFO_TYPE = eINSTANCE.getMvaInfoType();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__CORE = eINSTANCE.getMvaInfoType_Core();

		/**
		 * The meta object literal for the '<em><b>Faults</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__FAULTS = eINSTANCE.getMvaInfoType_Faults();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__STEP = eINSTANCE.getMvaInfoType_Step();

		/**
		 * The meta object literal for the '<em><b>Step Squared</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__STEP_SQUARED = eINSTANCE
				.getMvaInfoType_StepSquared();

		/**
		 * The meta object literal for the '<em><b>Submodels</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__SUBMODELS = eINSTANCE
				.getMvaInfoType_Submodels();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__WAIT = eINSTANCE.getMvaInfoType_Wait();

		/**
		 * The meta object literal for the '<em><b>Wait Squared</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MVA_INFO_TYPE__WAIT_SQUARED = eINSTANCE
				.getMvaInfoType_WaitSquared();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.OrListTypeImpl <em>Or List Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.OrListTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOrListType()
		 * @generated
		 */
		EClass OR_LIST_TYPE = eINSTANCE.getOrListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_LIST_TYPE__ACTIVITY = eINSTANCE.getOrListType_Activity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl <em>Out Port Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.OutPortTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutPortType()
		 * @generated
		 */
		EClass OUT_PORT_TYPE = eINSTANCE.getOutPortType();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUT_PORT_TYPE__CONNECT_TO = eINSTANCE
				.getOutPortType_ConnectTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUT_PORT_TYPE__DESCRIPTION = eINSTANCE
				.getOutPortType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUT_PORT_TYPE__NAME = eINSTANCE.getOutPortType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl <em>Output Distribution Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.OutputDistributionTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputDistributionType()
		 * @generated
		 */
		EClass OUTPUT_DISTRIBUTION_TYPE = eINSTANCE.getOutputDistributionType();

		/**
		 * The meta object literal for the '<em><b>Underflow Bin</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN = eINSTANCE
				.getOutputDistributionType_UnderflowBin();

		/**
		 * The meta object literal for the '<em><b>Histogram Bin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN = eINSTANCE
				.getOutputDistributionType_HistogramBin();

		/**
		 * The meta object literal for the '<em><b>Overflow Bin</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN = eINSTANCE
				.getOutputDistributionType_OverflowBin();

		/**
		 * The meta object literal for the '<em><b>Bin Size</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE = eINSTANCE
				.getOutputDistributionType_BinSize();

		/**
		 * The meta object literal for the '<em><b>Kurtosis</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__KURTOSIS = eINSTANCE
				.getOutputDistributionType_Kurtosis();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MAX = eINSTANCE
				.getOutputDistributionType_Max();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MEAN = eINSTANCE
				.getOutputDistributionType_Mean();

		/**
		 * The meta object literal for the '<em><b>Mid Point</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MID_POINT = eINSTANCE
				.getOutputDistributionType_MidPoint();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MIN = eINSTANCE
				.getOutputDistributionType_Min();

		/**
		 * The meta object literal for the '<em><b>Number Bins</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS = eINSTANCE
				.getOutputDistributionType_NumberBins();

		/**
		 * The meta object literal for the '<em><b>Skew</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__SKEW = eINSTANCE
				.getOutputDistributionType_Skew();

		/**
		 * The meta object literal for the '<em><b>Std Dev</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__STD_DEV = eINSTANCE
				.getOutputDistributionType_StdDev();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.OutputEntryDistributionTypeImpl <em>Output Entry Distribution Type</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.OutputEntryDistributionTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputEntryDistributionType()
		 * @generated
		 */
		EClass OUTPUT_ENTRY_DISTRIBUTION_TYPE = eINSTANCE
				.getOutputEntryDistributionType();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE = eINSTANCE
				.getOutputEntryDistributionType_Phase();

		/**
		 * The meta object literal for the '
		 * {@link org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl
		 * <em>Output Result Join Delay Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.palladiosimulator.solver.lqn.impl.OutputResultJoinDelayTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputResultJoinDelayType()
		 * @generated
		 */
		EClass OUTPUT_RESULT_JOIN_DELAY_TYPE = eINSTANCE
				.getOutputResultJoinDelayType();

		/**
		 * The meta object literal for the '<em><b>Result Conf95</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF95 = eINSTANCE
				.getOutputResultJoinDelayType_ResultConf95();

		/**
		 * The meta object literal for the '<em><b>Result Conf99</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_JOIN_DELAY_TYPE__RESULT_CONF99 = eINSTANCE
				.getOutputResultJoinDelayType_ResultConf99();

		/**
		 * The meta object literal for the '<em><b>Join Variance</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_VARIANCE = eINSTANCE
				.getOutputResultJoinDelayType_JoinVariance();

		/**
		 * The meta object literal for the '<em><b>Join Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_JOIN_DELAY_TYPE__JOIN_WAITING = eINSTANCE
				.getOutputResultJoinDelayType_JoinWaiting();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl <em>Output Result Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.OutputResultTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getOutputResultType()
		 * @generated
		 */
		EClass OUTPUT_RESULT_TYPE = eINSTANCE.getOutputResultType();

		/**
		 * The meta object literal for the '<em><b>Result Conf95</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_TYPE__RESULT_CONF95 = eINSTANCE
				.getOutputResultType_ResultConf95();

		/**
		 * The meta object literal for the '<em><b>Result Conf99</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_TYPE__RESULT_CONF99 = eINSTANCE
				.getOutputResultType_ResultConf99();

		/**
		 * The meta object literal for the '<em><b>Loss Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__LOSS_PROBABILITY = eINSTANCE
				.getOutputResultType_LossProbability();

		/**
		 * The meta object literal for the '<em><b>Open Wait Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME = eINSTANCE
				.getOutputResultType_OpenWaitTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING = eINSTANCE
				.getOutputResultType_Phase1ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME = eINSTANCE
				.getOutputResultType_Phase1ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE = eINSTANCE
				.getOutputResultType_Phase1ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase1 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION = eINSTANCE
				.getOutputResultType_Phase1Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase1 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_WAITING = eINSTANCE
				.getOutputResultType_Phase1Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_Phase1WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING = eINSTANCE
				.getOutputResultType_Phase2ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME = eINSTANCE
				.getOutputResultType_Phase2ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE = eINSTANCE
				.getOutputResultType_Phase2ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION = eINSTANCE
				.getOutputResultType_Phase2Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase2 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_WAITING = eINSTANCE
				.getOutputResultType_Phase2Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_Phase2WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING = eINSTANCE
				.getOutputResultType_Phase3ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME = eINSTANCE
				.getOutputResultType_Phase3ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE = eINSTANCE
				.getOutputResultType_Phase3ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION = eINSTANCE
				.getOutputResultType_Phase3Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase3 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_WAITING = eINSTANCE
				.getOutputResultType_Phase3Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_Phase3WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME = eINSTANCE
				.getOutputResultType_ProbExceedMaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Proc Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PROC_UTILIZATION = eINSTANCE
				.getOutputResultType_ProcUtilization();

		/**
		 * The meta object literal for the '<em><b>Proc Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PROC_WAITING = eINSTANCE
				.getOutputResultType_ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Holding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_READER_HOLDING = eINSTANCE
				.getOutputResultType_RwlockReaderHolding();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_READER_UTILIZATION = eINSTANCE
				.getOutputResultType_RwlockReaderUtilization();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING = eINSTANCE
				.getOutputResultType_RwlockReaderWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_READER_WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_RwlockReaderWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Holding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_WRITER_HOLDING = eINSTANCE
				.getOutputResultType_RwlockWriterHolding();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_WRITER_UTILIZATION = eINSTANCE
				.getOutputResultType_RwlockWriterUtilization();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING = eINSTANCE
				.getOutputResultType_RwlockWriterWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__RWLOCK_WRITER_WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_RwlockWriterWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Semaphore Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SEMAPHORE_UTILIZATION = eINSTANCE
				.getOutputResultType_SemaphoreUtilization();

		/**
		 * The meta object literal for the '<em><b>Semaphore Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING = eINSTANCE
				.getOutputResultType_SemaphoreWaiting();

		/**
		 * The meta object literal for the '<em><b>Semaphore Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SEMAPHORE_WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_SemaphoreWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SERVICE_TIME = eINSTANCE
				.getOutputResultType_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE = eINSTANCE
				.getOutputResultType_ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Squared Coeff Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION = eINSTANCE
				.getOutputResultType_SquaredCoeffVariation();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__THROUGHPUT = eINSTANCE
				.getOutputResultType_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND = eINSTANCE
				.getOutputResultType_ThroughputBound();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__UTILIZATION = eINSTANCE
				.getOutputResultType_Utilization();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__WAITING = eINSTANCE
				.getOutputResultType_Waiting();

		/**
		 * The meta object literal for the '<em><b>Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__WAITING_VARIANCE = eINSTANCE
				.getOutputResultType_WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Bottleneck Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__BOTTLENECK_STRENGTH = eINSTANCE
				.getOutputResultType_BottleneckStrength();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ParameterTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ParaTypeImpl <em>Para Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ParaTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getParaType()
		 * @generated
		 */
		EClass PARA_TYPE = eINSTANCE.getParaType();

		/**
		 * The meta object literal for the '<em><b>Start Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARA_TYPE__START_VALUE = eINSTANCE.getParaType_StartValue();

		/**
		 * The meta object literal for the '<em><b>End Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARA_TYPE__END_VALUE = eINSTANCE.getParaType_EndValue();

		/**
		 * The meta object literal for the '<em><b>Step Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARA_TYPE__STEP_VALUE = eINSTANCE.getParaType_StepValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PARA_TYPE__VALUE = eINSTANCE.getParaType_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.PhaseActivitiesImpl <em>Phase Activities</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.PhaseActivitiesImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPhaseActivities()
		 * @generated
		 */
		EClass PHASE_ACTIVITIES = eINSTANCE.getPhaseActivities();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_ACTIVITIES__ACTIVITY = eINSTANCE
				.getPhaseActivities_Activity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.PlotControlTypeImpl <em>Plot Control Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.PlotControlTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPlotControlType()
		 * @generated
		 */
		EClass PLOT_CONTROL_TYPE = eINSTANCE.getPlotControlType();

		/**
		 * The meta object literal for the '<em><b>First Plot</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_CONTROL_TYPE__FIRST_PLOT = eINSTANCE
				.getPlotControlType_FirstPlot();

		/**
		 * The meta object literal for the '<em><b>Plot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_CONTROL_TYPE__PLOT = eINSTANCE
				.getPlotControlType_Plot();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.PlotTypeImpl <em>Plot Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.PlotTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPlotType()
		 * @generated
		 */
		EClass PLOT_TYPE = eINSTANCE.getPlotType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PLOT_TYPE__VARIABLE = eINSTANCE.getPlotType_Variable();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.PortBindingTypeImpl <em>Port Binding Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.PortBindingTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPortBindingType()
		 * @generated
		 */
		EClass PORT_BINDING_TYPE = eINSTANCE.getPortBindingType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PORT_BINDING_TYPE__SOURCE = eINSTANCE
				.getPortBindingType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PORT_BINDING_TYPE__TARGET = eINSTANCE
				.getPortBindingType_Target();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.PragmaTypeImpl <em>Pragma Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.PragmaTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPragmaType()
		 * @generated
		 */
		EClass PRAGMA_TYPE = eINSTANCE.getPragmaType();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PRAGMA_TYPE__PARAM = eINSTANCE.getPragmaType_Param();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PRAGMA_TYPE__VALUE = eINSTANCE.getPragmaType_Value();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl <em>Precedence Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.PrecedenceTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPrecedenceType()
		 * @generated
		 */
		EClass PRECEDENCE_TYPE = eINSTANCE.getPrecedenceType();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__PRE = eINSTANCE.getPrecedenceType_Pre();

		/**
		 * The meta object literal for the '<em><b>Pre OR</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__PRE_OR = eINSTANCE
				.getPrecedenceType_PreOR();

		/**
		 * The meta object literal for the '<em><b>Pre AND</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__PRE_AND = eINSTANCE
				.getPrecedenceType_PreAND();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST = eINSTANCE.getPrecedenceType_Post();

		/**
		 * The meta object literal for the '<em><b>Post OR</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST_OR = eINSTANCE
				.getPrecedenceType_PostOR();

		/**
		 * The meta object literal for the '<em><b>Post AND</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST_AND = eINSTANCE
				.getPrecedenceType_PostAND();

		/**
		 * The meta object literal for the '<em><b>Post LOOP</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST_LOOP = eINSTANCE
				.getPrecedenceType_PostLOOP();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ProcessorBindingTypeImpl <em>Processor Binding Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ProcessorBindingTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getProcessorBindingType()
		 * @generated
		 */
		EClass PROCESSOR_BINDING_TYPE = eINSTANCE.getProcessorBindingType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_BINDING_TYPE__SOURCE = eINSTANCE
				.getProcessorBindingType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_BINDING_TYPE__TARGET = eINSTANCE
				.getProcessorBindingType_Target();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ProcessorTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getProcessorType()
		 * @generated
		 */
		EClass PROCESSOR_TYPE = eINSTANCE.getProcessorType();

		/**
		 * The meta object literal for the '<em><b>Result Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TYPE__RESULT_PROCESSOR = eINSTANCE
				.getProcessorType_ResultProcessor();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TYPE__GROUP = eINSTANCE.getProcessorType_Group();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TYPE__TASK = eINSTANCE.getProcessorType_Task();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__MULTIPLICITY = eINSTANCE
				.getProcessorType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__NAME = eINSTANCE.getProcessorType_Name();

		/**
		 * The meta object literal for the '<em><b>Quantum</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__QUANTUM = eINSTANCE
				.getProcessorType_Quantum();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__REPLICATION = eINSTANCE
				.getProcessorType_Replication();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__SCHEDULING = eINSTANCE
				.getProcessorType_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__SPEED_FACTOR = eINSTANCE
				.getProcessorType_SpeedFactor();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ReplyActivityTypeImpl <em>Reply Activity Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ReplyActivityTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getReplyActivityType()
		 * @generated
		 */
		EClass REPLY_ACTIVITY_TYPE = eINSTANCE.getReplyActivityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute REPLY_ACTIVITY_TYPE__NAME = eINSTANCE
				.getReplyActivityType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ReplyEntryTypeImpl <em>Reply Entry Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ReplyEntryTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getReplyEntryType()
		 * @generated
		 */
		EClass REPLY_ENTRY_TYPE = eINSTANCE.getReplyEntryType();

		/**
		 * The meta object literal for the '<em><b>Reply Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ENTRY_TYPE__REPLY_ACTIVITY = eINSTANCE
				.getReplyEntryType_ReplyActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute REPLY_ENTRY_TYPE__NAME = eINSTANCE.getReplyEntryType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl <em>Result Conf95 Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ResultConf95TypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf95Type()
		 * @generated
		 */
		EClass RESULT_CONF95_TYPE = eINSTANCE.getResultConf95Type();

		/**
		 * The meta object literal for the '<em><b>Join Variance</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE__JOIN_VARIANCE = eINSTANCE
				.getResultConf95Type_JoinVariance();

		/**
		 * The meta object literal for the '<em><b>Join Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE__JOIN_WAITING = eINSTANCE
				.getResultConf95Type_JoinWaiting();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf95Type1Impl <em>Result Conf95 Type1</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ResultConf95Type1Impl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf95Type1()
		 * @generated
		 */
		EClass RESULT_CONF95_TYPE1 = eINSTANCE.getResultConf95Type1();

		/**
		 * The meta object literal for the '<em><b>Loss Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__LOSS_PROBABILITY = eINSTANCE
				.getResultConf95Type1_LossProbability();

		/**
		 * The meta object literal for the '<em><b>Open Wait Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__OPEN_WAIT_TIME = eINSTANCE
				.getResultConf95Type1_OpenWaitTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING = eINSTANCE
				.getResultConf95Type1_Phase1ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME = eINSTANCE
				.getResultConf95Type1_Phase1ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf95Type1_Phase1ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase1 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_UTILIZATION = eINSTANCE
				.getResultConf95Type1_Phase1Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase1 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_WAITING = eINSTANCE
				.getResultConf95Type1_Phase1Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_Phase1WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING = eINSTANCE
				.getResultConf95Type1_Phase2ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME = eINSTANCE
				.getResultConf95Type1_Phase2ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf95Type1_Phase2ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_UTILIZATION = eINSTANCE
				.getResultConf95Type1_Phase2Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase2 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_WAITING = eINSTANCE
				.getResultConf95Type1_Phase2Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_Phase2WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING = eINSTANCE
				.getResultConf95Type1_Phase3ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME = eINSTANCE
				.getResultConf95Type1_Phase3ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf95Type1_Phase3ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_UTILIZATION = eINSTANCE
				.getResultConf95Type1_Phase3Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase3 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_WAITING = eINSTANCE
				.getResultConf95Type1_Phase3Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_Phase3WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = eINSTANCE
				.getResultConf95Type1_ProbExceedMaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Proc Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PROC_UTILIZATION = eINSTANCE
				.getResultConf95Type1_ProcUtilization();

		/**
		 * The meta object literal for the '<em><b>Proc Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PROC_WAITING = eINSTANCE
				.getResultConf95Type1_ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Holding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_READER_HOLDING = eINSTANCE
				.getResultConf95Type1_RwlockReaderHolding();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_READER_UTILIZATION = eINSTANCE
				.getResultConf95Type1_RwlockReaderUtilization();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING = eINSTANCE
				.getResultConf95Type1_RwlockReaderWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_READER_WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_RwlockReaderWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Holding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_WRITER_HOLDING = eINSTANCE
				.getResultConf95Type1_RwlockWriterHolding();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_WRITER_UTILIZATION = eINSTANCE
				.getResultConf95Type1_RwlockWriterUtilization();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING = eINSTANCE
				.getResultConf95Type1_RwlockWriterWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_RwlockWriterWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Semaphore Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SEMAPHORE_UTILIZATION = eINSTANCE
				.getResultConf95Type1_SemaphoreUtilization();

		/**
		 * The meta object literal for the '<em><b>Semaphore Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SEMAPHORE_WAITING = eINSTANCE
				.getResultConf95Type1_SemaphoreWaiting();

		/**
		 * The meta object literal for the '<em><b>Semaphore Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SEMAPHORE_WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_SemaphoreWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SERVICE_TIME = eINSTANCE
				.getResultConf95Type1_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf95Type1_ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Squared Coeff Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION = eINSTANCE
				.getResultConf95Type1_SquaredCoeffVariation();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__THROUGHPUT = eINSTANCE
				.getResultConf95Type1_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__THROUGHPUT_BOUND = eINSTANCE
				.getResultConf95Type1_ThroughputBound();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__UTILIZATION = eINSTANCE
				.getResultConf95Type1_Utilization();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__WAITING = eINSTANCE
				.getResultConf95Type1_Waiting();

		/**
		 * The meta object literal for the '<em><b>Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__WAITING_VARIANCE = eINSTANCE
				.getResultConf95Type1_WaitingVariance();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf99TypeImpl <em>Result Conf99 Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ResultConf99TypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf99Type()
		 * @generated
		 */
		EClass RESULT_CONF99_TYPE = eINSTANCE.getResultConf99Type();

		/**
		 * The meta object literal for the '<em><b>Join Variance</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE__JOIN_VARIANCE = eINSTANCE
				.getResultConf99Type_JoinVariance();

		/**
		 * The meta object literal for the '<em><b>Join Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE__JOIN_WAITING = eINSTANCE
				.getResultConf99Type_JoinWaiting();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl <em>Result Conf99 Type1</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ResultConf99Type1Impl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultConf99Type1()
		 * @generated
		 */
		EClass RESULT_CONF99_TYPE1 = eINSTANCE.getResultConf99Type1();

		/**
		 * The meta object literal for the '<em><b>Loss Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__LOSS_PROBABILITY = eINSTANCE
				.getResultConf99Type1_LossProbability();

		/**
		 * The meta object literal for the '<em><b>Open Wait Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__OPEN_WAIT_TIME = eINSTANCE
				.getResultConf99Type1_OpenWaitTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING = eINSTANCE
				.getResultConf99Type1_Phase1ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME = eINSTANCE
				.getResultConf99Type1_Phase1ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf99Type1_Phase1ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase1 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_UTILIZATION = eINSTANCE
				.getResultConf99Type1_Phase1Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase1 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_WAITING = eINSTANCE
				.getResultConf99Type1_Phase1Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_Phase1WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING = eINSTANCE
				.getResultConf99Type1_Phase2ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME = eINSTANCE
				.getResultConf99Type1_Phase2ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf99Type1_Phase2ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_UTILIZATION = eINSTANCE
				.getResultConf99Type1_Phase2Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase2 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_WAITING = eINSTANCE
				.getResultConf99Type1_Phase2Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_Phase2WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING = eINSTANCE
				.getResultConf99Type1_Phase3ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME = eINSTANCE
				.getResultConf99Type1_Phase3ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf99Type1_Phase3ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_UTILIZATION = eINSTANCE
				.getResultConf99Type1_Phase3Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase3 Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_WAITING = eINSTANCE
				.getResultConf99Type1_Phase3Waiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_Phase3WaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = eINSTANCE
				.getResultConf99Type1_ProbExceedMaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Proc Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PROC_UTILIZATION = eINSTANCE
				.getResultConf99Type1_ProcUtilization();

		/**
		 * The meta object literal for the '<em><b>Proc Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PROC_WAITING = eINSTANCE
				.getResultConf99Type1_ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Holding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_READER_HOLDING = eINSTANCE
				.getResultConf99Type1_RwlockReaderHolding();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_READER_UTILIZATION = eINSTANCE
				.getResultConf99Type1_RwlockReaderUtilization();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING = eINSTANCE
				.getResultConf99Type1_RwlockReaderWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Reader Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_READER_WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_RwlockReaderWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Holding</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_WRITER_HOLDING = eINSTANCE
				.getResultConf99Type1_RwlockWriterHolding();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_WRITER_UTILIZATION = eINSTANCE
				.getResultConf99Type1_RwlockWriterUtilization();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING = eINSTANCE
				.getResultConf99Type1_RwlockWriterWaiting();

		/**
		 * The meta object literal for the '<em><b>Rwlock Writer Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__RWLOCK_WRITER_WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_RwlockWriterWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Semaphore Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SEMAPHORE_UTILIZATION = eINSTANCE
				.getResultConf99Type1_SemaphoreUtilization();

		/**
		 * The meta object literal for the '<em><b>Semaphore Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SEMAPHORE_WAITING = eINSTANCE
				.getResultConf99Type1_SemaphoreWaiting();

		/**
		 * The meta object literal for the '<em><b>Semaphore Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SEMAPHORE_WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_SemaphoreWaitingVariance();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SERVICE_TIME = eINSTANCE
				.getResultConf99Type1_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE = eINSTANCE
				.getResultConf99Type1_ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Squared Coeff Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION = eINSTANCE
				.getResultConf99Type1_SquaredCoeffVariation();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__THROUGHPUT = eINSTANCE
				.getResultConf99Type1_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__THROUGHPUT_BOUND = eINSTANCE
				.getResultConf99Type1_ThroughputBound();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__UTILIZATION = eINSTANCE
				.getResultConf99Type1_Utilization();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__WAITING = eINSTANCE
				.getResultConf99Type1_Waiting();

		/**
		 * The meta object literal for the '<em><b>Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__WAITING_VARIANCE = eINSTANCE
				.getResultConf99Type1_WaitingVariance();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl <em>Result General Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ResultGeneralTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getResultGeneralType()
		 * @generated
		 */
		EClass RESULT_GENERAL_TYPE = eINSTANCE.getResultGeneralType();

		/**
		 * The meta object literal for the '<em><b>Mva Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_GENERAL_TYPE__MVA_INFO = eINSTANCE
				.getResultGeneralType_MvaInfo();

		/**
		 * The meta object literal for the '<em><b>Conv Val</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__CONV_VAL = eINSTANCE
				.getResultGeneralType_ConvVal();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__ELAPSED_TIME = eINSTANCE
				.getResultGeneralType_ElapsedTime();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__ITERATIONS = eINSTANCE
				.getResultGeneralType_Iterations();

		/**
		 * The meta object literal for the '<em><b>Platform Info</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__PLATFORM_INFO = eINSTANCE
				.getResultGeneralType_PlatformInfo();

		/**
		 * The meta object literal for the '<em><b>Solver Info</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__SOLVER_INFO = eINSTANCE
				.getResultGeneralType_SolverInfo();

		/**
		 * The meta object literal for the '<em><b>System Cpu Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME = eINSTANCE
				.getResultGeneralType_SystemCpuTime();

		/**
		 * The meta object literal for the '<em><b>User Cpu Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__USER_CPU_TIME = eINSTANCE
				.getResultGeneralType_UserCpuTime();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__VALID = eINSTANCE
				.getResultGeneralType_Valid();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.RunControlTypeImpl <em>Run Control Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.RunControlTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getRunControlType()
		 * @generated
		 */
		EClass RUN_CONTROL_TYPE = eINSTANCE.getRunControlType();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_CONTROL_TYPE__PARA = eINSTANCE.getRunControlType_Para();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.ServiceTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SERVICE_TYPE__NAME = eINSTANCE.getServiceType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.SingleActivityListTypeImpl <em>Single Activity List Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.SingleActivityListTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSingleActivityListType()
		 * @generated
		 */
		EClass SINGLE_ACTIVITY_LIST_TYPE = eINSTANCE
				.getSingleActivityListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY = eINSTANCE
				.getSingleActivityListType_Activity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.SlotTypeImpl <em>Slot Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.SlotTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSlotType()
		 * @generated
		 */
		EClass SLOT_TYPE = eINSTANCE.getSlotType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_TYPE__INTERFACE = eINSTANCE.getSlotType_Interface();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_TYPE__BINDING = eINSTANCE.getSlotType_Binding();

		/**
		 * The meta object literal for the '<em><b>Bind Target</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SLOT_TYPE__BIND_TARGET = eINSTANCE.getSlotType_BindTarget();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SLOT_TYPE__ID = eINSTANCE.getSlotType_Id();

		/**
		 * The meta object literal for the '<em><b>Replic Num</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SLOT_TYPE__REPLIC_NUM = eINSTANCE.getSlotType_ReplicNum();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl <em>Solver Params Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.SolverParamsTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSolverParamsType()
		 * @generated
		 */
		EClass SOLVER_PARAMS_TYPE = eINSTANCE.getSolverParamsType();

		/**
		 * The meta object literal for the '<em><b>Result General</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_PARAMS_TYPE__RESULT_GENERAL = eINSTANCE
				.getSolverParamsType_ResultGeneral();

		/**
		 * The meta object literal for the '<em><b>Pragma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_PARAMS_TYPE__PRAGMA = eINSTANCE
				.getSolverParamsType_Pragma();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__COMMENT = eINSTANCE
				.getSolverParamsType_Comment();

		/**
		 * The meta object literal for the '<em><b>Conv Val</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__CONV_VAL = eINSTANCE
				.getSolverParamsType_ConvVal();

		/**
		 * The meta object literal for the '<em><b>It Limit</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__IT_LIMIT = eINSTANCE
				.getSolverParamsType_ItLimit();

		/**
		 * The meta object literal for the '<em><b>Print Int</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__PRINT_INT = eINSTANCE
				.getSolverParamsType_PrintInt();

		/**
		 * The meta object literal for the '<em><b>Underrelax Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF = eINSTANCE
				.getSolverParamsType_UnderrelaxCoeff();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl <em>Synch Call Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.SynchCallTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSynchCallType()
		 * @generated
		 */
		EClass SYNCH_CALL_TYPE = eINSTANCE.getSynchCallType();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SYNCH_CALL_TYPE__DEST = eINSTANCE.getSynchCallType_Dest();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.TaskActivityGraphImpl <em>Task Activity Graph</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.TaskActivityGraphImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskActivityGraph()
		 * @generated
		 */
		EClass TASK_ACTIVITY_GRAPH = eINSTANCE.getTaskActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Reply Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ACTIVITY_GRAPH__REPLY_ENTRY = eINSTANCE
				.getTaskActivityGraph_ReplyEntry();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.impl.TaskTypeImpl
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Result Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__RESULT_TASK = eINSTANCE.getTaskType_ResultTask();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__SERVICE_TIME_DISTRIBUTION = eINSTANCE
				.getTaskType_ServiceTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Fan Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__FAN_OUT = eINSTANCE.getTaskType_FanOut();

		/**
		 * The meta object literal for the '<em><b>Fan In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__FAN_IN = eINSTANCE.getTaskType_FanIn();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__ENTRY = eINSTANCE.getTaskType_Entry();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__SERVICE = eINSTANCE.getTaskType_Service();

		/**
		 * The meta object literal for the '<em><b>Task Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__TASK_ACTIVITIES = eINSTANCE
				.getTaskType_TaskActivities();

		/**
		 * The meta object literal for the '<em><b>Activity Graph</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTIVITY_GRAPH = eINSTANCE
				.getTaskType_ActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Initially</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__INITIALLY = eINSTANCE.getTaskType_Initially();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__MULTIPLICITY = eINSTANCE
				.getTaskType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__PRIORITY = eINSTANCE.getTaskType_Priority();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__QUEUE_LENGTH = eINSTANCE
				.getTaskType_QueueLength();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__REPLICATION = eINSTANCE.getTaskType_Replication();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__SCHEDULING = eINSTANCE.getTaskType_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TASK_TYPE__THINK_TIME = eINSTANCE.getTaskType_ThinkTime();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.CallOrderType <em>Call Order Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.CallOrderType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getCallOrderType()
		 * @generated
		 */
		EEnum CALL_ORDER_TYPE = eINSTANCE.getCallOrderType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.RWLockType <em>RW Lock Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.RWLockType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getRWLockType()
		 * @generated
		 */
		EEnum RW_LOCK_TYPE = eINSTANCE.getRWLockType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.SchedulingType <em>Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.SchedulingType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSchedulingType()
		 * @generated
		 */
		EEnum SCHEDULING_TYPE = eINSTANCE.getSchedulingType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.SemaphoreType <em>Semaphore Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.SemaphoreType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSemaphoreType()
		 * @generated
		 */
		EEnum SEMAPHORE_TYPE = eINSTANCE.getSemaphoreType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.TaskOptionType <em>Task Option Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.TaskOptionType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskOptionType()
		 * @generated
		 */
		EEnum TASK_OPTION_TYPE = eINSTANCE.getTaskOptionType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.TaskSchedulingType <em>Task Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.TaskSchedulingType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskSchedulingType()
		 * @generated
		 */
		EEnum TASK_SCHEDULING_TYPE = eINSTANCE.getTaskSchedulingType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.TypeType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.solver.lqn.ValidType <em>Valid Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.solver.lqn.ValidType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getValidType()
		 * @generated
		 */
		EEnum VALID_TYPE = eINSTANCE.getValidType();

		/**
		 * The meta object literal for the '<em>Call Order Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.CallOrderType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getCallOrderTypeObject()
		 * @generated
		 */
		EDataType CALL_ORDER_TYPE_OBJECT = eINSTANCE.getCallOrderTypeObject();

		/**
		 * The meta object literal for the '<em>Connect From Type</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.util.List
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getConnectFromType()
		 * @generated
		 */
		EDataType CONNECT_FROM_TYPE = eINSTANCE.getConnectFromType();

		/**
		 * The meta object literal for the '<em>Connect To Type</em>' data type.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getConnectToType()
		 * @generated
		 */
		EDataType CONNECT_TO_TYPE = eINSTANCE.getConnectToType();

		/**
		 * The meta object literal for the '<em>Ext Variable</em>' data type.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getExtVariable()
		 * @generated
		 */
		EDataType EXT_VARIABLE = eINSTANCE.getExtVariable();

		/**
		 * The meta object literal for the '<em>Phase Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getPhaseType()
		 * @generated
		 */
		EDataType PHASE_TYPE = eINSTANCE.getPhaseType();

		/**
		 * The meta object literal for the '<em>RW Lock Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.RWLockType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getRWLockTypeObject()
		 * @generated
		 */
		EDataType RW_LOCK_TYPE_OBJECT = eINSTANCE.getRWLockTypeObject();

		/**
		 * The meta object literal for the '<em>Scheduling Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.SchedulingType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSchedulingTypeObject()
		 * @generated
		 */
		EDataType SCHEDULING_TYPE_OBJECT = eINSTANCE.getSchedulingTypeObject();

		/**
		 * The meta object literal for the '<em>Semaphore Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.SemaphoreType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSemaphoreTypeObject()
		 * @generated
		 */
		EDataType SEMAPHORE_TYPE_OBJECT = eINSTANCE.getSemaphoreTypeObject();

		/**
		 * The meta object literal for the '<em>Srvn Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSrvnFloat()
		 * @generated
		 */
		EDataType SRVN_FLOAT = eINSTANCE.getSrvnFloat();

		/**
		 * The meta object literal for the '<em>Srvn Non Negative Integer</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.lang.Object
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getSrvnNonNegativeInteger()
		 * @generated
		 */
		EDataType SRVN_NON_NEGATIVE_INTEGER = eINSTANCE
				.getSrvnNonNegativeInteger();

		/**
		 * The meta object literal for the '<em>Task Option Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.TaskOptionType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskOptionTypeObject()
		 * @generated
		 */
		EDataType TASK_OPTION_TYPE_OBJECT = eINSTANCE.getTaskOptionTypeObject();

		/**
		 * The meta object literal for the '<em>Task Scheduling Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.TaskSchedulingType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTaskSchedulingTypeObject()
		 * @generated
		 */
		EDataType TASK_SCHEDULING_TYPE_OBJECT = eINSTANCE
				.getTaskSchedulingTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.TypeType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Valid Type Object</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.palladiosimulator.solver.lqn.ValidType
		 * @see org.palladiosimulator.solver.lqn.impl.LqnPackageImpl#getValidTypeObject()
		 * @generated
		 */
		EDataType VALID_TYPE_OBJECT = eINSTANCE.getValidTypeObject();

	}

} // LqnPackage
