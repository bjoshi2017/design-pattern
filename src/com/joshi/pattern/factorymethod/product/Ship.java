/**
 * BJ Projects.
 */
package com.joshi.pattern.factorymethod.product;

/**
 * @author bjosh
 */
public class Ship implements Transport
{
	@Override
	public void deliver()
	{
		System.out.println("Sea Transport");
	}
}
