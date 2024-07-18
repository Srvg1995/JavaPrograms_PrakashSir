package string_programs;

public class SwapFirstAndLastWordsInAString {
	public static void main(String[] args) {
		String input="My name is Bheem";
		String[] arr=input.split(" ");
		String temp = arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		for(String s:arr)
		{
			System.out.print(s+" ");
		}

	}
}


