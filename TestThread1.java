class MyThread implements Runnable

{
    public void run()
    {
        System.out.println(Thread.currentThread()+"Thread is  Running ");

    }
}
 class TestThread{
    public static void main(String args[])
 {
    MyThread mt1=new MyThread();
    Thread t1=new Thread(mt1);
        t1.start();
    MyThread mt2=new MyThread();
    Thread t2=new Thread(mt2);
        t2.start();
 }
 }