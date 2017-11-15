package com.ylisoftware.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * session Attribute Listener
 * author:liyangli
 * date: 2017/11/13 下午11:31.
 */
public class HttpSessionAttrListenerDemo implements HttpSessionAttributeListener{
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("attributeAdded=========");
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("name->"+name+";value->"+value);
    }

    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("start attributeRemove===============");
        String name = httpSessionBindingEvent.getName();
        Object val = httpSessionBindingEvent.getValue();
        System.out.println("removeAttr->key:"+name+";value:"+val);

    }

    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("start replaced===============");
        String name = httpSessionBindingEvent.getName();
        Object val = httpSessionBindingEvent.getValue();
        System.out.println("replaced->key:"+name+";value:"+val);
    }
}
