package question8;
import java.lang.Math;
import java.util.Scanner;
public class PowNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X;
		int N;
		Scanner SC =new Scanner(System.in);
		X= SC.nextInt();
		N= SC.nextInt();
		double Result=Math.pow(X,N);
		System.out.println(Result);
		

	}

}
