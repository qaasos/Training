package EvenNumber;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	
	{
	 /*	int a = 25;
		int b = 30;
		int c;
		
		System.out.println("enter value a :" +a);
		System.out.println("enter value b :" +b);
		
		//Multiplication
		
		c= (a * b);
		
		System.out.println("result c :" +c);
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value a :");
		int x = Integer.parseInt(sc.next());
		
		System.out.println("enter value b :");
		int y = Integer.parseInt(sc.next());
		
		
		int c = (x * y);
		
		System.out.println("result c :" +c);
		
	}

}
