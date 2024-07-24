package string_programs;

public class GenerateAllSubstring {

	public static void main(String[] args) {
 
		String s="sum";
		for (int i = 0; i<s.length(); i++) //i<s.length()==>'i' value not equal to length() here. 
		{
			for (int j = i+1; j<=s.length(); j++) //j<=s.length()==>'j' value equal to length() here. 
			{
				System.out.print(s.substring(i,j)+" "); //substring()not includes the last index value(ie.,substring(0,3)==>includes 0,but excludes 3 & consider only upto 2 index.
			}
		}
	}
}
