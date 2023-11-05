package com.cg.homeloan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDTO {

	private int propertyId;
	private String ftName;
	private String ltName;
	private String phoneNumber;
	private String mailId;

}