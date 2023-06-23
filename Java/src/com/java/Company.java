package com.java;

public class Company implements College , School{

	@Override
	public void student() {

		System.out.println("Sandhiya");
	}

	@Override
	public void teacher() {

		System.out.println("San");
	}
	@Override
	public void tenth() {

		System.out.println("400 marks");
	}
	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.teacher();
		c.student();
		c.tenth();
	}



}
