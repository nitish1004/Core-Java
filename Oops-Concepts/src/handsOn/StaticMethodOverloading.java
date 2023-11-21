package handsOn;
//Writing multiple method with same name but different signature
public class StaticMethodOverloading {
	public static void method() {
		System.out.println("StaticMethodOverloading.method() called");
	}
	public static void method(int a) {
		System.out.println("StaticMethodOverloading.method(int) called");
	}
	public static void method(int a,String name) {
		System.out.println("StaticMethodOverloading.method(int,name) called");
	}
	public static void main(String[] args) {
		StaticMethodOverloading.method();
		StaticMethodOverloading.method(1004);
		StaticMethodOverloading.method(1004,"Nitish");
	}

}
