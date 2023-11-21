package abstraction;

abstract class Bank{
	abstract int getRateOfInterest();
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class UB extends Bank{
	int getRateOfInterest() {
		return 3;
	}
}

public class TestBank {
	public static void main(String[] args) {
		Bank obj;
		obj=new SBI();
		//obj.getRateOfInterest();
		System.out.println(obj.getRateOfInterest());
		obj=new UB();
		System.out.println(obj.getRateOfInterest());
	}
}
