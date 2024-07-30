package arrays_programs;

import java.util.Arrays;

public class BubbleSortWithStringArray {

	public static void main(String[] args) {
		String[] input= {"my","name","is","gagan"};
		int n=input.length; //4
		for (int i = 0; i < input.length-1; i++) 
		{
			for (int j = 0; j<n-i-1; j++) 
			{
				if(input[j].compareTo(input[j+1])>0)  //(input[j+1])<0)==>Then it sort it in Descending order 
				{
					String temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}
}