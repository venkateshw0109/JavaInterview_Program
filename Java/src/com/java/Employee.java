package com.java;

public class Employee extends Student{

	@Override
	public void stuName(int i) {
		// TODO Auto-generated method stub
		super.stuName(10);
		System.out.println("My number is "+i);
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.stuName(20);
	}
}
