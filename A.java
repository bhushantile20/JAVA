class A
{
    static int a=10;
    int x=20;

    static class B{
        static int a=50;
        int x=60;

        void m1()
        {
            System.out.println(a);
            System.out.println(x);

            A a=new A();
            System.out.println(A.a);
            System.out.println(a.x);


        }
    }

    void m2()
    {
        System.out.println(a);
        System.out.println(x);

        B b=new B();
        System.out.println(B.a);
        System.out.println(b.x);

    }

    public static void main(String args[])

    {

        A a=new A();
        a.m2();

        B b=new B();
        b.m1();
    }
}

class Test
{
    public static void main(String argsp[])
    {
        A a1=new A();
        A.B b1=new A.B();

        System.out.println(A.a);
        System.out.println(b1.x);
        System.out.println(b1.x);
    }
}