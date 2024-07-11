public class thread extends Thread {
    String str;
    int n;

    A1(String str ,int n)
    {
        this.str=str;
        this.n=n;

    }

    public void run()
    {
        try{
            for(int i=0;i<n;i++)
            {
                System.out.println(getName()+":"+str);

            }

        }
    
    catch(Exception e)
    {
        e.printStackTrace();
    }
}


public static void main(String args[])
{
     thread t1=new thread("Bhushan",10);
     thread t2=new thread("siddhesh",20);
     thread t3=new thread("Kiran",30);

     t1.start();
     t2.start();
     t3.start();
}
}