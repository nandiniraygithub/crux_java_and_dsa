package question_of_datatypes;
import java.util.*;
public class Print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int n1 =sc.nextInt();
         int n2 =  sc.nextInt();
        int count=0;
         for(int i=1;count<n1;i++) {
        	 int num =3*i+2;
        	
        	 if(num%n2!=0) {
        		
        		  count++;
        		  
        		System.out.println(num);
        		 
        	 }
        
         }
	}
}