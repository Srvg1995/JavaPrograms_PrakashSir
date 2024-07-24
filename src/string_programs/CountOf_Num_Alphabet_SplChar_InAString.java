package string_programs;

public class CountOf_Num_Alphabet_SplChar_InAString {

	public static void main(String[] args) {
		String s = "abcsAE123!@#";
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s .charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("Uppercase letters: " + upperCaseCount);
		System.out.println("Lowercase letters: " + lowerCaseCount);
		System.out.println("Digits: " + digitCount);
		System.out.println("Special characters: " + specialCharCount);
	}
}
