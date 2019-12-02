package com.guchenbo.study.mvc.servlet30.springboot.jar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author guchenbo
 * @Date 2019/11/30.
 */
@Controller
public class StudyController {

    @RequestMapping(value = "/study")
    @ResponseBody
    public String ok(HttpServletResponse response) {
        System.out.println("in study controller");
        return "SpringBoot Servlet 3.0 jar ok";
    }
}
