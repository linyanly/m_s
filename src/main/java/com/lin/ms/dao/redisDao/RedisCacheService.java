package com.lin.ms.dao.redisDao;

import java.util.concurrent.TimeUnit;

/**
 * Created by linyan on 2018/5/16.
 */
public interface RedisCacheService {

	/**
	 * 放置
	 * @param key
	 * @param data
	 * @param second
	 * @param <T>
	 */
	<T> void put(String key,T data,int second,TimeUnit timeUnit);

	/**
	 * 取出
	 * @param key
	 * @return
	 */
	<T>T get(String key,Class<T> cls);
}
