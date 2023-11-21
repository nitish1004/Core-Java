package handsOn;

public class SwapNumbersUsingTemp {
	public static void main(String[] args) {
	int a=19;
	int b=60;
	int temp=0;
	System.out.println("Before swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	//logic
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	}

}
