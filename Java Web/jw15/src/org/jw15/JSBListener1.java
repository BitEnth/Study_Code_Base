package org.jw15;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class JSBListener1
 *
 */
public class JSBListener1 implements HttpSessionBindingListener {

    /**
     * Default constructor. 
     */
    public JSBListener1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("session bound: "+this+"####"+event.getSession().getId());
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("session unbound: "+this+"####"+event.getSession().getId());
    }
	
}
