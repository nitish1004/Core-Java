package CollectionsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("akash", 100);
		map.put("nitish", 34);
		map.put("omprakash", 81);
		map.put("omprakash", 81);
		map.put("omprakash", 81);

		//condition based map
		Set<Integer> set=new HashSet<Integer>();
		//System.out.println(score);
		map.values().removeIf(value-> !set.add(value));
		System.out.println(set);

	}

}
