package com.jw9.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		boolean ismultipart = ServletFileUpload.isMultipartContent(request);
		if(ismultipart) {
			FileItemFactory fif = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(fif);
			try {
				List<FileItem> fitems = upload.parseRequest(request);
				Iterator<FileItem> it = fitems.iterator();
				while(it.hasNext()) {
					FileItem fitem = it.next();
					if(fitem.isFormField()) {
						String fieldname = fitem.getFieldName();
						if(fieldname.equals("uid")) {
							response.getWriter().println("<h3>"+fitem.getString()+"</h3>");
						}else if(fieldname.equals("uname")) {
							response.getWriter().println("<h3>"+fitem.getString()+"</h3>");
						}
					}else {
						String filename = fitem.getName();
						//String path = request.getSession().getServletContext().getRealPath("upload");
						String path = "/home/murphy/Apache-tomcat-8.5.39/upload";
						File file = new File(path, filename);
						fitem.write(file);
						response.getWriter().println("<h3>"+filename+" uploads successfully!</h3>");
					}
				}
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				response.getWriter().println("<h3>"+e.getMessage()+"</h3>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				response.getWriter().println("<h3>"+e.getMessage()+"</h3>");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
