package string_programs;

public class RevString_Approach6_Palindrome {
	public static void main(String[] args) {
		String s="amma";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}

	}
}

