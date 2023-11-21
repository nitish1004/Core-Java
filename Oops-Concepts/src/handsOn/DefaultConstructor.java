package handsOn;
//Constructor:-It is a special member function of class which has same name as that of the class
//It's used to initialization an object
//It will be called automatically when we instantiate the class
//It does not have any return type
//It does not have any modifiers but it allows access modifiers
//In java every class will have either user define constructor nor default constructor
public class DefaultConstructor {
	public String name;
	public int id;
	
	public DefaultConstructor() {
		//this.name=name;
		//this.id=id;
		name="Nitish Kuamr";
		id=1004;
	}
	public static void main(String[] args) {
		DefaultConstructor d=new DefaultConstructor();
		System.out.println("Name="+d.name);
		System.out.println("Id="+d.id);
	}

}
