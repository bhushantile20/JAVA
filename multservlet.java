import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class multservlet extends HttpServlet{
     public void doPost(httpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
         {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            String language[]=request.getParmeterValues("language");
            if(language!=null)
            {
                 out.println("language are:");
                 for(int i=0;i<language.length;i++)
                 {
                    out.println("\t"+language[i]);
                    
                 }
            }
         }
     }
}