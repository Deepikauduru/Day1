package que11;
import java.util.Scanner;

public class Seat1 {

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
		if(s%c==0||s%c==1||s<=c){
			System.out.println("yes");
		}
			else{
	    		 System.out.println("no");
	    	}
	    	
		
	}

}
