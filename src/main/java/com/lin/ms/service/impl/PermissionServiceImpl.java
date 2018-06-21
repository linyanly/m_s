package com.lin.ms.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lin.ms.dao.mybatisDao.PermissionMapper;
import com.lin.ms.document.entity.Permission;
import com.lin.ms.document.entity.Role;
import com.lin.ms.service.IPermissionService;
import com.lin.ms.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ly
 * @since 2018-06-20
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {


	@Override
	public Set<String> findUrlsByUserId(Integer id) {
		Set<String> urls = baseMapper.findUrlsByUserId(id);
		return urls;
	}
}
