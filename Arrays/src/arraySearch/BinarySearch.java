package arraySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int beg = 0;
		int end = arr.length - 1;
		int mid = 0;
		boolean flag = false;
		while (beg <= end) {
			mid = (beg + end) / 2;
			if (no == arr[mid]) {
				flag = true;
				break;
			} else if (no > arr[mid]) {
				beg = mid + 1;
			} else if (no < arr[mid]) {
				end = mid - 1;
			}
		}
		if (flag) {
			System.out.println("Item is found");
		} else {
			System.out.println("Item is not found");
		}
	}

}
