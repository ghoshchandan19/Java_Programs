package basics_programs;

public class Sum_Of_Factors {

	public static void main(String[] args) {
		System.out.println("Sum of factors");
		int N=16;
		int sum=0;
		for(int i=1;i<=N;i++)
		{
			if(N%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
