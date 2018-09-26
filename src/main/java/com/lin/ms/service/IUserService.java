package com.lin.ms.service;


import com.lin.ms.document.entity.User;
import com.lin.ms.document.response.ResultVo;

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
public interface IUserService {
	/**
	 * 不带密码的list
	 * @return
	 */
	List<User> userListWithoutPsw();

	ResultVo login(HttpServletRequest request,String userName,String password);

	String testAspect();

	String fuckAspect(String type);
}
