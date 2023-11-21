package practices;

import java.util.Arrays;

public class SumofElementsInAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 6, 8, 9 };
		//arr[0]=1;
		int ayy[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				ayy[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(ayy));

	}

}
