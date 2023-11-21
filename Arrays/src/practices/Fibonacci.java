package practices;

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int no = 8;
		int n3;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < no; i++) {
			n3 = n1 + n2;//2
			n1 = n2;//n1=1
			n2 = n3;//n2=1
			System.out.print(" " + n3);
		}

	}

}
