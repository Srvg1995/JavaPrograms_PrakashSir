package string_programs;

public class RevString_Approach2 {
	public static void main(String[] args) {
		String s="india";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);  //Here,'rev' is concatenated to the left,so we will get the string in reverse order with backward 'for loop'.
		}
		System.out.print(rev);

	}
}

