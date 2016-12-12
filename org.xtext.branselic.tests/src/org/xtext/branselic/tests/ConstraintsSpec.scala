package org.xtext.branselic.tests

import java.io.File

import scala.sys.process.Process

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.xtext.branselic.validation.Constraints
import org.xtext.branselic.domainmodel.BooleanExpression
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.xtext.branselic.domainmodel.impl.RuleSetImpl
import org.xtext.branselic.domainmodel.util.DomainmodelAdapterFactory
import org.xtext.branselic.validation.ConfiguratorLangValidator


@RunWith(classOf[JUnitRunner])
class ConstraintsSpec extends FlatSpec with Matchers {
  
 def fixture = new {
     val input = List("Basic_configurator.scala","Automobile_configurator.scala")
     val ops = List("<",">","=")
 }  

"The generated scala files" should "compile" in {

   val pathToClassFile = System.getProperty("user.dir") + "\\models\\validation\\"
   val workspace_path = scala.util.Properties.envOrElse("HOMEDRIVE", "" ) + scala.util.Properties.envOrElse("HOMEPATH", "" )
   val project_path = "\\runtime-EclipseApplication\\TestDsl\\src-gen\\"
   val f = fixture

   for(file <- f.input){
     new File(pathToClassFile+"Validator.class").delete()
     val sourceFile = workspace_path + project_path + file;
     Process(sys.env("SCALA_HOME")+"\\scalac.bat " + sourceFile)!;
     if(!new File(pathToClassFile+"Validator.class").exists ){
       throw new Exception("Generated file: " + file + "could not compile")
     } 
   }
 }  

  
 "An operator" should "be legal" in { 
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();
   val op = eINSTANCE.createOperator()
   val f = fixture

   for(optype <- f.ops){
     op.setOp(optype)
     assert(new Constraints().legalOperations(op))
   }

   // Expect false
   op.setOp("/")
   assert(false == new Constraints().legalOperations(op))
 } 
  
 
 "An argument" should "be legal" in { 
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();
   val op = eINSTANCE.createOperator()
   
    val f = fixture

   for(optype <- f.ops){
     op.setOp(optype)
     op.setValue("123456")
     assert(new Constraints().legalArgument(op))
   }

   //Expect false
   op.setOp(">")
   op.setValue("a")
   assert(false == new Constraints().legalArgument(op))
 } 
  
 
  
 "Types" should "be valid" in { 
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();
   val feature = eINSTANCE.createFeature()
   val op = eINSTANCE.createOperator()
   val bo = eINSTANCE.createBool()
   val in = eINSTANCE.createInt()
   val en = eINSTANCE.createEnum()

   feature.setType(bo)
   op.setValue("true")
   op.setFeature(feature) 
   assert(new Constraints().correctlyTyped(op))

   feature.setType(in)
   op.setValue("12")
   op.setFeature(feature) 
   assert(new Constraints().correctlyTyped(op))

   en.getValues.add("Test")
   en.getValues.add("Test2")
   feature.setType(en)
   op.setValue("Test")
   op.setFeature(feature)
   assert(new Constraints().correctlyTyped(op))

   //Expect false
   feature.setType(in)
   op.setValue("xx")
   op.setFeature(feature) 
   assert(false == new Constraints().correctlyTyped(op))
   
 } 
  

 "A rule with Atoms" should "contain 2 operators" in { 

   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   //Atom -> operator -> feature
   
   //HDMI = true
   val feature = eINSTANCE.createFeature()
   feature.setName("HDMI")
   feature.setText("No messages")
   val op = eINSTANCE.createOperator()
   op.setValue("true")
   op.setOp("=")
   op.setFeature(feature) 
   val atom_if = eINSTANCE.createAtom()
   atom_if.setOperator(op)

   
   // CPU : [AMD, Intel]
   val feature2 = eINSTANCE.createFeature()
   feature2.setName("CPU")
   feature2.setText("No messages")
   val op2 = eINSTANCE.createOperator()
   op2.setValue("[AMD,Intel]")
   op2.setOp("=")
   op2.setFeature(feature2) 
   val atom_then = eINSTANCE.createAtom()
   atom_then.setOperator(op2)

 
   // Rule/BooleanExpression -> ContainedOperators(rule) -> ContainedOperators(BooleanExpression)
   // Test of both ContainedOperators def's
   val rule = eINSTANCE.createRule()
   rule.setIf(atom_if)
   rule.setName("Test_Rule")
   rule.setThen(atom_then) 
   rule.setText("rule message")
   assert(new Constraints().containedOperators(rule).size == 2)
 } 
  
