package com.array.programs;

public class Bubble_short {

	public static void main(String[] args) {
		int N[]={32,76,52,9,43,5,96,11,107,654};
		int len=N.length;
		int T;
			for(int i=len-1;i>0;i--)
			{
				for(int j=0;j<i;j++)
				{
					if(N[j]>N[j+1])
					{
						T=N[j];
						N[j]=N[j+1];
						N[j+1]=T;
					}
				}
			}
			
			for(int i=0;i<len;i++)
			{
				System.out.println(N[i]);
			}
		System.out.println(len);
	}

}
