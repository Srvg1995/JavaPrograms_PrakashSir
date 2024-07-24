package arrays_programs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Set;

public class RemoveDuplicateElementsInAnArray {
	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,4,1,5};
		LinkedHashSet<Integer>hs=new LinkedHashSet();  //'LinkedHashSet' used here
		for(int i=0;i<a.length;i++) 
		{
			hs.add(a[i]);
		}
		for(Integer c:hs)
		{
			System.out.println(c);  
		}
	}
}
