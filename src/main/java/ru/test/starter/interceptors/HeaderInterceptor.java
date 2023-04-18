package ru.test.starter.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class HeaderInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.addHeader(HttpHeaders.FROM, "Interceptor");
        response.addHeader("Interceptor", "HeaderInterceptor");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
