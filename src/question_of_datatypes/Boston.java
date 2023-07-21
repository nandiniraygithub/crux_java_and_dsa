package question_of_datatypes;

import java.util.*;
public class Boston {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//System.out.println(Is_boolean_Number(n));
		   if(sumofdigit(n)==lcm(n)) {
	            System.out.println(1);
	        }
	        else {
	            System.out.println(0);
	        }

	    }
	public static int sumofdigit(int n) {
	
	int sum =0;
      while(n>0) {
    	  int rem=n%10;
    	  sum = sum+rem;
    	  n=n/10;
      }
      return(sum);
	}
	public static int lcm(int n) {
		 int primefact=0;
		 for(int i=2;i<=n;i++) {
			 
			 while(n%i==0) {
			 primefact=primefact +sumofdigit(i);
			 n/=i;
		 }
			 
		 }
	
	return primefact;
}
	}
