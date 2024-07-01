public class p5 extends Thread
{
     char c;
     public void run()
     {
         for(c='A';c<='Z';c++)
         {
            System.out.println(""+c);
            try{
                 Thread.sleep(3000);

            }
            catch(Exception e)
            {
                 e.printStackTrace();

            }
         }
     }


public static void main(String argsp[])
{
     p5 t=new p5();
     t.start();

}
}
