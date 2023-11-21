package String;

import java.util.Arrays;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Akash";
		String st[]= s.split(" ");
		//System.out.println(Arrays.toString(st));
		System.out.println(st[st.length-1].length()+"="+st[st.length-1]);
	}

}
