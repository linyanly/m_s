package com.lin.ms.Common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by linyan on 2018/6/13.
 */
@Component
public class SpringUtils implements ApplicationContextAware{

	private static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if(SpringUtils.applicationContext == null)
			SpringUtils.applicationContext = applicationContext;
	}

	public static ApplicationContext getContext(){
		return SpringUtils.applicationContext;
	}

	public static <T>T getBean(Class<T> clz){
		T bean = applicationContext.getBean(clz);
		return bean;
	}
}
