package arraySearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}if(flag) {
			System.out.println("Iteam is found");
		}else {
			System.out.println("Iteam is not found");
		}

	}

}
