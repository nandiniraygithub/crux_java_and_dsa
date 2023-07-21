package question_of_datatypes;
import java.util.*;
public class Sum_of_odd_placed_AND_EVEN_PLACED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1=0;
		int sum=0;
		int count=0;
		while(n>0) {
			int rem =n%10;
			count++;
			if(count%2!=0) {
				sum = sum+rem;
				
			}else {
				sum1=sum1+rem;
			}
			
			
			
			n=n/10;
		}
System.out.println(sum);
System.out.println(sum1);
	}

}
