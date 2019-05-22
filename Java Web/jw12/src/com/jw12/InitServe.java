package com.jw12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jw12.StuData;

@WebServlet("/InitServe")
public class InitServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StuData stu1 = new StuData(12012901, "Hardryson", 23, "Economy");
		request.setAttribute("student", stu1);
		String site = "Los vigas";
		request.setAttribute("site", site);
		request.getRequestDispatcher("jstl1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
