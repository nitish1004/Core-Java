package handsOn;

public class AccessingStatic {

	public static void main(String[] args) {
		System.out.println("x="+Nitish.x);
		System.out.println("y="+Kumar.y);
		Nitish.print();
		Kumar.disp();
	}
}

class Nitish
{
	public static final int x=10;
	public static void print()
	{
		System.out.println("I am in Nitish class");
	}
}

class Kumar
{
	public static double y=25.43;
	public static void disp()
	{
		System.out.println("I am in Kumar class");
	}
}
