package com.joshi.pattern.abstractfactorymethod.product;

public class ModernSofa implements Sofa
{
	@Override
	public void details()
	{
		System.out.println("Modern Sofa has been created");
		createModernLShapeSofa();
	}

	private void createModernLShapeSofa()
	{
		System.out.println("Modern L Shape Sofa has been created");
	}

}
