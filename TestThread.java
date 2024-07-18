class MyThread extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread()+"Thread is running");
    }
    }
class TestThread
{
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.start();
        MyThread t2=new MyThread();
        t2.start();
        
    }
}