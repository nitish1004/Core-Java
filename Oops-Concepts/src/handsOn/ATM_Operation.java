package handsOn;

public class ATM_Operation {
	public static void main(String[] args) {
		double dbpin=1004;
		double dbamount=1145;
		
		double pin=1004;
		if(dbpin==pin) {
			double amount=1000;
			if(dbamount>=amount) {
				System.out.println("Transaction successfull");
				System.out.println("Available balance ="+(dbamount-amount));
			}
			else
			{
			System.out.println("Insufficent balance");
			}
		}
		else
		{
			System.out.println("incorrect pin");
		}
	}

}
