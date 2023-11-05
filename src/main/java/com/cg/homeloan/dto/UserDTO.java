package com.cg.homeloan.dto;

import lombok.Data;

@Data
public class UserDTO {
	private Long userId;
	private String username;
	private String password;
	private String phoneNo;
	private String emId;
}
