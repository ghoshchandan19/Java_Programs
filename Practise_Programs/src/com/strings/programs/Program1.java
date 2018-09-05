package com.strings.programs;

public class Program1 {

	public static void main(String[] args) {

       String nm="He is a boy";
       int l =nm.length();//To store length of the string
       int c=0; //to store counter value
       int k=0;// to store counter value
       
       for(int i=0;i<=l-1;i++)
       {
    	char d=nm.charAt(i); //extracts the character one by one  from the given position
    	   if(d=='A')
    	   {
    		   c=c+1;//counter for uppercase A
    	   }
    	   if(d=='a')
    	   {
    		   k=k+1;//counter for lowercase a
    	   }
       }
       System.out.println("Number of uppercase A = " +c);
       System.out.println("Number of lowercase a = " + k);

	}

}
