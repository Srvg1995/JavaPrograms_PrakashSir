package string_programs;

public class ReverseWordByWord {
	public static void main(String[] args) {
		String s="welcome to tp office";
		String str[]=s.split(" ");
		
		//outer loop is used to iterate the array
		for(int i=0;i<str.length;i++)  //eg:welcome
		{
			String s1 = str[i]; //eg:welcome
			//inner loop is to reverse
			 for(int j=s1.length()-1;j>=0;j--)  //eg:emoclew
			 {
				System.out.print(s1.charAt(j));
			 }
			 System.out.print(" ");
		}
		
	}

}
