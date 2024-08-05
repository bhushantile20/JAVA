import java.io.Console;

class LoginValidator{
    public static void main(String args[])
    {
         Console cns=new console();

       System.out.println("Enter UserName");
       String usn=scn.nextLine();

       System.out.println("Enter password");
      
        char[] pwd =cns.readPassword();

       System.out.println("\n You enterred");
       System.out.println("UserName:" +usn);
       System.out.println("password:" +pwd);

    }
}