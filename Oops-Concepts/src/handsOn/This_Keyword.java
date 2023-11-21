package handsOn;
//this keyword refer to current object
public class This_Keyword {
	public static void main(String[] args) {
		AAA a=new AAA(12,45);
		AAA a1=new AAA(35,56);
		a.print();
		a1.print();
	}

}
class AAA{
	public int x,y;
	AAA(int x,int y){
	this.x=x;
	this.y=y;
	}
	public void print() {
		System.out.println(x+" "+y);
		System.out.println(this.x+" "+this.y);
	}
}
