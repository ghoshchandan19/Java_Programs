package com.array.programs;

import java.util.Arrays;

public class Missing_Number {
	
	//Method to calculate sum of numbers
	
	static int sumOfNumbers(int n)
	{
		int sum=(n*(n+1))/2;
		return sum;
	}
	
	//Method to calculate sum of numbers
	
	static int sumOfElements(int array[])
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n=10;
		int a[]={2,7,8,9,4,3,6,5,10};
		int sumOfNumbers=sumOfNumbers(n);
		int sumOfElements=sumOfElements(a);
		int missing_number=sumOfNumbers-sumOfElements;
		System.out.println("Input Array : "+Arrays.toString(a));
		System.out.println("Misising Number is : "+missing_number);
		
		
		
	}

}
