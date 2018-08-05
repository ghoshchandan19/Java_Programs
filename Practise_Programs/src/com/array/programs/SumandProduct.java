package com.array.programs;

public class SumandProduct {

	public static void main(String[] args) {
		int N[]={23,67,76,283,67,86,64,76,36,43};{
			int sum=0;
			int prod=1;
			int l=N.length;
			for(int i=0;i<l;i++)
			{
				if(i<=4)
				{
					sum=sum+N[i];
				}
				else
				{
					prod=prod*N[i];
				}
			}
			System.out.println(sum+"  "+prod);
		}
	}

}
