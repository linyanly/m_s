package com.lin.ms.service;

import com.baomidou.mybatisplus.service.IService;
import com.lin.ms.document.entity.Permission;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ly
 * @since 2018-06-20
 */
public interface IPermissionService extends IService<Permission> {

	/**
	 * 通过用户id查询url
	 * @param id
	 * @return
	 */
	Set<String> findUrlsByUserId(Integer id);
}
