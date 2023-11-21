package ArrayPractices;

import java.util.Arrays;

public class InsertElementToParticularIndexInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int ayy[] = new int[arr.length + 1];
		int index = 3;
		int insert = 3;

		for (int i = 0; i < ayy.length; i++) {
			if (i == index) {
				ayy[i] = insert;
			} else if (i < index) {
				ayy[i] = arr[i];
			} else if (i > index) {
				ayy[i] = arr[i - 1];
			}
		}
		System.out.println(Arrays.toString(ayy));
	}
}
