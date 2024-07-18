package string_programs;

import java.util.HashMap;

public class OccurenceOfACharacter {
	public static void main(String[] args) {
		String s="india";
		HashMap<Character, Integer>map=new HashMap();
		for(int i=0;i<s.length();i++) 
		{
			char ch = s.charAt(i); //To access each characters in a string
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				map.put(ch, 1);  //initially the 'value' will be 1 only for any 'key'
			}
		}
		System.out.println(map);
	}
}


