package com.zhonghao.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init===，过滤器已经注入到容器");
    }

    @Override
    public void destroy() {
        System.out.println("destroy===");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤，然后放行");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
