package practices;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 8, 9 };
		int mult = 1;

		for (int i = 0; i < arr.length; i++) {
			mult = arr[i] * mult;
		}

		System.out.println(mult);
	}

}
