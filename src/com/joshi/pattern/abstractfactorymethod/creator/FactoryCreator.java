/**
 * BJ Projects.
 */
package com.joshi.pattern.abstractfactorymethod.creator;

/**
 * @author bjosh
 */
public class FactoryCreator
{

	public static FurnitureFactory getFactory(String customerChoice)
	{

		if (customerChoice.equalsIgnoreCase("modern"))
		{
			return new ModernFurnitureFactory();

		}
		else if (customerChoice.equalsIgnoreCase("victorian"))
		{
			return new VictorianFurnitureFactory();
		}

		return null;
	}
}
