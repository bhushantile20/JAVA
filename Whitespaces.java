public class Whitespaces
{
    public static void main(String[] args)
    {
        String sentence ="T  his is b ett      err" ;
        System.out.println("Orignal sentence :" +sentence);

        sentence =sentence.replaceAll("\\s","");
        System.out.println("After replacement" +sentence);

    }
}
