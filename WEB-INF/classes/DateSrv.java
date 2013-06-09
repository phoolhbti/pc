import javax.servlet.*;
import java.io.*;
import java.util.*;
 public class DateSrv extends GenericServlet
 {
 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
 
   {
    res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	Date d=new Date();
	pw.print("<B><CENTER>Date and Time is:"+d.toString()+"</CENTER></B>");
	pw.close();
	}
}

