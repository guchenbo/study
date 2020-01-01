package com.guchenbo.study.mvc.servlet30;

import javax.servlet.*;
import java.util.Set;

/**
 * @Author guchenbo
 * @Date 2019/12/1.
 */
public class StudyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        ServletRegistration.Dynamic servletRegistration = ctx.addServlet("study", StudyServlet.class);
        servletRegistration.addMapping("/*");

        FilterRegistration.Dynamic filterRegistration = ctx.addFilter("studyFilter", StudyFilter.class);
        // isMatchAfter 优先级 false > true
        filterRegistration.addMappingForUrlPatterns(null, true, "/study");

        FilterRegistration.Dynamic filterRegistration2 = ctx.addFilter("studyFilter2", StudyFilter2.class);
        filterRegistration2.addMappingForUrlPatterns(null, true, "/study");

        ctx.addListener(new StudyServletContextListener());
    }
}
