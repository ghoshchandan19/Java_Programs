package basics_programs;

public class Binary_To_Decimal {
	
	public void convert(int N)
	{ 
		int sum=0;
		double c=0;
		
		while(N!=0)
		{
			int d=N%10;
			sum=(int) (sum+d*Math.pow(2, c));
			c=c+1;
			N=N/10;
		}
		System.out.println("Decimal of the binary number is = "+sum);
	}
	public static void main(String args[])
	{
		Binary_To_Decimal num=new Binary_To_Decimal();
		num.convert(1101);
		num.convert(11101);
	}

}
