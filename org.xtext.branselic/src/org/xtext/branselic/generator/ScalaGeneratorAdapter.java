package org.xtext.branselic.generator;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.branselic.domainmodel.ConfiguratorModel;

public class ScalaGeneratorAdapter
{
	public String getResourceName(Resource res)
	{
		return ((ConfiguratorModel)res.getContents().get(0)).getName().replace(" ", "_") + ".scala";
	}
	
	public String generateScala(Resource res)
	{
		return new ScalaGenerator().generateScala((ConfiguratorModel)res.getContents().get(0));
	}
}
