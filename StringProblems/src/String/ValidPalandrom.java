package String;

public class ValidPalandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String sr = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			sr = sr + ch;
		}
		System.out.println(sr);
		if (input.equals(sr)) {
			System.out.println("valid plindrome");
		} else {
			System.out.println("Not a valid plindrome");
		}

	}

}
