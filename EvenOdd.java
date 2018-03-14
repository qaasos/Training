package EvenNumber;

import java.util.Scanner;

class EvenOdd

{
	public static void main (String[] args) 
	
	{
		int num;
		
		System.out.println("Enter any number :");
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		if(num%2 == 0)
		
		
		System.out.println("Eneter number is even");
			
		else
			System.out.println("eneter number is odd");
		
	}
	
	
		
	
}

