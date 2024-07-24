package string_programs;

public class ReverseCharByKeepingSpaceInSamePosition {
	public static void main(String[] args) {
		String s="i love india";
		String s1=s.replaceAll(" ", "");  //iloveindia  //we can use this also==>s.replace() //Here we are replacing space with no space(ie.,(" ", "")).
		int n=s1.length()-1;  //last index of s1
		for (int i = 0; i < s.length(); i++) //To read original string
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(' '); //if character 'space' is there in 's',then print the same 'space'
			}
			else
			{
				System.out.print(s1.charAt(n)); //a// //i//d//n//i// //e//v//o//l//i
				n--;
			}
		}
	}
}
