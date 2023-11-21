package ArrayPractices;

public class SubElementsAndMatchTOGivenInput {
	public static void main(String[] args) {
		int arr[] = { 3, 1, 5, 4, 2 };
		int k = 2;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) == k) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
