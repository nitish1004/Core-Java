package ArrayPractices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestElementInArrayInJavaFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 30, 3, 7, 3 };
		List<Integer> list= Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list.stream().skip(1).findFirst().get());
	}
}
