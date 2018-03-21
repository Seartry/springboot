package com.newsky.zhangxp.system.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newsky.zhangxp.system.model.User;
import com.newsky.zhangxp.util.JSONResult;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public User getUser(String id) {
		User u = new User();
		u.setId("01");
		u.setName("zhangxp");
		u.setAge(25);
		u.setBirthday(new Date());
		u.setDesc("喜欢书法！");
		return u;
	}
	
	@RequestMapping("/getResult")
	public JSONResult getResult() {
		User u = new User();
		u.setId("01");
		u.setName("zhangxp");
		u.setAge(25);
		u.setBirthday(new Date());
		u.setDesc("喜欢书法！");
		return JSONResult.ok(u);
	}
}
