package question_of_datatypes;

import java.util.*;
public class Shopping_GAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner (System.in);
       int m =sc.nextInt();
       int n =sc.nextInt();
       int Ayush_total_phone=0;
       int Harshit_total_phone=0;
       int curr=1;
       while(true) {
    	   Ayush_total_phone += curr;
    	   
    	   if( Ayush_total_phone>m) {
    		   System.out.println("harshit");
    		   break;
    		   
    	   }
    	   curr++;
    	   Harshit_total_phone+=curr;
    	   if(Harshit_total_phone>n) {
    		   System.out.println("ayush");
    		   break;
    	   }
    	   curr++;
       }
	}
  
}
