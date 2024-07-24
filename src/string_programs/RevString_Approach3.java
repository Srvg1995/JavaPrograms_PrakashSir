package string_programs;

public class RevString_Approach3 
{
	public static void main(String[] args) {
		String s="india";
		String rev="";
		for(int i=0;i<s.length();i++) //Here,we can write it in any way==> i<s.length() or i<=s.length()-1
		{
			rev=s.charAt(i)+rev;    //Here,'rev' is concatenated to the right,so we will get the string in reverse order with forward 'for loop'.
		}
		System.out.print(rev);
	}
}


		





