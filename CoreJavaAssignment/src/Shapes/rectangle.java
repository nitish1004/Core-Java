package Shapes;

public class rectangle extends shape {
	@Override
	void draw() {
		System.out.println("Rectangle");
	}
	
	public static void main(String[] args) {
		rectangle rect = new rectangle();
		rect.draw();
	}
}
