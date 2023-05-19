package com.joshi.pattern.abstractfactorymethod.creator;

import com.joshi.pattern.abstractfactorymethod.product.Chair;
import com.joshi.pattern.abstractfactorymethod.product.Sofa;

public interface FurnitureFactory
{
	Chair createChair();

	Sofa createSofa();
}
