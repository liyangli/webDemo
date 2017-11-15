package com.ylisoftware.jstl;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;
import java.util.Enumeration;

/**
 * author:liyangli
 * date: 2017/11/15 上午12:12.
 */
public class DemoJSTL extends BodyTagSupport {

    /**
     * 属性定义
     */
    private String name;
    private Integer age;
    @Override
    public int doStartTag() throws JspException {
        System.out.println("doStartTag..可以开始处理一下事情了。。。");
        System.out.println("key->"+name+",val->"+this.getName());
        System.out.println("key->"+age+",val->"+this.getAge());
        JspWriter w = pageContext.getOut();
        try {
            w.write("start->");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doStartTag();
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("doEndTag..表明标签结束了。。。");
        String demo = this.bodyContent.getString();
        JspWriter out = this.pageContext.getOut();
        try {
            out.write(demo+"-->end");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doEndTag();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
