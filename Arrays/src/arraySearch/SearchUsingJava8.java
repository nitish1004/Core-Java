package arraySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		boolean result = Arrays.stream(arr).boxed().anyMatch(x -> x == num);

		if (result) {
			System.out.println("Item is found");
		} else {
			System.out.println("Item not found");
		}
		sc.close();
	}

}
