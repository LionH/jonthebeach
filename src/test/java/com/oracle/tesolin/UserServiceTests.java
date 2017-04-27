package com.oracle.tesolin;

import java.util.Collection;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.oracle.tesolin.entity.User;
import com.oracle.tesolin.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsonFormsApplication.class)
@WebAppConfiguration
@Transactional
public class UserServiceTests {

	@Autowired
	private UserService userService;
	
	@Test
	public void testAddAndSearchUser() {
		User user = new User();
		user.setFirstname("Lionel");
		user.setLastname("Tesolin");
		user.setCompany("Oracle");
		user.setContact(true);
		user.setEmail("lionel.tesolin@oracle.com");
		user.setLanguage("it");
		user.setRole("CEO");
		user.setTopic("Nothing important");
		userService.addUser(user);
		Collection<User> searchUsers = userService.findUsers();
		Assert.assertFalse("Search Flights", searchUsers.isEmpty());
	}
	
}
