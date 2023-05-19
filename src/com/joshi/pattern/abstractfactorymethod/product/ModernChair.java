package com.joshi.pattern.abstractfactorymethod.product;

public class ModernChair implements Chair
{
	@Override
	public void details()
	{
		System.out.println("Modern Chair has been created=>" + toString());
	}

	String woodType = "Sagwaan";
	int leg = 3;

	/**
	 * @return the woodType
	 */
	public String getWoodType()
	{
		return woodType;
	}

	/**
	 * @param woodType
	 *            the woodType to set
	 */
	public void setWoodType(String woodType)
	{
		this.woodType = woodType;
	}

	/**
	 * @return the leg
	 */
	public int getLeg()
	{
		return leg;
	}

	/**
	 * @param leg
	 *            the leg to set
	 */
	public void setLeg(int leg)
	{
		this.leg = leg;
	}
}
