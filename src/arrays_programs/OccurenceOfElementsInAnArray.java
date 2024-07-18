package arrays_programs;

import java.util.HashMap;

public class OccurenceOfElementsInAnArray {
	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,4,1,5};
		HashMap<Integer, Integer>map=new HashMap();
		for(int i=0;i<a.length;i++) 
		{
			int num = a[i];
			if(map.containsKey(num))
			{
				map.put(num, map.get(num)+1);
			}
			else 
			{
				map.put(num, 1);  //initially the 'value' will be 1 only for any 'key'
			}
		}
		System.out.println(map);
	}
}

