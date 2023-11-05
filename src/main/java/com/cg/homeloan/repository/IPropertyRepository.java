package com.cg.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entity.Property;

@Repository
public interface IPropertyRepository extends JpaRepository<Property, Integer> {

	public static Property getPropertyByHomeName(String homeName) {
		// TODO Auto-generated method stub
		return null;
	}

}