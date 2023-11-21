package HierarchyOfOrganization;

import java.util.Scanner;

public class labour extends employee {
	
	public void TotalSalary(int salary) {
		System.out.println("Labour Salary : " + (1.5*salary));
	}
	
	public static void main(String[] args) {
		labour labour = new labour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int Salary = sc.nextInt();
		labour.TotalSalary(Salary);	
	}

}
