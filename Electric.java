public class Electric
{
     public static void main(String args[])
     {
         int units =123;
         int bill=0;
          
         if(units>100)
         {
             if(units>=200)
             {
                if(units>300)
                {
                     bill=units*8;

                }
                else
                bill=units*5;

             }
             System.out.println("Nashik electricity LTD,Nashik");
             System.out.println("Units consumed :"+units);
             System.out.println("Toal Bill:"+bill);
             
         }
     }
}