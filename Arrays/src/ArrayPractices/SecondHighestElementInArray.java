package ArrayPractices;

import java.util.Arrays;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 22, 11, 5, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {// decending order
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
		// System.out.println(arr[arr.length-2]);//to print from last to second element
	}
}
