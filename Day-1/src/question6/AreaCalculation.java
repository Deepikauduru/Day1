package question6;
import java.lang.Math;
import java.util.Scanner;

public class AreaCalculation {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner SC = new Scanner(System.in);
		x= SC.nextInt();
		y= SC.nextInt();		
		System.out.println("side of the Square:"+Math.pow(x,2));
		System.out.println("Length and width of a Rectangle:"+x*+y);
		double Z=3.14*x*x;
		System.out.println("Radius of Circle:"+Z);
		
	}

}
