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
		private final Keyword cFeaturesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureFeatureParserRuleCall_1_0 = (RuleCall)cFeatureAssignment_1.eContents().get(0);
		private final Assignment cFeatureAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFeatureFeatureParserRuleCall_2_0 = (RuleCall)cFeatureAssignment_2.eContents().get(0);
		private final Keyword cRulesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRulesetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRulesetRuleSetParserRuleCall_4_0 = (RuleCall)cRulesetAssignment_4.eContents().get(0);
		
		//ConfiguratorModel branselic::ConfiguratorModel:
		//	'Features' feature+=Feature feature+=Feature*
		//	'Rules' ruleset=RuleSet
		@Override public ParserRule getRule() { return rule; }
		
		//'Features' feature+=Feature feature+=Feature* 'Rules' ruleset=RuleSet
		public Group getGroup() { return cGroup; }
		
		//'Features'
		public Keyword getFeaturesKeyword_0() { return cFeaturesKeyword_0; }
		
		//feature+=Feature
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_1_0() { return cFeatureFeatureParserRuleCall_1_0; }
		
		//feature+=Feature*
		public Assignment getFeatureAssignment_2() { return cFeatureAssignment_2; }
		
		//Feature
		public RuleCall getFeatureFeatureParserRuleCall_2_0() { return cFeatureFeatureParserRuleCall_2_0; }
		
		//'Rules'
		public Keyword getRulesKeyword_3() { return cRulesKeyword_3; }
		
		//ruleset=RuleSet
		public Assignment getRulesetAssignment_4() { return cRulesetAssignment_4; }
		
		//RuleSet
		public RuleCall getRulesetRuleSetParserRuleCall_4_0() { return cRulesetRuleSetParserRuleCall_4_0; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cTypeTypeCrossReference_2_0.eContents().get(1);
		
		//Feature branselic::Feature:
		//	Name=EString
		//	':'
		//	type=[branselic::Type]
		@Override public ParserRule getRule() { return rule; }
		
		//Name=EString ':' type=[branselic::Type]
		public Group getGroup() { return cGroup; }
		
		//Name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=[branselic::Type]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//[branselic::Type]
		public CrossReference getTypeTypeCrossReference_2_0() { return cTypeTypeCrossReference_2_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_2_0_1() { return cTypeTypeIDTerminalRuleCall_2_0_1; }
	}
	public class OperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Operator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeatureFeatureCrossReference_0_0 = (CrossReference)cFeatureAssignment_0.eContents().get(0);
		private final RuleCall cFeatureFeatureEStringParserRuleCall_0_0_1 = (RuleCall)cFeatureFeatureCrossReference_0_0.eContents().get(1);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpOpSymbolParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueEStringParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Operator branselic::Operator:
		//	feature=[branselic::Feature|EString] op=OpSymbol
		//	value=EString
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[branselic::Feature|EString] op=OpSymbol value=EString
		public Group getGroup() { return cGroup; }
		
		//feature=[branselic::Feature|EString]
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//[branselic::Feature|EString]
		public CrossReference getFeatureFeatureCrossReference_0_0() { return cFeatureFeatureCrossReference_0_0; }
		
		//EString
		public RuleCall getFeatureFeatureEStringParserRuleCall_0_0_1() { return cFeatureFeatureEStringParserRuleCall_0_0_1; }
		
		//op=OpSymbol
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//OpSymbol
		public RuleCall getOpOpSymbolParserRuleCall_1_0() { return cOpOpSymbolParserRuleCall_1_0; }
		
		//value=EString
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_2_0() { return cValueEStringParserRuleCall_2_0; }
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
		private final RuleCall cValuesEStringParserRuleCall_2_0_0 = (RuleCall)cValuesAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cValuesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cValuesEStringParserRuleCall_2_1_1_0 = (RuleCall)cValuesAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EnumType branselic::Enum:
		//	{branselic::Enum}
		//	'[' (values+=EString ("," values+=EString)*)?
		//	']'
		@Override public ParserRule getRule() { return rule; }
		
		//{branselic::Enum} '[' (values+=EString ("," values+=EString)*)? ']'
		public Group getGroup() { return cGroup; }
		
		//{branselic::Enum}
		public Action getEnumAction_0() { return cEnumAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(values+=EString ("," values+=EString)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//values+=EString
		public Assignment getValuesAssignment_2_0() { return cValuesAssignment_2_0; }
		
		//EString
		public RuleCall getValuesEStringParserRuleCall_2_0_0() { return cValuesEStringParserRuleCall_2_0_0; }
		
		//("," values+=EString)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//values+=EString
		public Assignment getValuesAssignment_2_1_1() { return cValuesAssignment_2_1_1; }
		
		//EString
		public RuleCall getValuesEStringParserRuleCall_2_1_1_0() { return cValuesEStringParserRuleCall_2_1_1_0; }
		
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
		private final Assignment cIfAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIfBooleanExpressionParserRuleCall_0_0 = (RuleCall)cIfAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cThenAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cThenBooleanExpressionParserRuleCall_2_0 = (RuleCall)cThenAssignment_2.eContents().get(0);
		
		//Rule branselic::Rule:
		//	if=BooleanExpression
		//	'->'
		//	then=BooleanExpression
		@Override public ParserRule getRule() { return rule; }
		
		//if=BooleanExpression '->' then=BooleanExpression
		public Group getGroup() { return cGroup; }
		
		//if=BooleanExpression
		public Assignment getIfAssignment_0() { return cIfAssignment_0; }
		
		//BooleanExpression
		public RuleCall getIfBooleanExpressionParserRuleCall_0_0() { return cIfBooleanExpressionParserRuleCall_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//then=BooleanExpression
		public Assignment getThenAssignment_2() { return cThenAssignment_2; }
		
		//BooleanExpression
		public RuleCall getThenBooleanExpressionParserRuleCall_2_0() { return cThenBooleanExpressionParserRuleCall_2_0; }
	}
	public class BooleanExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.BooleanExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConstParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAtomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAndParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNegationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//BooleanExpression branselic::BooleanExpression:
		//	Const | Atom | And | Negation
		@Override public ParserRule getRule() { return rule; }
		
		//Const | Atom | And | Negation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Const
		public RuleCall getConstParserRuleCall_0() { return cConstParserRuleCall_0; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_1() { return cAtomParserRuleCall_1; }
		
		//And
		public RuleCall getAndParserRuleCall_2() { return cAndParserRuleCall_2; }
		
		//Negation
		public RuleCall getNegationParserRuleCall_3() { return cNegationParserRuleCall_3; }
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
		private final CrossReference cOperatorOperatorCrossReference_0 = (CrossReference)cOperatorAssignment.eContents().get(0);
		private final RuleCall cOperatorOperatorIDTerminalRuleCall_0_1 = (RuleCall)cOperatorOperatorCrossReference_0.eContents().get(1);
		
		//Atom branselic::Atom:
		//	operator=[branselic::Operator]
		@Override public ParserRule getRule() { return rule; }
		
		//operator=[branselic::Operator]
		public Assignment getOperatorAssignment() { return cOperatorAssignment; }
		
		//[branselic::Operator]
		public CrossReference getOperatorOperatorCrossReference_0() { return cOperatorOperatorCrossReference_0; }
		
		//ID
		public RuleCall getOperatorOperatorIDTerminalRuleCall_0_1() { return cOperatorOperatorIDTerminalRuleCall_0_1; }
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
	public class OrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.Or");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBooleanexpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_0_0 = (RuleCall)cBooleanexpressionAssignment_0.eContents().get(0);
		private final Keyword cOrKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBooleanexpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBooleanexpressionSimpleBooleanParserRuleCall_2_0 = (RuleCall)cBooleanexpressionAssignment_2.eContents().get(0);
		
		//Or branselic::Or:
		//	booleanexpression+=SimpleBoolean
		//	"or"
		//	booleanexpression+=SimpleBoolean
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
		//	booleanexpression+=SimpleBoolean
		//	"and"
		//	booleanexpression+=SimpleBoolean
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
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.branselic.ConfiguratorLang.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
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
	private final OrElements pOr;
	private final NegationElements pNegation;
	private final AndElements pAnd;
	private final EStringElements pEString;
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
		this.pOr = new OrElements();
		this.pNegation = new NegationElements();
		this.pAnd = new AndElements();
		this.pEString = new EStringElements();
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
	//	'Features' feature+=Feature feature+=Feature*
	//	'Rules' ruleset=RuleSet
	public ConfiguratorModelElements getConfiguratorModelAccess() {
		return pConfiguratorModel;
	}
	
	public ParserRule getConfiguratorModelRule() {
		return getConfiguratorModelAccess().getRule();
	}
	
	//Feature branselic::Feature:
	//	Name=EString
	//	':'
	//	type=[branselic::Type]
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Operator branselic::Operator:
	//	feature=[branselic::Feature|EString] op=OpSymbol
	//	value=EString
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
	//	'[' (values+=EString ("," values+=EString)*)?
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
	//	if=BooleanExpression
	//	'->'
	//	then=BooleanExpression
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//BooleanExpression branselic::BooleanExpression:
	//	Const | Atom | And | Negation
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
	//	operator=[branselic::Operator]
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
	
	//Or branselic::Or:
	//	booleanexpression+=SimpleBoolean
	//	"or"
	//	booleanexpression+=SimpleBoolean
	public OrElements getOrAccess() {
		return pOr;
	}
	
	public ParserRule getOrRule() {
		return getOrAccess().getRule();
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
	//	booleanexpression+=SimpleBoolean
	//	"and"
	//	booleanexpression+=SimpleBoolean
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
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
