package com.joshi.pattern.abstractfactorymethod.product;

public class VictorianSofa implements Sofa
{
	@Override
	public void details()
	{
		System.out.println("Victorian Sofa has been created");
		createVictorianSofa();
	}

	private void createVictorianSofa()
	{
		System.out.println("Victorian Leather Sofa has been created");
	}
}
