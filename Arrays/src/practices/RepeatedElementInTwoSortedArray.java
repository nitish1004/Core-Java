package practices;

import java.util.Scanner;

public class RepeatedElementInTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int num1 =sc.nextInt();
		int arr[]=new int[num1];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int num2=sc.nextInt();
		int arr2[]=new int[num2];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int k=0,l=0;
		while(k<arr.length&&l<arr2.length) {
			if(arr[k]==arr[l]) {
				System.out.print(arr[k]+" ");
				l++;
				k++;
			}else if(arr[k]<arr2[l]) {
				k++;
			}else {
				l++;
			}
		}

	}

}
