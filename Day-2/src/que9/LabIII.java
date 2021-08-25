package que9;
import java.util.Scanner;
public class LabIII {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int L1=sc.nextInt();
		System.out.println("Enter y");
		int L2=sc.nextInt();
		System.out.println("Enter z");
		int L3=sc.nextInt();
	    System.out.println("Enter n");
	    int n=sc.nextInt();
	    	if( L1>n|| L2>n|| L3>n){
	    		 System.out.println("1 lab can  accomodate 25 students");
	    		
	    	}
	    	else if((n<=L1&&n<=L2)||(n<=L1&&n<=L3)||(n<=L2&&n<=L3)){
	    		 System.out.println("2 lab's can  accomodate 25 students");
	    		
	    	}
	    	else if(n<=L1&&n<=L2&&n<=L3){
	    		System.out.println("3 lab's can  accomodate 25 students");
	    		
	    	}
	    	else{
	    		 System.out.println("none of the lab's can  accomodate 25 students");
	    	}
	    	
	    	

	
	}
}

