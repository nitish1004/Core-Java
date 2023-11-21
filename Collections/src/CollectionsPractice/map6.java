package CollectionsPractice;

import java.util.TreeMap;

public class map6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "fears to leads to anger anger leads to hatred hatred leads to conflict leads to suffering";
		String st[]=s.split(" ");
		
		TreeMap<String, Integer> treemap=new TreeMap<>();
		for (int i = 0; i < st.length; i++) {
			if(treemap.containsKey(st[i])) {
				Integer integer=treemap.get(st[i]);
				treemap.put(st[i], integer+1);
			}else {
				treemap.put(st[i], 1);
			}
		}
		System.out.println(treemap);
		

	}

}
