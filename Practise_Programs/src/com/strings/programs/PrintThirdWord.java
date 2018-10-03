//Program to print the third word in the given sentence
package com.strings.programs;

public class PrintThirdWord {

	public static void main(String[] args) {
		String nm="He is a boy";
		nm=nm+"";
		String B="";
		int P=0;
		for(int i=0;i<=nm.length()-1;i++)
		{
			char d=nm.charAt(i);
			if(d!=' ')
			{
				B=B+d;
			}
			else
			{
				P=P+1;//Counter to print the number of words
				if(P==3)
				{
					System.out.println("The third word of the sentence is "+B);
					
				}
				B="";
			}
		}

	}

}
