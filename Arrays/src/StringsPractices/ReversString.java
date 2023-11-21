package StringsPractices;

public class ReversString {

	public static void main(String[] args) {
		String s = "NITISH";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println("This String is palandrome");
		} else {
			System.out.println("This String is not palandrome");
		}
	}
}
