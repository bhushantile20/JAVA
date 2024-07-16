import java.util.*;
class student
{
    public static void main(String args[])
    {
        Hashtable ht=new Hashtable();
        ht.put("abcd",1111);
        ht.put("xyzw",2222);
        System.out.println("Student details are as follows");
        Enumeration k=ht.keys();
        while(k.hasMoreElements())
        {
            String name=(String)k.nextElement();
            System.out.println("Student Name:"+name);
            System.out.println("Student contact no:"+ht.get(name));

        }
    }
}