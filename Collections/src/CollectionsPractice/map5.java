package CollectionsPractice;

import java.util.LinkedHashMap;

public class map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3, 9 };

		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (lhm.containsKey(arr[i])) {
				Integer integer = lhm.get(arr[i]);
				lhm.put(arr[i], integer + 1);
			} else {
				lhm.put(arr[i], 1);
			}

		}
		System.out.println(lhm);

	}

}
