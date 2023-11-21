package abstraction;

//Abstraction:-Hiding the implementation of an object and showing only functionality
//Abstract class contains static members which can be  by using class name 
//We can not declare abstract class as final because we provide the implementation for the abstract class in the sub class ,but we cant't abstract method in the subclass since its final 
//We can not create an object of abstract class 

public class Abstract_Class {
	public static void main(String[] args) {
		Pig p=new Pig();
		p.animalSound();
		p.sleep();
	}
}
 abstract class Animal{
	 public abstract void animalSound();//abstract method(does not have any body)
	 public void sleep()//normal method
	 {
		 System.out.println("Zzz");
	 }
 }
class Pig extends Animal{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	
}