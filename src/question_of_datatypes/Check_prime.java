package question_of_datatypes;
import java.util.*;
public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);{
			int n =sc.nextInt();
			int count =0;
			for(int i =1;i<n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count>1) {
		System.out.println("not prime");
			
			}else {
				System.out.println("prime");
			}
		}

	}

}
