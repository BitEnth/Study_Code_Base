package com.jw7.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw7.service.StuOperate;

public class DelStuServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("stuid"));
			StuOperate sop = new StuOperate();
			boolean flag = sop.DeleteStudent(id);
			if(flag == true) {
				response.sendRedirect("success.html");
			}else {
				response.sendRedirect("fail.html");
			}
		}catch (NumberFormatException e) {
			response.getWriter().print("<h1>Student's ID is wrong!</h1>");
		}catch (Exception e) {
			response.getWriter().print(e.getMessage());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
