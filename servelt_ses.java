import java.io.*;
import java.servlet.*;
import java.servlet.http.*;

class ses extends HttpServlet implements Servlet 
{
	protected void doGet(HttpServletRequest reuest,HttpServletResponse response)
throws ServletException,IOException
{
HttpSession session=request.getSession(true);
Integer cnt=(Integer)session.getAttribute("mycnter");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
if(cnt==null)
{
cnt=new Integer(0);
out.print("Welcome...");
}
else
{
String uname=request.getParameter("Txtname");
if(uname!=null)session.setAttibute("who ",uname);
else uname=(String) session.getAttribute("Who ");
cnt=new Integer(cnt.intValue()+1);
out.print("<h1>Welcome black "+uname+"</h1>");
out.print("This is your visit no."+cnt+"<BR>");
}
session.setAttribute("mycnter",cnt);
}
}
