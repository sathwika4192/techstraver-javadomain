package convert;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Currency extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws NumberFormatException, IOException
	{
		int i=Integer.parseInt(req.getParameter("curr"));
		String s=req.getParameter("opr");
		PrintWriter out=res.getWriter();
		if(s.equals("rupee"))
		out.println("Amount in us dollars = "+ (0.0119913 *i));
		if(s.equals("euro"))
		out.println("Amount in us dollars = "+ (1.072445*i));	
		if(s.equals("uae"))
		out.println("Amount in us dollars = "+ (i/3.6729));
		if(s.equals("pound"))
		out.println("Amount in us dollars = "+ Math.round((i*1.24)));
	}
	
}
