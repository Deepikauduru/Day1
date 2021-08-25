package que10;

import java.util.Scanner;

public class Lab4 {

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
	    	if( L1>n){
	    		 System.out.println(" L1 can  accomodate  students");
	    	}
	    	else{
	    		 System.out.println("none of the labs can  accomodate 25 students");
	    	}
	    	if(L2>n){
	    		 System.out.println(" L2 can  accomodate  students");
	    	}
	    	
	    	else{
	    		 System.out.println("none of the labs can  accomodate 25 students");
	    	}
	    	if(L3>n){
	    		 System.out.println(" L3 can  accomodate  students");
	    	}
	    	
	    	else{
	    		 System.out.println("none of the labs can  accomodate 25 students");
	    	}
	    	

	}

}

