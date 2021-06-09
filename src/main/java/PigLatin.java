public class PigLatin {
	public String translate(String word) {
		char start = word.charAt(0);
		char start2 = word.charAt(1);
		if (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') {
			return (word + "ay");
		} else if (start == 'x' && start2 == 'r') {
			return (word + "ay");
		} else if (start == 'y' && start2 == 't') {
			return (word + "ay");
		}
		return word;
	}
}
