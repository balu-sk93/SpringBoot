package com.ew.user.service;

import com.ew.user.model.Users;

public interface UserService {

	Long save(Users user);
	
	Users findByIdOrUname(long id, String uName);
	
}
