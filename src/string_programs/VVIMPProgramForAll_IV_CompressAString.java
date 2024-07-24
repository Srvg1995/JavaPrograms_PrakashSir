package string_programs;

public class VVIMPProgramForAll_IV_CompressAString {

	public static void main(String[] args) {
		String s="aabbccaa";  //Output:a2b2c2a2
		int i;  //here 'i' is declared outside the for loop,sothat we can access it from outside of 'for loop'.
		int count=1;
		String op=""; //op=output
		for (i = 0; i<s.length()-1; i++) 
		{
			if(s.charAt(i)==s.charAt(i+1)) 
			{
				count++;
			}
			else 
			{
				op=op+s.charAt(i)+count;
				count=1; //Bcz every time count should starts from 1 only(ie.,it has to be reinitialized to 1 every time)
			}
		}
		if(i==s.length()-1)   //This 'if statement' is for last index value(ie.,7 in this program)
		{
			op=op+s.charAt(i)+count;
		}
		System.out.println(op);
	}
}

