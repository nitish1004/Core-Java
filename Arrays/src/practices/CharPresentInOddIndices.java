package practices;

import java.util.Scanner;

public class CharPresentInOddIndices {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.nextLine();
		String s1="";
		
		for (int i = 0; i < input.length(); i++) {
			if(i%2==1) {
				s1=s1+input.charAt(i)+" ";
			}
		}
		if(s1.length()>0) {
			System.out.println(s1.trim());
			System.out.println(s1.length());
		}else {
			System.out.println("No character found at odd indices");
		}

	}

}
