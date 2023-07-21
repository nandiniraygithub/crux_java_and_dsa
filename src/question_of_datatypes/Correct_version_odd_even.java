package question_of_datatypes;
import java.util.*;
public class Correct_version_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int sum1 = calculateSum(n1);
            int sum2 = calculateSum(n2);

            if ((sum1 % 2 != 0 && sum1 % 3 == 0) || (sum2 % 2 != 0 && sum2 % 3 == 0)) {
                System.out.println("yes");
            } else if (sum1 % 2 == 0 && sum1 % 4 == 0 && sum2 % 2 == 0 && sum2 % 4 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            testCases--;
        }
    }
	public static int calculateSum(int num) {
	    int sum = 0;

	    while (num > 0) {
	        int digit = num % 10;
	        sum += digit;
	        num /= 10;
	    }

	    return sum;
	}
}
