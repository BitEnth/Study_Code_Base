package com.jw6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jw6.LoginCheck;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("uname");
		String passwd = request.getParameter("upwd");
		LoginData ld = new LoginData(name, passwd);
		LoginCheck lc = new LoginCheck();
		int result = lc.login(ld);
		if(result == 1) {
			response.sendRedirect("welcome.html");
		}else if(result == 0) {
			response.sendRedirect("passerror.html");
			//response.getWriter().println("ERROR");
		}else if(result == -1) {
			response.sendRedirect("syserror.html");
		}else {
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
