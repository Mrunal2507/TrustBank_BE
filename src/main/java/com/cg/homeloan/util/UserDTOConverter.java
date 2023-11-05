package com.cg.homeloan.util;

import org.springframework.stereotype.Component;

import com.cg.homeloan.dto.UserDTO;
import com.cg.homeloan.entity.User;

@Component
public class UserDTOConverter {

	public UserDTO toUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(user.getUserId());
		userDTO.setUsername(user.getUsername());
		userDTO.setPassword(user.getPassword());
		userDTO.setPhoneNo(user.getPhoneNo());
		userDTO.setEmId(user.getEmId());
		return userDTO;
	}

	public User toUserEntity(UserDTO userDTO) {
		User user = new User();
		user.setUserId(userDTO.getUserId());
		user.setUsername(userDTO.getUsername());
		user.setPassword(userDTO.getPassword());
		user.setPhoneNo(userDTO.getPhoneNo());
		user.setEmId(userDTO.getEmId());
		return user;
	}
}
