package New1;

public class Practice12 {

	public static void main(String[] args) {
	//Program-	Create a for loop that iterates up to 100 while outputting "fizz" at multiples of 3, "buzz" at multiples of 5 and "fizzbuzz" at multiples of 3 and 5.
		for(int i =1;i<=100;i++) {
			//check for multiples of 3 and 5
			if(i%3==0 && i%5==0)
				{
				System.out.println("fizzbuzz");
				}
			//check for multiples of 3
			else 
			{
				if(i%3==0)
					{
					System.out.println("fizz");
				
			
				}
			 
				 if (i%5==0)
				 	 
			{
					 System.out.println("buzz");
			
			 }
			 {
				System.out.println(i);
			}
	}

	}
	}
}
