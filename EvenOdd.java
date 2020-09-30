import java.util.*;
public class EvenOdd
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any integer");
		int num = sc.nextInt();
		if(num % 2 == 0)
			System.out.println(num+" is an even");
		else
			System.out.println(num+" is odd");
	}
}
