package array_lectures;

public class Arrays_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,5,7,8};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0]+" "+arr[1]);
	}
	public static  void swap(int [] arr ,int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	

	}

}
