package com.javaWeb.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;


 
@WebServlet("/Srevlet/ThreadSafe")
public class ThreadSafe extends HttpServlet {
	String name="";//实例变量，多线程共享
       private final Lock lock=new ReentrantLock();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreadSafe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		lock.lock();
		response.setContentType("Text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Servlet线程安全问题</TITLE></HEAD>");
		out.println("<BODY>");
		String name=request.getParameter("username");
		/*name=new String(name.getBytes("iso-8859-1"),"UTF-8");*/
		try {
			Thread.sleep(5000);//休眠5秒
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<H2>您好，"+name+"!</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();//关闭输出流
		lock.unlock();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
