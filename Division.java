package EvenNumber;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) 
	
	{
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter value X :");
		int x = Integer.parseInt(sc.next());
		System.out.println("enter value y :");
		int y = Integer.parseInt(sc.next());
		
		int z = (x % y);
		
		System.out.println("result z " +z)	;

	}

}
