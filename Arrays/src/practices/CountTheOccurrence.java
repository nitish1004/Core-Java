package practices;

public class CountTheOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abababab";
		String s2="aba";
		int count=0;
		for (int i = 0; i <= s1.length()-s2.length(); i++) {
			if(s1.substring(i, i + s2.length()).equals(s2)) {
				count++;
			}
		}System.out.println(count);

	}

}
