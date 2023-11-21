package handsOn;

//Method Overriding :- Changing the implementation of super class method in sub class
//We always override in the subclass
//While overriding we should maintain method signature same
//Private methods and constructor can not be inherited, Hence they can not be overridden
public class MethodOverride {
	public static void main(String[] args) {
		
		Parent p=new child();//upcasting
		p.trip();
		System.out.println();
		p=new Parent();
		p.trip();
		p.bike();
		System.out.println();
		p=new child1();//upcasting
		p.trip();
		p.bike();
		System.out.println();

		}
	}
class Parent{
	public void trip() {
		System.out.println("Lets go Trrupti");
	}
	public void bike() {
		System.out.println("No bike riding");
	}
}
class child extends Parent{
	@Override
	public void trip() {
		System.out.println("Lets go Goa");
	}
}
class child1 extends child{
	@Override
	public void bike() {
		System.out.println("Bike ride");
	}
}

