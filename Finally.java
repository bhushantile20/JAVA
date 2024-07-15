public class Finally
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Inside try block");
            int data=25/0;
            System.out.println(data);

        }

        catch(ArithmeticException e)
        {
            System.out.println("Exception handled");
            System.out.println(e);
        }Finally{
            System.out.println("Finally block is always executed:");
        }

        System.out.println("Rest of the code....");
    }

}