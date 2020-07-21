package org.palladiosimulator.solver;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.palladiosimulator.commons.stoex.api.StoExParser;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "pcmsolver_plugin";

	// The shared instance
	private static Activator plugin;

	// Singleton references to StoEx parser
    private ServiceReference<StoExParser> stoExParserReference;
    private StoExParser stoExParser;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		// acquire StoEx parser reference
		stoExParserReference = context.getServiceReference(StoExParser.class);
		stoExParser = context.getService(stoExParserReference);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
	    // release StoEx parser reference
	    context.ungetService(stoExParserReference);
	    stoExParser = null;
	    
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	/**
	 * Returns a singleton instance of StoExParser. 
	 * @return the parser
	 */
	public StoExParser getStoExParser() {
	    return stoExParser;
	}
}
