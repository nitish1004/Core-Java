package ExceptionalHandling;

public class finallyException 
{
    public static void main(String args[]) 
    {
    try
    {
        int num=Integer.parseInt("Hello");
        System.out.println(num);
    }
    finally
    {
        System.out.println("Finally block will always executed");
    }
    }
}