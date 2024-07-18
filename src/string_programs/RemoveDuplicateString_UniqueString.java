package string_programs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Set;

public class RemoveDuplicateString_UniqueString {
	public static void main(String[] args) {
		String s="welcome to tp welcome to gc18";
		String str[]=s.split(" ");
		LinkedHashSet<String>hs=new LinkedHashSet();
		for(int i=0;i<str.length;i++) 
		{
			hs.add(str[i]);
		}
		for(String st:hs)
		{
			System.out.print(st+" ");  //print not println
		}
	}
}
