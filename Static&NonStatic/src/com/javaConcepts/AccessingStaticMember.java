package com.javaConcepts;


public class AccessingStaticMember {
public static void main(String[] args) {
	System.out.println("Me="+Me.x);
	System.out.println();
	System.out.println("You="+You.y);
	System.out.println();
	Me.print();
	System.out.println();
	You.disp();
}
}
class Me
{
	public static final int x=10;
	public static void print() {
		System.out.println("It's Me class");
	}
}
class You
{
	public static double y=14.45;
	public static void disp() {
		System.out.println("I am in You class" );
	}
}