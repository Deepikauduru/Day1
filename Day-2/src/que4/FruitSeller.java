package que4;
import java.util.Scanner;


public class FruitSeller {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		x =sc.nextInt();
		System.out.println("Enter the price of dozen mangoes");
		y =sc.nextInt();
		System.out.println("Enter the price of 1  mangoes");
		z=y*12;
		if(x==z){
			System.out.println("no profit nor loss" );
		}
		else if(x>z){
			System.out.println("loss:" +(x-y));
		}
		else {
			System.out.println("profit:" +(x+y));
		}

	}

}
