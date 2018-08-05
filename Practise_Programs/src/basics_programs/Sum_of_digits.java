package basics_programs;

import java.util.Scanner;

public class Sum_of_digits {
	private static Scanner a;
	public static void main(String[] args) {
		 a=new Scanner(System.in);
		 System.out.println("Enter any three digit number");
		 int N=a.nextInt();
		 int sum=0;
		 while(N!=0){
		 int d=N%10;
		 sum=sum+d;
		 N=N/10;
		 }
		 System.out.println("Sum of the digits of the number = "+sum);
		 

	}

}
