/**
 * BJ Projects.
 */
package com.joshi.pattern.factorymethod.product;

/**
 * @author bjosh
 */
public class Truck implements Transport
{
	@Override
	public void deliver()
	{
		System.out.println("Road Transport");
	}
}
