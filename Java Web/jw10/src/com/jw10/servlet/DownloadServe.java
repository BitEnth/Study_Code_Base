package com.jw10.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;

public class DownloadServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("filename");
		response.addHeader("content-Type", "application/octet-stream");
		System.out.println(response.getHeader("content-Type"));
		//Edge & IE: #URLEncoder.encode("filename","UTF-8");
		//FireFox: #'=?UTF-8?B?'+new String(Base64.encodeBase64(filename.getBytes("UTF-8")))+'?='
		String useragent = request.getHeader("User-Agent");
		if(useragent.indexOf(useragent) != -1) {
			response.addHeader("content-Disposition", "attatchment;filename="+"=?UTF-8?B?"+new String(Base64.encodeBase64(name.getBytes("UTF-8")))+"?=");
		}else {
			response.addHeader("content-Disposition", "attatchment;filename="+URLEncoder.encode(name,"UTF-8"));
		}
		InputStream in = getServletContext().getResourceAsStream("/res/test1.jpeg");
		ServletOutputStream out = response.getOutputStream();
		byte[] bs = new byte[1024];
		int len = -1;
		while((len=in.read(bs)) != -1) {
			out.write(bs);
		}
		out.close();
		in.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
