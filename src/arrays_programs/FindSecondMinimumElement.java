package arrays_programs;

import java.util.Iterator;

public class FindSecondMinimumElement {

	public static void main(String[] args) {
		int[]a= {12,34,56,32,12,78,85,79};
		int min=Integer.MAX_VALUE;
		int sec_min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				sec_min=min;
				min=a[i];
			}else if(sec_min>a[i] && min!=a[i]) {
				sec_min=a[i];
			}
		}
		System.out.println(sec_min);
	}

}







