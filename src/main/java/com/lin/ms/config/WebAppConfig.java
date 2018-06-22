package com.lin.ms.config;

import com.lin.ms.Common.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyan on 2018/6/22.
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer{

	@Autowired
	LoginInterceptor loginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> excludes = new ArrayList<>();
		excludes.add("/static/**");
		excludes.add("/error");
		excludes.add("/api/user/login");

		registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(excludes);
	}



	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

}
