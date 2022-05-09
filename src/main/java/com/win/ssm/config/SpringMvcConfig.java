package com.win.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
    @Configuration
    @EnableWebMvc
    @ComponentScan("com.win.ssm")
    public class SpringMvcConfig implements WebMvcConfigurer {

        /**
         * 字符编码
         */
        private String characterEncoding = "utf-8";

        // 如果需要使用Thymeleaf，则必须添加以下配置
        // @Bean
        // public ViewResolver getViewResolver() {
        //     ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        //     templateResolver.setCacheable(false);
        //     templateResolver.setCharacterEncoding(characterEncoding);
        //     templateResolver.setTemplateMode("HTML");
        //     templateResolver.setPrefix("/templates/");
        //     templateResolver.setSuffix(".html");
        //
        //     SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        //     templateEngine.setTemplateResolver(templateResolver);
        //
        //     ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        //     viewResolver.setCharacterEncoding(characterEncoding);
        //     viewResolver.setTemplateEngine(templateEngine);
        //
        //     return viewResolver;
        // }

    }

