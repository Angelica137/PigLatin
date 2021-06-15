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
		} else {
			char[] ch = word.toCharArray();
			int i;
			String temp = "";
			for (i = 0; i < word.length(); i++) {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					break;
				} else {
					temp += ch[i];
				}
			}
			System.out.println("First print " + word);
			System.out.println(temp);
			String word2 = word.substring(i);
			word = (word2 + temp + "ay");
			return word;
		}

	}

	public static void main(String[] args) {
		PigLatin pig;
		pig = new PigLatin();
		System.out.println(pig.translate("chair"));

	}

}