package com.lin.ms.web.controller.api;

import com.lin.ms.document.mybatis.entity.User;
import com.lin.ms.document.mybatis.response.ResultVo;
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
		ResultVo resultVo = userService.login(request, userName, password);
		return resultVo;
	}


}
