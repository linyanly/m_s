package com.lin.ms.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lin.ms.dao.mybatisDao.UserMapper;
import com.lin.ms.dao.redisDao.RedisCacheService;
import com.lin.ms.document.mybatis.entity.User;
import com.lin.ms.document.mybatis.response.ResultVo;
import com.lin.ms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ly
 * @since 2018-05-24
 */
@Service("userServiceImpl")
@Slf4j
public class UserServiceImpl implements IUserService {

	@Autowired
	private RedisCacheService redisCacheService;

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> userListWithoutPsw() {
		List<User> users = userMapper.selectWithoutPsw();
		return users;
	}

	@Override
	public ResultVo login(HttpServletRequest request, String userName, String password) {
		User where = new User();
		where.setName(userName);
		where.setPassword(password);
		try {
			User user = userMapper.selectOne(where);
			if(user != null){
				user.setPassword(null);
				String requestedSessionId = request.getRequestedSessionId();
				//把用户信息放到redis
				redisCacheService.put(requestedSessionId,user,30, TimeUnit.MICROSECONDS);
				return new ResultVo(ResultVo.SUCCESS_CODE,"登录成功");
			}else {
				return new ResultVo(ResultVo.FAIL_CODE,"用户名或密码不正确");
			}
		} catch (Exception e) {
			log.error("登录失败:{}",e);
		}
		return new ResultVo(ResultVo.ERROR_CODE,"系统出错,请联系管理员");
	}
}
