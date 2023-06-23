package com.java;

public class Atm extends BankDetails{

	@Override
	public void hdfc() {

		System.out.println("5%");
		
	}
	
	public static void main(String[] args) {
		
		Atm a = new Atm();
		a.hdfc();
		a.sbi();
	}

}
