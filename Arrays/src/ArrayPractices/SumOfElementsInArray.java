package ArrayPractices;

import java.util.Arrays;

public class SumOfElementsInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count = count + arr[i];
		}
		System.out.println(count);// normal sum
		System.out.println("----------------");
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}
