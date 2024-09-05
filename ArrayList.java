import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
System.out.println("Initial size of arraylist :"+a.size());

a.add(0,"Yellow");
a.add(1,"Orange");

a.add(2,"red");
a.add(3,"Pink");
a.add(4,"White");
System.out.println(""+a);
System.out.println("Size of arrayList after 5 items added :"+a.size());
System.out.println("Item red is present in arraylist:"+a.contains ("Red"));
System.out.println("Item Blue is present in arraylist:"+a.contains("Blue"));
a.remove("White");
a.remove(2);
System.out.println("After remove of 2 elements from arraylist:"a.size());

	}
}
