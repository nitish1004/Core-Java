package inheritance;

//Deriving properties from super class to subclass is called inheritance
//we can inherit by using EXTENDS keyword
//In java every class is subclass of object class 
//Final class can not be inherit 
//Except Private members and constructor every properties will be inherited from one class to another class
public class Inheritance {
	public static void main(String[] args) {
		dog labrador=new dog();
		labrador.name="Cooper";
		//System.out.println("My name is"+" "+labrador.name);
		labrador.display();
		labrador.eat();
	}
}
class Animal{
	String name;
	public void eat() {
		System.out.println("I eat pedigree");
	}
}
class dog extends Animal{
	public void display() {
		System.out.println("Sorry!!!"+"I eat non-veg");
		System.out.println("my name is="+name);
	}
}