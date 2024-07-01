package oops;

public class array22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [ ] [] mat =	{{2, 3, 5	},
		{6, 7, 2 },
		{ 2, 4, 8}};
	
	for(int i= 0; i<mat.length; i++) {
		for(int j=0; j<mat[0].length; j++) {
			if(mat[i][j]%2 == 0) {
				System.out.print(mat[i][j]+" ");
			}
		}
		System.out.println();
	}
		
	}
		
}
