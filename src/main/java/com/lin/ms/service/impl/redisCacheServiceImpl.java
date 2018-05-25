package com.lin.ms.service.impl;

import com.lin.ms.dao.redisDao.RedisCacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by linyan on 2018/5/16.
 */
@Slf4j
@Service("redisCacheService")
public class redisCacheServiceImpl implements RedisCacheService{

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public <T> void put(String key, T data) {

	}

	@Override
	public <T> T get(String key, Class<T> cls) {
		return null;
	}
}
