package CollectionsPractice;

public class map8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is a sample sentence with some long words like 'antidisestablishmentarianism'.";
		String st[] = sentence.split("[^a-zA-Z]");

		String longestword = "";
		for (String word : st) {
			if (word.length() > longestword.length()) {
				longestword = word;
			}

		}

		System.out.println(longestword);
	}

}
