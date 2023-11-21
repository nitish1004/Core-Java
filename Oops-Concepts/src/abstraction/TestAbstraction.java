package abstraction;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}

public class TestAbstraction {
	public static void main(String[] args) {
		Shape obj1,obj2;
		obj1=new Rectangle();
		obj1.draw();
		obj2=new Circle();
		obj2.draw();
		
	}

}
