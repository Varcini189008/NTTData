package com.nttdata.assessmentFactory;

public class Square implements Shape {

	@Override
	public void Area(int a, int b) {
		System.out.println("Area of the Square:");
		int c=0;
		c=a*b;
		System.out.println(c);
	}

	

}
