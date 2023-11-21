package handsOn;
//Writing multiple constructor with different signature(Length,Order,Type)
//Constructor Overloading helps us to create multiple object with different length and type of arguments
public class ConstructorOverloading {
	public String name;
	public int id;
	
	public ConstructorOverloading(String name, int id) {
		this.name=name;
		this.id=id;
	}
	ConstructorOverloading(){
	}
	ConstructorOverloading(String name){
		this.name=name;
	}
	ConstructorOverloading(int id){
		this.id=id;
	}
	ConstructorOverloading(int id,String name){
		this.id=id;
		this.name=name;
	}	
	/*
	 * public void print() { System.out.println(name+" "+id); }
	 */
	
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading("nitish",20);
		ConstructorOverloading co1=new ConstructorOverloading("nitish");
		ConstructorOverloading co2=new ConstructorOverloading(20);
		ConstructorOverloading co3=new ConstructorOverloading(20,"nitish");
		/*
		 * co.print(); co1.print(); co2.print(); co3.print();
		 */
		System.out.println("Name="+co.name+" "+"id="+20);
		System.out.println("Name="+co1.name);
		System.out.println("Id="+co2.id);
		System.out.println("Id="+co3.id+" "+"Name="+co3.name);
	}
}
