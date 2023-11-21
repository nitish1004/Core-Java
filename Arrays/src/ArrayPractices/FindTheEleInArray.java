package ArrayPractices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheEleInArray {
	public static void main(String[] args) {
		Integer [] arr = { 3, 4, 2, 5, 8, 9 };
		List<Integer> list = Arrays.asList(arr);

		int firstLeast = list.stream().sorted(Comparator.naturalOrder()).findFirst().get();//Ascending order of array
		System.out.println(firstLeast);
		System.out.println("-------------------");
		int firstTop = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();//reverse order of array
		System.out.println(firstTop);
		System.out.println("-------------------");
		int secondLeast = list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();//second least element of the array
		System.out.println(secondLeast);
		System.out.println("-------------------");
		List<Integer> sorted =list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sorted);
	}
}