public class FinalExampleTest

{
    final int age=18;
    void display()
    {

        age=55;
    }

    public static void main(String args[])
    {

        FinalExampleTest obj=new FinalExampleTest();
        obj.display();
    }
    }