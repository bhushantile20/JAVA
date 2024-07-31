class A extends Thread
{
public void run()
{
 for(int i=1; i<=5;i++)
{
   System.out.println("\t From Thread: i=" +i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
 
public void run()
{
 for(int j=1; j<=5;j++)
{
 System.out.println("\t From Thread B:j="+j);
}

System.out.println("Exit from B:");
}
}
class B extends Thread
{
 public void run()
{
 for(int k=1;k<=5;k++)
{
  System.out.println("\t From ThreadC: k=" +k);
}
System.out.println("Exit from c:");

}
}
 class ThreadTest
{
    new A().start();
    new B().start();
    new C().start();
}
}