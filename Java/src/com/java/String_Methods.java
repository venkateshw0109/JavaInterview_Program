package com.java;

public class String_Methods {
	
	public static void main(String[] args) {
		
		
		String s = "Welcome to Java";
	// DataType ref = "";
		
		System.out.println(s);
		
		boolean e = s.equals("Welcome to Java");
		System.out.println(e);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("WELCOME TO JAVA");
		System.out.println(equalsIgnoreCase);
		
		char charAt = s.charAt(0);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('o');
		System.out.println(indexOf);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		 boolean startsWith = s.startsWith("wel");
		 System.out.println(startsWith);
		 
		 boolean endsWith = s.endsWith("av");
		 System.out.println(endsWith);
		 
		 boolean contains = s.contains("to");
		 System.out.println(contains);
		 
		 
		 String substring = s.substring(2);
		 System.out.println(substring);
		 
		 CharSequence subSequence = s.subSequence(2, 10);
		 System.out.println(subSequence);
		
		
	}

}
