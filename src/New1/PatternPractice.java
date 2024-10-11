package New1;

public class PatternPractice {

	public static void main(String[] args) {
		int n =4;
		int m =5;
		for(int i =1; i<=n;i++) {
			for(int j =1;j<=m;j++) {
				
				System.out.print("*"+ " ");
			}
			System.out.println(" ");
				
		}
		
		// Next Problem of Pattern 
		
		int a= 4;
		int b= 5;
		for(int c= 1; c<=a;c++)
		{
			for(int d=1; d<=b;d++)
			{
				if(c==1|| c==a || d==1 || d==b) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println("   ");
		}
		

		
	}

}
