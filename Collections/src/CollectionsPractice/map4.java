package CollectionsPractice;

import java.util.LinkedHashMap;

public class map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="nitishkumar";
		
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(lhm.containsKey(c)) {
				Integer integer = lhm.get(c);
				lhm.put(c, integer+1);
			}else {
				lhm.put(c, 1);
			}
			
		}
		System.out.println(lhm);

	}

}
