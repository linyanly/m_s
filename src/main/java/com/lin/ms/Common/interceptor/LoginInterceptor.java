package com.lin.ms.Common.interceptor;

import com.lin.ms.Common.Enum.NyEnum;
import com.lin.ms.Common.utils.UserSessionUtils;
import com.lin.ms.document.redis.CurrentUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by linyan on 2018/6/22.
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.info("-登录拦截器拦截_url:[{}]-",request.getRequestURI());

		CurrentUser currentUserInfo = UserSessionUtils.getCurrentUserInfo();
		if(currentUserInfo == null){
			response.sendRedirect("/static/view/login.html");
			return false;
		}

		if(NyEnum.Y.getCode().equals(currentUserInfo.getIsAdmin())){
			return true;
		}

		if(!currentUserInfo.getUrl().contains(request.getRequestURI())){
			response.sendRedirect("/static/view/403.html");
			return false;
		}

		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
		System.out.println("==2==");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
		System.out.println("==3==");
	}

}
