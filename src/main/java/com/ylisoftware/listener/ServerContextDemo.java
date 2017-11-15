package com.ylisoftware.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Enumeration;

/**
 * author:liyangli
 * date: 2017/11/12 下午11:43.
 */

public class ServerContextDemo implements ServletContextListener {


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Enumeration<String> enums = servletContextEvent.getServletContext().getInitParameterNames();
        while(enums.hasMoreElements()){
            System.out.println("key->"+enums.nextElement());
        }
        System.out.println("contextInitialized============");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("destoryed============");
    }
}
