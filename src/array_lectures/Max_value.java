package array_lectures;

public class Max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,51,7};
        System.out.println(Max(arr));
	}
	public static int Max(int[]arr) {
		int Max =Integer.MIN_VALUE;// first way
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
			// max=Math.max(arr[i],max);//second way
		}
		return Max;
	}



	}


