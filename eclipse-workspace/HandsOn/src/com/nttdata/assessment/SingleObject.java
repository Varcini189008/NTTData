package com.nttdata.assessment;

public class SingleObject {
	//create an object of SingleObject
	   private static SingleObject instance = new SingleObject();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	  

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }



	public static SingleObject getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}

}
