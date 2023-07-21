package array_2d_lectures;

import java.util.*;
public class Search_2d_matrix_2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] arr = new int[n][m];
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[0].length; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        int x = sc.nextInt();
	        System.out.println(search(arr, x));
	    }

	    public static boolean search(int[][] arr, int x) {
	        int r = 0;
	        int c = arr[0].length - 1;
	        while (r < arr.length && c >= 0) {
	            if (arr[r][c] == x) {
	                return true;
	            } else if (arr[r][c] > x) {
	                c--;
	            } else {
	                r++;
	            }
	        }
	        return false;
	    }
	}