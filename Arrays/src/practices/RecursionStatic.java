package practices;

public class RecursionStatic {
	//static int x = 0;

	public static int print(int n) {
		int x = 0;
		if (n > 0) {
			x++;
			System.out.println(x);
			return print(n - 1) + x;
		}
		return n;
	}
	public static void main(String[] args) {
		print(5);

	}

}
