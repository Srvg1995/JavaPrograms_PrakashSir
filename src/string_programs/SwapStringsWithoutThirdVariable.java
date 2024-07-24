package string_programs;

public class SwapStringsWithoutThirdVariable {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Api";
		

		System.out.println("Before swapping");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		s1=s1+s2; //JavaApi
		s2=s1.substring(0,s1.length()-s2.length()); //Java
		s1=s1.substring(s2.length()); //Api
		
		
		System.out.println("====================================");
		System.out.println("After swapping");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
	}

	}


