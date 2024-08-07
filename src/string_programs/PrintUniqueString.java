package string_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintUniqueString {
	public static void main(String[] args) {
		String s="welcome to tp welcome to gc18";
		String str[]=s.split(" ");
		LinkedHashMap<String, Integer>map=new LinkedHashMap();
		for(int i=0;i<=str.length-1;i++) 
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

		for(Entry<String, Integer>data:map.entrySet())  //entrySet() is using here
		{
			if(data.getValue()==1)
			{
				System.out.print(data.getKey()+" "); //print not println
			}
		}
	}
}

