package question1;
import java.util.Scanner;

public class StaticWorld {

	public static void main(String[] args) {
		
		int num1=2;
		int num2=5;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("addition:"+(num1+num2));
		System.out.println("subtraction:"+(num1-num2));
		System.out.println("multiplication:"+(num1*num2));
		System.out.println("division:"+(num1/num2));
	}

}
