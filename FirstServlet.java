import java.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWrite out=res.getWriter();
        Cookie c1=new Cookie("user","suresh");
        res.addCookie(c1);
        Cookie c2=new Cookie("Company","bsg");
        res.addCookie(c2);
    }

    }
