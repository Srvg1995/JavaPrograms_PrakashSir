package stringprograms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Set;

public class RemoveDuplicateCharacter_UniqueCharacter {
	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character>hs=new LinkedHashSet();
		for(int i=0;i<s.length();i++) 
		{
			hs.add(s.charAt(i));
		}
		for(Character c:hs)
		{
			System.out.print(c);
		}
	}
}
