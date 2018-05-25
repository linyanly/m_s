package com.lin.ms.service;


import com.baomidou.mybatisplus.service.IService;
import com.lin.ms.document.mybatis.entity.User;
import com.lin.ms.document.mybatis.response.ResultVo;
import sun.security.util.Password;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ly
 * @since 2018-05-24
 */
public interface IUserService extends IService<User> {
	/**
	 * 不带密码的list
	 * @return
	 */
	List<User> userListWithoutPsw();

	ResultVo login(HttpServletRequest request,String userName,String password);
}
