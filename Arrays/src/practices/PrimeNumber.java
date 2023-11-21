package practices;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (i % 2 != 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not a prime number");

		}

	}
}
