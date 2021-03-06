/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 */
package org.palladiosimulator.solver.context.aggregatedUsageContext.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.solver.context.aggregatedUsageContext.AggregatedUsageContextPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregatedUsageContextXMLProcessor extends XMLProcessor {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AggregatedUsageContextXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        AggregatedUsageContextPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the AggregatedUsageContextResourceFactoryImpl
     * factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null)
        {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new AggregatedUsageContextResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new AggregatedUsageContextResourceFactoryImpl());
        }
        return this.registrations;
    }

} // AggregatedUsageContextXMLProcessor
