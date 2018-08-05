package com.array.programs;

public class Linear_Search {

	public static void main(String[] args) {
		int N[]={23,76,21,34,98,9};
		int l=N.length;
		int flag=0;
		int K=34;
		for(int i=0;i<l;i++)
		{
		 if(K==N[i])
		 {
			 flag=1;
		 }
		}
		 if(flag==1)
		 {
			 System.out.println("Found Number");
		 }
		 else
		 {
			 System.out.println("Did not found number");
		 }
		}
		

	}

