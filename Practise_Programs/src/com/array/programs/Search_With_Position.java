package com.array.programs;

public class Search_With_Position {

	public static void main(String[] args) {
		String A[]={"India","Pakistan","Bangladesh","Maldives"};
		String B[]={"Delhi","Islamabad","Dhanka","Male"};
		String K="Maldives";
		int l=A.length;
		for(int i=0;i<l;i++)
		{
			if(K.equals(A[i]))
			{
				System.out.println(B[i]);
			}
		}
		

	}

}
