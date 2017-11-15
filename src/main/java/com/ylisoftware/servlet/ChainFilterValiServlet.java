package com.ylisoftware.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet Filter链路验证的
 * author:liyangli
 * date: 2017/11/8 下午11:58.
 */
public class ChainFilterValiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("name","HI_"+session.getId());
        session.invalidate();
        resp.getWriter().write("Hello world");
    }
}
