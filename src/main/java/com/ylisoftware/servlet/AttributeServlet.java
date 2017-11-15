package com.ylisoftware.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * session attribute 验证处理类
 * author:liyangli
 * date: 2017/11/13 下午11:35.
 */
public class AttributeServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //开始做具体请求；
        Object type = req.getParameter("type");
        String desc = "";
        if(type != null){
            desc = (String)type;
        }
        System.out.println("type==>"+type);
        HttpSession session = req.getSession();
        ServletContext sc = req.getSession().getServletContext();
        if("add".equals(desc)){
            session.setAttribute("name","lyl");
            sc.setAttribute("scName","lyl_sc");
        }else if("del".equals(desc)){
            session.removeAttribute("name");
            sc.removeAttribute("scName");
        }else{
            sc.setAttribute("scName","lyl_sc_1");
            session.setAttribute("name","lyl_1");
        }
        resp.getWriter().write("success......");
    }
}
