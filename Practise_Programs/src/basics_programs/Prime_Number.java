package basics_programs;

public class Prime_Number {
	
	public void is_prime(int N)
	{
		int c=0;
		for(int i=1;i<=N;i++)
		{
			if(N%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
	public static void main(String args[])
	{
		Prime_Number num=new Prime_Number();
				num.is_prime(21);
				num.is_prime(7);
	}

}
