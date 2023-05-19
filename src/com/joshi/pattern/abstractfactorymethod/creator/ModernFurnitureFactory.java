package com.joshi.pattern.abstractfactorymethod.creator;

import com.joshi.pattern.abstractfactorymethod.product.Chair;
import com.joshi.pattern.abstractfactorymethod.product.ModernChair;
import com.joshi.pattern.abstractfactorymethod.product.ModernSofa;
import com.joshi.pattern.abstractfactorymethod.product.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory
{
	@Override
	public Chair createChair()
	{
		return new ModernChair();
	}

	@Override
	public Sofa createSofa()
	{
		return new ModernSofa();
	}
}
