package com.nttdata.assessmentFactory;

public class Rectangle implements Shape  {

	@Override
	public void Area(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of the Rectangle:");
		int c=0;
		c=a*b;
		System.out.println(c);
	}

	

}
