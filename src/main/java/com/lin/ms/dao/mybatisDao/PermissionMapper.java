package com.lin.ms.dao.mybatisDao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lin.ms.document.entity.Permission;

import java.util.Set;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author ly
 * @since 2018-06-20
 */
public interface PermissionMapper extends BaseMapper<Permission> {

	Set<String> findUrlsByUserId(Integer id);
}