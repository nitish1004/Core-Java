package String;

import java.util.Iterator;

public class ReversString {

	public static void main(String[] args) {
		String s1 = "JAVA";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		System.out.println("===========================");
		for (int i = s1.length()-1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
