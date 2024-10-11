package New1;

public class PatternPractice3 {

	public static void main(String[] args) {
		int n=4;
	
		for(int i=n;i>=1;i--)
		{
			for(int j=1; j<=i;j++) {
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}
// //Another Program(Same program logic but output is different)
		
		int m=4;
		for(int k=m; k>=1;k--) {
			for(int z= 1; z<=k;z++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

}