 "A valid rule" should "not have circular bools" in { 

   //A rule must contain a reference to a feature    
   
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   //Atom -> operator -> feature
   
   //HDMI = true
   val feature = eINSTANCE.createFeature()
   feature.setName("HDMI")
   feature.setText("No messages")
   val op = eINSTANCE.createOperator()
   op.setValue("true")
   op.setFeature(feature) 
   val atom_if = eINSTANCE.createAtom()
   atom_if.setOperator(op)

   
   // CPU : [AMD, Intel]
   val feature2 = eINSTANCE.createFeature()
   feature2.setName("CPU")
   feature2.setText("No messages")
   val op2 = eINSTANCE.createOperator()
   op2.setValue("[AMD,Intel]")
   op2.setFeature(feature2) 
   val atom_then = eINSTANCE.createAtom()
   atom_then.setOperator(op2)

 
   // Rule/BooleanExpression -> ContainedOperators(rule) -> ContainedOperators(BooleanExpression)
   // Test of both ContainedOperators def's
   val rule = eINSTANCE.createRule()
   rule.setIf(atom_if)
   rule.setName("Test_Rule")
   rule.setThen(atom_then) 
   rule.setText("rule message")
   assert(new Constraints().nonCircularRules(rule))
   
 } 

 
 "A const based rule" should "not have operators" in { 

   //A rule must contain a reference to a feature    
   
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   // No operators for a rule containing consts   
   val const = eINSTANCE.createConst()
   const.setValue(true)
   val const2 = eINSTANCE.createConst()
   const2.setValue(false)
   val rule2 = eINSTANCE.createRule()
   rule2.setIf(const)
   rule2.setThen(const2)
   assert(new Constraints().containedOperators(rule2).isEmpty)
   
 } 
 
 "A non valid circular rule" should "validate false" in { 

   //A rule must contain a reference to a feature    
   
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   //Atom -> operator -> feature
   
   //HDMI = true
   val feature = eINSTANCE.createFeature()
   feature.setName("HDMI")
   feature.setText("No messages")
   val bo = eINSTANCE.createBool()
   feature.setType(bo)
   val op = eINSTANCE.createOperator()
   op.setValue("true")
   op.setOp("=")
   op.setFeature(feature) 

   val atom_if = eINSTANCE.createAtom()
   atom_if.setOperator(op)
   
   
   // HDMI = false 
   val bo2 = eINSTANCE.createBool()
   feature.setType(bo2)
   val op2 = eINSTANCE.createOperator()
   op2.setValue("false")
   op2.setOp("=")
   op2.setFeature(feature) 

   val atom_then = eINSTANCE.createAtom()
   atom_then.setOperator(op2)

 
   // Rule/BooleanExpression -> ContainedOperators(rule) -> ContainedOperators(BooleanExpression)
   // Test of both ContainedOperators def's
   val rule = eINSTANCE.createRule()
   rule.setIf(atom_if)
   rule.setName("Test_Rule")
   rule.setThen(atom_then)

//   val validator = new ConfiguratorLangValidator()
//   validator.checkNonCircularRules(rule)
   
   assert(new Constraints().nonCircularRules(rule))
  
   
 } 


 "A model" should "be complete" in { 

   //A rule must contain a reference to a feature    
   
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   //HDMI = true
   val feature = eINSTANCE.createFeature()
   feature.setName("HDMI")
   feature.setText("No messages")
   val op = eINSTANCE.createOperator()
   op.setValue("true")
   op.setFeature(feature) 
   val atom_if = eINSTANCE.createAtom()
   atom_if.setOperator(op)

   
   // CPU : [AMD, Intel]
   val feature2 = eINSTANCE.createFeature()
   feature2.setName("CPU")
   feature2.setText("No messages")
   val op2 = eINSTANCE.createOperator()
   op2.setValue("[AMD,Intel]")
   op2.setFeature(feature2) 
   val atom_then = eINSTANCE.createAtom()
   atom_then.setOperator(op2)

 
   // Rule/BooleanExpression -> ContainedOperators(rule) -> ContainedOperators(BooleanExpression)
   // Test of both ContainedOperators def's
   val rule = eINSTANCE.createRule()
   rule.setIf(atom_if)
   rule.setName("Test_Rule")
   rule.setThen(atom_then) 
   rule.setText("rule message")
   
 
   val model = eINSTANCE.createConfiguratorModel()
   val ruleset = eINSTANCE.createRuleSet()
   model.setName("Test")
   model.setRuleset(ruleset)
   ruleset.getRule.add(rule)
   
   
   model.getFeature.add(feature)
   model.getFeature.add(feature2)
    
   assert(new Constraints().modelComplete(model))
   
   
 
   
   //  Negate : not ElectricWindows=true -> (Fuel = Gasoline) 
//   val neg = eINSTANCE.createNegation()
//   rule2.setThen(neg)  
   
//   val or = eINSTANCE.createAnd()
//   val and = eINSTANCE.createOr()
//   val enum = eINSTANCE.createEnum()

//   rule2.setThen(or)  
//   rule2.setThen(and)  

   
   
 } 
 
