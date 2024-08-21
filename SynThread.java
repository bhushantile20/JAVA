class myThread extends Thread{
     Share s;
     MyThread(Share s,String str)
     {
         super(str);
         this.s=s;
         start();
     }
     public void run()
     {
         s.doword(Thread.currentThread().getName());

     }
}
class Share{
    
     public Synchronized void doword(String str)
     {
         for(int i=0;i<5;i++)
         {
             System.out.println("Started :"+str);
             try{
                Thread.sleep(100);

             }
             catch(Exception e){}

         }
     }
}
public class SynThread
{
     public static void main(String args[])
     {
        
         Share s=new Share();
         MyThread m1=new MyThread(s,"Thread1");
         MyTHread m2=new MyThread(s,"Thread2");
         MyThread m3=new MyThread(s,"Thread3");
     }
}