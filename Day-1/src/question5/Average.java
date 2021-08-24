package question5;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter five marks");
		int a,b,c,d,e; 
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		int sum=a+b+c+d+e;
		System.out.println("total marks:" +sum);
        double average=sum/5;
		System.out.println("average marks:" +average);
		
	}
	

}