package practices;

public class CountAlphaNumeric {

	public static void main(String[] args) {
		String s = "ASNKY002";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// char ch= s.charAt(i);
			count++;
		}
		System.out.println(count);
	}
}
