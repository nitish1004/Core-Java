package ArrayPractices;

public class HigestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		//int highestNum=0;//can be declare like this also 
		int highestNum=arr[0];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>highestNum) {
				highestNum=arr[i];
			}
		}System.out.println(highestNum);
	}

}
