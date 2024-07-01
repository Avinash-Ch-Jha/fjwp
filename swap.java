//swaPPIG of tWO nuMBER
import java.util.*;
public class swap {
	public static int pyramid(int n) {
		
	for (int i=1; i<=n; i++ )
	{
		for(int j=1; j<=n-i;  j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	return n;
	}

	public static void swap (int a, int b) {
		
		int temp = a;
		 a=b;
		 b = temp;
		System.out.println("value of a is ="+a);
		System.out.println("value of b is ="+b);
		System.out.println();
	}
	
	public static int pracTice(int z, int y) {
		int sum = z + y;
		System.out.println(sum);
		System.out.println();
		return sum;
		
		
}
	public static void number (int m) {
		for (int i=1; i<=m; i++)
		{
			for(int j=1; j<=m-i+1; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}
	
	
	// number pyramid
	
	public static void numberPyramid(int n) {
//outer loop
		for(int i=1; i<=n; i++) {
//inner loop for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
	//inner loop for print number
			for(int j=1; j<=i; j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		
	}
	
	//palindromic pattern with number
	public static void palindrome_number(int n) {
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop for space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//decending sequence
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			//for accending sequence
			for(int j=2; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//butterfly
	public static void butterfly(int n) {
	//upper bddy
	for(int i=1; i<=n; i++) {
		// for upper star
		for(int j=1; j<=i; j++) {
			System.out.print("&");
		}
		//for spaces
		int spaces= 2*(n-i);
		for(int j=1; j<=spaces; j++) {
			System.out.print(" ");
		}
		//for 2nd body
		for(int j=1; j<=i; j++) {
			System.out.print("#");
		}
		System.out.println();
	}
	
	
	//lower half
	for(int i=n; i>=1; i--) {
		// for upper star
		for(int j=1; j<=i; j++) {
			System.out.print("@");
		}
		//for spaces
		int spaces= 2*(n-i);
		for(int j=1; j<=spaces; j++) {
			System.out.print(" ");
		}
		//for 2nd body
		for(int j=1; j<=i; j++) {
			System.out.print("$");
		}
		System.out.println();
	}
	}
	


	

public static void main(String args[]) {
//	pracTice(19,2);
//	pyramid(9);
//	swap(5,8);
//	palindrome_number(9);
//	
//	number(9);
//	numberPyramid(9);
//	butterfly(15);

	}

}
