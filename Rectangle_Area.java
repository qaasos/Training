package FF_JAVA;
import java.util.Scanner;

public class Rectangle_Area {

	double A;
	
	Rectangle_Area(double L,double W)
	{
		
		A= L*W;
		
	}
	
	public void Display()
	{
		System.out.println("Area of rectangle is "+A);
	}
	public static void main(String[]args)
	{
		Rectangle_Area rt = new Rectangle_Area(55.9,89);
		rt.Display();
		
	}
}
