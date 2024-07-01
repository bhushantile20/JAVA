class p10 extends Thread
{
     p10(String msg)
     {
         super(msg);
         start();

     }
     public void run()
     {
         try 
         {
             for(int i=3;i>0;i--)
             {
                 System.out.println("Thread Name:"+Thread.currentThread().getName());
                 Thread.sleep(1000);

             }
         }
         catch(InterruptedException e)
         { 
            System.out.println("Child interrupted");

         }

     }
}
class ThreadDemo
{
     public static void main(String args[])
{
     p10 t1=new p10("Thread 1");
     p10 t2=new p10("Thread 2");

}
}