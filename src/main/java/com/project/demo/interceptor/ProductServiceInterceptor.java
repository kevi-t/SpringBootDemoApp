package com.project.demo.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ProductServiceInterceptor implements HandlerInterceptor {

    //perform operations before sending the request to the controller. This method should return true to return the response to the client.
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Pre Handle method is Calling");
        return true;
    }

    //perform operations before sending the response to the client.
    @Override
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
        System.out.println("Post Handle method is Calling");
    }

    //perform operations after completing the request and response.
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,Object handler, Exception exception) throws Exception {
        System.out.println("Request and Response is completed");
    }
}