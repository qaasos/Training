package FF_JAVA;
import java.util.Scanner;
public class AdditionOfOddNum {
	
	
	public static void main(String[]args)
	{
		int x,Y, add = 0;
		
		System.out.println("Enter your number: ");
		Scanner in = new Scanner(System.in);
		
		Y = in.nextInt();
		
		for(x =1; x<=Y;x++)
		{
			if(x%2 == 1)
			{
				add = add + x;				
			}
			
		}
		System.out.println("Addition of odd number between 0 to " +Y+ " is " +add);
	}

}
