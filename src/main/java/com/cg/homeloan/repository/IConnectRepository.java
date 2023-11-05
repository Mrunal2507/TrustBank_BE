package com.cg.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.homeloan.entity.Connect;

public interface IConnectRepository extends JpaRepository<Connect, Long> {
	// You can add custom query methods if needed
}
