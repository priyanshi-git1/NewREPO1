package New1;

public class Practice13 {

	public static void main(String[] args) {
		 int n=5;
		 for(int i =1; i<=n;i++) {
			 for(int j = 1; j<=n-i;j++) {
				 System.out.print(" "); // print spaces
			 }
			 //print numbers - logic print row no , row no times
			 for(int j = 1; j<=i; j++) 
			 {
				 System.out.print(i + " ");
			 }
			System.out.println(); 
		 }
		 // Another program of Palindrome Pattern 
		 
		 int m=5;
		 for(int i=1; i<=m;i++)
		 {
			 for(int j=1;j<=m-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i; j>=1;j--) {
				 System.out.print(j);
			 }
			 for(int j= 2; j<=i; j++)
			 {
				 System.out.print(j );
			 }
			 System.out.println();
		 }
	}

}
