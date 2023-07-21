package question_of_datatypes;
import java.util.*;
public class Lcm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt(); // dividend
        System.out.print("Enter the second number: ");
        int b = sc.nextInt(); // divisor
        sc.close();

        int p = b;
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int gcd = b;
        int lcm = (a * p) / gcd;
        
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    



	}

}
