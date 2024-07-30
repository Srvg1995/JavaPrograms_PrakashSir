package arrays_programs;

import java.util.Arrays;
import java.util.Iterator;

public class LeftRotationArray {
	public static void main(String[] args) {
		
		String[] s= {"My","Name","Is","Dora"};
		for (int i = 1; i<=2; i++) {    //If you pass 'i' value upto 4,then we will get the same string array which is stored in's' container.
			String temp=s[0];
			for(int j=0;j<s.length-1;j++) {
				s[j]=s[j+1];
			}
			s[s.length-1]=temp;
		}
		System.out.println(Arrays.toString(s));
	}
	
	}





//Assignment:WAJP TO ROTATE THE INTEGER ARRAY FOR A GIVEN PARTICULAR AMOUNT OF TIME.