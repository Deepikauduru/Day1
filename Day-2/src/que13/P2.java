package que13;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		float s,d,t;
		Scanner sc=new Scanner(System.in);
		s=sc.nextFloat();
		d=sc.nextFloat();
		t=sc.nextFloat();
		if((s<t)||((s>t)&&(d>1))){
			System.out.println("no");
		}
			else{
				System.out.println("yes");
				
		}

		
	}

}
