package com.ylisoftware.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Enumeration;

/**
 * HTTPSession监听器
 * author:liyangli
 * date: 2017/11/13 下午11:18.
 */
public class HttpSessionListenerDemo implements HttpSessionListener{
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {


        HttpSession session = httpSessionEvent.getSession();
        System.out.println("sessionID创建--》"+session.getId());
        //所有的session;
        Enumeration<String> enums = session.getAttributeNames();
        while(enums.hasMoreElements()){
            String key = enums.nextElement();
            System.out.println("key---->"+key);

        }
        System.out.println("sessionCreated-----success");
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        System.out.println("sessionID注销--》"+session.getId());
    }

}
