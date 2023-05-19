/**
 * BJ Projects.
 */
package com.joshi.pattern.factorymethod.creator;

import com.joshi.pattern.factorymethod.product.Ship;
import com.joshi.pattern.factorymethod.product.Transport;

/**
 * @author bjosh
 */
public class SeaLogistics extends Logistics
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joshi.pattern.factorymethod.Logistics#createTransport()
	 */
	@Override
	Transport createTransport()
	{
		return new Ship();
	}

}
