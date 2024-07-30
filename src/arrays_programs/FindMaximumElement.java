package arrays_programs;

import java.util.Iterator;

public class FindMaximumElement {

	public static void main(String[] args) {
		int[]a= {20,100,-10,600,50};
		int max=a[0];
		for (int i = 0; i < a.length-1; i++) 
		{
			if(max<a[i])
			{
			 max=a[i];
			}
		}
		System.out.println(max);
	}

}
