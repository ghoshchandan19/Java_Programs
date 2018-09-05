package com.strings.programs;

public class Concatenation {

	public static void main(String[] args) {
		String nm="He is a boy";
	       int l =nm.length();//To store length of the string
	       String B="good ";
	       for(int i=0;i<=l-1;i++)
	       {
	    	char d=nm.charAt(i);
	    	B=B+d;//Used to concatenate(normal way)

	}
	      System.out.println(B);
	      
	   //Method to Concatenate two strings
	       String concatenate=B.concat(nm);
	       System.out.println(concatenate);
	}
}
