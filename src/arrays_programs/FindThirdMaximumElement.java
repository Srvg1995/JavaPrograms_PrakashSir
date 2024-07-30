package arrays_programs;

import java.util.Iterator;

//WAJP to find third largest element in an array without sorting.
public class FindThirdMaximumElement {

	public static void main(String[] args) {
		int[]a= {12,34,56,32,12,78,85,79};
		int max=Integer.MIN_VALUE; 
		int sec_max=Integer.MIN_VALUE;
		int third_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) 
			{
				third_max=sec_max;
				sec_max=max;
				max=a[i];
			}
			else if(a[i]>sec_max && a[i]!=max) 
			{
				third_max=sec_max;
				sec_max=a[i];
				
			}
			else if(third_max<a[i] && a[i]!=max && a[i]!=sec_max) 
			{
				third_max=a[i];
			}
		}
		System.out.println(third_max);
	}

}


