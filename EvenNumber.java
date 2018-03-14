package FF_JAVA;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args)
	{
		int x;
		System.out.println("Enter value of x");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		
		if(x % 2 == 0)
		{
			System.out.println("The value of x is EVEN");
		}
		
		else
		{
			System.out.println("The value of x is Odd");
		}
			
		

	}

}
