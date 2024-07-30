package arrays_programs;

import java.util.Iterator;

public class FindMinimumElement {

	public static void main(String[] args) {
		int[]a= {20,100,-10,600,50};
		int min=a[0];
		for (int i = 0; i < a.length-1; i++) 
		{
			if(min>a[i])
			{
			 min=a[i];
			}
		}
		System.out.println(min);
	}

}
