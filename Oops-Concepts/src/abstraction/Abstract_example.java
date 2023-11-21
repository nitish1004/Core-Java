package abstraction;

abstract class Bike{
	 abstract void run();
}

public class Abstract_example extends Bike{
	void run() {
		System.out.println("Bike is running successfully");
	}
	public static void main(String[] args) {
		Bike obj=new Abstract_example();
		obj.run();
	}

}
