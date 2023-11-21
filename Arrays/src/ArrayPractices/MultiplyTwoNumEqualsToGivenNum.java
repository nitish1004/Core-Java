package ArrayPractices;

public class MultiplyTwoNumEqualsToGivenNum {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 3, 8, 9 };
		int k = 24;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] * arr[j] == k) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
