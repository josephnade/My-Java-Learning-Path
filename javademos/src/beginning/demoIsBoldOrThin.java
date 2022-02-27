package beginning;

public class demoIsBoldOrThin {
	public static void main(String[] args) {
		char letter = '0';
		boolean isBold = false;
		boolean isThin = false;
		char[] boldVowel = {'A','a','I','ý','O','o','U','u'};
		char[] thinVowel = {'E','e','Ý','i','Ö','ö','Ü','ü'};
		for(char boldLet:boldVowel) {
			if(letter == boldLet) {
				isBold = true;
			}
		}
		for(char thinLet:thinVowel) {
			if(letter == thinLet) {
				isThin = true;
			}
		}
		if(isBold == true) {
			System.out.println("Letter is Bold Vowel!");
		}
		if(isThin == true) {
			System.out.println("Letter is Thin Vowel");
		}
		if(isBold == false && isThin == false) {
			System.out.println("Wrong input!!");
		}
	}
}
