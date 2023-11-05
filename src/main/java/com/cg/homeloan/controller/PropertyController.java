package com.cg.homeloan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.dto.PropertyDTO;
import com.cg.homeloan.entity.Property;
import com.cg.homeloan.service.IPropertyService;
import com.cg.homeloan.util.PropertyDTOConverter;

@RestController
@RequestMapping("/property")
@CrossOrigin(origins = "http://localhost:4200")

public class PropertyController {

	private final Logger loggers = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private IPropertyService propertyService;
	@Autowired
	private PropertyDTOConverter propertyDTOConvertor;

	public PropertyController() {
		loggers.info("---------- Property Controller Called ----------");
		loggers.warn("---------- Property Controller Called ----------");
		System.err.println(
				"--------------------------------------- Welcome to Property Form -------------------------------------");
	}

	@PostMapping("/add")
	public ResponseEntity<Property> addProperty(@RequestBody Property property) throws Exception {
		return new ResponseEntity<>(propertyService.addProperty(property), HttpStatus.OK);
	}

	@GetMapping("/homeName/{homeName}")
	public ResponseEntity<PropertyDTO> getPropertyByHomeName(@PathVariable String homeName) {
		Property savedProperty = propertyService.getPropertyByHomeName(homeName);
		PropertyDTO dto = propertyDTOConvertor.getPropertyDTO(savedProperty);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

}