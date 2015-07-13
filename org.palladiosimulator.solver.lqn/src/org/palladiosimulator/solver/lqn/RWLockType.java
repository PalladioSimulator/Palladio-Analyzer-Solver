/**
 */
package org.palladiosimulator.solver.lqn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>RW Lock Type</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.solver.lqn.LqnPackage#getRWLockType()
 * @model extendedMetaData="name='RWLockType'"
 * @generated
 */
public enum RWLockType implements Enumerator {
    /**
     * The '<em><b>RUnlock</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #RUNLOCK_VALUE
     * @generated
     * @ordered
     */
    RUNLOCK(0, "rUnlock", "r-unlock"),

    /**
     * The '<em><b>RLock</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #RLOCK_VALUE
     * @generated
     * @ordered
     */
    RLOCK(1, "rLock", "r-lock"),

    /**
     * The '<em><b>WUnlock</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #WUNLOCK_VALUE
     * @generated
     * @ordered
     */
    WUNLOCK(2, "wUnlock", "w-unlock"),

    /**
     * The '<em><b>WLock</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #WLOCK_VALUE
     * @generated
     * @ordered
     */
    WLOCK(3, "wLock", "w-lock");

    /**
     * The '<em><b>RUnlock</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RUnlock</b></em>' literal object isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #RUNLOCK
     * @model name="rUnlock" literal="r-unlock"
     * @generated
     * @ordered
     */
    public static final int RUNLOCK_VALUE = 0;

    /**
     * The '<em><b>RLock</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RLock</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #RLOCK
     * @model name="rLock" literal="r-lock"
     * @generated
     * @ordered
     */
    public static final int RLOCK_VALUE = 1;

    /**
     * The '<em><b>WUnlock</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WUnlock</b></em>' literal object isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #WUNLOCK
     * @model name="wUnlock" literal="w-unlock"
     * @generated
     * @ordered
     */
    public static final int WUNLOCK_VALUE = 2;

    /**
     * The '<em><b>WLock</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WLock</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #WLOCK
     * @model name="wLock" literal="w-lock"
     * @generated
     * @ordered
     */
    public static final int WLOCK_VALUE = 3;

    /**
     * An array of all the '<em><b>RW Lock Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    private static final RWLockType[] VALUES_ARRAY =
            new RWLockType[]
                    {
        RUNLOCK,
        RLOCK,
        WUNLOCK,
        WLOCK,
                    };

    /**
     * A public read-only list of all the '<em><b>RW Lock Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<RWLockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>RW Lock Type</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static RWLockType get(final String literal) {
        for (final RWLockType result : VALUES_ARRAY) {
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>RW Lock Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static RWLockType getByName(final String name) {
        for (final RWLockType result : VALUES_ARRAY) {
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>RW Lock Type</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static RWLockType get(final int value) {
        switch (value)
        {
        case RUNLOCK_VALUE:
            return RUNLOCK;
        case RLOCK_VALUE:
            return RLOCK;
        case WUNLOCK_VALUE:
            return WUNLOCK;
        case WLOCK_VALUE:
            return WLOCK;
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
    private RWLockType(final int value, final String name, final String literal) {
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

} // RWLockType
