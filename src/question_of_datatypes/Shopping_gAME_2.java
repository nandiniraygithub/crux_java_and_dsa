package question_of_datatypes;

import java.util.*;
public class Shopping_gAME_2 {
	 public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test > 0) {
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	     int AyushTotalPhone = 0;
	      int HarshitTotalPhone = 0;
	      int curr = 1;
	        
	        while (true) {
	            AyushTotalPhone += curr;
	            
	            if (AyushTotalPhone > m) {
	                System.out.println("Harshit");
	                break;
	            }
	            
	            curr++;
	            HarshitTotalPhone += curr;
	            
	            if (HarshitTotalPhone > n) {
	                System.out.println("Ayush");
	                break;
	            }
	            
	            curr++;
	        }
	        test--;
	    }
	    }
	}
