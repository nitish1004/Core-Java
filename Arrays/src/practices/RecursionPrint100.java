package practices;

public class RecursionPrint100 {
	
	public static void print(int b) {
		if(b>0) {
			System.out.print(b+" ");
			print(b-1);
		}
	}

	public static void main(String[] args) {
		print(10);

	}

}
