package com.guchenbo.study.mvc.servlet30.springmvc;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @Author guchenbo
 * @Date 2019/12/1.
 */
public class StudyAnnotationConfigDispatcherServletInitializer
                extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * root application context
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfiguration.class };
    }

    /**
     * servlet application context
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { ServletConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/study" };
    }

    @Override
    protected Filter[] getServletFilters() {
        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
        delegatingFilterProxy.setTargetBeanName("springStudyFilter");

        StudyFilter studyFilter = new StudyFilter();
        return new Filter[] { delegatingFilterProxy, studyFilter };
    }
}
