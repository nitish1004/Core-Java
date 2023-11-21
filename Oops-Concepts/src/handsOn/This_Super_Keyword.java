package handsOn;
//This is a keyword used to refer the current object
//This keyword should used either inside the constructor nor Non-static() but can not be used inside the static()
public class This_Super_Keyword {
	public static void main(String[] args) {
		BB b=new BB();
		b.display();
	}

}
class AA{
	public int x=4;
	public void print() {
		System.out.println("Its print method");
	}
}
class BB extends AA{
	public int x=40;
	public void display() {
		int x=10;//local variable
		System.out.println("x="+x);//10
		System.out.println("this.x="+this.x);//40
		System.out.println("super.x="+super.x);//4
		super.print();
	}
}
