//Thread
class p8 extends Thread{
     public void run()
     {
         try{
             for(int i=5;i>0;i--)
             { 
                System.out.println("Child Thread:"+i);
                Thread.sleep(500);
             }
         }
         catch(InterruptedException e)
         {
             System.out.println("child interrupted ");

         }
         System.out.println("Exiting child Thread");

     }
}
class ThreadDemo
{
     public static void main(String args[])
     {
               p8 t=new p8();
               t.start();
     }
}