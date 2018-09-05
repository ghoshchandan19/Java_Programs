package com.strings.programs;

public class Reverse {

	public static void main(String[] args) {
		String nm="Manoj";
		 int l =nm.length();//To store length of the string
		   String B="";
	       for(int i=0;i<=l-1;i++)
	       {
	    	char d=nm.charAt(i);
	    	B=d+B;//Used to reverse the string
	}
	      System.out.println("Reversed String "+ B);
	}

}
