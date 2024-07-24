package string_programs;

public class CheckWhetherSubstringIsPalindromeOrNot 
{
	public static void main(String[] args) 
	{
		String s="aabaac"; //This 's'should be taken properly(ie.,Palindrome only need to consider like,"kayak"),otherwise output won't be displayed.
		for (int i = 0; i<s.length(); i++) 
		{
			for (int j = i+1; j<=s.length(); j++) 
			{
				String s1=s.substring(i,j);
				if(s1.length()>=3 && isPalindrome(s1)) //2 conditions added here,ie.,length()>=3 and check whether palindrome or not by isPalindrome().
				{
					System.out.print(s.substring(i,j)+" "); 
				}
			}
		}
	}

	public static boolean isPalindrome(String s) 
	{
		String rev="";
		for (int i = s.length()-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s)) 
		{
			return true;
		}
		return false;
	}

}


