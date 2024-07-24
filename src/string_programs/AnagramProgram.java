package string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 strings");
			String s1=sc.next();//Care
			String s2=sc.next();//Race
			s1=s1.toUpperCase();
			s2=s2.toUpperCase();
			char[]ch1=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean res=Arrays.equals(ch1, ch2);
			if(res)
			{
				System.out.println("Anagram strings");
			}
			else
			{
				System.out.println("Not an Anagram strings");
			}
		}
}







	/*
	    public static void main(String[] args) {
		String s1="NET";
		String s2="TEN";
		boolean flag = true;
		if(s1.length()!=s2.length()) {
			System.out.println("Not an Anagram");
			return;
		}else
		{
			s1=s1.toUpperCase();
			s2=s2.toUpperCase();
			
			char[]ch1=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for (int i = 0; i < ch1.length; i++) {
				if(ch1[i]!=ch2[i]) {
					flag=false;
					System.out.println("Not an Anagram");
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Anagram");
		}
	}
}
*/
		
		

