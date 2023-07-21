package question_of_datatypes;

import java.util.*;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();//divident
		int b = sc.nextInt();//divisior
		int p1=a;
		int p=b;
		while(a%b!=0) {
			int rem = a%b;
			a= b;
			b=rem;
			
		}
		int gcd =b;
           int lcm = (p1 * p) / gcd;
           System.out.println(lcm);
        
       
		
	}
	 
		}
