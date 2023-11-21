package polymorphism;
//Polymorphism:-"Many Forms" An Object showing different states in its different stages
//Compile_time_Polymorphism:- Its also called dynamic polymorphism,
//In this type binding of method deceleration with the method definition is done by the JVM during runtime based on the runtime object 
//Overriding is best example


public class Run_time_Polymorphism {
	public static void main(String[] args) {
		Bank b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();//upcasting  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  //upcasting
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
		}  
	}

class Bank{  
float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank{  
float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends Bank{  
float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends Bank{  
float getRateOfInterest(){return 9.7f;}  
}  

