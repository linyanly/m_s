package com.lin.ms.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lin.ms.dao.mybatisDao.RoleMapper;
import com.lin.ms.document.entity.Role;
import com.lin.ms.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ly
 * @since 2018-06-20
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}
