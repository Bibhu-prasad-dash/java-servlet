package com.java.servdemo.filter;

import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class ApplicationFilter implements Filter {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ApplicationFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("Filter() executed {}" , "init()");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        LOGGER.info("com.java.servdemo.filter() executed {}","doFilter()");
        System.out.println("before "+this.getClass());
        filterChain.doFilter(request, response);  // next com.java.servdemo.filter, next servlet
        System.out.println("after "+this.getClass());
    }

    @Override
    public void destroy() {
        LOGGER.info("com.java.servdemo.filter() executed {}","destroy()");

    }
}
