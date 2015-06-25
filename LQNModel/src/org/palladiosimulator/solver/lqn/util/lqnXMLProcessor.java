/**
 */
package org.palladiosimulator.solver.lqn.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.solver.lqn.lqnPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class lqnXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public lqnXMLProcessor() {
        super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
        this.extendedMetaData.putPackage(null, lqnPackage.eINSTANCE);
    }

    /**
     * Register for "*" and "xml" file extensions the lqnResourceFactoryImpl factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null) {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new lqnResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new lqnResourceFactoryImpl());
        }
        return this.registrations;
    }

} // lqnXMLProcessor
