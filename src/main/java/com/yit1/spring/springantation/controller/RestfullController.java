package com.yit1.spring.springantation.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yit1.spring.springantation.pojo.User;

@RestController
@RequestMapping("rest")
public class RestfullController {
	@GetMapping("get")
	public String getData() {
		System.out.println("111");
		return "hello";
	}
	@GetMapping("getuser")
	public User getuser() {
		User user = new User();
		user.setName("yit1");
		user.setAge("14");
		return user;
	}
	@GetMapping("getuserbyid/{id}")
	public User getuser(@PathVariable(name = "id") String id) {
		User user = new User();
		user.setName("yit1" +id);
		user.setAge("14" +id);
		return user;
	}
	@PostMapping("post")
	public User addUser(@RequestBody User user) {
		System.out.println(user);
		return user;
	}
	@GetMapping("returnuser")
	@ResponseBody
	public User returnUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		User user1 = new User();
		user1.setName("yit1222222");
		user1.setAge("14222222222");
		return user1;
	}

}
