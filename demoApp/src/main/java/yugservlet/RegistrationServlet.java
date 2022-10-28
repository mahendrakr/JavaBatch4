package yugservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/registration.do")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("uemail");
		String password = request.getParameter("pwd");
		String gender = request.getParameter("gen");
		String check = request.getParameter("check");
		System.out.println(email+" "+password+" "+gender+" "+check);
		RequestDispatcher rdi=request.getRequestDispatcher("login.html");
//		 PrintWriter out = response.getWriter();
//		   out.write("Hello:"+email);
//		  out.flush();
//		  out.close();
		   rdi.forward(request, response);
		  
//		   System.out.println("before rdi1");
//	    RequestDispatcher rdi1=request.getRequestDispatcher("success.html");
//	       System.out.println("After rdi1");
//	       rdi1.forward(request, response);
//	       System.out.println("end rdi1");
		   
	}

}
