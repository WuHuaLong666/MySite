package com.javaWeb.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.swing.internal.plaf.basic.resources.basic;

/**
 * Servlet implementation class ServletDemo4
 */
@WebServlet(urlPatterns = { "/Servlet/ServletDemo4" }, initParams = {
		@WebInitParam(name = "institute", value = "职业培训学校"), @WebInitParam(name = "major", value = "java技术"),
		@WebInitParam(name = "count", value = "10000") })
public class ServletDemo4 extends HttpServlet {
	private String myInstitute = null;
	private String myMajor = null;
	private int count = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDemo4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// 依次获取三个初始化参数的值，处理后存放到类的三个私有字段中
		myInstitute = config.getInitParameter("institute");
		if (myInstitute == null)
			myInstitute = "";
		myMajor = config.getInitParameter("major");
		if (myMajor == null)
			myMajor = "";
		String strCount = config.getInitParameter("count");
		try {
			count = Integer.parseInt(strCount);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/heml;charset=UTF-8");
		PrintWriter out=response.getWriter();//得到输出字符流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获取初始化参数</TITLE></HEAD>");
		out.println("<BODY>");
		out.print("<H3>所在学校："+myInstitute+"</H3>");
		out.print("<H3>所在专业："+myMajor+"</H3>");
		count++;
		out.print("<H3>此Servlet的访问次："+count+"</H3>");
		out.print("</BODY>");
		out.print("</HTML>");
		out.close();//关闭输出流
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

}
