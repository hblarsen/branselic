/*
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.branselic.ui.internal.BranselicActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ConfiguratorLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BranselicActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BranselicActivator.getInstance().getInjector(BranselicActivator.ORG_XTEXT_BRANSELIC_CONFIGURATORLANG);
	}
	
}
