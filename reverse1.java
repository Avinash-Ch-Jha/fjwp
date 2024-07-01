package oops;
import java.util.*;
public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the array in reverse order
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        
    }

	}

