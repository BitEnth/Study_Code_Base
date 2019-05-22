package com.jw11.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw11.data.StuData;


@WebServlet("/ELservlet")
public class ELservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StuData sd = new StuData(20191844, "Royal", 27, "Finance");
		String stuinfo = sd.Output();
		String[] hobbies = new String[] {"soccer", "music", "read"};
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "sh*t");
		map.put(2, "fu*k");
		map.put(3, "bi*ch");
		request.setAttribute("stuinfo", stuinfo);
		request.setAttribute("my-address", "Devil");
		request.setAttribute("hobbies", hobbies);
		request.setAttribute("nullValue", null);
		request.setAttribute("map", map);
		request.getRequestDispatcher("eltest1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
