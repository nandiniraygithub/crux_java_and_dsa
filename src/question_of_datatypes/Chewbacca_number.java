package question_of_datatypes;
import java.util.*;
public class Chewbacca_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans=0;
		long mul=1;
		while(n>0) {
			int rem =(int)(n%10);
			if(rem>=5) {
				int t = 9-rem;
				ans =ans +t*mul;
			}
			else {
				ans = ans +rem*mul;
			}
	mul= mul*10;
			
			n=n/10;
		}
System.out.println(ans);
	}

}
