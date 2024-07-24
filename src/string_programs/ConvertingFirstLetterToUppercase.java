package string_programs;

public class ConvertingFirstLetterToUppercase {

	public static void main(String[] args) {
		String s="India are the world champions";  //Output:India Are The World Champions 
		String[] str = s.split(" ");  //India| are |the |world |champions
		for (int i = 0; i < str.length; i++) {
		//converting first character to uppercase
			String s1=str[i];
			s1=Character.toUpperCase(s1.charAt(0))+s1.substring(1); //Here,after converting first letter to uppercase & concatenating with substring(ie.,+s1.substring(1))==> I+"ndia"=India
			System.out.print(s1+" ");
		}
	}

}
