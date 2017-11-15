package com.ylisoftware.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * author:liyangli
 * date: 2017/11/8 下午11:56.
 */
public class SecondFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("i am SecondFilter...");
        filterChain.doFilter(req,resp);
        resp.getWriter().write("i am sendFilter");
        System.out.println("SecondFliter doFilter after");
    }

    public void destroy() {

    }
}
