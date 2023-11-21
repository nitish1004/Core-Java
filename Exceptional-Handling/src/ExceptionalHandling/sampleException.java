package ExceptionalHandling;

public class sampleException 
{
    public static void main(String args[])
    {
   //String str=null;
  // System.out.println(str.length());
    try
    {
        int a=10, b=0;
        int c=a/b;
        System.out.println("Result="+c);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Number can not be divide by zero");
    }
    try
    {
        int num=Integer.parseInt("Hello");
        System.out.println(num);
    }
    catch(NumberFormatException e)
    {
        System.out.println("Number Format Exception");
    }
    try
    {
        int a[]=new int[5];
        a[10]=44;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array Index Out Of Bounds Exception");
    }
    }
}
