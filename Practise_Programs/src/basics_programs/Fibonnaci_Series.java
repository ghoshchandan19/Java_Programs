package basics_programs;

public class Fibonnaci_Series 
{
//1,1,2,3,5,8......20th term
	public static void main(String[] args) 
	{ 
		System.out.println("Fibonacci series upto 20th term");
		int a=1,b=1,c=0;
		System.out.print(a+" "+b);
		for(int i=1;i<=18;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
