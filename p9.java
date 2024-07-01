//Runnble
class p9 implements Runnable 
{
     public void run()
     { 
        try
        {
             for(int i=5;i>0;i--)
             {
                 System.out.println("Child Thread :" +i);
                 Thread.sleep(500);

             }
        }
        catch(InterruptedException e)
        {
             System.out.println("Child interrupted");

        }
        System.out.println("Exitng child Thread");
    }
}
class ThreadDemo
 {
    public static void main(String args[])

    {
         p9 ob=new p9();
         Thread t=new Thread(ob);
         t.start();

    }
 }

