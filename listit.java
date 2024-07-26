import java.util.*;  
class listit 
     
{
     
	public static void main(String[] args) 
     
	{
     
	 LinkedList l=new LinkedList();
     
     l.add("one");
     
     l.add("two");
     
     l.add("three");
     
     l.add("four");
     
      
     
ListIterator t1= l.listIterator();
     
      
     
while(t1.hasNext())
     
      
     
{
     
      
     
System.out.println(t1.next());
     
      
     
}
     
      
     
while(t1.hasPrevious())
     
      
     
{
     
      
     
  System.out.println(t1.previous());
     
      
     
}
     
      
     
	}
     
      
     
}
     
      
     
