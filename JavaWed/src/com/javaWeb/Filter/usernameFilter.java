package com.javaWeb.Filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class usernameFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, //urlPatterns = { "/Filter/usernameFilter" })
					servletNames={"/com.javaWeb.Servlet/ServletDemo.java"})
public class usernameFilter implements Filter {

    /**
     * Default constructor. 
     */
    public usernameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy...销毁执行");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("username...过滤器执行");
		String username=request.getParameter("userName");
		if(username.equals(null)&&"".equals(username)){
			System.out.println("过滤器向下执行---");
		 chain.doFilter(request, response);
		}else{
			HttpServletResponse he=(HttpServletResponse)response;
			he.sendRedirect("/JavaWed/Filter/Filterusername.html");
		}
		System.out.println("doFilter--->执行完毕！");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("username 初始化！！");
	}

}
