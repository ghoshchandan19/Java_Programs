package basics_programs;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		int n,d,square;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: " );
			n=sc.nextInt();
			square=n*n;
			while(square!=0)
			{
				d=square%10;
				sum=sum+d;
				square=square/10;
			}
			if(sum==n){
				System.out.println("Number is neon number");
			}
			
			else
			{
				System.out.println("Number is not a neon number");
			}
			
		sc.close();

	}

}
