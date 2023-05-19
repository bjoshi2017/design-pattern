/**
 * BJ Projects.
 */
package com.joshi.pattern.factorymethod.creator;

import com.joshi.pattern.factorymethod.product.Transport;
import com.joshi.pattern.factorymethod.product.Truck;

/**
 * @author bjosh
 */
public class RoadLogistics extends Logistics
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joshi.pattern.factorymethod.Logistics#createTransport()
	 */
	@Override
	Transport createTransport()
	{
		return new Truck();
	}

}
