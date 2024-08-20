package com.example.controller.interceptor;

import com.example.exception.GraceException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

@Slf4j
public class UserInfoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("userId");
        String userToken = request.getHeader("userToken");
        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(userToken)){
            log.error("Don't just lemme guess what you want to put. ");
            GraceException.display("Don't just lemme guess what you want to put. ");
            return false;
        }

        if(!userId.equalsIgnoreCase("1001") || !userToken.equalsIgnoreCase("serena")) {
            log.error("Yeah, you are not the one~ For~^ Me^~~ I'll not be there to~ save~ your~ day ~");
            GraceException.display("Yeah, you are not the one~ For~^ Me^~~ I'll not be there to~ save~ your~ day ~");
            return false;
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
