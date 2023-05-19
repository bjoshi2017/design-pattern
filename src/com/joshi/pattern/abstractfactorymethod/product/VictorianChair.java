package com.joshi.pattern.abstractfactorymethod.product;

public class VictorianChair implements Chair
{

	@Override
	public void details()
	{
		System.out.println("Victorian Chair has been created");
		createVictorianChair();
	}

	private void createVictorianChair()
	{
		System.out.println("Victorian Leather Chair has been created");
	}
}
