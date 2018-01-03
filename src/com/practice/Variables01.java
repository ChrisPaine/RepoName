package com.practice;

public class Variables01 {

	public static void main(String[] args) {

		System.out.println("Byte \t" + Byte.MAX_VALUE);
		System.out.println("Short \t" + Short.MAX_VALUE);
		System.out.println("Integer " + Integer.MAX_VALUE);
		System.out.println("Long \t" + Long.MAX_VALUE);
		System.out.println("Float \t" + Float.MAX_VALUE);
		System.out.println("Double \t" + Double.MAX_VALUE);
		
		int bigInt = 127;
		
		
		String intString = Integer.toString(bigInt);
		int backInt = Integer.parseInt(intString);
	}
	
}
