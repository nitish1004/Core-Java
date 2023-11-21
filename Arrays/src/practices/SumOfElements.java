package practices;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 8, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;

		}
		System.out.println(sum);

	}

}
