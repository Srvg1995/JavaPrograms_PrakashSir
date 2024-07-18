package MockPrograms;

import java.util.HashMap;


	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class UniqueChar{
		public static void main(String[] args) {
			String s="indiaaa";
			LinkedHashMap<Character, Integer>map=new LinkedHashMap();
			for(int i=0;i<s.length();i++) 
			{
				char ch = s.charAt(i);
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
				}
				else 
				{
					map.put(ch, 1);  
				}
			}

			for(Map.Entry<Character, Integer>data:map.entrySet()) 
			{
				if(data.getValue()==1)
				{
					System.out.print(data.getKey()); 
				}
			}
		}
	}


	    


