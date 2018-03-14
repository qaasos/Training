package EvenNumber;

public class LargestInArrayExample {
	
	
	public static int getLargest(int[]a){
		
		int temp = 0 ;
		
		
		
		for(int x : a )
		{
			if(temp<x)
			temp=x;
			
		}
		
		return temp;
		
	}
	public static void main(String[] args)	
	{
		int a1[] = {1,2,3,4,5,6};
		int b [] = {44,66,99,77,33,22,55};
		
		System.out.println("Largest"+getLargest (a1));
		System.out.println("Largest"+getLargest (b));
	}
	}

