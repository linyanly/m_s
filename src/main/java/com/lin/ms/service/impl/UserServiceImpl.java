package com.lin.ms.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lin.ms.dao.mybatisDao.UserMapper;
import com.lin.ms.document.mybatis.entity.User;
import com.lin.ms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public List<User> userListWithoutPsw() {
		List<User> users = baseMapper.selectWithoutPsw();
		return users;
	}
}
