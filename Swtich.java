package EvenNumber;

import java.util.Scanner;

public class Swtich {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value a :");
		int x = Integer.parseInt(sc.next());
		
			
		System.out.println("enter value b :");
		int y = Integer.parseInt(sc.next());
		
	    String operation = 	sc.next();
		
		switch(operation)
		{
	case "Addtion" : 
		
		{
			System.out.println("result c :" + (x + y));
			break;
		}
		
	case "Substraction" : 
		
	{
		System.out.println("result c :" + (x - y));break;
	}
	
case "Division" : 
		
	{
		System.out.println("result c :" + (x / y));break;
	}
	
	
	default : 
	    {
		
	
		}
		

	}
}


}
