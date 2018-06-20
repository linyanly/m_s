package com.lin.ms.web.controller.api;

import com.lin.ms.Common.utils.UserSessionUtils;
import com.lin.ms.document.entity.User;
import com.lin.ms.document.redis.CurrentUser;
import com.lin.ms.document.response.ResultVo;
import com.lin.ms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by linyan on 2018/5/24.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired IUserService userService;

	@RequestMapping("list")
	public List<User> list(){
		List<User> users = userService.userListWithoutPsw();
		return users;
	}


	@RequestMapping("login")
	public ResultVo login(HttpServletRequest request,String userName,String password){
		userName = "admin";
		password = "root";

		ResultVo resultVo = userService.login(request, userName, password);
		return resultVo;
	}


	@RequestMapping("getUser")
	public CurrentUser getUserInfo(){
		CurrentUser userInfo = UserSessionUtils.getCurrentUserInfo();
		return userInfo;
	}




}
