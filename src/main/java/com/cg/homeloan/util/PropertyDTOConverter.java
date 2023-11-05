package com.cg.homeloan.util;

import org.springframework.stereotype.Component;

import com.cg.homeloan.dto.PropertyDTO;
import com.cg.homeloan.dto.PropertyResponseDTO;
import com.cg.homeloan.entity.Property;

@Component
public class PropertyDTOConverter {

	public PropertyResponseDTO convertTo(Property property) {
		PropertyResponseDTO dto = new PropertyResponseDTO();
		dto.setPropertyId(property.getPropertyId());
		dto.setFtName(property.getFtName());
		dto.setLtName(property.getLtName());
		dto.setPhoneNumber(property.getPhoneNumber());
		dto.setMailId(property.getMailId());
		return dto;

	}

	public PropertyDTO getPropertyDTO(Property property) {

		return new PropertyDTO(property.getPropertyId(),
				property.getFtName(), property.getLtName(), property.getPhoneNumber(), property.getMailId());

	}

}