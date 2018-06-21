package com.lin.ms.web.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by linyan on 2018/6/21.
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
