package com.gavin.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.gavin.model.User;
import com.gavin.service.DemoService;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List getUsers() {
		List list = new ArrayList();
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("1");

		User u2 = new User();
		u2.setName("tom");
		u2.setAge(21);
		u1.setSex("1");

		User u3 = new User();
		u3.setName("rose");
		u3.setAge(19);
		u1.setSex("2");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}
}
