package com.oracle.tesolin.dao;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.oracle.tesolin.entity.User;

public interface UserDao extends CrudRepository<User,Long> {
	User getById(long id);
	User getByLastname(String lastname);
	Collection<User> findAll();
	User save(User user);
}
