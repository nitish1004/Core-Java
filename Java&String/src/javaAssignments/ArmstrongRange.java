package javaAssignments;

public class ArmstrongRange 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to find armstrong number 100 to 999
		//153,370,371,407
		for(int k = 100;k <=1000;k++)
		{
			int n=k;
			int d=0;
			int s=0;
			while(n>0)
			{
				d=n%10;
				s=s+(d*d*d);
				n=n/10;
			}
			if(k==s)
			{
				System.out.println(k +" is Armstrong number");
			}
		}

	}

}
