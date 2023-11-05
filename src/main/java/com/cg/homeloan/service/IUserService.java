package com.cg.homeloan.service;

import com.cg.homeloan.dto.UserDTO;

public interface IUserService {

	UserDTO registerUser(UserDTO userDTO);

	UserDTO loginUser(String username, String password);
}
