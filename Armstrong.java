public class Armstrong
{
     public static void main(String args[])
     {
         int n,arg,sum=0,r;

         n=153;
         arg=n;
         for(int i=1;i<n;i++)
         {
             while(n>0)
             {
                 r=n%10;
                 sum=sum+(r*r*r);
                 n=n/10;

             }
             if(arg==sum)
             {
                System.out.println("Given numbers is armstrong number:"+arg);

             }
             else
                   {
                    System.out.println("Give number is not armstrong number:"+arg);
                 }
         }
     }
}