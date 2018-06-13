package com.lin.ms.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by linyan on 2018/5/24.
 */
@Configuration
@MapperScan("com.lin.ms.dao.mybatis*")//生成Mapper代理类
public class MoreConfig {
	/**
	 * mybatisPlus分页
	 * @return
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType("mysql");
		return page;
	}

}
