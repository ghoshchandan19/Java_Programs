package com.strings.programs;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		   String nm="cooc";
		   int l =nm.length();//To store length of the string
		   String B="";
	       for(int i=0;i<=l-1;i++)
	       {
	    	char d=nm.charAt(i);
	    	B=d+B;//Used to reverse the string
	       }
	       if(B.equals(nm))//Check reverse String with original String
	       {
	    	   System.out.println("String is Palindrome");
	       }
	       else
	       {
	    	   System.out.println("String is not Palindrome");
	    	   
	       }
	}

}
