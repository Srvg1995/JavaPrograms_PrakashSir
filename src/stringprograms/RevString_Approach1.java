package stringprograms;

public class RevString_Approach1 {
	public static void main(String[] args) {
		String s="india";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}

