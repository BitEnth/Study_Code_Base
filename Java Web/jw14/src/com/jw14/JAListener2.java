package com.jw14;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class JAListener2
 *
 */
public class JAListener2 implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public JAListener2() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	String aname = scae.getName();
    	//scae.getServletContext().getAttribute("");
    	Object att = scae.getValue(); //just get the first initialized value, can't get the changed value
    	System.out.println("Application add attribute: "+aname+"--"+att);
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	String aname = scae.getName();
    	Object att = scae.getServletContext().getAttribute(aname); //can get the changed value all the time
    	System.out.println("Applocation remove attribute: "+aname+"--"+att);
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	String aname = srae.getName();
    	Object att = srae.getValue();
    	System.out.println("Request remove attribute: "+aname+"--"+att);
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	String aname = srae.getName();
    	Object att = srae.getServletRequest().getAttribute(aname);
    	System.out.println("Request add attribute: "+aname+"--"+att);
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	String aname = srae.getName();
    	Object att = srae.getValue();
    	System.out.println("Request replace attribute: "+aname+"--"+att);
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	String aname = se.getName();
    	Object att = se.getValue();
    	System.out.println("Session add attribute: "+aname+"--"+att);
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	String aname = se.getName();
    	Object att = se.getSession().getAttribute(aname);
    	System.out.println("Session remove attribute: "+aname+"--"+att);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	String aname = se.getName();
    	Object att = se.getValue();
    	System.out.println("Session replace attribute: "+aname+"--"+att);
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	String aname = scae.getName();
    	Object att = scae.getServletContext().getAttribute(aname);
    	System.out.println("Application replace attribute: "+aname+"--"+att);
    }
	
}
