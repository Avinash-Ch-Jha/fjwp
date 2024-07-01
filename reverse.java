package oops;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] []matrix= {{1,2,3,4,5}};
		int size =5;
		   int[] arr = new int[size];

	        // Read the elements of the array
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
		
		  for (int i =5; i >= 1; i--) {
	            System.out.print(arr[i] + " ");
	        }


	}

}
