package basics_programs;

import java.util.Scanner;

public class Factorial {
	private static Scanner sc;

	public static void main(String[] args) {
		 sc =new Scanner(System.in);
			System.out.println("Enter a number");
			int f=1;
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				f=f*i;
			}
			System.out.println("Factorial of the number " +f);

	}

}
