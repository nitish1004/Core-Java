package handsOn;

public class SwapNumberWithoutTemp {
	public static void main(String[] args) {
		int x=22;
		int y=42;
		System.out.println("before swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("before swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
