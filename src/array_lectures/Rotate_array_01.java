package array_lectures;

public class Rotate_array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}
public static void rotate(int []arr,int k) {
	int n =arr.length;
	k =k%n;
	reverse(arr,k+1,n-1);
	reverse(arr,0,k);
	reverse(arr,0,n-1);
	
}
public static void reverse(int[] arr,int start,int end) {
	while(start<end) {
		int temp =arr[start];
		arr[start] = arr[end];
		arr[end]=temp;
		start++;
		end--;
		
	}
	
}



	}


