package com.ylisoftware.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * author:liyangli
 * date: 2017/11/8 下午11:19.
 */
public class FirstFilter implements Filter {


    private int total = 0;
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化方法，获取配置信息。一些初始化设置
        System.out.println("i am FirstFilter init..");
        Enumeration<String> iters = filterConfig.getInitParameterNames();
        while(iters.hasMoreElements()){
            String key = iters.nextElement();
            String val = filterConfig.getInitParameter(key);
            System.out.println("配置中参数为key->"+key+";value->"+val);
        }

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("i am firstFilter total->"+(total++));
        //表明需要进行设定接力棒，继续执行下一步Filter操作
        filterChain.doFilter(req,resp);
        System.out.println("FirstFliter doFilter after");
    }

    public void destroy() {
        //注销方法，在容器卸载web项目是进行启动destory操作
        System.out.println("i am FitrstFilter destory...");
    }
}
