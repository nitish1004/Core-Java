package ExceptionalHandling;

public class multipleTryCatchBlock 
{
    public static void main(String args[])
    {
    try
    {
        int num=Integer.parseInt("Hello");
        System.out.println(num);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Number can not be divide by zero");
    }
    catch(NumberFormatException e)
    {
        System.out.println("Number Format Exception");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array Index Out Of Bounds Exception");
    }
    }
}
