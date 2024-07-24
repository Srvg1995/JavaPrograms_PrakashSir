

package string_programs;

public class RevString_Approach5_Recurssion 
{
	//Method:1(Sumanth  sir)
	public static void main(String[] args) 
	{
		reverse("Sumanth");
	}

	

	public static void reverse(String s) {

		if(s.length()>=1) //7>=1//6>=1//5>=1.....
		{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1)); //sumant//suman//suma.......
		}
	}
}

	
	
	
	
	
	
	
	




   /* //Method:2(Me&Praveen)
	public static void main(String[] args) {
		String str="india";
		int a=str.length()-1;
		reverse(str,a);
	}
	
	
	public static void reverse(String str,int a) {
		if(a>=0) {
			System.out.print(str.charAt(a));
			reverse(str, a-1);
		}
	}
  */
	
	
	
	
	
 
	
	
	/* //Method:3(CTGPT)	   
	  public static String reverse(String str) {
		        if (str.isEmpty()) 
		        {
		            return str;
		        }
		        return reverse(str.substring(1)) + str.charAt(0);
		    }

		    
		    
		    public static void main(String[] args) 
		    {
		        String originalString = "india";
		        String reversedString = reverse(originalString);
		        System.out.println("Original String: " + originalString);
		        System.out.println("Reversed String: " + reversedString);
		    }
	  	}
	  */

	


