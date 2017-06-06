package com.javaWeb.Servlet.Listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionDemo
 *
 */
@WebListener
public class SessionDemo implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionIdListener {

    /**
     * Default constructor. 
     */
    public SessionDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->sessionCreated");
    	System.out.println("创建session Id："+arg0.getSession().getId());
    	
    }

	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent arg0, String arg1)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->sessionIdChanged");
    	
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->sessionDestroyed");
    	System.out.println("销毁Session Id："+arg0.getSession().getId());
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->sessionDidActivate");
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->attributeAdded");
    	System.out.println("添加属性："+arg0.getName()+"--->"+arg0.getValue());
    	
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->attributeRemoved");
    	System.out.println("删除属性："+arg0.getName());
    	
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->attributeReplaced");
    	System.out.println("替换前："+arg0.getName()+"---->"+arg0.getValue());
    	System.out.println("替换后："+arg0.getName()+"---->"+arg0.getSession().getAttribute(arg0.getName()));
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("SessionDemo--->sessionWillPassivate");
    }
	
}
