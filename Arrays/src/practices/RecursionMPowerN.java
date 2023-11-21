package practices;

public class RecursionMPowerN {

	public static int print(int m, int n) {
//		if(n==0) {
//			return 1;
//		}else {
//			return print(m,(n-1))*m;
//		}
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * m;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print(2, 5));
		System.out.println(Math.pow(2, 5) + "----------------by using inbuilt power method");

	}

}
