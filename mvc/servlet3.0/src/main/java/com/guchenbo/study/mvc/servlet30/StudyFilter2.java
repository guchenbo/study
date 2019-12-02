package com.guchenbo.study.mvc.servlet30;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author guchenbo
 * @Date 2019/11/30.
 */
public class StudyFilter2 implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init study filter2");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                    throws IOException, ServletException {
        System.out.println("in Study Filter2");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
