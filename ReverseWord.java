public class ReverseWord
{
     public static void main(String args[])
     {
         String input="welcome to java Session ";
         String[] words=input.split(" ");
         String[] revwords=new String[words.lenght];
         int j=0;
         for(int=words.lenght-1;i<=0;i--)
         {
             revwords[j]=words[i];
             System.out.print(revwords[j]+" ");
             j++;
         }
     }
}