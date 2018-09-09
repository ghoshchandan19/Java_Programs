//Program to print maximum of the three numbers
package basics_programs;

public class Maximum_Number {
	
	public void max_number(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			System.out.println("Maximum Number is a "+a);
		}
		if(b>a&&b>c)
		{
			System.out.println("Maximum Number is b "+b);
		}
		if(c>a&&c>b)
		{
			System.out.println("Maximum Number is c "+c);
		}
	}

	public static void main(String[] args) {
		
		Maximum_Number num=new Maximum_Number();
		num.max_number(10, 18, 4);
		
	}

}
