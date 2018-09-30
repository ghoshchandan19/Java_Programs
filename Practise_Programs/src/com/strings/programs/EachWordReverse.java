// wap to print each word of the sentence in reverse 
package com.strings.programs;

public class EachWordReverse {

	public static void main(String[] args) {
		String nm="He is a boy";
		nm=nm+" ";
		String B="";
		
		int length=nm.length();
		for(int i=0;i<=length-1;i++)
		{
			char d=nm.charAt(i);
			if(d!=' ')
			{
				
				B=d+B;
			}
			else
			{
			System.out.print(B);
			
				B=" ";
			}
		

          }
		
	}
}
