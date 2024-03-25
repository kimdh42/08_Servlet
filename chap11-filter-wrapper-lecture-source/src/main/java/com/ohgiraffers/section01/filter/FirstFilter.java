package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first/*")
public class FirstFilter implements Filter {

    public  FirstFilter() {
        System.out.println("FirstFilter 기본 생성자 호출됨");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init() 메소드 호출됨");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter() 메소드 호출됨");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("doFilter() 호출 이후... Servlet 요청 수행 완료!");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy() 메소드 호출됨");
    }
}
