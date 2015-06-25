/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.solver.spa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.solver.spa.ProcessBehaviour;
import org.palladiosimulator.solver.spa.SPAModel;
import org.palladiosimulator.solver.spa.SpaFactory;
import org.palladiosimulator.solver.spa.SpaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SpaFactoryImpl extends EFactoryImpl implements SpaFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static SpaFactory init() {
        try {
            final SpaFactory theSpaFactory = (SpaFactory) EPackage.Registry.INSTANCE.getEFactory(SpaPackage.eNS_URI);
            if (theSpaFactory != null) {
                return theSpaFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SpaFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SpaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SpaPackage.PROCESS_BEHAVIOUR:
            return this.createProcessBehaviour();
        case SpaPackage.SPA_MODEL:
            return this.createSPAModel();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ProcessBehaviour createProcessBehaviour() {
        final ProcessBehaviourImpl processBehaviour = new ProcessBehaviourImpl();
        return processBehaviour;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SPAModel createSPAModel() {
        final SPAModelImpl spaModel = new SPAModelImpl();
        return spaModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SpaPackage getSpaPackage() {
        return (SpaPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SpaPackage getPackage() {
        return SpaPackage.eINSTANCE;
    }

} // SpaFactoryImpl
