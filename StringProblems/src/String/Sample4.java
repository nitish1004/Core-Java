package String;

public class Sample4 {

	public static void main(String[] args) {
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		if (s1 == s2) {
			System.out.println("s1 and s2 equal");// objects with new keyword stored in non-constant pool area and duplicates are not allowed and create another object
		} else {
			System.out.println("s1 and s2 not equal");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 equal");
		} else {
			System.out.println("s1 and s2 not equal");
		}
	}

}
