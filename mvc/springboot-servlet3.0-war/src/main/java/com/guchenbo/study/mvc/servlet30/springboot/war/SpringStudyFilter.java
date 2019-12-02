package com.guchenbo.study.mvc.servlet30.springboot.war;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author guchenbo
 * @Date 2019/11/30.
 */
@Configuration
public class SpringStudyFilter extends OncePerRequestFilter {

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
                    throws ServletException, IOException {
        System.out.println("in Spring Study Filter");
        filterChain.doFilter(request, response);
    }
}
