public class LCM {
    public static void main(String args[])
    {
         int a,b,x,y,t,hcf,lcm;
         x=6;
         y=10;
         a=x;
         b=y;
         while(b!=0)
         {
            t=b;
            b=a%b;
            a=t;

         }
         hcf=a;
         lcm=(x*y)/hcf;

         System.out.println("Hcf and lcm of:"+x+"and"+y+"is :\n");
         System.out.println("HCF ="+hcf);
         System.out.println("\n LCM="+lcm);
    }
}
