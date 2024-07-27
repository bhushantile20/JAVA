
class A17
{
 static int a=10;
  int x=20;
 static void m1()
{
System.out.println("A mq");
}
 void m2()
{
System.out.println("A m2");
}
void m3()
{
System.out.println("A m3");
 
System.out.println("A a:"+a);
System.out.println("A x:"+x);
m1();
m2();
}
}

class B17 extends A17
{

static int a=60;
int x=60;

static void m1()
{
System.out.println("B m1");

}
void m2()
{
System.out.println("B m2:");

System.out.println("B a:"+a);
System.out.println("B x:"+x);
}
void m4()
{
super.a=a-10;
super.x=x-10;
}
}


class TestAB17
{

public static void main(String args[])
{
 B17 b1=new B17();
 B17 b2=new B17();
 B17 b3=new B17();

 b1.a=15;
 b1.x=16;
 b2.a=18;
b2.x=19;

b1.m4();
b2.m4();

b1.m3();
System.out.println();
b2.m3();

System.out.println();

System.out.println(b1.a);
System.out.println(b1.a);

System.out.println(b1.x);
System.out.println(b1.x);
}

}