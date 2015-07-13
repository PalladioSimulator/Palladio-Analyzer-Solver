/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Semaphore Type</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getSemaphoreType()
 * @model extendedMetaData="name='SemaphoreType'"
 * @generated
 */
public enum SemaphoreType implements Enumerator {
    /**
     * The '<em><b>Signal</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #SIGNAL_VALUE
     * @generated
     * @ordered
     */
    SIGNAL(0, "signal", "signal"),

    /**
     * The '<em><b>Wait</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #WAIT_VALUE
     * @generated
     * @ordered
     */
    WAIT(1, "wait", "wait");

    /**
     * The '<em><b>Signal</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Signal</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #SIGNAL
     * @model name="signal"
     * @generated
     * @ordered
     */
    public static final int SIGNAL_VALUE = 0;

    /**
     * The '<em><b>Wait</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Wait</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #WAIT
     * @model name="wait"
     * @generated
     * @ordered
     */
    public static final int WAIT_VALUE = 1;

    /**
     * An array of all the '<em><b>Semaphore Type</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final SemaphoreType[] VALUES_ARRAY =
            new SemaphoreType[]
            {
                    SIGNAL,
                    WAIT,
            };

    /**
     * A public read-only list of all the '<em><b>Semaphore Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<SemaphoreType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Semaphore Type</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SemaphoreType get(final String literal) {
        for (final SemaphoreType result : VALUES_ARRAY) {
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Semaphore Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SemaphoreType getByName(final String name) {
        for (final SemaphoreType result : VALUES_ARRAY) {
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Semaphore Type</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SemaphoreType get(final int value) {
        switch (value)
        {
        case SIGNAL_VALUE:
            return SIGNAL;
        case WAIT_VALUE:
            return WAIT;
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
    private SemaphoreType(final int value, final String name, final String literal) {
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

} // SemaphoreType
