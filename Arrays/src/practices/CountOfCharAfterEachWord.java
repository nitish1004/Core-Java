package practices;

public class CountOfCharAfterEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Tap academy";
		String st[]=s1.split(" ");
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+st[i].length()+" ");
		}	
	}
}