package handsOn;

public class AccessingNonStatic {
	public static void main(String[] args) {
		A a1,a2,a3;
		a1=new A();
		a2=new A();
		a3=new A();
		new A();
		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(a3.x);
		
		a1.print();
		a2.print();
		a3.print();
	}
}
class A
{
	int x=29;
	public void print() 
	{
		System.out.println("I am in A class");
	}
}
