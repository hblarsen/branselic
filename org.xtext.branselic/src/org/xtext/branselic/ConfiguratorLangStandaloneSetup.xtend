/*
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ConfiguratorLangStandaloneSetup extends ConfiguratorLangStandaloneSetupGenerated {

	def static void doSetup() {
		new ConfiguratorLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
