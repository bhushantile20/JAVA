import java.util.*;

class SumThread extends Thread{
    int x[];
    int l;
    int u;
    int total;

    public SumThread(int a[],int l,int u){
        x = a;
        this.l = l;
        this.u = u;
    }
    public void run(){  //job/task
        for(int i=l;i<=u;i++){
            total = total + x[i];
        }
    }
}
class TestSumThread{
    public static void main(String args[]){
        int a[] = new int[20];
        Random r = new Random();
        int i;
        for(i=0;i<20;i++){
            a[i] = r.nextInt(10);
        }

        System.out.println("All 20 numbers are as follows:");
        for(i=0;i<20;i++)
            System.out.print(a[i]+" ");
        System.out.println();

        // SumThread st1 = new SumThread(a,0,3);
        // SumThread st2 = new SumThread(a,4,7);
        // SumThread st3 = new SumThread(a,8,11);
        // SumThread st4 = new SumThread(a,12,15);
        // SumThread st5 = new SumThread(a,16,19);

        int x = 0, y = 3;
        SumThread st[] = new SumThread[5];  //array of references
        for(i=0;i<5;i++){
            st[i] = new SumThread(a,x,y);
            x = x+4;
            y = y+4;
        }


        // st1.start();
        // st2.start();
        // st3.start();
        // st4.start();
        // st5.start();
        for(i=0;i<5;i++)
            st[i].start();


        try{
            // st1.join();
            // st2.join();
            // st3.join();
            // st4.join();
            // st5.join();
            for(i=0;i<5;i++)
                st[i].join();
        }catch(InterruptedException ie){}


        // System.out.println("Sum by Child1 : "+st1.total);
        // System.out.println("Sum by Child2 : "+st2.total);
        // System.out.println("Sum by Child3 : "+st3.total);
        // System.out.println("Sum by Child4 : "+st4.total);
        // System.out.println("Sum by Child5 : "+st5.total);
        for(i=0;i<5;i++)
            System.out.println("Sum by Child"+(i+1)+" : "+st[i].total);
            
        int grandtotal = 0;
        // grandtotal = st1.total + st2.total + st3.total + st4.total + st5.total;
        for(i=0;i<5;i++)
            grandtotal = grandtotal + st[i].total;


        System.out.println("Total : "+grandtotal);
    }
}