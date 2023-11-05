package com.cg.homeloan.service;

import org.springframework.stereotype.Service;

import com.cg.homeloan.entity.Property;

@Service
public interface IPropertyService {

	public Property addProperty(Property property);

	public Property getPropertyByHomeName(String homeName);

}