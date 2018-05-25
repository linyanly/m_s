package com.lin.ms.dao.mybatisDao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lin.ms.document.mybatis.entity.User;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author ly
 * @since 2018-05-24
 */
public interface UserMapper extends BaseMapper<User> {

	List<User> selectWithoutPsw();
}