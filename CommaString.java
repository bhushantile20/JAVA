public class CommaString
{
    public static void main(String args[])
    {
        String input="Welcome to java Session Session session";
        String[]words=input.split(",");
        for(int k=0;k<words.lenght;k++)
        {
            System.out.println(words[k]);
        }
    }
}