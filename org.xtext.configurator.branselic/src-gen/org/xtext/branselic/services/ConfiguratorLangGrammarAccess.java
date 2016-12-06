/*
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ConfiguratorLangGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ConfiguratorModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.ConfiguratorModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cFeaturesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeatureAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeatureFeatureParserRuleCall_4_0 = (RuleCall)cFeatureAssignment_4.eContents().get(0);
		private final Assignment cFeatureAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFeatureFeatureParserRuleCall_5_0 = (RuleCall)cFeatureAssignment_5.eContents().get(0);
		private final Keyword cRulesKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRulesetAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cRulesetRuleSetParserRuleCall_7_0 = (RuleCall)cRulesetAssignment_7.eContents().get(0);
		
		//ConfiguratorModel branselic::ConfiguratorModel:
		//	'Name' ':' name=STRING
		//	'Features' feature+=Feature feature+=Feature*
		//	'Rules' ruleset=RuleSet
		@Override public ParserRule getRule() { return rule; }
		
		//'Name' ':' name=STRING 'Features' feature+=Feature feature+=Feature* 'Rules' ruleset=RuleSet
		public Group getGroup() { return cGroup; }
		
		//'Name'
		public Keyword getNameKeyword_0() { return cNameKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'Features'
		public Keyword getFeaturesKeyword_3() { return cFeaturesKeyword_3; }
		
		//feature+=Feature
		public Assignment getFeatureAssignment_4() { return cFeatureAssignment_4; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_4_0() { return cFeatureFeatureParserRuleCall_4_0; }
		
		//feature+=Feature*
		public Assignment getFeatureAssignment_5() { return cFeatureAssignment_5; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_5_0() { return cFeatureFeatureParserRuleCall_5_0; }
		
		//'Rules'
		public Keyword getRulesKeyword_6() { return cRulesKeyword_6; }
		
		//ruleset=RuleSet
		public Assignment getRulesetAssignment_7() { return cRulesetAssignment_7; }
		
		//RuleSet
		public RuleCall getRulesetRuleSetParserRuleCall_7_0() { return cRulesetRuleSetParserRuleCall_7_0; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cTextAssignment_3.eContents().get(0);
		
		//Feature branselic::Feature:
		//	name=ID
		//	':'
		//	type=Type
		//	text=STRING?
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' type=Type text=STRING?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }
		
		//text=STRING?
		public Assignment getTextAssignment_3() { return cTextAssignment_3; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_3_0() { return cTextSTRINGTerminalRuleCall_3_0; }
	}
	public class OperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Operator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeatureFeatureCrossReference_0_0 = (CrossReference)cFeatureAssignment_0.eContents().get(0);
		private final RuleCall cFeatureFeatureIDTerminalRuleCall_0_0_1 = (RuleCall)cFeatureFeatureCrossReference_0_0.eContents().get(1);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpOpSymbolParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueIDTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Operator branselic::Operator:
		//	feature=[branselic::Feature] op=OpSymbol
		//	value=ID
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[branselic::Feature] op=OpSymbol value=ID
		public Group getGroup() { return cGroup; }
		
		//feature=[branselic::Feature]
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//[branselic::Feature]
		public CrossReference getFeatureFeatureCrossReference_0_0() { return cFeatureFeatureCrossReference_0_0; }
		
		//ID
		public RuleCall getFeatureFeatureIDTerminalRuleCall_0_0_1() { return cFeatureFeatureIDTerminalRuleCall_0_0_1; }
		
		//op=OpSymbol
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//OpSymbol
		public RuleCall getOpOpSymbolParserRuleCall_1_0() { return cOpOpSymbolParserRuleCall_1_0; }
		
		//value=ID
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0() { return cValueIDTerminalRuleCall_2_0; }
	}
	public class OpSymbolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.OpSymbol");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//OpSymbol:
		//	'=' | '<' | '>';
		@Override public ParserRule getRule() { return rule; }
		
		//'=' | '<' | '>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'='
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_2() { return cGreaterThanSignKeyword_2; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBoolTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Type branselic::Type:
		//	BoolType | IntType | EnumType
		@Override public ParserRule getRule() { return rule; }
		
		//BoolType | IntType | EnumType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BoolType
		public RuleCall getBoolTypeParserRuleCall_0() { return cBoolTypeParserRuleCall_0; }
		
		//IntType
		public RuleCall getIntTypeParserRuleCall_1() { return cIntTypeParserRuleCall_1; }
		
		//EnumType
		public RuleCall getEnumTypeParserRuleCall_2() { return cEnumTypeParserRuleCall_2; }
	}
	public class BoolTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.BoolType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBoolAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBoolKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BoolType branselic::Bool:
		//	{branselic::Bool}
		//	'bool'
		@Override public ParserRule getRule() { return rule; }
		
		//{branselic::Bool} 'bool'
		public Group getGroup() { return cGroup; }
		
		//{branselic::Bool}
		public Action getBoolAction_0() { return cBoolAction_0; }
		
		//'bool'
		public Keyword getBoolKeyword_1() { return cBoolKeyword_1; }
	}
	public class IntTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.IntType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIntAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIntKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//IntType branselic::Int:
		//	{branselic::Int}
		//	'int'
		@Override public ParserRule getRule() { return rule; }
		
		//{branselic::Int} 'int'
		public Group getGroup() { return cGroup; }
		
		//{branselic::Int}
		public Action getIntAction_0() { return cIntAction_0; }
		
		//'int'
		public Keyword getIntKeyword_1() { return cIntKeyword_1; }
	}
	public class EnumTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.EnumType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEnumAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cValuesAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cValuesIDTerminalRuleCall_2_0_0 = (RuleCall)cValuesAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cValuesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cValuesIDTerminalRuleCall_2_1_1_0 = (RuleCall)cValuesAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EnumType branselic::Enum:
		//	{branselic::Enum}
		//	'[' (values+=ID ("," values+=ID)*)?
		//	']'
		@Override public ParserRule getRule() { return rule; }
		
		//{branselic::Enum} '[' (values+=ID ("," values+=ID)*)? ']'
		public Group getGroup() { return cGroup; }
		
		//{branselic::Enum}
		public Action getEnumAction_0() { return cEnumAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(values+=ID ("," values+=ID)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//values+=ID
		public Assignment getValuesAssignment_2_0() { return cValuesAssignment_2_0; }
		
		//ID
		public RuleCall getValuesIDTerminalRuleCall_2_0_0() { return cValuesIDTerminalRuleCall_2_0_0; }
		
		//("," values+=ID)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//values+=ID
		public Assignment getValuesAssignment_2_1_1() { return cValuesAssignment_2_1_1; }
		
		//ID
		public RuleCall getValuesIDTerminalRuleCall_2_1_1_0() { return cValuesIDTerminalRuleCall_2_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class RuleSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.RuleSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRuleSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRuleRuleParserRuleCall_1_0 = (RuleCall)cRuleAssignment_1.eContents().get(0);
		
		//RuleSet branselic::RuleSet:
		//	{branselic::RuleSet} rule+=Rule*
		@Override public ParserRule getRule() { return rule; }
		
		//{branselic::RuleSet} rule+=Rule*
		public Group getGroup() { return cGroup; }
		
		//{branselic::RuleSet}
		public Action getRuleSetAction_0() { return cRuleSetAction_0; }
		
		//rule+=Rule*
		public Assignment getRuleAssignment_1() { return cRuleAssignment_1; }
		
		//Rule
		public RuleCall getRuleRuleParserRuleCall_1_0() { return cRuleRuleParserRuleCall_1_0; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cIfAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIfBooleanExpressionParserRuleCall_1_0 = (RuleCall)cIfAssignment_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cThenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cThenBooleanExpressionParserRuleCall_3_0 = (RuleCall)cThenAssignment_3.eContents().get(0);
		private final Assignment cTextAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTextSTRINGTerminalRuleCall_4_0 = (RuleCall)cTextAssignment_4.eContents().get(0);
		
		//Rule branselic::Rule:
		//	(name=ID ':')?
		//	if=BooleanExpression
		//	'->'
		//	then=BooleanExpression
		//	text=STRING?
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID ':')? if=BooleanExpression '->' then=BooleanExpression text=STRING?
		public Group getGroup() { return cGroup; }
		
		//(name=ID ':')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//if=BooleanExpression
		public Assignment getIfAssignment_1() { return cIfAssignment_1; }
		
		//BooleanExpression
		public RuleCall getIfBooleanExpressionParserRuleCall_1_0() { return cIfBooleanExpressionParserRuleCall_1_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }
		
		//then=BooleanExpression
		public Assignment getThenAssignment_3() { return cThenAssignment_3; }
		
		//BooleanExpression
		public RuleCall getThenBooleanExpressionParserRuleCall_3_0() { return cThenBooleanExpressionParserRuleCall_3_0; }
		
		//text=STRING?
		public Assignment getTextAssignment_4() { return cTextAssignment_4; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_4_0() { return cTextSTRINGTerminalRuleCall_4_0; }
	}
	public class BooleanExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.BooleanExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConstParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAtomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAndParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cOrParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cNegationParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//BooleanExpression branselic::BooleanExpression:
		//	Const | Atom | And | Or | Negation
		@Override public ParserRule getRule() { return rule; }
		
		//Const | Atom | And | Or | Negation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Const
		public RuleCall getConstParserRuleCall_0() { return cConstParserRuleCall_0; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_1() { return cAtomParserRuleCall_1; }
		
		//And
		public RuleCall getAndParserRuleCall_2() { return cAndParserRuleCall_2; }
		
		//Or
		public RuleCall getOrParserRuleCall_3() { return cOrParserRuleCall_3; }
		
		//Negation
		public RuleCall getNegationParserRuleCall_4() { return cNegationParserRuleCall_4; }
	}
	public class ConstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Const");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Const branselic::Const:
		//	value=EBoolean
		@Override public ParserRule getRule() { return rule; }
		
		//value=EBoolean
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//EBoolean
		public RuleCall getValueEBooleanParserRuleCall_0() { return cValueEBooleanParserRuleCall_0; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Atom");
		private final Assignment cOperatorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperatorOperatorParserRuleCall_0 = (RuleCall)cOperatorAssignment.eContents().get(0);
		
		//Atom branselic::Atom:
		//	operator=Operator
		@Override public ParserRule getRule() { return rule; }
		
		//operator=Operator
		public Assignment getOperatorAssignment() { return cOperatorAssignment; }
		
		//Operator
		public RuleCall getOperatorOperatorParserRuleCall_0() { return cOperatorOperatorParserRuleCall_0; }
	}
	public class SimpleBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConstParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAtomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cBooleanExpressionParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//SimpleBoolean branselic::BooleanExpression:
		//	Const | Atom | "(" BooleanExpression ")"
		@Override public ParserRule getRule() { return rule; }
		
		//Const | Atom | "(" BooleanExpression ")"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Const
		public RuleCall getConstParserRuleCall_0() { return cConstParserRuleCall_0; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_1() { return cAtomParserRuleCall_1; }
		
		//"(" BooleanExpression ")"
		public Group getGroup_2() { return cGroup_2; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//BooleanExpression
		public RuleCall getBooleanExpressionParserRuleCall_2_1() { return cBooleanExpressionParserRuleCall_2_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}
	public class NegationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Negation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNotKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBooleanexpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_1_0 = (RuleCall)cBooleanexpressionAssignment_1.eContents().get(0);
		
		//Negation branselic::Negation:
		//	'not'
		//	booleanexpression=SimpleBoolean
		@Override public ParserRule getRule() { return rule; }
		
		//'not' booleanexpression=SimpleBoolean
		public Group getGroup() { return cGroup; }
		
		//'not'
		public Keyword getNotKeyword_0() { return cNotKeyword_0; }
		
		//booleanexpression=SimpleBoolean
		public Assignment getBooleanexpressionAssignment_1() { return cBooleanexpressionAssignment_1; }
		
		//SimpleBoolean
		public RuleCall getBooleanexpressionSimpleBooleanParserRuleCall_1_0() { return cBooleanexpressionSimpleBooleanParserRuleCall_1_0; }
	}
	public class AndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.And");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBooleanexpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_0_0 = (RuleCall)cBooleanexpressionAssignment_0.eContents().get(0);
		private final Keyword cAndKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBooleanexpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_2_0 = (RuleCall)cBooleanexpressionAssignment_2.eContents().get(0);
		
		//And branselic::And:
		//	booleanexpression+=SimpleBoolean "and" booleanexpression+=SimpleBoolean
		@Override public ParserRule getRule() { return rule; }
		
		//booleanexpression+=SimpleBoolean "and" booleanexpression+=SimpleBoolean
		public Group getGroup() { return cGroup; }
		
		//booleanexpression+=SimpleBoolean
		public Assignment getBooleanexpressionAssignment_0() { return cBooleanexpressionAssignment_0; }
		
		//SimpleBoolean
		public RuleCall getBooleanexpressionSimpleBooleanParserRuleCall_0_0() { return cBooleanexpressionSimpleBooleanParserRuleCall_0_0; }
		
		//"and"
		public Keyword getAndKeyword_1() { return cAndKeyword_1; }
		
		//booleanexpression+=SimpleBoolean
		public Assignment getBooleanexpressionAssignment_2() { return cBooleanexpressionAssignment_2; }
		
		//SimpleBoolean
		public RuleCall getBooleanexpressionSimpleBooleanParserRuleCall_2_0() { return cBooleanexpressionSimpleBooleanParserRuleCall_2_0; }
	}
	public class OrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Or");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBooleanexpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_0_0 = (RuleCall)cBooleanexpressionAssignment_0.eContents().get(0);
		private final Keyword cOrKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBooleanexpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_2_0 = (RuleCall)cBooleanexpressionAssignment_2.eContents().get(0);
		
		//Or branselic::BooleanExpression:
		//	booleanexpression+=SimpleBoolean "or" booleanexpression+=SimpleBoolean
		@Override public ParserRule getRule() { return rule; }
		
		//booleanexpression+=SimpleBoolean "or" booleanexpression+=SimpleBoolean
		public Group getGroup() { return cGroup; }
		
		//booleanexpression+=SimpleBoolean
		public Assignment getBooleanexpressionAssignment_0() { return cBooleanexpressionAssignment_0; }
		
		//SimpleBoolean
		public RuleCall getBooleanexpressionSimpleBooleanParserRuleCall_0_0() { return cBooleanexpressionSimpleBooleanParserRuleCall_0_0; }
		
		//"or"
		public Keyword getOrKeyword_1() { return cOrKeyword_1; }
		
		//booleanexpression+=SimpleBoolean
		public Assignment getBooleanexpressionAssignment_2() { return cBooleanexpressionAssignment_2; }
		
		//SimpleBoolean
		public RuleCall getBooleanexpressionSimpleBooleanParserRuleCall_2_0() { return cBooleanexpressionSimpleBooleanParserRuleCall_2_0; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false'
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	
	private final ConfiguratorModelElements pConfiguratorModel;
	private final FeatureElements pFeature;
	private final OperatorElements pOperator;
	private final OpSymbolElements pOpSymbol;
	private final TypeElements pType;
	private final BoolTypeElements pBoolType;
	private final IntTypeElements pIntType;
	private final EnumTypeElements pEnumType;
	private final RuleSetElements pRuleSet;
	private final RuleElements pRule;
	private final BooleanExpressionElements pBooleanExpression;
	private final ConstElements pConst;
	private final AtomElements pAtom;
	private final SimpleBooleanElements pSimpleBoolean;
	private final NegationElements pNegation;
	private final AndElements pAnd;
	private final OrElements pOr;
	private final EBooleanElements pEBoolean;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ConfiguratorLangGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pConfiguratorModel = new ConfiguratorModelElements();
		this.pFeature = new FeatureElements();
		this.pOperator = new OperatorElements();
		this.pOpSymbol = new OpSymbolElements();
		this.pType = new TypeElements();
		this.pBoolType = new BoolTypeElements();
		this.pIntType = new IntTypeElements();
		this.pEnumType = new EnumTypeElements();
		this.pRuleSet = new RuleSetElements();
		this.pRule = new RuleElements();
		this.pBooleanExpression = new BooleanExpressionElements();
		this.pConst = new ConstElements();
		this.pAtom = new AtomElements();
		this.pSimpleBoolean = new SimpleBooleanElements();
		this.pNegation = new NegationElements();
		this.pAnd = new AndElements();
		this.pOr = new OrElements();
		this.pEBoolean = new EBooleanElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.branselic.ConfiguratorLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ConfiguratorModel branselic::ConfiguratorModel:
	//	'Name' ':' name=STRING
	//	'Features' feature+=Feature feature+=Feature*
	//	'Rules' ruleset=RuleSet
	public ConfiguratorModelElements getConfiguratorModelAccess() {
		return pConfiguratorModel;
	}
	
	public ParserRule getConfiguratorModelRule() {
		return getConfiguratorModelAccess().getRule();
	}
	
	//Feature branselic::Feature:
	//	name=ID
	//	':'
	//	type=Type
	//	text=STRING?
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Operator branselic::Operator:
	//	feature=[branselic::Feature] op=OpSymbol
	//	value=ID
	public OperatorElements getOperatorAccess() {
		return pOperator;
	}
	
	public ParserRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}
	
	//OpSymbol:
	//	'=' | '<' | '>';
	public OpSymbolElements getOpSymbolAccess() {
		return pOpSymbol;
	}
	
	public ParserRule getOpSymbolRule() {
		return getOpSymbolAccess().getRule();
	}
	
	//Type branselic::Type:
	//	BoolType | IntType | EnumType
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//BoolType branselic::Bool:
	//	{branselic::Bool}
	//	'bool'
	public BoolTypeElements getBoolTypeAccess() {
		return pBoolType;
	}
	
	public ParserRule getBoolTypeRule() {
		return getBoolTypeAccess().getRule();
	}
	
	//IntType branselic::Int:
	//	{branselic::Int}
	//	'int'
	public IntTypeElements getIntTypeAccess() {
		return pIntType;
	}
	
	public ParserRule getIntTypeRule() {
		return getIntTypeAccess().getRule();
	}
	
	//EnumType branselic::Enum:
	//	{branselic::Enum}
	//	'[' (values+=ID ("," values+=ID)*)?
	//	']'
	public EnumTypeElements getEnumTypeAccess() {
		return pEnumType;
	}
	
	public ParserRule getEnumTypeRule() {
		return getEnumTypeAccess().getRule();
	}
	
	//RuleSet branselic::RuleSet:
	//	{branselic::RuleSet} rule+=Rule*
	public RuleSetElements getRuleSetAccess() {
		return pRuleSet;
	}
	
	public ParserRule getRuleSetRule() {
		return getRuleSetAccess().getRule();
	}
	
	//Rule branselic::Rule:
	//	(name=ID ':')?
	//	if=BooleanExpression
	//	'->'
	//	then=BooleanExpression
	//	text=STRING?
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//BooleanExpression branselic::BooleanExpression:
	//	Const | Atom | And | Or | Negation
	public BooleanExpressionElements getBooleanExpressionAccess() {
		return pBooleanExpression;
	}
	
	public ParserRule getBooleanExpressionRule() {
		return getBooleanExpressionAccess().getRule();
	}
	
	//Const branselic::Const:
	//	value=EBoolean
	public ConstElements getConstAccess() {
		return pConst;
	}
	
	public ParserRule getConstRule() {
		return getConstAccess().getRule();
	}
	
	//Atom branselic::Atom:
	//	operator=Operator
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//SimpleBoolean branselic::BooleanExpression:
	//	Const | Atom | "(" BooleanExpression ")"
	public SimpleBooleanElements getSimpleBooleanAccess() {
		return pSimpleBoolean;
	}
	
	public ParserRule getSimpleBooleanRule() {
		return getSimpleBooleanAccess().getRule();
	}
	
	//Negation branselic::Negation:
	//	'not'
	//	booleanexpression=SimpleBoolean
	public NegationElements getNegationAccess() {
		return pNegation;
	}
	
	public ParserRule getNegationRule() {
		return getNegationAccess().getRule();
	}
	
	//And branselic::And:
	//	booleanexpression+=SimpleBoolean "and" booleanexpression+=SimpleBoolean
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//Or branselic::BooleanExpression:
	//	booleanexpression+=SimpleBoolean "or" booleanexpression+=SimpleBoolean
	public OrElements getOrAccess() {
		return pOr;
	}
	
	public ParserRule getOrRule() {
		return getOrAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}