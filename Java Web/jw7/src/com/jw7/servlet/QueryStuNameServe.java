package com.jw7.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jw7.unity.StuData;
import com.jw7.service.StuOperate;


public class QueryStuNameServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("stuname");
		StuOperate sop = new StuOperate();
		List<StuData> students = sop.QueryStuByName(name);
		Iterator<StuData> is = students.iterator();
		if(is.hasNext() == false) {
			response.getWriter().print("<h1>NO THIS ONE</h1>");
		}else {
			request.setAttribute("students", students);
			request.getRequestDispatcher("queryresult.jsp").forward(request, response);
		}
//		while(is.hasNext()) {
//			response.getWriter().println("<h3>" + is.next().Output() + "</h3>");
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
