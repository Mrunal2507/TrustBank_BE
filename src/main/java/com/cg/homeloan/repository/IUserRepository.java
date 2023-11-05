package com.cg.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.homeloan.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	User findByUsernameAndPassword(String username, String password);
}
