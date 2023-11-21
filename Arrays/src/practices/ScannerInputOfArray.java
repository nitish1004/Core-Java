package practices;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInputOfArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
