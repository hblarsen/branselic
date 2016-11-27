package org.xtext.branselic.validation;

import org.xtext.branselic.domainmodel.*;

public class ConstraintsAdapter
{
	public boolean modelComplete(ConfiguratorModel model)
	{
		return new Constraints().modelComplete(model);
	}
	
	public boolean nonCircularBools(BooleanExpression exp)
	{
		return new Constraints().nonCircularBools(exp);
	}
	
	public boolean legalOperations(Operator op)
	{
		return new Constraints().legalOperations(op);
	}
	
	public boolean correctlyTyped(Operator op)
	{
		return new Constraints().correctlyTyped(op);
	}
	
	public boolean nonCircularRules(Rule r)
	{
		return new Constraints().nonCircularRules(r);
	}
}
