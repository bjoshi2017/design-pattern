/**
 * BJ Projects.
 */
package com.joshi.pattern.factorymethod.creator;

import com.joshi.pattern.factorymethod.product.Transport;

/**
 * @author bjosh
 */
public abstract class Logistics
{
	public void planDelivery()
	{
		Transport transport = createTransport();
		// Várias operações = faturar, empacotar, etc...
		transport.deliver();
	}

	abstract Transport createTransport();
}
