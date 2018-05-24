package com.lin.ms.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lin.ms.dao.mybatisDao.UserMapper;
import com.lin.ms.document.mybatis.entity.User;
import com.lin.ms.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ly
 * @since 2018-05-24
 */
@Service("userServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
