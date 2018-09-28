package com.array.programs;

import java.util.Arrays;

public class Common_Elements {
	public static void main(String args[])
	{
		
	
	int[] array1={1996,2003,2007,1994,1876};
	int[] array2={2003,1994,1654,2018,2005};
	System.out.println("First Array "+Arrays.toString(array1));
	System.out.println("Second Array "+Arrays.toString(array2));
	
	for(int i=0;i<array1.length;i++)
	{
		for(int j=0;j<array2.length;j++)
		{
			if(array1[i]==array2[j])
			{
				System.out.println("Coomon Elements Between the arrays "+array1[i]);
			}
		}
	}

}
}
