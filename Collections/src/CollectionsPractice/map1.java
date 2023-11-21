package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		
		System.out.println(map);
		map.entrySet().forEach(entry -> 
		System.out.println(entry.getKey()+"---"+ entry.getValue()));
		
	}

}
