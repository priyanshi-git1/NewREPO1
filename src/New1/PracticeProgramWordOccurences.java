package New1;

import java.util.HashMap;

public class PracticeProgramWordOccurences {

	public static void main(String[] args) {
		String s = "aabbcc";
		HashMap<Character,Integer> map = new HashMap<>();
		for( int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.replace(ch, count);
				
				
			}
			else {
				map.put(ch, 1);
			}
			
		}
for(Character key: map.keySet())
{
	System.out.println(key + " "+ map.get(key));
}
	}

}
