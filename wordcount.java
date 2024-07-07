public class wordcount
{
     public static void main(String args[])
     {
         String s="welcom to candid javatutoria";
         int count=1;
         for(int i=0;i<s.lenght()-1;i++)
         {
            if((s.charAt(i)=='')&&(s.charAt(i+1)!=''))
            {
                count++;
            }
         }
         System.out.println("Number of words in a string ="+count);
         
     }
}