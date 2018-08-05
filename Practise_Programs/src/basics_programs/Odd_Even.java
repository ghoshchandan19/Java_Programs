package basics_programs;

import java.util.Scanner;

public class Odd_Even {
	private static Scanner a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=new Scanner(System.in);
		System.out.println("Enter a Number");
				
		int N=a.nextInt();
		if(N%2==0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		

	}

}
