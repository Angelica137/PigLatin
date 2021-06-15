public class PigLatin {
	public String translate(String word) {

		// word starts with vowel
		char start = word.charAt(0);
		char start2 = word.charAt(1);
		if (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') {
			return (word + "ay");
		} else if (start == 'x' && start2 == 'r') {
			return (word + "ay");
		} else if (start == 'y' && start2 == 't') {
			return (word + "ay");
		} else {

			// word starts with consonant
			int i;
			String temp = "";
			String word2;
			Boolean qu = false;
			for (i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					break;
				} else if (ch == 'q' && word.charAt(i + 1) == 'u') {
					temp = temp + ch + word.charAt(i + 1);
					qu = true;
				} else {
					temp += ch;
				}
			}
			if (qu == false) {
				word2 = word.substring(i);
			} else {
				word2 = word.substring((i + 1));
			}
			word = (word2 + temp + "ay");
			return word;
		}

	}

	public static void main(String[] args) {
		PigLatin pig;
		pig = new PigLatin();
		// pig.translate("square");
		System.out.println(pig.translate("square"));
		System.out.println(pig.translate("chair"));

	}

}