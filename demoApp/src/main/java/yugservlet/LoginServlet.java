package yugservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		response.setContentType("text/html");
		if (password.equals("hrishabh")) {
			HttpSession session = request.getSession(true);  //creation session.
			Date createTime=new Date(session.getCreationTime());  // get session ceration time.
			Date lastAccessTime=new Date(session.getLastAccessedTime());//get Last session Access time.			
			String title="welcome back to my web.";
			Integer visitCount=new Integer(0);
			String vckey=new String("VisitCount");   //visit count key
			String userIDKey=new String("User ID");
			String userID=new String("Hrishabh");
			if(session.isNew()) {
				title="welcome to my web";
				session.setAttribute(userIDKey, userID);	
				
			}
			else {
				visitCount=(Integer)session.getAttribute(vckey);
				visitCount=+1;
				userID=(String)session.getAttribute(userIDKey);
				
			}
			request.setAttribute("creationTime",createTime );
			request.setAttribute("lastAccessTimeHere", lastAccessTime);
			session.setAttribute(vckey, visitCount);
			session.setAttribute("title", title);
//			request.setAttribute("uname",email);
//			request.setAttribute("phone", 1234);
//			request.setAttribute("DOB", LocalDate.now());
			//list of stirngs
			List <String> l=new ArrayList<String>();			
			l.add("shaili");
			l.add("mona");
			l.add("moni");
			
			List <String> l1=new ArrayList<String>();
			l1.add("Shail");
			l1.add("Ram");
			l1.add("Mohan");
			
			List <String> l2=new ArrayList<String>();
			l2.add("xyz");
			l2.add("abc");
			l2.add("pqr");
			//request.setAttribute("li", l);
			Map<String, String> map=new HashMap<>();
			map.put("id", "123");
			map.put("name", "Yug");
			map.put("Branch", "CSE");
			//request.setAttribute("mp", map);
			List <List<String>> li=new ArrayList<>();
			li.add(l);
			li.add(l2);
			li.add(l1);
			//request.setAttribute("LI", li);
			//rd = request.getRequestDispatcher("success1.jsp");	
			rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.print("sorry user name or password incorrect!!");
			rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

	}

}
