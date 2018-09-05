package com.strings.programs;

public class Print_First_Word {

	public static void main(String[] args) {
		String nm="He is a boy";
	       int l =nm.length();//To store length of the string
	       String B="";
	       for(int i=0;i<=l-1;i++)
	       {
	    	char d=nm.charAt(i);
	    	  B=B+d;//To store word
	    	  if(d==' ')//To compare char d with space
	    	{
	    		break;
	    	}

	}
	       System.out.println("First word in the string is "+B);

   }
}
