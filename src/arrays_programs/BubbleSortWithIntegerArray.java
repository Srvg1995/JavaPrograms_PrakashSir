package arrays_programs;

import java.util.Arrays;

public class BubbleSortWithIntegerArray {

	public static void main(String[] args) {
		
		int[]a= {12,23,34,4,6};  //4 6 12 23 34 //Bubble sort always compares adjacent elements.
		int n=a.length; //5
		for (int i = 0; i < a.length-1; i++) //For no.of iterations
		{
			for (int j = 0; j< n-i-1; j++) //condition==>j<n-i-1==>To compare Adjacent elements("j< n-i-1"==>Bcz,In every iterations we will compare 4,3,2,1 elements)
			{
				if(a[j]>a[j+1]) //instead we can use==>(a[j].compareTo(a[j+1])==>for string array
				{
					int temp=a[j]; //Swapping will be done here
					a[j]=a[j+1];
					a[j+1]=temp;
				}

			}

		}
		System.out.println(Arrays.toString(a));  //To access the each elements of an Array.//We can also use 'for loop'/'for each loop'. 
	}
}
   

//Assignment:WAJP TO swap a string array(use 'compareTo()' method present in string class)==>(a[j].compareTo(a[j+1])==>for string array