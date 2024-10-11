package New1;

public class PatternPractice5 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
// Another way of same program
		int m=5;
		for(int i=1; i<=m;i++) {
			for(int j =1; j<=m-i+1;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// Another way of same program
		int p=5;
		for(int i=0;i<p;i++) {
			for(int j=1;j<p-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
