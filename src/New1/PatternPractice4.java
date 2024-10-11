package New1;

public class PatternPractice4 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
          for(int j =1;j<=n-i;j++) //inner loop -> space print
          {
        	  System.out.print(" ");
          }
          for(int j =1;j<=i;j++)  // inner loop -> star print
          {
        	  System.out.print("*" + " ");
          }
          System.out.println();
	}
// Next program
		int p= 5;
		for(int i=1;i<=p;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}		
}
}
