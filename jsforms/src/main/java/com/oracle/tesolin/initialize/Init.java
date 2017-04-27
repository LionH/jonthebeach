package com.oracle.tesolin.initialize;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oracle.tesolin.dao.UserDao;

@Component
public class Init {

	@Autowired
	private UserDao userDao;

	@PostConstruct
	@Transactional
	private void init() {
		
	}
}
