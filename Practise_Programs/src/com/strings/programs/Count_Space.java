package com.strings.programs;

public class Count_Space {

	public static void main(String[] args) {
		 String nm="He is a boy";
	       int l =nm.length();//To store length of the string
	       int c=0; //to store counter value
	       int k=0;// to store counter value
	       
	       for(int i=0;i<=l-1;i++)
	       {
	    	char d=nm.charAt(i);
	    	if(d==' ')
	    	{
	    		c=c+1;//counter for number of spaces
	    	}
	    	k=c+1;//to store value of number of words i.e number of words = number of spaces +1
	}
	       System.out.println("Number of spaces = " +c);
	       System.out.println("Number of words = " +k);

	       
}
}
