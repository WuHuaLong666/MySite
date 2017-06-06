package com.javaWeb.Servlet.Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextDemo
 *
 */
@WebListener
public class ServletContextDemo implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletContextDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
       System.out.println("ServletContext---->attributeAdded");
       System.out.println("添加属性："+arg0.getName()+"----->"+arg0.getValue());
      
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ServletContext---->attributeRemoved");
    	System.out.println("删除属性："+arg0.getName());
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ServletContext---->contextDestroyed");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ServletContext---->attributeReplaced");
    	System.out.println("替换前："+arg0.getName()+"----->"+arg0.getValue());
    	System.out.println("替换后："+arg0.getName()+"----->"+arg0.getServletContext().getAttribute(arg0.getName()));
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ServletContext---->contextInitialized");
    }
	
}
