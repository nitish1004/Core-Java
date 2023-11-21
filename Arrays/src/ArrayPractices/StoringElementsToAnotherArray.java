package ArrayPractices;

import java.util.Arrays;

public class StoringElementsToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int ayy[] = new int[arr.length];
		for (int i = 0; i < ayy.length; i++) {// to iterate based on index
			ayy[i] = arr[i];
		}
		System.out.println(Arrays.toString(ayy));
	}
}
