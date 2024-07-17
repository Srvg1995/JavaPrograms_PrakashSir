package stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String s="india";
		HashMap<Character, Integer>map=new HashMap();
		for(int i=0;i<s.length();i++) 
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				map.put(ch, 1);  //initially the 'value' will be 1 only for any 'key'
			}
		}

		for(Map.Entry<Character, Integer>data:map.entrySet())  //entrySet() is using here
		{
			if(data.getValue()==1)
			{
				System.out.print(data.getKey());
			}
		}
	}
}

