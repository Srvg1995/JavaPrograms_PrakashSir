package arrays_programs;

public class RepeatedPosition_Array {

	public static void main(String[] args) {
		int[] a={1,12,12,12,15,1,6,6,5,5};  //1-5   12-2,3   6-7   5-9
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			String s=a[i]+"-";
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					if(j<i) {
						flag=false;
						break;
					}
					else if(i!=j) {
						s=s+j+",";
						count++;
					}
				}
			}
			if(flag && count>0) {
				System.out.println(s);
			}
		}

	}

}
