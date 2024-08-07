package string_programs;

import java.util.HashMap;

public class OccurenceOfACharacter {
	public static void main(String[] args) {
		String s="india";
		HashMap<Character, Integer>map=new HashMap(); //If we want to get the output as per the insertion order,then use 'LinkedHashMap' instead of 'HashMap'.
		for(int i=0;i<=s.length()-1;i++) 
		{
			char ch = s.charAt(i); //To access each characters in a string
			if(map.containsKey(ch))//initially this map doesn't have any character(ie,key),so this 'if block'  won't execute until same character repeated again for second time.
			{
				map.put(ch, map.get(ch)+1); //get(key) will gives you the 'value'  //get(ch)+1==>(here,'value' for 'key i' is 1 which is added through below 'else block'==>ie, 'i' is already present 1 time)1+1==>2
			}
			else 
			{
				map.put(ch, 1);  //initially the 'value' will be 1 only for any 'key' //here,till same character found again(ie.,i encounters 2nd time @ index 3),only else block gets executed,but when i repeats again for 2nd time ,then only if block gets executed.
			}
		}
		System.out.println(map);
	}
}


 