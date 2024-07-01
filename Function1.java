//addition of two number
import java.util.Scanner;

public class Function1 {

	public static int calculateSum(int a,int b) {
		int sum = a + b;
		return sum;
	}
	public static int multiply(int a, int b) {
		int mul =a*b;
    	System.out.println("product of two number is:" +mul);
		return mul;
	}
	// for factorial
	public static int factorial(int n) {
		int f=1;
		for(int i=1; i<=n; i++) {
			f=f * i;
//			System.out.print("factorial of :"+n);
//			System.out.println("is\t"+f);
		}
		System.out.print("factorial of :"+n);
		System.out.println("is\t"+f);
	return f;
	}


	
	
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int sum= calculateSum(a,b);
		System.out.println("sum of two number is:"+sum);
		int product=multiply(a,b);
		System.out.println("product of two number is:" + product);
	   multiply(8,5);
	   factorial(n);
    
		
	}

}
 