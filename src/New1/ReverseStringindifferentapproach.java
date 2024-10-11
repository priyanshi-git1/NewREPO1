package New1;

public class ReverseStringindifferentapproach {

	public static void main(String[] args) {
		String s = "PriyanshiGupta";
		String str= " ";
		char ch[]= s.toCharArray(); // convert string in array
		System.out.println(s.length());
		
		for(int i = ch.length-1;i>=0;i--)
		{
			str+= ch[i];
			
		}
		System.out.println("Original String:"  + s + "Reveresed String:"  + str);

	}

}
