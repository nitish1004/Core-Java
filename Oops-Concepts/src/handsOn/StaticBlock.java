package handsOn;

public class StaticBlock {
	static 
	{
		System.out.println("I am Static block");
	}
	{
		System.out.println("I am not static block");
	}
	public static void main(String[] args) {
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
		System.out.println("I am in main method");
	}
}
