public class PigLatin {
	public String translate(String word) {

		int i;
		String temp = "";
		Boolean qu = false;

		// dictionary rules
		for (i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				break;
			} else if (word.charAt(0) == 'x' && word.charAt(1) == 'r') {
				return (word + "ay");
			} else if (word.charAt(0) == 'y' && word.charAt(1) == 't') {
				return (word + "ay");
			} else if (word.charAt(i) == 'q' && word.charAt(i + 1) == 'u') {
				temp = temp + word.charAt(i) + word.charAt(i + 1);
				qu = true;
			} else if (i > 0 && word.charAt(i) == 'y') {
				break;
			} else {
				temp += word.charAt(i);
			}
		}

		// create word output
		if (qu == false) {
			word = word.substring(i);
		} else {
			word = word.substring((i + 1));
		}
		word = (word + temp + "ay");
		return word;
	}
}