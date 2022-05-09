package com.win.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
    @Configuration
    @Import({MyBatisConfig.class, JdbcConfig.class})
    @ComponentScan(value = "com.win.ssm.service")
    public class SpringConfig {

    }

