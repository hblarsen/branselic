import org.xtext.branselic.domainmodel._
import scala.collection.JavaConversions._

package org.xtext.branselic.validation
{

  class Constraints {
    
    def modelComplete (model:ConfiguratorModel) :Boolean = 
      model.getRuleset.getRule.iterator.toList.
        flatMap{ r => containedOperators(r) }.
        forall { a => model.getFeature.contains(a.getFeature) }
    
    def nonCircularBools (exp:BooleanExpression) :Boolean =
      !subExpressions(exp).contains(exp)
   
    def legalOperations (op:Operator) :Boolean = 
      List("=", "<", ">").contains(op.getOp)
    
    def legalArgument (op:Operator) :Boolean =
      op.getOp match
      {
        case "=" => true
        case "<" => op.getValue.forall(Character.isDigit)
        case ">" => op.getValue.forall(Character.isDigit)
      }
    
    def correctlyTyped (op:Operator) :Boolean = 
      op.getFeature.getType match
      {
        case i:Int => op.getValue.forall(Character.isDigit)
        case b:Bool => List("true","false").contains(op.getValue)
        case e:Enum => e.getValues.iterator.toList.contains(op.getValue)
      }
    
    def nonCircularRules (r:Rule) :Boolean = 
      containedOperators(r.getIf).map{_.getFeature}.forall
        { x => !containedOperators(r.getThen).map{_.getFeature}.contains(x) }
    
    
    def containedOperators (r:Rule) : List[Operator] =
      containedOperators(r.getIf) ++ containedOperators(r.getThen)
   
    def containedOperators (b:BooleanExpression) : List[Operator] =
      b match
      {
        case c:Const => List()
        case a:Atom => List(a.getOperator)
        case n:Negation => containedOperators(n.getBooleanexpression.get(0))
        case a:And => containedOperators(a.getBooleanexpression.get(0)) ++ 
                      containedOperators(a.getBooleanexpression.get(1))
        case o:Or =>  containedOperators(o.getBooleanexpression.get(0)) ++ 
                      containedOperators(o.getBooleanexpression.get(1))
      }
    
    def subExpressions (b:BooleanExpression) : List[BooleanExpression] =
      b match
      {
        case c:Const => List()
        case a:Atom => List()
        case n:Negation => n.getBooleanexpression.get(0) :: subExpressions(n.getBooleanexpression.get(0))
        case a:And => a.getBooleanexpression.get(0) ::
                      a.getBooleanexpression.get(1) ::
                      (subExpressions(a.getBooleanexpression.get(0)) ++ 
                      subExpressions(a.getBooleanexpression.get(1)))
        case o:Or =>  o.getBooleanexpression.get(0) ::
                      o.getBooleanexpression.get(1) ::
                      (subExpressions(o.getBooleanexpression.get(0)) ++ 
                      subExpressions(o.getBooleanexpression.get(1)))
      }

  }
}