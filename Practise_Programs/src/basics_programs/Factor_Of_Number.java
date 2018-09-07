package basics_programs;

public class Factor_Of_Number {

	public static void main(String[] args) {
		System.out.println("Factors of a Number is");
		int N=16;
		for(int i=1;i<=N;i++)
		{
			if(N%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
