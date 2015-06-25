/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Call Order Type</b></em>', and utility methods for working with them. <!-- end-user-doc
 * -->
 *
 * @see org.palladiosimulator.solver.lqn.lqnPackage#getCallOrderType()
 * @model extendedMetaData="name='CallOrderType'"
 * @generated
 */
public enum CallOrderType implements Enumerator {
    /**
     * The '<em><b>STOCHASTIC</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #STOCHASTIC_VALUE
     * @generated
     * @ordered
     */
    STOCHASTIC(0, "STOCHASTIC", "STOCHASTIC"),

    /**
     * The '<em><b>DETERMINISTIC</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #DETERMINISTIC_VALUE
     * @generated
     * @ordered
     */
    DETERMINISTIC(1, "DETERMINISTIC", "DETERMINISTIC"),

    /**
     * The '<em><b>LIST</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #LIST_VALUE
     * @generated
     * @ordered
     */
    LIST(2, "LIST", "LIST");

    /**
     * The '<em><b>STOCHASTIC</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STOCHASTIC</b></em>' literal object isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #STOCHASTIC
     * @model
     * @generated
     * @ordered
     */
    public static final int STOCHASTIC_VALUE = 0;

    /**
     * The '<em><b>DETERMINISTIC</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DETERMINISTIC</b></em>' literal object isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #DETERMINISTIC
     * @model
     * @generated
     * @ordered
     */
    public static final int DETERMINISTIC_VALUE = 1;

    /**
     * The '<em><b>LIST</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LIST</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #LIST
     * @model
     * @generated
     * @ordered
     */
    public static final int LIST_VALUE = 2;

    /**
     * An array of all the '<em><b>Call Order Type</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final CallOrderType[] VALUES_ARRAY = new CallOrderType[] { STOCHASTIC, DETERMINISTIC, LIST, };

    /**
     * A public read-only list of all the '<em><b>Call Order Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<CallOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Call Order Type</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CallOrderType get(final String literal) {
        for (final CallOrderType result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Call Order Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CallOrderType getByName(final String name) {
        for (final CallOrderType result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Call Order Type</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CallOrderType get(final int value) {
        switch (value) {
        case STOCHASTIC_VALUE:
            return STOCHASTIC;
        case DETERMINISTIC_VALUE:
            return DETERMINISTIC;
        case LIST_VALUE:
            return LIST;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private CallOrderType(final int value, final String name, final String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLiteral() {
        return this.literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        return this.literal;
    }

} // CallOrderType
