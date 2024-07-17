import java.util.*;
class PrintCollection{
    public static void main(String arsgs[]){
        Vector v = new Vector(); //by default capacity 10
        v.add(2.5f);
        v.add(111);
        v.add(true);
        v.add(null);

        //option - 1 : using toString() method
        System.out.println(v); //v.toString()

        // option - 2 : using for loop : only for List
        int i;
        System.out.print("[");
        for(i = 0;i<v.size()-1;i++)
            System.out.print(v.get(i)+", ");
        System.out.print(v.get(i)+"]");
        System.out.println();

        // option - 3 advanced for loop i.e. foreach loop : for any collection
        for(Object o : v)
            System.out.println(o);

        // option - 4 : Iterator : for any collection : unidirectional
        Iterator itr = v.iterator();
        while(itr.hasNext())
            System.out.println(itr.next()) ;   


        // option - 5 : ListIterator : bidirectional : for any List
        System.out.println("Content in reverse order:");
        ListIterator litr = v.listIterator(v.size());  //start from end
        while(litr.hasPrevious())
            System.out.println(litr.previous());

        System.out.println("Content in forward direction:");
        while(litr.hasNext())
            System.out.println(litr.next());        


        // option - 6 : Enumeration : used only with vector and Hashtable
        System.out.println("Vector printing using Enumeration:");        
        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
