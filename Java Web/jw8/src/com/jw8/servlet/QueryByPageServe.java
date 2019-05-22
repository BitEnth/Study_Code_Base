package com.jw8.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw8.DButil.Studata;
import com.jw8.service.StuService;
import com.jw8.service.PageService;

@WebServlet("/QueryByPageServe")
public class QueryByPageServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pageno, pagesize, pages;
		PageService ps = new PageService();
		StuService ss = new StuService();
		pages = ss.GetTotalCount();
		ps.setTotalCount(pages);
		if(request.getParameter("pageno") == null) {
			pageno = 1;
		}else {
			pageno = Integer.parseInt(request.getParameter("pageno"));
		}
		pagesize = 3;
		ps.setPageNum(pageno, pagesize);
		response.getWriter().println("<h1>"+pageno+"</h1>");
		if(pageno > 0 && pagesize > 0) {
			List<Studata> stus = ss.QueryStuByPage(pageno, pagesize);
			ps.setStudents(stus);
			request.setAttribute("pageinfo", ps);
//			Iterator<Studata> is = stus.iterator();
//			while(is.hasNext()) {
//				response.getWriter().println("<h2>"+is.next().Output()+"</h2>");
//			}
			request.getRequestDispatcher("stuindex.jsp").forward(request, response);
		}else {
			response.getWriter().println("Parameters are illegal!");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
