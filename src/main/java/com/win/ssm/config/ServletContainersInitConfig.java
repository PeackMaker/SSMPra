package com.win.ssm.config;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;


// Description:ServletContainersInitConfig的类，继承AbstractAnnotationConfigDispatcherServletInitializer抽象类，重写抽象类的方法。
public class ServletContainersInitConfig extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    //Description: 加载Spring配置类中的信息，
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    // Description: 加载Spring MVC配置类中的信息，
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    //Description:配置DispatcherServlet的映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    private String encoding = "utf-8";
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter(encoding);
        return new Filter[]{filter};
    }
}