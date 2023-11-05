package com.cg.homeloan.validations;

import java.util.HashMap;
import java.util.Map;

import com.cg.homeloan.entity.Property;

public class PropertyValidators {

	public PropertyValidators() {

	}

	public Map<String, String> validate(Property property) {

		Map<String, String> errors = new HashMap<>();

		// Validate the ftName field.
		if (property.getFtName().isEmpty()) {
			errors.put("ftName", "The ft name field is empty.");
		} else if (property.getFtName().length() > 12) {
			errors.put("ftName", "The ft name field must be less than 12 alphabets.");
		} else if (!property.getFtName().matches("[a-zA-Z]+")) {
			errors.put("ftName", "The ft name field must contain only alphabets.");
		}

		// Validate the ltName field.
		if (property.getLtName().isEmpty()) {
			errors.put("ltName", "The lt name field is empty.");
		} else if (property.getLtName().length() > 15) {
			errors.put("ltName", "The lt name field must be less than 15 characters.");
		} else if (!property.getLtName().matches("[a-zA-Z]+")) {
			errors.put("ltName", "The lt name field must contain only alphabets.");
		}

		// Validate the phoneNumber field.
		String phoneNumber = "^\\d{10}$";
		if (property.getPhoneNumber().isEmpty()) {
			errors.put("phoneNumber", "phoneNumber field is empty.");
		} else if (!property.getPhoneNumber().matches(phoneNumber)) {
			errors.put("phoneNumber", "phoneNumber field is invalid.");
		}

		// Validate the mailId field.
		String mailId = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		if (property.getMailId().isEmpty()) {
			errors.put("mailId", "mailId field is empty.");
		} else if (!property.getMailId().matches(mailId)) {
			errors.put("mailId", "mailId field is invalid.");
		}
		return errors;

	}

}