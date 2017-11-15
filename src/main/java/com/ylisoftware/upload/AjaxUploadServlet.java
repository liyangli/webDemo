package com.ylisoftware.upload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * ajaxUpload上传文件
 * author:liyangli
 * date: 2017/11/14 上午12:17.
 */
public class AjaxUploadServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //进行处理上传然后需要通过ajax方式返回数据；
        Object obj = req.getParameter("file");
        System.out.println("file-->"+obj);
        Map map = req.getParameterMap();
        System.out.println("map -->"+map);
        ServletInputStream in = req.getInputStream();
        FileOutputStream out = new FileOutputStream("/Users/liyangli/opt/demo_ajax_first");
        byte[] bytes = new byte[1024];
        while(in.read(bytes) != -1){
            out.write(bytes);
        }
        resp.setContentType("application/json;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.print("{\"desc\": \"success\"}");
        pw.flush();
        pw.close();
    }
}
