package com.ew.user.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ew.user.model.Users;
import com.ew.user.repository.UserRepository;

@Transactional
@Component
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepo;

	@Override
	public Long save(Users user) {

		try {
			Users newUser = userRepo.save(user);
			return newUser.getId();
		} catch (Exception e) {
			log.error("Error saving user");
		}

		return null;
	}

	@Override
	public Users findByIdOrUname(long id, String uName) {
		
		try {
			return userRepo.findByIdOrUname(id, uName);
		} catch (Exception e) {
			log.error("Error getting user");
		}
		return null;
	}

}
