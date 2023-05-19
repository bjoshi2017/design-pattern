package com.joshi.pattern.abstractfactorymethod.creator;

import com.joshi.pattern.abstractfactorymethod.product.Chair;
import com.joshi.pattern.abstractfactorymethod.product.Sofa;
import com.joshi.pattern.abstractfactorymethod.product.VictorianChair;
import com.joshi.pattern.abstractfactorymethod.product.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory
{
	@Override
	public Chair createChair()
	{
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa()
	{
		return new VictorianSofa();
	}
}
