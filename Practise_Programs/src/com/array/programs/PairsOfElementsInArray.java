package com.array.programs;

public class PairsOfElementsInArray {

	
	public static void findThePairs(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if ((arr[i]+arr[j])==n)
				{
					System.out.println("Pairs are :"+arr[i]+"+"+arr[j]+"="+n);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		findThePairs(new int[]{4,5,7,11,9,13,8,12},20);
		//findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
	}

}
