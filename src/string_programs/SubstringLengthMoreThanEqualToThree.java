package string_programs;

public class SubstringLengthMoreThanEqualToThree {

	public static void main(String[] args) {
 
		String s="india";
		for (int i = 0; i<s.length(); i++) //i<s.length()==>
		{
			for (int j = i+1; j<=s.length(); j++) //j<=s.length()==>
			{
				if(s.substring(i,j).length()>=3) //This is the only line to be added to previous program(ie.,GenerateAllSubstring)to get the output for this program
				System.out.print(s.substring(i,j)+" "); //substring()not includes the last index value(ie.,substring(0,3)==>includes 0,but excludes 3.
				
			}
			
		}
	}

}
