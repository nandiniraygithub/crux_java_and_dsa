package question_of_datatypes;

import java.util.*;
public class Binary_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int num=0;
		int mul=0;
		while(n>0) {
			int rem = n%10;
			num = (int ) (num+rem*Math.pow(2, mul));
			mul++;
			n=n/10;
		}
System.out.println(num);
	}

}
