class p11 implements Runnable{
     public void run()
     {
         try {
             for(int i=3;i>0;i--)
             {
                 System.out.println("test1 class "+i);
                 Thread.sleep(500);

             }
            }
             catch(InterruptedException e)
             {
                 System.out.println("Child Interrupted");
             }
         
     }
     class test2 implements Runnable
     {
         public void run()
         {
             try{
                 for(int i=3;i>0;i--)
                 {
                     System.out.println("test2 class :"+i);
                     Thread.sleep(500);
                 }
             }
             catch(InterruptedException e)
             {
                System.out.println("Child interrupted ");
             }
         }
     }
     class Demo
     {
        public static void main(String args[])
        {
             p11 ob1=new p11();
             Thread t1=new Thread(ob1);                                                                       
             t1.start();

             p11 ob2=new p11();
             Thread t2=new Thread(ob2);
             t2.start();
        }
     }
}