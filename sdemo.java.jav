import java.util.*;
class sdemo
{
    public static void main(String args[])
    {
        Stack s=new Stack();
        int p;
        String str="hello";
        s.push(new Integer(10));
        s.push(new Float(4.5));


        s.push("hello");
        s.push("abx");

        System.out.println("Contenets of stack "+s);
        System.out.prinltn("The poped elements is"+s.pop());

        p=s.search(str);

        if(P!=-1)
        {
            System.out.println(str+"found at"+P);
            else 
            System.out.println(str+"Not found");
            
        }
    }
}