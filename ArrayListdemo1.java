import java.util.*;
class ArrayListdemo1 
{
	public static void main(String[] args) 
	{
	   ArrayList<String> a=new ArrayList<String>();
       System.out.println("Initial Size of arraylist:"+a.size());
a.add(0,"Yellow");
a.add(1,"Orange");
a.add(2,"Red");
a.add(3,"White");
a.add(4,"pink");
 System.out.println(""+a);

      String s;
     Iterator e=a.iterator();
 while (e.hasNext())
      {
         s=(String)e.next();
            System.out.println(s);
      }
	
}
}
