package com.zhonghao.springboot.config;

import com.zhonghao.springboot.filter.MyFilter;
import com.zhonghao.springboot.listener.MyListener;
import com.zhonghao.springboot.servlet.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.util.Arrays;

@Configuration
public class MyServletConfig {

    /**
     * 注册servlet组件
     * @return
     */
    @Bean
    public ServletRegistrationBean helloServlet() {
//      servlet请求
        ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet(), "/hello");
        bean.setLoadOnStartup(1);
        return bean;
    }

    /**
     * 注册filter组件
     */
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new MyFilter());
        // 过滤hello请求
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }

    /**
     * 注册listener组件
     */
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }
}
