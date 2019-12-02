package com.guchenbo.study.mvc.servlet30.springboot.war;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author guchenbo
 * @Date 2019/12/1.
 */
@SpringBootApplication
public class SpringApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(SpringApp.class);
        return super.configure(builder);
    }
}
