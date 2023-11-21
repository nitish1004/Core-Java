package practices;

//PENDING

public class OddIndicesFollowedByEvenIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="India is my country";
		String even="";
		String odd="";
		
		String st[]=s1.split(" ");
		
		for(int i=0;i<st.length;i++) {
			if(i%2==0) {
				even=even+st[i]+" ";
			}else {
				odd=odd+st[i]+" ";
			}
		}System.out.println(odd.trim()+" "+even.trim());
	
	}
}
