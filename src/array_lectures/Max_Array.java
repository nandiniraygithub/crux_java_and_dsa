package array_lectures;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr= {2,3,1,51,7};
          System.out.println(Max(arr));
	}
	public static int Max(int[]arr) {
		int Max =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			} 
		}
		return Max;
	}

}
