package lambdaexpression;

public class C3 {

	public static void main(String[] args) {
		//1st Implementation
		I2 i=(a,b)->{
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
		};
		i.add(2, 3);
		i.add(4, 5);

		//2nd Implementation
		I2 i1=(a,b)->{
			System.out.println(a+b);  
		};
		i1.add(3, 4);
	}
}
