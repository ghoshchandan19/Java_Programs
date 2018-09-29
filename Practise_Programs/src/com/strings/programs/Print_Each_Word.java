package com.strings.programs;

public class Print_Each_Word {

	public static void main(String[] args) {
		String nm="He is a boy";//Store the string in nm variable
		nm=nm+" "; //Concatenate the string with white space
		String B=""; //Use variable B to store the word
		
		int length=nm.length();//Get length of the string
		for(int i=0;i<=length-1;i++)
		{
			char d=nm.charAt(i); //Extract character from the string
			if(d!=' ') //Checking if the character is not apace
			{
				B=B+d;
			}
			else
			{
				System.out.println("Word "+B+" " +"having character count "+B.length());
				/*
				System.out.println(B);
				int K=B.length();
				System.out.println(K);
				*/
				B="";
				
				
			}
			
		}
	}

}
