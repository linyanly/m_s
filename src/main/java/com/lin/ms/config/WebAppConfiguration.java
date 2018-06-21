package com.lin.ms.config;

import com.lin.ms.Common.Interceptor.CheckLoginInterceptor;
import com.lin.ms.Common.Interceptor.PermissionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyan on 2018/6/21.
 */
@Configuration
public class WebAppConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		List<String> excludePaths = new ArrayList<>();
		excludePaths.add("/view/*");
		excludePaths.add("/assets/*");
		excludePaths.add("/css/*");
		excludePaths.add("/fonts/*");
		excludePaths.add("/img/*");
		excludePaths.add("/js/*");

		registry.addInterceptor(new CheckLoginInterceptor()).addPathPatterns("/**").excludePathPatterns(excludePaths);
		registry.addInterceptor(new PermissionInterceptor()).addPathPatterns("/**").excludePathPatterns(excludePaths);
		super.addInterceptors(registry);
	}

}
