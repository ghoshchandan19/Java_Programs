package com.strings.programs;

public class EachWordWithPosition {

	public static void main(String[] args) {
		String nm="He is a boy";
		nm=nm+" ";
		String B="";
		int P=0;
		
		int length=nm.length();
		for(int i=0;i<=length-1;i++)
		{
			char d=nm.charAt(i);
			if(d!=' ')
			{
				
				B=B+d;
			}
			else
			{
				P=P+1;
				System.out.println(B+" with position "+P);
				
				B=" ";
			}
		}
	}
}
			

	


