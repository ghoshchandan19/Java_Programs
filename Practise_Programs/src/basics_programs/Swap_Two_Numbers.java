//Swap number using third variable
package basics_programs;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		System.out.println("Number before swapping");
		int a=4,b=3;
		System.out.println(a+" "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after swapping");
		System.out.println(a+" "+b);
	}

}
