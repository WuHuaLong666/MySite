package com.javaWeb.Servlet.Listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class SessionBindingDemo
 *
 */
@WebListener
public class SessionBindingDemo implements HttpSessionBindingListener {
	private String name;

    public SessionBindingDemo() {
      
    }
    public SessionBindingDemo(String name){
    	this.name=name;
    	
    }

	
	public void valueBound(HttpSessionBindingEvent arg0)  { 
        System.out.println("*******valueBound:"+arg0.getName()+"----->"+arg0.getValue());
        
    }

    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
         System.out.println("******valueUnbound:"+arg0.getName());
    }
    @Override
    public String toString() {
    	return "SessionBindingDemo [name=" + name + "]";
    }
	
}
