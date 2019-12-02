package com.guchenbo.study.mvc.servlet30;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author guchenbo
 * @Date 2019/11/30.
 */
public class StudyServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init Study Servlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in Study Servlet");
        resp.getWriter().write("Servlet 3.0 ok");
    }
}
