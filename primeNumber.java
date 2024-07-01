
public class primeNumber {

	public static boolean isprime(int n) {
//		boolean isprime=true;
		for(int i=2; i<=n-1; i++) {
			if(n%i==0)
			{
//				boolean isprime= false;
				return false;
//				break;
			}
			else {
				return true;
			}
		}
		return true;
	}
	
	
	// prime number in range
	public static void primeInRange(int n) {
		for (int i=2; i<=n; i++) {
			if (isprime(i)) {
				System.out.print(i+" \n ");
				
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
	 System.out.println(isprime(40));
	 primeInRange(40);
	 

	}

}
