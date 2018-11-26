package com.ew.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ew.user.model.Users;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Users, Long> {
	
	Users findByIdOrUname(long id, String uName);
	
}

