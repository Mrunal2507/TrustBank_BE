package com.cg.homeloan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int propertyId;
	private String ftName;
	private String ltName;
	private String phoneNumber;
	private String mailId;

	public Property(int propertyId, String ftName, String ltName, String phoneNumber, String mailId) {
		super();
		this.propertyId = propertyId;
		this.ftName = ftName;
		this.ltName = ltName;
		this.phoneNumber = phoneNumber;
		this.mailId = mailId;
	}

}