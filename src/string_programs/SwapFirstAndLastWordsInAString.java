package string_programs;

public class SwapFirstAndLastWordsInAString {
	public static void main(String[] args) {
		String input="My name is Bheem";
		String[] str=input.split(" ");
		String temp = str[0]; //My
		str[0]=str[str.length-1]; //Bheem
		str[str.length-1]=temp; //My
		
		for(String s:str)
		{
			System.out.print(s+" ");
		}
	}
}


