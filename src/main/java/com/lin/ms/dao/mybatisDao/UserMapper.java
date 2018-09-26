package com.lin.ms.dao.mybatisDao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lin.ms.document.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author ly
 * @since 2018-05-24
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

	List<User> selectWithoutPsw();
}