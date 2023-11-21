package ArrayPractices;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDepulicateElementsInArrayUsingMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 2, 3, 3, 5, 5, 5, 5, 6, 7, 8, 33, 9 };

		Map<Integer, Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map);
		map.forEach((element, count) -> {
			if (count > 1) {
				System.out.println(element + "=" + count);
			}
		}

		);
	}

}
