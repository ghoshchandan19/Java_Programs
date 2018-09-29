//WAP to enter any sentence and count number of uppercase a nad lowercase a

package com.strings.programs;

public class CountCapitals {

	public static void main(String[] args) {
		String nm="He is a boy";
		int c=0,k=0;
		int length=nm.length();
		for(int i=0;i<length-1;i++)
		{
		   char d=nm.charAt(i);
		    if(d=='A')
		     {
			  c=c+1; //Counter for uppercase
		     }
		   if(d=='a')
		    {
			k=k+1;//Counter for lowercase
		    } 
		}
		System.out.println("Number of a in upper case = "+c);
		System.out.println("Number of a in lower case = "+k);
	}

}
