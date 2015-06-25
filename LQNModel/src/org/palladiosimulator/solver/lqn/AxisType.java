/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Axis Type</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.lqn.lqnPackage#getAxisType()
 * @model extendedMetaData="name='AxisType'"
 * @generated
 */
public enum AxisType implements Enumerator {
    /**
     * The '<em><b>Linear</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #LINEAR_VALUE
     * @generated
     * @ordered
     */
    LINEAR(0, "linear", "linear"),

    /**
     * The '<em><b>Log</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #LOG_VALUE
     * @generated
     * @ordered
     */
    LOG(1, "log", "log");

    /**
     * The '<em><b>Linear</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Linear</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #LINEAR
     * @model name="linear"
     * @generated
     * @ordered
     */
    public static final int LINEAR_VALUE = 0;

    /**
     * The '<em><b>Log</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Log</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #LOG
     * @model name="log"
     * @generated
     * @ordered
     */
    public static final int LOG_VALUE = 1;

    /**
     * An array of all the '<em><b>Axis Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    private static final AxisType[] VALUES_ARRAY = new AxisType[] { LINEAR, LOG, };

    /**
     * A public read-only list of all the '<em><b>Axis Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<AxisType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Axis Type</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AxisType get(final String literal) {
        for (final AxisType result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Axis Type</b></em>' literal with the specified name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AxisType getByName(final String name) {
        for (final AxisType result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Axis Type</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AxisType get(final int value) {
        switch (value) {
        case LINEAR_VALUE:
            return LINEAR;
        case LOG_VALUE:
            return LOG;
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
    private AxisType(final int value, final String name, final String literal) {
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

} // AxisType
