package handsOn;

//It is to initialize the object with different value
public class ParameterisedConstructor{ /*{
	public static void main(String[] args) {
		
		Student s1=new Student("Nitish",1004,56.7);
		  System.out.println("Name="+s1.name);
		  System.out.println("Id="+s1.id);
		  System.out.println("Marks="+s1.marks);
		 
	}
}

class Student{
	public String name;
	public int id;
	public double marks;
	
	public Student(String name, int id, double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}}*/
int id;
double marks;
ParameterisedConstructor(int id, double marks){
	this.id=id;
	this.marks=marks;

}
public void display()
{
	System.out.println(id+" "+marks);
}
public static void main(String[] args) {
	ParameterisedConstructor pm=new ParameterisedConstructor(1004,464.32);
	ParameterisedConstructor pm1=new ParameterisedConstructor(323,484.48);
	pm.display();
	pm1.display();
	
}

}
