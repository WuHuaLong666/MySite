package com.javaWeb.Servlet.Listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerDemo
 *
 */
@WebListener
public class ListenerDemo implements ServletRequestAttributeListener, AsyncListener, ServletRequestListener {

    /**
     * Default constructor. 
     */
    public ListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see AsyncListener#onComplete(AsyncEvent)
     */
    public void onComplete(AsyncEvent arg0) throws java.io.IOException { 
        System.out.println("ListenerDemo --->onComplete");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
    	System.out.println("ListenerDemo --->requestDestroyed");
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->attributeRemoved");
       System.out.println("删除属性："+arg0.getName());
    }

	/**
     * @see AsyncListener#onError(AsyncEvent)
     */
    public void onError(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->onError");
    }

	/**
     * @see AsyncListener#onStartAsync(AsyncEvent)
     */
    public void onStartAsync(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->onStartAsync");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->requestInitialized");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->attributeAdded");
    	System.out.println("添加值:"+arg0.getName()+"----->"+arg0.getValue());
    }

	/**
     * @see AsyncListener#onTimeout(AsyncEvent)
     */
    public void onTimeout(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->onTimeout");
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("ListenerDemo --->attributeReplaced");
    	System.out.println("替换前："+arg0.getName()+"---->"+arg0.getValue());
    	System.out.println("替换后："+arg0.getName()+"---->"+arg0.getServletRequest().getAttribute(arg0.getName()));
    	
    }
	
}
