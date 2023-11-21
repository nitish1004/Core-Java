package encapsulation;
//Binding of data members and methods together into single entity is called encapsulation
//A jar file is also an encapsulation of byte code files

//Java Bean Class:-writing public class with private data members ,public constructor, getter and setters
//We write java been class to achieve DATA ACCESS OBJECT
//Java been class is very good example of Encapsulation and Data Hiding

//Data Hiding:-Hiding the data members of the class from outside the class
//We can Hide data members using private access specifier
public class JavaBean_classOfStudent {
	public static void main(String[] args) {
		Student s=new Student("Nitish",1004);
		System.out.println(s.getId());
		System.out.println(s.getName());
		Student s1=new Student("Legolas",1005);
		System.out.println();
		System.out.println(s1.getName()+" "+s1.getId());
	}
}
class Student{
	private String name;
	private int id;
	
	public Student(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
