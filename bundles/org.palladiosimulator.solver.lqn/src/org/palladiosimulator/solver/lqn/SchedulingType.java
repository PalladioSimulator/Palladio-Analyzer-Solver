/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Scheduling Type</b></em>', and utility methods for working with them. <!-- end-user-doc
 * -->
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSchedulingType()
 * @model extendedMetaData="name='SchedulingType'"
 * @generated
 */
public enum SchedulingType implements Enumerator {
	/**
	 * The '<em><b>Fcfs</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #FCFS_VALUE
	 * @generated
	 * @ordered
	 */
	FCFS(0, "fcfs", "fcfs"),

	/**
	 * The '<em><b>Ps</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PS_VALUE
	 * @generated
	 * @ordered
	 */
	PS(1, "ps", "ps"),

	/**
	 * The '<em><b>Pp</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PP_VALUE
	 * @generated
	 * @ordered
	 */
	PP(2, "pp", "pp"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(3, "inf", "inf"),

	/**
	 * The '<em><b>Rand</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #RAND_VALUE
	 * @generated
	 * @ordered
	 */
	RAND(4, "rand", "rand"),

	/**
	 * The '<em><b>Hol</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #HOL_VALUE
	 * @generated
	 * @ordered
	 */
	HOL(5, "hol", "hol"),

	/**
	 * The '<em><b>Ps Hol</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PS_HOL_VALUE
	 * @generated
	 * @ordered
	 */
	PS_HOL(6, "psHol", "ps-hol"),

	/**
	 * The '<em><b>Ps Pp</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PS_PP_VALUE
	 * @generated
	 * @ordered
	 */
	PS_PP(7, "psPp", "ps-pp"),

	/**
	 * The '<em><b>Cfs</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #CFS_VALUE
	 * @generated
	 * @ordered
	 */
	CFS(8, "cfs", "cfs");

	/**
	 * The '<em><b>Fcfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fcfs</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FCFS
	 * @model name="fcfs"
	 * @generated
	 * @ordered
	 */
	public static final int FCFS_VALUE = 0;

	/**
	 * The '<em><b>Ps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ps</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PS
	 * @model name="ps"
	 * @generated
	 * @ordered
	 */
	public static final int PS_VALUE = 1;

	/**
	 * The '<em><b>Pp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pp</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PP
	 * @model name="pp"
	 * @generated
	 * @ordered
	 */
	public static final int PP_VALUE = 2;

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inf</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 3;

	/**
	 * The '<em><b>Rand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rand</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAND
	 * @model name="rand"
	 * @generated
	 * @ordered
	 */
	public static final int RAND_VALUE = 4;

	/**
	 * The '<em><b>Hol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hol</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOL
	 * @model name="hol"
	 * @generated
	 * @ordered
	 */
	public static final int HOL_VALUE = 5;

	/**
	 * The '<em><b>Ps Hol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ps Hol</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PS_HOL
	 * @model name="psHol" literal="ps-hol"
	 * @generated
	 * @ordered
	 */
	public static final int PS_HOL_VALUE = 6;

	/**
	 * The '<em><b>Ps Pp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ps Pp</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PS_PP
	 * @model name="psPp" literal="ps-pp"
	 * @generated
	 * @ordered
	 */
	public static final int PS_PP_VALUE = 7;

	/**
	 * The '<em><b>Cfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cfs</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CFS
	 * @model name="cfs"
	 * @generated
	 * @ordered
	 */
	public static final int CFS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Scheduling Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedulingType[] VALUES_ARRAY = new SchedulingType[] {
			FCFS, PS, PP, INF, RAND, HOL, PS_HOL, PS_PP, CFS, };

	/**
	 * A public read-only list of all the '<em><b>Scheduling Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<SchedulingType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduling Type</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static SchedulingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Type</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static SchedulingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Type</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static SchedulingType get(int value) {
		switch (value) {
		case FCFS_VALUE:
			return FCFS;
		case PS_VALUE:
			return PS;
		case PP_VALUE:
			return PP;
		case INF_VALUE:
			return INF;
		case RAND_VALUE:
			return RAND;
		case HOL_VALUE:
			return HOL;
		case PS_HOL_VALUE:
			return PS_HOL;
		case PS_PP_VALUE:
			return PS_PP;
		case CFS_VALUE:
			return CFS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private SchedulingType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // SchedulingType
