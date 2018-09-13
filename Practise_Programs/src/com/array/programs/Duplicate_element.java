package com.array.programs;


public class Duplicate_element {

	public static void main(String[] args) {
		String N[]={"abc","bcd","bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		int length=N.length;
		int c=0;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if((N[i]).equals(N[j])&&(i!=j))
				{
					
					System.out.println("Duplicate element is "+N[i]);
					
					
				}
				
			}
		}
		//System.out.println(c);
	}

}
