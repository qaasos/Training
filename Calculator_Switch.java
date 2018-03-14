package FF_JAVA;
import java.util.Scanner;

public class Calculator_Switch {

	public static void main(String[] args) 
	{
		System.out.println("Hello Calculator!!");
		int x,y,z;
		String input;
		
		
		System.out.println("Enter the value of x");
		Scanner pec = new Scanner(System.in);
		x = pec.nextInt();
		
		System.out.println("Enter the value of y");
		Scanner sec = new Scanner(System.in);
		y = sec.nextInt();
		
		
		System.out.println("Do you want to Add, Sub, Mul and Div?, please enter your choice ");
		
		Scanner in = new Scanner(System.in);
		input = in.next();
		
		switch(input.toLowerCase())
		{
		case "add":
			z = x + y;
			System.out.println("The addition of x and y is: " + z);
			break;
			
		case "sub":
			z = x - y;
			System.out.println("The subtraction of x and y is: " + z);
			break;
			
		case "mul":
			z = x * y;
			System.out.println("The multiplication of x and y is: " + z);
			break;
			
		case "div":
			z = x / y;
			System.out.println("The division of x and y is: " + z);
			break;
			
		}
		
		

	}

}
