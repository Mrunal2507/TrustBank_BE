package com.cg.homeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.dto.UserDTO;
import com.cg.homeloan.entity.User;
import com.cg.homeloan.repository.IUserRepository;
import com.cg.homeloan.util.UserDTOConverter;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Autowired
	private UserDTOConverter userConverter;

	@Override
	public UserDTO registerUser(UserDTO userDTO) {
		User user = userConverter.toUserEntity(userDTO);
		user = userRepository.save(user);
		return userConverter.toUserDTO(user);
	}

	@Override
	public UserDTO loginUser(String username, String password) {
		User user = userRepository.findByUsernameAndPassword(username, password);
		if (user != null) {
			return userConverter.toUserDTO(user);
		}
		return null;
	}
}
