package array_2d_lectures;

public class Spiral_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
	        spiral(arr);
	    }

	    public static void spiral(int[][] arr) {
	        int minr = 0;
	        int maxr = arr.length - 1;
	        int minc = 0;
	        int maxc = arr[0].length - 1;

	        int totalElements = arr.length * arr[0].length;
	        int count = 0;

	        while (count < totalElements) {
	            // Traverse from left to right
	            for (int i = minc; i <= maxc && count < totalElements; i++) {
	                System.out.print(arr[minr][i] + " ");
	                count++;
	            }
	            minr++;

	            // Traverse from top to bottom
	            for (int i = minr; i <= maxr && count < totalElements; i++) {
	                System.out.print(arr[i][maxc] + " ");
	                count++;
	            }
	            maxc--;

	            // Traverse from right to left
	            for (int i = maxc; i >= minc && count < totalElements; i--) {
	                System.out.print(arr[maxr][i] + " ");
	                count++;
	            }
	            maxr--;

	            // Traverse from bottom to top
	            for (int i = maxr; i >= minr && count < totalElements; i--) {
	                System.out.print(arr[i][minc] + " ");
	                count++;
	            }
	            minc++;
	        }
	    }
	}