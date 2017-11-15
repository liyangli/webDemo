package com.ylisoftware.upload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 * Form表单上传文件
 * author:liyangli
 * date: 2017/11/13 下午11:55.
 */
public class FormUploadServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理上传操作
        Object obj = req.getParameter("file");
        System.out.println("file-->"+obj);
        Map map = req.getParameterMap();
        System.out.println("map -->"+map);
        ServletInputStream in = req.getInputStream();
        FileOutputStream out = new FileOutputStream("/Users/liyangli/opt/demo_first");
        byte[] bytes = new byte[1024];
        while(in.read(bytes) != -1){
            out.write(bytes);
        }
        resp.getWriter().write("upload success");
    }
}
