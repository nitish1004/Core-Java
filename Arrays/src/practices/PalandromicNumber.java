package practices;

public class PalandromicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 121215;
		String st=Integer.toString(i);
		System.out.println("by using stringbuilder class");
		String sb=new StringBuilder(st).reverse().toString();
		System.out.println("--------->");
		String rev ="";
		for (int j= st.length()-1;j>=0; j--) {
			char ch=st.charAt(j);
			rev=rev+ch;
			
		}System.out.println(rev);
		if(rev.equals(st)) {
			System.out.println("It is palandrome");
		}else {
			System.out.println("It is not palandrome");
		}

	}

}
