package lambdaexpression;

//public class ImplementingLambda1 {
//	public static void main(String[] args) 
//	{
//		I1 ref=()->
//		System.out.println("Hello");
//		ref.demo();
//	}
//}



public class ImplementingLambda1 {
	public static void main(String[] args) 
	{
		I1 ref=()->{
		System.out.println("Hello");
		System.out.println("DORA");
		System.out.println("BUJJI");
		};
		ref.demo();
		
		I1 ref1=()->System.out.println("Hammer");
		ref1.demo();
	}
} 