package com.practice;

import java.util.Arrays;

public class StringClass13 {

	static String gotQuotes = "This test \"Here\"";
	static String combine = " the rest of the sentence. ";
	static int convert = 1234;
	static String convertedInt = Integer.toString(convert);
	static int convertBack = Integer.parseInt(convertedInt);
	
	public static void main(String[] args) {
		System.out.println(gotQuotes + combine + convertedInt);
		System.out.println(gotQuotes.equals(combine));
		System.out.println(combine.charAt(1));
		System.out.println(gotQuotes.compareTo(combine));
		System.out.println(gotQuotes.contains("test"));
		System.out.println(gotQuotes.indexOf("te"));
		System.out.println(gotQuotes.indexOf("test", 6));
		String[] testArray = gotQuotes.split("");
		System.out.println(Arrays.toString(testArray));
		System.out.println(gotQuotes.toUpperCase());
		
		StringBuilder sb = new StringBuilder("This is a test");
		sb.append(" of the emergency broadcast system...");
		System.out.println(sb.delete(1, 10));
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
	
}
