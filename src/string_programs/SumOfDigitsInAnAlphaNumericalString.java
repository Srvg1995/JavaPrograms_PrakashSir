package string_programs;

public class SumOfDigitsInAnAlphaNumericalString {
	public static void main(String[] args) {
		String input="a1b6^&jsjdh899+";
		String number="";
		int sum = 0;

		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+ch-48;  // Here,ch returns 'char' type & sum returns 'int' type ,so we have to convert the character(char) into number(int)==>ie., ASCII value of '0'(Character ZERO)is ==>48
			}
		}
		System.out.println("The sum is: "+sum);

	}
}

