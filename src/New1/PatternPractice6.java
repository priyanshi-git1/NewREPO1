package New1;

public class PatternPractice6 {

	public static void main(String[] args) {
		int n=5;
		int num= 1;
		//outer loop
		for(int i =1;i<=n;i++) {
			//Inner loop
			for(int j=1;j<=i;j++) {
				System.out.print(num + " ");
				num++; // num = num+1;
			}
			System.out.println();
		}
		
		//Another Program
		
		int m=5;
		for(int i=1; i<=m;i++) {
			for(int j=1; j<=i;j++) {
				int sum = i+j;
				if(sum%2==0) {
					System.out.print("1"+ " "); // for even 
				}
				else {
					System.out.print("0"+ " "); // for odd
				}
				
			}
			System.out.println();
		}
	}

}
