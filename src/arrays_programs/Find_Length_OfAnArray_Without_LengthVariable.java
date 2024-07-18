package arrays_programs;

public class Find_Length_OfAnArray_Without_LengthVariable {
	    public static void main(String[] args) {
	        int[] array = {1,2,3,4,5,6,7};
	        int count = 0;
	        try {
	            while (true) {
	                int dummy = array[count];
	                count++;
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	           
	        }
	        System.out.println(count);
	    }
	}



