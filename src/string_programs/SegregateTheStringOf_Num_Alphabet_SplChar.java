package string_programs;

public class SegregateTheStringOf_Num_Alphabet_SplChar {
	public static void main(String[] args) {
		String input="a1b6^&jsjdh899+";
		String special="";
		String number="";
		String alphabet="";
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				alphabet+=ch;
			}

			else if(ch>='0' && ch<='9') //This is character 0 & character 9, not integers 0&9.
			{
				number+=ch;
			}

			else
			{
				special+=ch;
			}
		}
		System.out.println("ALPHABET: "+alphabet);
 		System.out.println("NUMBER: "+number);
		System.out.println("SPECIAL: "+special);

	}

}
