package practices;

import java.util.Arrays;

public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 8, 4 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}
		System.out.println(largest + "-----------------------by using itreator method");

		System.out.println(Arrays.stream(arr).max().getAsInt()+"--------------by using JAVA 8 feature");
	}

}
