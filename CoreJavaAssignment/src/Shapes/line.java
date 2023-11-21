package Shapes;

public class line extends shape{
	@Override
	void draw() {
		System.out.println("Line");
		
	}
	
	public static void main(String[] args) {
		line line = new line();
		line.draw();
	}
}
