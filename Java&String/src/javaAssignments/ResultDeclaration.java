package javaAssignments;

import java.util.Scanner;

public class ResultDeclaration {
	public static void main(String[] args)
	{
		
		Scanner Subject01 = new Scanner(System.in);
		System.out.println("Enter Marks of Subject 01 : ");
		int a= Subject01.nextInt();
		Scanner Subject02 = new Scanner(System.in);
		System.out.println("Enter Marks of Subject 02 : ");
		int b= Subject02.nextInt();
		Scanner Subject03 = new Scanner(System.in);
		System.out.println("Enter Marks of Subject 03 : ");
		int c= Subject03.nextInt();
		
		if(a>60 && b>60 && c>60)
		{
			System.out.println("Passed");
		}
		else if(a>60 && b>60 && c<60 || a<60 && b>60 && c>60 || a>60 && b<60 && c>60)
		{
			System.out.println("Promoted");
		}
		else 
		{
			System.out.println("Failed");
		}
	}
}
