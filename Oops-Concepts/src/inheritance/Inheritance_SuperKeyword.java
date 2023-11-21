package inheritance;

class Animalia {
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}
	class bird extends Animalia {
	  @Override
	  public void eat() {
	    super.eat();
	    System.out.println("I eat parrot food");
	  }
	  public void bark() {
	    System.out.println("I can bark");
	  }
	}
public class Inheritance_SuperKeyword {
	public static void main(String[] args) {
		bird parrot = new bird();
	    parrot.eat();
	    parrot.bark();
	}

}
