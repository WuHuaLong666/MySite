package com.javaWeb.Servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Servlet/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintStream out;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html;charset=UTF-8");
	  //  FileReader file=new FileReader("E:\\Demo.txt");
	    String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		/*HashMap<String, String> map=new HashMap<String,String>();*/
	  /*  for(Entry<String, String> i:map.entrySet()){
	    if(name.equals(i)&&pwd.equals(i)){
	    	
	    }
	    }*/
		BufferedReader br=new BufferedReader(new FileReader("E:\\Demo.txt"));
	    
	    out.println("<h1>用户名："+name+"</h1>");
	    out.print("<h1>密码："+pwd+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
