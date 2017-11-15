package com.ylisoftware.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * author:liyangli
 * date: 2017/11/13 下午11:45.
 */
public class ServerContextAttrListenerDemo implements ServletContextAttributeListener {

    private void dealAttr(String type,ServletContextAttributeEvent event){
        String name = event.getName();
        Object value = event.getValue();
        System.out.println("type->"+type+";name->"+name+";val->"+value);
    }

    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        this.dealAttr("add",servletContextAttributeEvent);

    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        this.dealAttr("del",servletContextAttributeEvent);
    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        this.dealAttr("replaced",servletContextAttributeEvent);
    }
}
