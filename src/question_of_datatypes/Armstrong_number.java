package question_of_datatypes;
import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        for (int i = n1; i < n2; i++) {
            int count = 0;
            int num = i;
            
            // Count the number of digits
            while (num > 0) {
                int rem = num % 10;
                count++;
                num = num / 10;
            }
            
            int num2 = i;
            int ans = 0;
            
            while (num2 > 0) {
                int rem = num2 % 10;
                ans += Math.pow(rem, count);
                num2 = num2 / 10;
            }
            
            if (ans == i) {
                System.out.println(ans);
            }
        }
        
        
    }
}


