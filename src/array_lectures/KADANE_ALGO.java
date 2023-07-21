package array_lectures;

public class KADANE_ALGO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(subarray(arr)); 
         
	}
	public static int subarray(int[]arr) {
		int ans=Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				ans=Math.max(sum, ans);
				if(sum<0) {
					sum=0;
				}
				
				
			}
		}
		return ans;
	}

}
	