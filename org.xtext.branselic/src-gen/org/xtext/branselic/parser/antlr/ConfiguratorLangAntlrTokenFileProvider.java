/*
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ConfiguratorLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/branselic/parser/antlr/internal/InternalConfiguratorLang.tokens");
	}
}
