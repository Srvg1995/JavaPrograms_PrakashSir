package string_programs;

public class RevString_Approach2 {
	public static void main(String[] args) {
		String s="india";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);

	}
}

