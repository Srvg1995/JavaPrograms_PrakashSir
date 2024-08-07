package string_programs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Set;

public class RemoveDuplicateCharacter_UniqueCharacter {
	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character>hs=new LinkedHashSet();  //'LinkedHashSet' used here which doesn't allow duplicates & also insertion order is maintained.
		for(int i=0;i<=s.length()-1;i++) 
		{
			hs.add(s.charAt(i)); //Duplicates are removed & insertion order is maintained
		}
		for(Character c:hs)
		{
			System.out.print(c);  //print not println
		}
	}
}
 