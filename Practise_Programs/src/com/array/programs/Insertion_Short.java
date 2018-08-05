package com.array.programs;

public class Insertion_Short {

	public static void main(String[] args) {
		int N[]={23,45,12,54,9};
		int T;
		int len=N.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(N[i]>N[j])
				{
					T=N[i];
					N[i]=N[j];
					N[j]=T;
				}
			}
		}
		//The sorted array in ascending order
		for(int i=0;i<=4;i++)
		{
			System.out.println(N[i]);
		}
		
	}
	
	

}
