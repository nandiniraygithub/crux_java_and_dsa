package array_assignment_1;

import java.util.Arrays;

public class Pair_of_Roses {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] prices = {10, 2, 6, 8, 4};
	        int targetSum = 10;

	        Arrays.sort(prices);
	        int difference = findClosestSum(prices, targetSum);

	        int left = 0;
	        int right = prices.length - 1;
	        System.out.println("Should buy " + prices[left] + " and " + prices[right]);
	    }

	    public static int findClosestSum(int[] prices, int targetSum) {
	        int closestSum = Integer.MAX_VALUE;
	        int left = 0;
	        int right = prices.length - 1;

	        while (left < right) {
	            int currentSum = prices[left] + prices[right];

	            if (currentSum == targetSum) {
	                closestSum = 0;
	                break;
	            } else if (Math.abs(currentSum - targetSum) < Math.abs(closestSum - targetSum)) {
	                closestSum = currentSum;
	            }

	            if (currentSum < targetSum) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return closestSum;
	    }
	}