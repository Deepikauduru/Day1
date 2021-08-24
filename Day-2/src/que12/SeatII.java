package que12;
import java.util.Scanner;
public class SeatII {

	public static void main(String[] args) {

		int r;
		int c;
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		r=sc.nextInt();
		System.out.println("enter the number of columns");
		c=sc.nextInt();
		System.out.println("enter the roll number of the student");
		s=sc.nextInt();
		if(s%r==0||s%r==1||s<=r){
			System.out.println("yes");
		}
			else{
	    		 System.out.println("no");
	    	}

		


	}

}
