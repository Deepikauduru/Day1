package que6;
import java.util.Scanner;
public class Y2K {

	public static void main(String[] args) {
		int current,birth;
		int age ;
		Scanner sc=new Scanner(System.in);
	
		current=sc.nextInt();
		birth=sc.nextInt();
		
		if(current>birth){
			age=current-birth;
			System.out.println(age);
		}
		else if(current<birth){
			age=(current+100)-birth;
		    System.out.println(age);
		}
		
	
	}

}

