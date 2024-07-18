package string_programs;

public class RevString_Approach3 
{
	public static void main(String[] args) {
		
	
//		String s="india";
//		String rev="";
//		for(int i=0;i<s.length();i++) {
//			rev=s.charAt(i)+rev;    //Here,'rev' is concatenated to the right,so we will get the string in reverse order with forward 'for loop'..
//		}
//		System.out.print(rev);
//	}


		
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
	}
}





