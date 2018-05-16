package com.lin.ms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linyan on 2018/3/23.
 */
@RestController
public class HellowController {

	@RequestMapping("/hello")
	public String hello(){
		System.out.println("Hello,World");
		return "Hello,World";
	}
}
