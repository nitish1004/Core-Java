package StreamPractices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		
		list.stream().filter(i -> i%2==0).forEach(System.out::println);//using filter 
		
		System.out.println("---------------------");
		
		List<Integer> list2 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
	}

}
