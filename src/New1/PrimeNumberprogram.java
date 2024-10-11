package New1;

public class PrimeNumberprogram {
public static void main(String[] args) {
		
		boolean isPrime = true;
		int s=7;
		
		if(s==0||s==1) {
			System.out.println("Not prime");
		}
		else {
			for(int i=2;i<=s/2;i++) {
				if(s%i==0) {
					System.out.println("Not prime");
					isPrime= false;
					break;		
				}
			}
			if(isPrime) {
				System.out.println("Prime");
			}
		}
	}
}


