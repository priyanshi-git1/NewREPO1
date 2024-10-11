package New1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		 String[] array= {"Apple", "Cat", "Mat"}; // Define an array
		 
		  List<String> arrayList = new ArrayList<>(Arrays.asList(array)); // Convert array to ArrayList using Arrays.asList()

		  System.out.println(arrayList);
		  
		 
//  How to create an Array List
		  
		  Object obj []  = {"Apple",123,12.89f,34.8907,'x'};
		  List <Object> abc = new ArrayList<>(Arrays.asList(obj));
		  
		  System.out.println(abc);
	}

}
