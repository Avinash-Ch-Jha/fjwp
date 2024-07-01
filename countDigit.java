package oops;

public class countDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mat = {0 ,1, 0, 2, 1, 2, 0, 1, 2, 0};
		
		
		int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        
        for (int i = 0; i < mat.length; i++) {
        	            if (mat [i] == 0) {
                count0++;
            } 
        	            else if (mat [i] == 1) {
                count1++;
            } 
        	            else if (mat [i] == 2) {
                count2++;
            }
        }
        System.out.print(count0 + " " + count1 + " " + count2);
        
			

	}

}
