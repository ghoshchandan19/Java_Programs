/*
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
 */



package com.condutional_stements;

public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i=65;i<=90;i++)//ASCII value of uppercase of Alphabets
		{
			for(int j=65;j<=i;j++)
			{
				 char d=(char)j;// Type casting of int to char
				System.out.print(d);
			}
			System.out.println();
		}

	}

}
