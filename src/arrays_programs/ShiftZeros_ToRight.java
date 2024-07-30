package arrays_programs;

import java.util.Iterator;

public class ShiftZeros_ToRight {

	public static void main(String[] args) {
		int[]a= {1,2,0,0,3,4,0,2,3,0};  //0 0 0 0 1 2 3 4 2 3
		int[] result=new int[a.length];
		int index=result.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				result[index--]=a[i];
			}
		}
		for(int i:result) {
			System.out.println(i+" ");
		}
	}
}



//WAJP to find max,sec max,third max after sorting(not ask usually in the IV) 
//WAJP to shift all the zeros to the right side and other elements to the left side.