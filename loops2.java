import java.util.*;
public class loops2 {

	public static void main(String[] args) {
		int n=4;
		int m=5;
		int i;
		int j;
		for( i=1; i<=n; i++)
		{
			for( j=1; j<=m; j++)
			{
				if( i==1 || j==1 || i==4 || j==5) {
					System.out.print	("*");
				}else {
					System.out.print(" ");				}
			}
									System.out.println();
				
		}
	}

}
