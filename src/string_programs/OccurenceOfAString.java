package string_programs;

import java.util.HashMap;

public class OccurenceOfAString {
	public static void main(String[] args) {
		String s="welcome to tp welcome to gc18";
		String str[]=s.split(" ");
		HashMap<String, Integer>map=new HashMap();
		for(int i=0;i<str.length;i++) 
		{
			 String word = str[i];
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else 
			{
				map.put(word, 1);  //initially the 'value' will be 1 only for any 'key'
			}
		}
		System.out.println(map);
	}
}

