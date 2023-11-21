package arraySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println("Enter the Input");
		String input = sc.nextLine();
		// String s = "Akash Is Brilliant Boy";
		// String input = "is";
		boolean flag = false;
		String st[] = s.toLowerCase().split(" ");
		System.out.println(Arrays.toString(st));
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals(input)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("yes");
		}
	}

}
