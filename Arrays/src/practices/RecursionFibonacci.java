package practices;

public class RecursionFibonacci {
	
	static int n1=0;
	static int n2=1;
	public static void print(int b) {
		int n3;
		if(b>2) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			print(b-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(n1+" "+n2);
		print(9);
	}

}
