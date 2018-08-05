package com.array.programs;

public class Position {

	public static void main(String[] args) {
		int N[]={23,76,21,34,98,9};
		int l=N.length;
		int flag=0;
		int K=9;
		for(int i=0;i<l;i++)
		{
		 if(K==N[i])
		 { 
			 System.out.println(i+1);
			 flag=1;
		 }
		}
		 if(flag==0)
		 {
			 System.out.println("Not Found Number");
		 }

	}

}
