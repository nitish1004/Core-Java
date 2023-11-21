package HierarchyOfOrganization;

import java.util.Scanner;

public class manager extends employee{
	public void TotalSalary(int Salary) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the incentive");
		int incentive = sc.nextInt();
		System.out.println("Managers Salary : " + (Salary+incentive));
	}
	
	public static void main(String[] args) {
		manager manager = new manager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int Salary = sc.nextInt();
		manager.TotalSalary(Salary);	
	}
}