 "Negation in contained operators" should "validate" in { 

   //A rule must contain a reference to a feature    
   
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   //HDMI = true
   val feature = eINSTANCE.createFeature()
   feature.setName("HDMI")
   feature.setText("No messages")
   val op = eINSTANCE.createOperator()
   op.setValue("true")
   op.setOp("=")
   op.setFeature(feature) 
   val atom_if = eINSTANCE.createAtom()
   atom_if.setOperator(op)

   
   // CPU : [AMD, Intel]
   val feature2 = eINSTANCE.createFeature()
   feature2.setName("CPU")
   feature2.setText("No messages")
   val op2 = eINSTANCE.createOperator()
   op2.setValue("[AMD,Intel]")
   op2.setOp("=")
   op2.setFeature(feature2) 
   val atom_then = eINSTANCE.createAtom()
   atom_then.setOperator(op2)

 
   // Rule/BooleanExpression -> ContainedOperators(rule) -> ContainedOperators(BooleanExpression)
   // Test of both ContainedOperators def's
   val rule = eINSTANCE.createRule()
   val neg = eINSTANCE.createNegation()
   neg.getBooleanexpression.add(atom_if)
   rule.setIf(neg)
   rule.setName("Test_Rule")
   rule.setThen(atom_then) 
   rule.setText("rule message")
  
   assert(new Constraints().containedOperators(rule).size == 2)
   
 } 

 "Using one And-expression in a rule" should "validate and contain 3 operators " in { 

   //A rule must contain a reference to a feature    
   
   val eINSTANCE = org.xtext.branselic.domainmodel.impl.DomainmodelFactoryImpl.init();

   //HDMI = true
   val feature = eINSTANCE.createFeature()
   feature.setName("HDMI")
   feature.setText("No messages")
   val op = eINSTANCE.createOperator()
   op.setValue("true")
   op.setOp("=")
   op.setFeature(feature) 
   val atom_if = eINSTANCE.createAtom()
   atom_if.setOperator(op)

   
   // CPU : [AMD, Intel]
   val feature2 = eINSTANCE.createFeature()
   feature2.setName("CPU")
   feature2.setText("No messages")
   val op2 = eINSTANCE.createOperator()
   op2.setValue("[AMD,Intel]")
   op2.setOp("=")
   op2.setFeature(feature2) 
   val atom_then = eINSTANCE.createAtom()
   atom_then.setOperator(op2)


   // OS : [Linux, Windows]
   val feature3 = eINSTANCE.createFeature()
   feature3.setName("OS")
   feature3.setText("No messages")
   val op3 = eINSTANCE.createOperator()
   op3.setValue("[Linux,Windows]")
   op3.setOp("=")
   op3.setFeature(feature3) 
   val atom_then2 = eINSTANCE.createAtom()
   atom_then2.setOperator(op3)

   
   
   // Rule/BooleanExpression -> ContainedOperators(rule) -> ContainedOperators(BooleanExpression)
   // Test of both ContainedOperators def's
   val rule = eINSTANCE.createRule()
   val and = eINSTANCE.createAnd()
   and.getBooleanexpression.add(atom_then)
   and.getBooleanexpression.add(atom_then2)
   
   rule.setIf(atom_if)
   rule.setName("Test_Rule")
   
   rule.setThen(and) 
   rule.setText("rule message")
  
   assert(new Constraints().containedOperators(rule).size == 3)
   
 } 

 
 
} //end CompileSpec




