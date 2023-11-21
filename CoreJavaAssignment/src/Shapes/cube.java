package Shapes;

public class cube extends shape{
	@Override
	void draw() {
		System.out.println("Cube");
	}
	
	public static void main(String[] args) {
		cube cube = new cube();
		cube.draw();
	}

}
