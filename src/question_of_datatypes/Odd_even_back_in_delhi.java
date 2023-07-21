package question_of_datatypes;

import java.util.*;
public class Odd_even_back_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        while (n1 > 0) {
            sum += n1 % 10;
            n1 /= 10;
        }

        if (sum % 2 != 0 && (sum % 3 == 0 || sum % 4 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        int sum1 = 0;
        while (n2 > 0) {
            sum1 += n2 % 10;
            n2 /= 10;
        }

        if (sum1 % 2 != 0 && (sum1 % 3 == 0 || sum1 % 4 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}