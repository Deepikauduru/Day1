package que7;
import java.util.Scanner;

public class LabI {

	public static void main(String[] args) {
	int l1;
	int l2;
	int l3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x");
	l1=sc.nextInt();
	System.out.println("Enter y");
	l2=sc.nextInt();
	System.out.println("Enter z");
	l3=sc.nextInt();
	if(l1<l2&&l1<l3){
		System.out.println("l1 has the minimal seating capacity");
	}
	
	if(l2<l3&&l2<l1){
		System.out.println("l2 has the minimal seating capacity");
	}
	
	if(l3<l1&&l3<l2){
		System.out.println("l3 has the minimal seating capacity");
	}
	
	}

}
