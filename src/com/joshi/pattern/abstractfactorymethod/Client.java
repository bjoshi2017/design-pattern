package com.joshi.pattern.abstractfactorymethod;

import java.util.Scanner;

import com.joshi.pattern.abstractfactorymethod.creator.FactoryCreator;
import com.joshi.pattern.abstractfactorymethod.creator.FurnitureFactory;
import com.joshi.pattern.abstractfactorymethod.product.Chair;
import com.joshi.pattern.abstractfactorymethod.product.Sofa;

public class Client
{
	public static void main(String[] args)
	{

		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		// String input
		String name = sc.nextLine();

		FurnitureFactory furnitureFactory = FactoryCreator.getFactory(name);
		Chair chair = furnitureFactory.createChair();
		chair.details();

		Sofa sofa = furnitureFactory.createSofa();
		sofa.details();

	}
}
