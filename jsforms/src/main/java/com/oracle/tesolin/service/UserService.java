package com.oracle.tesolin.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.tesolin.dao.UserDao;
import com.oracle.tesolin.entity.User;

@RestController
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/addUser",method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userDao.save(user);
	}
	
	@RequestMapping("/findUsers")
	public Collection<User> findUsers() {
		return userDao.findAll();
	}
	
	
}
