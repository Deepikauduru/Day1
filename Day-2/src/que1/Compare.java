package que1;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc =new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>y){
			System.out.println("x grater than y");
		}
		if(x<y){
			System.out.println("x less than y");
			
		}
		if(x==y){
			System.out.println("x equal y");
			
		}	
			
			

	}

}
