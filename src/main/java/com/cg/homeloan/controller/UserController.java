package com.cg.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.dto.UserDTO;
import com.cg.homeloan.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:2003" }, allowedHeaders = "*")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/register")
	public UserDTO registerUser(@RequestBody UserDTO userDTO) {
		return userService.registerUser(userDTO);
	}

	@PostMapping("/login")
	public UserDTO loginUser(@RequestBody UserDTO userDTO) {
		return userService.loginUser(userDTO.getUsername(), userDTO.getPassword());
	}
}
