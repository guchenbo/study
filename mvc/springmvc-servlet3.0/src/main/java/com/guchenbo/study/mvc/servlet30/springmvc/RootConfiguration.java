package com.guchenbo.study.mvc.servlet30.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guchenbo
 * @Date 2019/12/1.
 */
@Configuration
public class RootConfiguration {

    @Bean
    public SpringStudyFilter springStudyFilter() {
        return new SpringStudyFilter();
    }
}
