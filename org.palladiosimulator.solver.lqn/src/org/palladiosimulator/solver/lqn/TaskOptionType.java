/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Task Option Type</b></em>', and utility methods for working with them. <!-- end-user-doc
 * -->
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getTaskOptionType()
 * @model extendedMetaData="name='TaskOptionType'"
 * @generated
 */
public enum TaskOptionType implements Enumerator {
    /**
     * The '<em><b>YES</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #YES_VALUE
     * @generated
     * @ordered
     */
    YES(0, "YES", "YES"),

    /**
     * The '<em><b>NO</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #NO_VALUE
     * @generated
     * @ordered
     */
    NO(1, "NO", "NO");

    /**
     * The '<em><b>YES</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>YES</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #YES
     * @model
     * @generated
     * @ordered
     */
    public static final int YES_VALUE = 0;

    /**
     * The '<em><b>NO</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NO</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #NO
     * @model
     * @generated
     * @ordered
     */
    public static final int NO_VALUE = 1;

    /**
     * An array of all the '<em><b>Task Option Type</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final TaskOptionType[] VALUES_ARRAY =
            new TaskOptionType[]
                    {
        YES,
        NO,
                    };

    /**
     * A public read-only list of all the '<em><b>Task Option Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<TaskOptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Task Option Type</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TaskOptionType get(final String literal) {
        for (final TaskOptionType result : VALUES_ARRAY) {
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Task Option Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TaskOptionType getByName(final String name) {
        for (final TaskOptionType result : VALUES_ARRAY) {
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Task Option Type</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TaskOptionType get(final int value) {
        switch (value)
        {
        case YES_VALUE:
            return YES;
        case NO_VALUE:
            return NO;
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
    private TaskOptionType(final int value, final String name, final String literal) {
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

} // TaskOptionType
