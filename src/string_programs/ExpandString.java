package string_programs;

public class ExpandString {
	public static void main(String[] args) {
		String s="a2b2c1a1b2";   //aabbcabb
		for (int i = 0; i<s.length()-1; i=i+2) 
		{
			char ch=s.charAt(i);
			int count=s.charAt(i+1)-48; //Here converting character into integer by subtracting with 48(ie.,charAt(i+1)-48)===>For first iteration,when i=0,then s.charAt(0+1)-48==>s.charAt(1)-48==>'2'-48==>(ASCII value of 2 is 50)50-48==>2
			for (int j = 0; j < count; j++)  //count=2,2,1,1,2 
			{
				System.out.print(ch);
				
			}
		}
	}

}
