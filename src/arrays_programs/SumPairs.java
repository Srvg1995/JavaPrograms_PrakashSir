package arrays_programs;

import java.util.HashSet;

public class SumPairs {

	public static void main(String[] args) {
		int[]a= {10,3,7,6,7,8,5,8,0,13,0,5,6,8};
		HashSet<String>hs=new HashSet();
		int targetSum=13;
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==targetSum) {
					String res=a[i]<a[j]?("("+a[i]+","+a[j])+")":"("+(a[j]+","+a[i]+")");
							hs.add(res);
				}

			}
		}
		System.out.println(hs);
	}
}
