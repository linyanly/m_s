package com.lin.ms.service.impl;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.lin.ms.dao.redisDao.RedisCacheService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by linyan on 2018/5/16.
 */
@Slf4j
@Service("redisCacheService")
public class redisCacheServiceImpl implements RedisCacheService{

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public <T> void put(String key, T data, int second, TimeUnit timeUnit) {
		try {
			redisTemplate.opsForValue().set(key,data,second,timeUnit.MINUTES);
		} catch (Exception e) {
			log.error("redis key:{],data:{},error:{}",key,data,e);
		}
	}

	@Override
	public <T> T get(String key, Class<T> cls) {
		T data = null;
		try {
			data = (T)redisTemplate.opsForValue().get(key);

		} catch (Exception e) {
			log.error("redis key:{],data:{},error:{}",key,data,e);
		}
		return data;
	}

}
