package que8;
import java.util.Scanner;

public class labII {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int L1=sc.nextInt();
		System.out.println("Enter y");
		int L2=sc.nextInt();
		System.out.println("Enter z");
		int L3=sc.nextInt();
		System.out.println("Enter the lab allocated for ACE training");
		String ace=sc.next();
		if(ace=="L1"){
		if(L2<L3){
			System.out.println("l2 has the minimal seating capacity");
		}
		else{
			System.out.println("l3 has the minimal seating capacity");
		}
		}
		else if(ace=="L2"){
		if(L3<L1){
			System.out.println("l3 has the minimal seating capacity");
		}
		else{
			 System.out.println("l1 has the minimal seating capacity");
		}
		}
		else if(ace=="L3"){
		if(L2>L1){
			System.out.println("l2 has the minimal seating capacity");
		}
		else{
			System.out.println("l3 has the minimal seating capacity");
		}
		}
	}
}
