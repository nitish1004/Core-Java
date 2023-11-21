package practices;

public class RecursionFactorial {

	public static int print(int num) {
		if (num > 1) {
			return print(num - 1) * num;
		} else {
			return num;
		}

	}

	public static void main(String[] args) {
		System.out.println(print(4));

	}

}
