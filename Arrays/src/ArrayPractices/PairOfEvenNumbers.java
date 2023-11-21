package ArrayPractices;

public class PairOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j< arr.length;j++) {
				if((arr[i]%2==0)&&(arr[j]%2==0)) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
