package question_of_datatypes;

import java.util.*;
public class Is_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        int temp = num; // Store the original number in a temporary variable
        while (temp > 0) {
            int rem = temp % 10;
            count++;
            temp = temp / 10;
        }

        int ans = 0;
        temp = num; // Reset the temporary variable to the original number
        while (temp > 0) {
            int rem = temp % 10;
            ans += Math.pow(rem, count);
            temp = temp / 10;
        }

if (num==ans) {
	System.out.println("true");
	
	
}else {
	System.out.println("false");
}
    }
}