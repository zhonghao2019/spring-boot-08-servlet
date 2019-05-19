package com.zhonghao.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *自定义监听器
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器：启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器：销毁了");
    }
}
