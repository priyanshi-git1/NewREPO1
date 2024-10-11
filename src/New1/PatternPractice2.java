package New1;

public class PatternPractice2 {

	public static void main(String[] args) {
		int n=4; 
		
		for(int i=1; i<=n; i++)
		{
			for(int j =1; j<=i;j++) {
				System.out.print(j + " ");
				
			}
		System.out.println();		
		}
 //Another Program(Same program logic but output is different)
		
		
		int m=4;
		for(int k=1;k<=m;k++) 
		{
			for(int p=1; p<=k;p++) {
				System.out.print("*"+ " ");
			}
			System.out.println();	
		}
	}
}
