package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> score = new HashMap<>();
		score.put("akash", 100);
		score.put("nitish", 34);
		score.put("omprakash", 81);
		
		//condition based map
		//System.out.println(score);
		score.entrySet().removeIf(entry -> entry.getValue()<80);
		System.out.println(score);

	}

}
