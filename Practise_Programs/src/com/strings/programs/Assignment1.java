package com.strings.programs;

public class Assignment1 {

	public static void main(String[] args) {
		String s="I AM LEARNING APPIUM";
		int length_of_string=s.length();//Length of string
		System.out.println("Length of String =" +length_of_string);
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(15));
		try{
		System.out.println(s.charAt(55));
		}
		catch(StringIndexOutOfBoundsException e){
	        System.out.println("Warning: StringException");
	     }
	String replaced=s.replaceAll("APPIUM", "SELENIUM");//Replaced appium with selenium
	System.out.println("New String = " +replaced);
	System.out.println(s.toLowerCase());//String converted to lower case
	
	
		
	}

}
