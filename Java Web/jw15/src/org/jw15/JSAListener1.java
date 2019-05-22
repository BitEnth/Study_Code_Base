package org.jw15;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class JSAListener1
 *
 */
public class JSAListener1 implements HttpSessionActivationListener , Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userID;
	private String userName;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
     * Default constructor. 
     */
    public JSAListener1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("session has been activated @"+se.getSession().getId()+"--"+se.getSource());
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("session will be passivated @"+se.getSession().getId()+"--"+se.getSource());
    }
	
}
