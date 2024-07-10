import java.util.WeakHashMap;

class Whash{
    public static void main(String args[])
    {

    
    WeakHashMap<String,Integer> numbers=new WeakHashMap<>();

    String two =new String ("Two");
    Integr twoValue=2;
    String four=new String("Four");
    Integer fourValue=4;

    numbers.put(two,twoValue);
    numbers.pu(four,fourValue);
    System.out.println("WeakHashMap:"+numbers);

    two=null;

    System.gc();

    System.out.println("WeakHashMap after garbage collection:"+numbers);
}
}
