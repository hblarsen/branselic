/*
 * generated by Xtext 2.10.0
 */
grammar InternalConfiguratorLang;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.branselic.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.branselic.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.branselic.services.ConfiguratorLangGrammarAccess;

}
@parser::members {
	private ConfiguratorLangGrammarAccess grammarAccess;

	public void setGrammarAccess(ConfiguratorLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleConfiguratorModel
entryRuleConfiguratorModel
:
{ before(grammarAccess.getConfiguratorModelRule()); }
	 ruleConfiguratorModel
{ after(grammarAccess.getConfiguratorModelRule()); } 
	 EOF 
;

// Rule ConfiguratorModel
ruleConfiguratorModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfiguratorModelAccess().getGroup()); }
		(rule__ConfiguratorModel__Group__0)
		{ after(grammarAccess.getConfiguratorModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpSymbol
entryRuleOpSymbol
:
{ before(grammarAccess.getOpSymbolRule()); }
	 ruleOpSymbol
{ after(grammarAccess.getOpSymbolRule()); } 
	 EOF 
;

// Rule OpSymbol
ruleOpSymbol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpSymbolAccess().getAlternatives()); }
		(rule__OpSymbol__Alternatives)
		{ after(grammarAccess.getOpSymbolAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolType
entryRuleBoolType
:
{ before(grammarAccess.getBoolTypeRule()); }
	 ruleBoolType
{ after(grammarAccess.getBoolTypeRule()); } 
	 EOF 
;

// Rule BoolType
ruleBoolType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBoolTypeAccess().getGroup()); }
		(rule__BoolType__Group__0)
		{ after(grammarAccess.getBoolTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntType
entryRuleIntType
:
{ before(grammarAccess.getIntTypeRule()); }
	 ruleIntType
{ after(grammarAccess.getIntTypeRule()); } 
	 EOF 
;

// Rule IntType
ruleIntType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntTypeAccess().getGroup()); }
		(rule__IntType__Group__0)
		{ after(grammarAccess.getIntTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumType
entryRuleEnumType
:
{ before(grammarAccess.getEnumTypeRule()); }
	 ruleEnumType
{ after(grammarAccess.getEnumTypeRule()); } 
	 EOF 
;

// Rule EnumType
ruleEnumType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumTypeAccess().getGroup()); }
		(rule__EnumType__Group__0)
		{ after(grammarAccess.getEnumTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRuleSet
entryRuleRuleSet
:
{ before(grammarAccess.getRuleSetRule()); }
	 ruleRuleSet
{ after(grammarAccess.getRuleSetRule()); } 
	 EOF 
;

// Rule RuleSet
ruleRuleSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleSetAccess().getGroup()); }
		(rule__RuleSet__Group__0)
		{ after(grammarAccess.getRuleSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanExpression
entryRuleBooleanExpression
:
{ before(grammarAccess.getBooleanExpressionRule()); }
	 ruleBooleanExpression
{ after(grammarAccess.getBooleanExpressionRule()); } 
	 EOF 
;

// Rule BooleanExpression
ruleBooleanExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanExpressionAccess().getAlternatives()); }
		(rule__BooleanExpression__Alternatives)
		{ after(grammarAccess.getBooleanExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConst
entryRuleConst
:
{ before(grammarAccess.getConstRule()); }
	 ruleConst
{ after(grammarAccess.getConstRule()); } 
	 EOF 
;

// Rule Const
ruleConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstAccess().getValueAssignment()); }
		(rule__Const__ValueAssignment)
		{ after(grammarAccess.getConstAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtom
entryRuleAtom
:
{ before(grammarAccess.getAtomRule()); }
	 ruleAtom
{ after(grammarAccess.getAtomRule()); } 
	 EOF 
;

// Rule Atom
ruleAtom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomAccess().getOperatorAssignment()); }
		(rule__Atom__OperatorAssignment)
		{ after(grammarAccess.getAtomAccess().getOperatorAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimpleBoolean
entryRuleSimpleBoolean
:
{ before(grammarAccess.getSimpleBooleanRule()); }
	 ruleSimpleBoolean
{ after(grammarAccess.getSimpleBooleanRule()); } 
	 EOF 
;

// Rule SimpleBoolean
ruleSimpleBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleBooleanAccess().getAlternatives()); }
		(rule__SimpleBoolean__Alternatives)
		{ after(grammarAccess.getSimpleBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNegation
entryRuleNegation
:
{ before(grammarAccess.getNegationRule()); }
	 ruleNegation
{ after(grammarAccess.getNegationRule()); } 
	 EOF 
;

// Rule Negation
ruleNegation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNegationAccess().getGroup()); }
		(rule__Negation__Group__0)
		{ after(grammarAccess.getNegationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnd
entryRuleAnd
:
{ before(grammarAccess.getAndRule()); }
	 ruleAnd
{ after(grammarAccess.getAndRule()); } 
	 EOF 
;

// Rule And
ruleAnd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndAccess().getGroup()); }
		(rule__And__Group__0)
		{ after(grammarAccess.getAndAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEBoolean
entryRuleEBoolean
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
		(rule__EBoolean__Alternatives)
		{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpSymbol__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpSymbolAccess().getEqualsSignKeyword_0()); }
		'='
		{ after(grammarAccess.getOpSymbolAccess().getEqualsSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpSymbolAccess().getLessThanSignKeyword_1()); }
		'<'
		{ after(grammarAccess.getOpSymbolAccess().getLessThanSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOpSymbolAccess().getGreaterThanSignKeyword_2()); }
		'>'
		{ after(grammarAccess.getOpSymbolAccess().getGreaterThanSignKeyword_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanExpressionAccess().getConstParserRuleCall_0()); }
		ruleConst
		{ after(grammarAccess.getBooleanExpressionAccess().getConstParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanExpressionAccess().getAtomParserRuleCall_1()); }
		ruleAtom
		{ after(grammarAccess.getBooleanExpressionAccess().getAtomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_2()); }
		ruleAnd
		{ after(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanExpressionAccess().getNegationParserRuleCall_3()); }
		ruleNegation
		{ after(grammarAccess.getBooleanExpressionAccess().getNegationParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleBooleanAccess().getConstParserRuleCall_0()); }
		ruleConst
		{ after(grammarAccess.getSimpleBooleanAccess().getConstParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleBooleanAccess().getAtomParserRuleCall_1()); }
		ruleAtom
		{ after(grammarAccess.getSimpleBooleanAccess().getAtomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleBooleanAccess().getGroup_2()); }
		(rule__SimpleBoolean__Group_2__0)
		{ after(grammarAccess.getSimpleBooleanAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfiguratorModel__Group__0__Impl
	rule__ConfiguratorModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorModelAccess().getFeaturesKeyword_0()); }
	'Features'
	{ after(grammarAccess.getConfiguratorModelAccess().getFeaturesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfiguratorModel__Group__1__Impl
	rule__ConfiguratorModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorModelAccess().getFeatureAssignment_1()); }
	(rule__ConfiguratorModel__FeatureAssignment_1)
	{ after(grammarAccess.getConfiguratorModelAccess().getFeatureAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfiguratorModel__Group__2__Impl
	rule__ConfiguratorModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorModelAccess().getFeatureAssignment_2()); }
	(rule__ConfiguratorModel__FeatureAssignment_2)*
	{ after(grammarAccess.getConfiguratorModelAccess().getFeatureAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfiguratorModel__Group__3__Impl
	rule__ConfiguratorModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorModelAccess().getRulesKeyword_3()); }
	'Rules'
	{ after(grammarAccess.getConfiguratorModelAccess().getRulesKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfiguratorModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorModelAccess().getRulesetAssignment_4()); }
	(rule__ConfiguratorModel__RulesetAssignment_4)
	{ after(grammarAccess.getConfiguratorModelAccess().getRulesetAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getNameAssignment_0()); }
	(rule__Feature__NameAssignment_0)
	{ after(grammarAccess.getFeatureAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFeatureAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); }
	(rule__Feature__TypeAssignment_2)
	{ after(grammarAccess.getFeatureAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BoolType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BoolType__Group__0__Impl
	rule__BoolType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BoolType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBoolTypeAccess().getBoolAction_0()); }
	()
	{ after(grammarAccess.getBoolTypeAccess().getBoolAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BoolType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BoolType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BoolType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); }
	'bool'
	{ after(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntType__Group__0__Impl
	rule__IntType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntTypeAccess().getIntAction_0()); }
	()
	{ after(grammarAccess.getIntTypeAccess().getIntAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); }
	'int'
	{ after(grammarAccess.getIntTypeAccess().getIntKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__0__Impl
	rule__EnumType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getEnumAction_0()); }
	()
	{ after(grammarAccess.getEnumTypeAccess().getEnumAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__1__Impl
	rule__EnumType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__2__Impl
	rule__EnumType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getGroup_2()); }
	(rule__EnumType__Group_2__0)?
	{ after(grammarAccess.getEnumTypeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumType__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_2__0__Impl
	rule__EnumType__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getValuesAssignment_2_0()); }
	(rule__EnumType__ValuesAssignment_2_0)
	{ after(grammarAccess.getEnumTypeAccess().getValuesAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getGroup_2_1()); }
	(rule__EnumType__Group_2_1__0)*
	{ after(grammarAccess.getEnumTypeAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumType__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_2_1__0__Impl
	rule__EnumType__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getEnumTypeAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumType__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeAccess().getValuesAssignment_2_1_1()); }
	(rule__EnumType__ValuesAssignment_2_1_1)
	{ after(grammarAccess.getEnumTypeAccess().getValuesAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RuleSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleSet__Group__0__Impl
	rule__RuleSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleSetAccess().getRuleSetAction_0()); }
	()
	{ after(grammarAccess.getRuleSetAccess().getRuleSetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleSetAccess().getRuleAssignment_1()); }
	(rule__RuleSet__RuleAssignment_1)*
	{ after(grammarAccess.getRuleSetAccess().getRuleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getIfAssignment_0()); }
	(rule__Rule__IfAssignment_0)
	{ after(grammarAccess.getRuleAccess().getIfAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
	'->'
	{ after(grammarAccess.getRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getThenAssignment_2()); }
	(rule__Rule__ThenAssignment_2)
	{ after(grammarAccess.getRuleAccess().getThenAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleBoolean__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleBoolean__Group_2__0__Impl
	rule__SimpleBoolean__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleBoolean__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleBooleanAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getSimpleBooleanAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleBoolean__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleBoolean__Group_2__1__Impl
	rule__SimpleBoolean__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleBoolean__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleBooleanAccess().getBooleanExpressionParserRuleCall_2_1()); }
	ruleBooleanExpression
	{ after(grammarAccess.getSimpleBooleanAccess().getBooleanExpressionParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleBoolean__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleBoolean__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleBoolean__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleBooleanAccess().getRightParenthesisKeyword_2_2()); }
	')'
	{ after(grammarAccess.getSimpleBooleanAccess().getRightParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Negation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Negation__Group__0__Impl
	rule__Negation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegationAccess().getNotKeyword_0()); }
	'not'
	{ after(grammarAccess.getNegationAccess().getNotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Negation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegationAccess().getBooleanexpressionAssignment_1()); }
	(rule__Negation__BooleanexpressionAssignment_1)
	{ after(grammarAccess.getNegationAccess().getBooleanexpressionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__And__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__0__Impl
	rule__And__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getBooleanexpressionAssignment_0()); }
	(rule__And__BooleanexpressionAssignment_0)
	{ after(grammarAccess.getAndAccess().getBooleanexpressionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__1__Impl
	rule__And__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getAndKeyword_1()); }
	'and'
	{ after(grammarAccess.getAndAccess().getAndKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__And__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__And__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAccess().getBooleanexpressionAssignment_2()); }
	(rule__And__BooleanexpressionAssignment_2)
	{ after(grammarAccess.getAndAccess().getBooleanexpressionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfiguratorModel__FeatureAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_1_0()); }
		ruleFeature
		{ after(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__FeatureAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_2_0()); }
		ruleFeature
		{ after(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfiguratorModel__RulesetAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfiguratorModelAccess().getRulesetRuleSetParserRuleCall_4_0()); }
		ruleRuleSet
		{ after(grammarAccess.getConfiguratorModelAccess().getRulesetRuleSetParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__ValuesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeAccess().getValuesEStringParserRuleCall_2_0_0()); }
		ruleEString
		{ after(grammarAccess.getEnumTypeAccess().getValuesEStringParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__ValuesAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeAccess().getValuesEStringParserRuleCall_2_1_1_0()); }
		ruleEString
		{ after(grammarAccess.getEnumTypeAccess().getValuesEStringParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleSet__RuleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_1_0()); }
		ruleRule
		{ after(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__IfAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getIfBooleanExpressionParserRuleCall_0_0()); }
		ruleBooleanExpression
		{ after(grammarAccess.getRuleAccess().getIfBooleanExpressionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ThenAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getThenBooleanExpressionParserRuleCall_2_0()); }
		ruleBooleanExpression
		{ after(grammarAccess.getRuleAccess().getThenBooleanExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Const__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstAccess().getValueEBooleanParserRuleCall_0()); }
		ruleEBoolean
		{ after(grammarAccess.getConstAccess().getValueEBooleanParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__OperatorAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomAccess().getOperatorOperatorCrossReference_0()); }
		(
			{ before(grammarAccess.getAtomAccess().getOperatorOperatorIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomAccess().getOperatorOperatorIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getAtomAccess().getOperatorOperatorCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__BooleanexpressionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNegationAccess().getBooleanexpressionSimpleBooleanParserRuleCall_1_0()); }
		ruleSimpleBoolean
		{ after(grammarAccess.getNegationAccess().getBooleanexpressionSimpleBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__BooleanexpressionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_0_0()); }
		ruleSimpleBoolean
		{ after(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__And__BooleanexpressionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_2_0()); }
		ruleSimpleBoolean
		{ after(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;