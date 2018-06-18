package com.mycompany.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter{
    
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            // 세션정보가 없을경우 로그인페이지로 이동     	
				if(request.getSession().getAttribute("users_id") == null ){
					response.sendRedirect("/");
					return false;
					}	
			} catch (Exception e) {
				e.printStackTrace();
			}
        // 세션정보가 있을경우  main 페이지 이동
        return true;
    }
 /*
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
 
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
  */  
}