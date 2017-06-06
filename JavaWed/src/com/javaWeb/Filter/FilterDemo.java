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
 * Servlet Filter implementation class FilterDemo
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, //urlPatterns = { "/Filter/FilterDemo" })
               servletNames={"/com.javaWeb.Servlet/ServletDemo.java"})
public class FilterDemo implements Filter {
	

    /**
     * Default constructor. 
     */
    public FilterDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("PasswordFilter销毁.......");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("PasswordFilter 过滤器执行中......");
		String password=request.getParameter("passwore");
		if (password !=null&&!"".equals(password)) {
			System.out.println("password放行，即将进入...");
			chain.doFilter(request, response);//向下执行
		} else {
            HttpServletResponse hr=(HttpServletResponse)response;
            hr.sendRedirect("/JavaWed/Filter/Filterpassword.html");
		}
		System.out.println("执行完毕！！");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("passwordFilter 初始化....");
	}

}
