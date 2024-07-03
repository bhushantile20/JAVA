
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class studservlet extends HttpServlet
{
     public void doPost(HttpServlet request,HttpServletResponse response)throws ServletException,IOException
     {
        response.setContentType("text/html"); 
        PrintWrite Out=response.getWriter();

        int rno=Integer.parseInt(request.getParameter("rno"));
        String sname=request.getParameter("name");
        String class=request.getParameter("Class");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet servlet</title>");
        out.println("</head>");
        out.println("h1>Roll Number:" +rno+"</h1>");
        out.println("<h1>Student Name:"+sname+"</h1>");
        out.println("<h1>class:"+clas+"<</h!>");
        out.println("/body");
        out.println("/html");

     }
}
