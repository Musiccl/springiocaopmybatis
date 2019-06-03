package com.dzh.interceptor;

import com.dzh.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        System.out.println(uri);
        if (uri.equals("/login.html") || uri.equals("/reg.html")) {
            return true;
        }
        HttpSession session = httpServletRequest.getSession();
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");

        if (userInfo!=null) {
            return true;
        }
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
