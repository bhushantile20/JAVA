class Message implements Runnable
{
    String msg;
    int n;
    Message(String m,int x)
    {
        msg =m;
        n =x;
    }
   public void run()
   {

    try
    {
        for(int i=0;i<n;i++)
        {
            Thread.sleep(2000);
            System.out.println(msg);

        }
    }catch(InterruptedException e){}
   }
}
class TestMessage
{
    public static void main(String args[])
    {
        Message m1=new Message("Welcome",50);
        Thread t1=new Thread(m1);
        t1.start();
    }
}