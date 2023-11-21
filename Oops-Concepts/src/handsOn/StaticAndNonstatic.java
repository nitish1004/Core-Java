package handsOn;

public class StaticAndNonstatic {
	public static void main(String[] args) {
		Student s1,s2,s3;
		s1=new Student();
		s2=new Student();
		s3=new Student();
		new Student();
		s1.name="Nitish Kumar";
		s1.usn="321710801004";
		s1.marks=38.45;
		
		s2.name="Samapth kumar";
		s2.usn="321710801112";
		s2.marks=60.4;
		
		s3.name="Suhas";
		s3.usn="321710801345";
		s3.marks=96.5;
		
		System.out.println("name="+s1.name);
		System.out.println("usn="+s1.usn);
		System.out.println("marks="+s1.marks);
		System.out.println("CName="+s1.CName);
		System.out.println("DepName="+s1.DepName);
		System.out.println();
		System.out.println("name="+s2.name);
		System.out.println("usn="+s2.usn);
		System.out.println("marks="+s2.marks);
		System.out.println("CName="+s2.CName);
		System.out.println("DepName="+s2.DepName);
		System.out.println();
		System.out.println("name="+s3.name);
		System.out.println("usn="+s3.usn);
		System.out.println("marks="+s3.marks);
		System.out.println("CName="+s3.CName);
		System.out.println("DepName="+s3.DepName);
	}
}

class Student
{
	String name;
	String usn;
	double marks;
	public static String CName="Gitam";
	public static String DepName="Mechanical";
}
