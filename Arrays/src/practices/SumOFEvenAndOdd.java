package practices;

public class SumOFEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 8, 9 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = arr[i] + sum;
			}
		}
		System.out.println(sum);
	}

}
