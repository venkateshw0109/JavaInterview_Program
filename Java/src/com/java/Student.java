package com.java;

public class Student { //Class
	

	public void stuName(int i) {

		System.out.println("my id is :"+i);
		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.stuName(10);
	}

}
