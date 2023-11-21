package inheritance;

class Animala {
	  protected String name;

	  protected void display() {
	    System.out.println("I am an animal.");
	  }
	}

	class Horse extends Animala {

	  public void getInfo() {
	    System.out.println("My name is " + name);
	  }
	}

public class Inheritance_protectedMembers {
	public static void main(String[] args) {
		Horse friesian=new Horse();
		friesian.name="Tony";//Here, we are able to access the protected field and method of the superclass using the friesian object of the subclass
		friesian.display();
		
		friesian.getInfo();
	}

}
