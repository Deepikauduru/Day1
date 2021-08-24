package que2;
import java.util.Scanner;
import java.lang.String;
public class VowelConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch =='o'||ch=='u'){
			System.out.println("Vowel");
		}
		else{
			System.out.println("constant");
		}
		
		}

	}


