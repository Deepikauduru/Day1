package que17;
import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sun=sc.nextInt();
		int mon=sc.nextInt();
		int tue=sc.nextInt();
		int wed=sc.nextInt();
	    int thu=sc.nextInt();
	    int fri=sc.nextInt();
        int sat=sc.nextInt();
        int bonus,bonusrate,rate1 =0,rate2 =0,rate3 =0,rate4 =0,rate5 =0,rate6 =0,rate7 =0,rate8 =0;
        int days,totaldays,totalrate;
        rate1=sun*150;
        rate7=sat*125;
        if(mon<=8){
        	 rate2=mon*100;       	
        }
        else if(mon>8){
        	bonus=mon-8;
        	bonusrate=bonus*115;
        	rate2=bonusrate+800;       	
        }
        if(tue<=8){
       	 rate3=tue*100;       	
       }
       else if(tue>8){
       	bonus=tue-8;
       	bonusrate=bonus*115;
       	rate3=bonusrate+800;       	
       }
        if(wed<=8){
       	 rate4=wed*100;       	
       }
       else if(wed>8){
       	bonus=wed-8;
       	bonusrate=bonus*115;
       	rate4=bonusrate+800;       	
       }
        if(thu<=8){
       	 rate5=thu*100;       	
       }
       else if(thu>8){
       	bonus=thu-8;
       	bonusrate=bonus*115;
       	rate5=bonusrate+800;       	
       }
        if(fri<=8){
       	 rate6=fri*100;       	
       }
       else if(fri>8){
       	bonus=fri-8;
       	bonusrate=bonus*115;
       	rate6=bonusrate+800;       	
       }
        totaldays=mon+tue+wed+thu+fri;
        if(totaldays>40){
        	days=totaldays-40;
            rate8=days*25;	
        }
        totalrate=rate1+rate2+rate3+rate4+rate5+rate6+rate7+rate8;
        System.out.printf("%d",totalrate);
        
	} 
}
