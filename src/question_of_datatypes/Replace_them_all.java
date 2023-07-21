package question_of_datatypes;
import java.util.*;
public class Replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int ans = 0;
		        int mul = 1;
		        boolean hasZero = false;

		        while (n > 0) {
		            int rem = n % 10;
		            if (rem == 0) {
		                rem = 5;
		                hasZero = true;
		            }
		            ans = ans + rem * mul;
		            mul = mul * 10;
		            n = n / 10;
		        }

		        if (!   hasZero) {
		            ans = ans * 10 + 5;
		        }

		        System.out.println(ans);
		    }
		}
