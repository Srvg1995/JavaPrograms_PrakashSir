package string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1=sc.next();
		String s2=sc.next();
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
