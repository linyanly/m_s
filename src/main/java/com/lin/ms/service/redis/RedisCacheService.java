package com.lin.ms.service.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by linyan on 2018/5/16.
 */
public interface RedisCacheService {

	/**
	 * 以ky对形式存储
	 * @param key
	 * @param data
	 * @param <T>
	 */
	public <T> void put(String key,T data);

	/**
	 * 取值
	 * @param key
	 * @param cls
	 * @param <T>
	 * @return
	 */
	public  <T> T get(String key,Class<T> cls);
}
