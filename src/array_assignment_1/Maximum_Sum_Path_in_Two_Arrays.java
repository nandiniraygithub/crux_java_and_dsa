package array_assignment_1;


public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] A = {2, 3, 7, 10, 12};
		        int[] B = {1, 5, 7, 8};
		        int m = A.length;
		        int n = B.length;
		        int result = pathSum(A, B, m, n);
		        System.out.println(result);

		    }

		    public static int pathSum(int[] A, int[] B, int m, int n) {
		        int i = 0;
		        int j = 0;
		        int sum1 = 0;
		        int sum2 = 0;
		        int res = 0;

		        while (i < m && j < n) {
		            if (A[i] < B[j]) {
		                sum1 += A[i];
		                i++;
		            } else if (A[i] > B[j]) {
		                sum2 += B[j];
		                j++;
		            } else {
		                res += Math.max(sum1, sum2); // Add current matching element
		                sum1 = 0;
		                sum2 = 0;

		                while (i < m && j < n && A[i] == B[j]) { // Add all consecutive matching elements
		                    res += A[i];
		                    i++;
		                    j++;
		                }
		            }
		        }

		        while (i < m) {
		            sum1 += A[i];
		            i++;
		        }

		        while (j < n) {
		            sum2 += B[j];
		            j++;
		        }

		        res += Math.max(sum1, sum2); // Add remaining elements from the longer array

		        return res;
		    }
		}
