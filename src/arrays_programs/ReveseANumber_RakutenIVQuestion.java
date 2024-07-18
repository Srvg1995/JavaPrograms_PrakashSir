package arrays_programs;

public class ReveseANumber_RakutenIVQuestion {

	public static void main(String[] args) {

		
		int a = 123124;
		
		while(a>0) {
			
			int rem = a%10;    //4,2,1,3,2,1
			System.out.print(rem);
			a=a/10;      //12312,1231,123,12,1
		}
		
		
		
		
		
		
//		for(int i=1; i<=a;) {
//			int res = a%10;
//			System.out.print(res);
//			a=a/10;
//		}
	}

}
