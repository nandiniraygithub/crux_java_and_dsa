package array_lectures;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr = {7,8,3,1,2};
     sort(arr);
     for(int i =0;i<arr.length;i++) {
    	 System.out.print(arr[i]+" ");
     }
	}
	public static void sort(int[]arr) {
	 for(int i =1;i<arr.length-1;i++) {
		 int current =arr[i];
		 int j=i-1;
		 while(j>=0 && current<arr[j]) {
			 arr[j+1]=arr[j];
			 j--;
		 }
		 arr[j+1]=current;
	 }
		
	}
}
