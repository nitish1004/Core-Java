package practices;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		//int num = 5;
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = i * fact;
		}
		System.out.println(fact);
	}
}