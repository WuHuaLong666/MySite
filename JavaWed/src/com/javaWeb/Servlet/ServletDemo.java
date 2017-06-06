package com.javaWeb.Servlet;

import javax.servlet.http.*;

import org.apache.jasper.tagplugins.jstl.core.Out;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/com.javaWeb.Servlet/ServletDemo.java")
public class ServletDemo extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// public void doPost(HttpServletRequest request,HttpServletResponse
		// response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");// 设置生成的文档类型
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<html>");// 输出相应的HTML源文件
		out.println("<head><title>用servlet测试get/post方法</title></head>");
		out.println("<body>");
		out.println("<h2>调用doGet()方法</h2>");
		out.println("<h2>用户输入信息如下：</h2>");
		String name = request.getParameter("username");
		if (name==null || name=="") {
			name = "未输入";
		}
		String pwd = request.getParameter("password");
		if (pwd == null || pwd == "") {
			pwd = "未输出";
		}
		out.println("<h2>用户名：" + name + "</h2>");
		out.println("<h2>密码：" + pwd + "</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}
}
