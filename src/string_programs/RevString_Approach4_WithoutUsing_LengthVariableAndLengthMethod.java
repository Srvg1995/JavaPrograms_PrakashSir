package string_programs;

public class RevString_Approach4_WithoutUsing_LengthVariableAndLengthMethod {

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





/*
String input="Pyramid";
String op="";
int i=0;
while(true)
{
	try 
	{
		char ch=input.charAt(i);
		op=ch+op;
		i++;
	}
	catch(StringIndexOutOfBoundsException  s) 
	{
		break;
	}
}
System.out.print(op);
*/