package array_2d_lectures;

import java.util.*;
public class Aggresive_cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int nos = sc.nextInt(); // no.of stalls
	        int noc = sc.nextInt(); // no.of cows
	        int[] stall = new int[nos];
	        for (int i = 0; i < stall.length; i++) {
	            stall[i] = sc.nextInt();
	        }
	        Arrays.sort(stall);
	        System.out.println(MinDistance(stall, noc));
	    }

	    public static int MinDistance(int[] stall, int noc) {
	        int lo = stall[0];
	        int hi = stall[stall.length - 1];
	        int ans = 0; // Initialize ans to -1
	        while (lo <= hi) {
	            int mid = (lo + hi) / 2; // Corrected the calculation of mid
	            if (isitpossible(stall, noc, mid) == true) {
	                ans = mid;
	                lo = mid + 1;
	            } else {
	                hi = mid - 1;
	            }
	        }
	        return ans;
	    }

	    public static boolean isitpossible(int[] stall, int noc, int mid) {
	        int pos = stall[0];
	        int cowscount = 1;
	        for (int i = 1; i < stall.length; i++) {
	            if (stall[i] - pos >= mid) {
	                cowscount++;
	                pos = stall[i];
	            }
	            if (cowscount == noc) {
	                return true;
	            }
	        }
	        return false;
	    }
	}