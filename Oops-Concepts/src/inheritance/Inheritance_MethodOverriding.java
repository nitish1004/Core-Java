package inheritance;

//The method in the subclass overrides the method in the superclass. This concept is known as method overriding in Java.
public class Inheritance_MethodOverriding {
	public static void main(String[] args) {
		cat jack=new cat();
		jack.eat();
		jack.bark();
	}
}
class Animals{
	public void eat() {
		System.out.println("I can eat");
	}
}
class cat extends Animals{
	@Override
	public void eat() {
		System.out.println("I can drink and eat");
	}
	public void bark() {
		System.out.println("Meow Meow");
	}
}
