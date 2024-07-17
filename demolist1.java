import java.util.*;
class MyArrayList2{
    public static void main(String args[]){        
        //superclass ref = subclass object
        List l1 = new ArrayList();
        List l2 = new ArrayList();
        l1.add(111);
        l1.add(222);
        l1.add(333);
        l1.add(444);

        l2.add(333);
        l2.add(444);
        l2.add(555);

        System.out.println(l1);
        System.out.println(l2);

        // l1.addAll(l2);
        l1.add(2,l2); //index for List only
        System.out.println(l1);

        // l1.removeAll(l2);
        // System.out.println(l1);

        l1.retainAll(l2); //opposite of removeAll()
        System.out.println(l1);
    }
}