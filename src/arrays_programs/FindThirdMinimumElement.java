package arrays_programs;

import java.util.Iterator;

//WAJP to find third minimum element in an array without sorting.
public class FindThirdMinimumElement {

	public static void main(String[] args) {
		int[]a= {12,34,56,32,12,78,85,79};
		int min=Integer.MAX_VALUE; 
		int sec_min=Integer.MAX_VALUE;
		int third_min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) 
			{
				third_min=sec_min;
				sec_min=min;
				min=a[i];
			}
			else if(a[i]<sec_min && a[i]!=min) 
			{
				third_min=sec_min;
				sec_min=a[i];
				
			}
			else if(third_min>a[i] && a[i]!=min && a[i]!=sec_min) 
			{
				third_min=a[i];
			}
		}
		System.out.println(third_min);
	}

}



