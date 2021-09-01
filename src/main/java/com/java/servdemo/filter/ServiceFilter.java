package com.java.servdemo.filter;

import javax.servlet.*;
import java.io.IOException;

public class ServiceFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("before "+this.getClass());
        chain.doFilter(request, response);  // next com.java.servdemo.filter, next servlet
        System.out.println("after "+this.getClass());
    }

    @Override
    public void destroy() {

    }
}
