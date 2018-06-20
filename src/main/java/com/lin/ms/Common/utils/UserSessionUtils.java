package com.lin.ms.Common.utils;
import com.lin.ms.dao.redisDao.RedisCacheService;
import com.lin.ms.document.redis.CurrentUser;

/**
 * Created by linyan on 2018/6/13.
 */
public class UserSessionUtils {

	public static CurrentUser getCurrentUserInfo(){
		String id = RequestUtils.getSession().getId();
		RedisCacheService redisCacheService = SpringUtils.getBean(RedisCacheService.class);
		CurrentUser user = redisCacheService.get(id, CurrentUser.class);
		return user;
	}
}
