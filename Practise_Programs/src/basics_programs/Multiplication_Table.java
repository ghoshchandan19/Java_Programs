package basics_programs;

import java.util.Scanner;

public class Multiplication_Table {
	private static Scanner sc;

	public static void main(String[] args) {
	  sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int mult=num*i;
			System.out.println(num+"*"+i+"="+mult);
		}
		

	}

}
