import java.lang.Thread.*;
class NewThread implements Runnable
{
Thread t;
String name;

Newthread(String s)
{
 name=s;
   t=new Thread(this.name);
System.out.println("New THread:"+t);
t.start();
}

public void run()
{
 try{
  for(int i=10;i>0;i--)
{
  System.out.println(name+" :"+i);
Thread.sleep(200);
}
}
catch(InterruptedException e){}
System.out.println("Finally "+Thread.currentThread().getName()+" exited..");
}
}
public class MultiThread
{
public static void main(String args[])
{
System.out.println("Thread Name:" +Thread.currentThread().getName());
Newthread Nt1=new Newthread("First");
Newthread Nt2=new Newthread("Second");

try{
    Thread.sleep(1000);
     Nt1.t.suspend();
System.out.println("Suspending Thread First");
Thread.sleep(1000);
Nt1.t.resume();

System.out.println("Resuming Thread First:");
Nt2.t.suspend();

System.out.println("Suspending Thread Second:");
Threads.sleep(1000);
Nt2.t.resume();

System.out.println("Resumeing Thread Second:");
}
 try
 {
	System.out.println("Waiting for Thread Finsihed ");
Nt1.t.join();
Nt2.t.join();
}
catch(InterruptedException e)
{}
 }
}


