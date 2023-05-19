/**
 * BJ Projects.
 */
package com.joshi.pattern.factorymethod;

import com.joshi.pattern.factorymethod.creator.Logistics;
import com.joshi.pattern.factorymethod.creator.RoadLogistics;
import com.joshi.pattern.factorymethod.creator.SeaLogistics;

/**
 * @author bjosh
 */
public class CouriesShopClient
{

	private static Logistics logistics;

	public static void main(String[] args)
	{

		// END User just ask shopkeeper to courier the product. No Matter how it will be delivered.
		configure();
		runBusinessLogic();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or environment options.
	 */
	static void configure()
	{
		// Logistics will be decided at initial stage based on internal logic and customer provided
		// information about courier destination
		if (System.getProperty("country").equals("india"))
		{
			logistics = new RoadLogistics();
		}
		else
		{
			logistics = new SeaLogistics();
		}
	}

	/**
	 * All of the client code should work with factories and products through abstract interfaces. This way it does not
	 * care which factory it works with and what kind of product it returns.
	 */
	static void runBusinessLogic()
	{
		logistics.planDelivery();
	}

}
