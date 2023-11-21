package practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 8, 4 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr) + "------------> by using Arrays inbulit method");

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i]; // temp=3
					arr[i] = arr[j]; // arr[i]=2
					arr[j] = temp; // arr[j]=3
				}
			}
		}
		System.out.println(Arrays.toString(arr) + "-------------------------------------");

		List<Integer> list = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
		System.out.println(list);

	}

}
