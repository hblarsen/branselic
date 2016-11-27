import org.xtext.branselic.domainmodel._;
import scala.collection.JavaConversions._

package org.xtext.branselic.generator
{
  
  class ScalaGenerator
  {
    def generateScala (model:ConfiguratorModel) :String = 
    {
      s"""
      package models.validation


      object Validator
      {
      	sealed trait InputType
      	case class IntType() extends InputType
      	case class BoolType() extends InputType
      	case class EnumType(vals:List[String]) extends InputType
      
        
      	def features :List[(String, String, InputType)] = 
      		List(
              ${fromFeatures(model.getFeature.iterator.toList)}
      		)

          def validate (m:Map[String,String]) :Boolean = 
        	{
        		validationOption(m) match
        		{
        			case None => true
        			case Some(e) => false
        		}
        	}
        		
        		
        	def getError (m:Map[String,String]) :String = 
        	{
        		validationOption(m) match
        		{
        			case None => ""
        			case Some(e) => e
        		}
        	}

          def validationOption (m:Map[String,String]) :Option[String] = 
        	{
            ${model.getRuleset.getRule.iterator.toList.map(fromRule).mkString(" ")}
            None
          }
      }
      """
    }
    
    def fromFeatures (features:List[Feature]) :String =
    {
      features.iterator.toList.map 
        { f => s"""("${f.getName}", "${f.getText}", ${fromType(f.getType)})""" }
        .mkString(",\n						")
    }
    
    def fromType(t:Type) :String = 
    {
      t match
      {
        case i:Int => "IntType()"
        case b:Bool => "BoolType()"
        case e:Enum => s"""EnumType(List( ${e.getValues.iterator.toList.map 
          {st => s""" "${st}" """}.mkString(", ") } ))"""
      }
    }
    
    def fromRule(r:Rule) :String =
    {
      s"""if(${fromBool(r.getIf)} && !(${fromBool(r.getThen)}))
              Some("${r.getText}")
            else"""
    }
    
    def fromBool(b:BooleanExpression) :String =
      b match
      {
        case c:Const => c.isValue.toString
        case a:Atom => s""" (m("${a.getOperator.getFeature.getName}")=="${a.getOperator.getValue}") """
        case n:Negation => s"""(!${fromBool(n.getBooleanexpression.iterator.toList(0))})"""
        case a:And => s"""(${fromBool(a.getBooleanexpression.iterator.toList(0))} && """ +
                      s"""${fromBool(a.getBooleanexpression.iterator.toList(1))})"""
        case o:Or => s"""(${fromBool(o.getBooleanexpression.iterator.toList(0))} || """ +
                      s"""${fromBool(o.getBooleanexpression.iterator.toList(1))})"""
      }
  }
 
}