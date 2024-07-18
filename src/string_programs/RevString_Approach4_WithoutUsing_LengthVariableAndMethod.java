package string_programs;

public class RevString_Approach4_WithoutUsing_LengthVariableAndMethod {

	public static void main(String[] args) {
		String str = "india";
		String rev = "";
		char[] chr = str.toCharArray();

		for (char c : chr) 
		{
			rev = c + rev;
		}
		System.out.println(rev);
	}
}