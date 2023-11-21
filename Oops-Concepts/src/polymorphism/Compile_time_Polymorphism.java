package polymorphism;
//Polymorphism:-"Many Forms" An Object showing different states in its different stages
//Compile_time_Polymorphism:- Its also called static polymorphism,
//In this type binding of method deceleration with the method definition is done by the complier during compilation time

//Overloading and Method Hiding are examples

public class Compile_time_Polymorphism {
	public static void main(String[] args) {
		Maths m=new Maths();//object created for accessing non static method
		System.out.println(m.multiply(2, 4));
		System.out.println(m.multiply(16.4, 47.2));
		System.out.println();
		System.out.println(Math.multiply(10, 20));
		System.out.println(Math.multiply(10.1, 20.1));
	}

}
class Maths{
	//By using non static methods
	public int multiply(int a, int b) {
		return a+b;
	}
	public double multiply(double a, double b) {
		return a+b;
	}
}

class Math{
	//by using static methods
	public static int multiply(int a, int b) {
		return a+b;
	}
	public static double multiply(double a, double b) {
		return a+b;
	}
}
