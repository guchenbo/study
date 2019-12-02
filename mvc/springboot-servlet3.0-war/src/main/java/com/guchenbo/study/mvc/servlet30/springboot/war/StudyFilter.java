package com.guchenbo.study.mvc.servlet30.springboot.war;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author guchenbo
 * @Date 2019/11/30.
 */
@Configuration
public class StudyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init study filter");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                    throws IOException, ServletException {
        System.out.println("in Study Filter");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
