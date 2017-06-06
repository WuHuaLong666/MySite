package com.javaWeb.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.jmx.snmp.Enumerated;

/**
 * Servlet implementation class ServletDemo5
 */
@WebServlet("/Servlet/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//向浏览器发送错误消息
	   response.sendError(HttpServletResponse.SC_GONE,"Resource no longer available" );
	   response.setContentType("text/html;charset=UTF-8");	
	   PrintWriter out=response.getWriter();//得到输出字符输出流
	   out.println("<HTML>");
	   out.println("<HEDA><TITLE>输出报头有关信息</TITLE></HEAD>");
	   out.println("<BODY>");
	   //获取请求头信息，返回枚举类型
	   Enumeration<?> head=request.getHeaderNames();
	   while (head.hasMoreElements()) {
		String obj = (String) head.nextElement();
		String value=request.getHeader(obj);
		out.println("<h3>"+obj+":"+value+"</h3>");
		
	}
	   out.println("<h3>客户端的IP地址："+request.getRemoteAddr()+"</h3>");
	   out.println("<h3>客户端的端口号："+request.getRemotePort()+"</h3>");
	   out.println("<h3>服务器的IP地址："+request.getLocalAddr()+"</h3>");
	   out.println("<h3>客户端的IP地址："+request.getLocalPort()+"</h3>");
	   out.println("</BODY>");
	   out.println("</HTML>");
	   out.close();//关闭输出流
	   
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
