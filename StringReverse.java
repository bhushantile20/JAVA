public class StringReverse
{
     public static void main(String args[])
     {
         String string ="Welcome to java programming and dotent Programming";
         String[]wordsCount=string.split("");

         System.out.println("The Given String is :\n" +string +"\n");
         System.out.println("After Reverse String is:");

         for(int i=wordsCount.lenght;i>0;i--)
         {
             System.out.print(wordsCount[i-1]+"");
             
         }
     }
}