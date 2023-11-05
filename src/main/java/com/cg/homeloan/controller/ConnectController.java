package com.cg.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.dto.ConnectDTO;
import com.cg.homeloan.service.IConnectService;

@RestController
@RequestMapping("/connect")
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:2003" }, allowedHeaders = "*")
public class ConnectController {

	@Autowired
	private IConnectService connectService;

	@PostMapping("/agent")
	public ConnectDTO connectWithAgent(@RequestBody ConnectDTO connectDTO) {
		return connectService.connectWithAgent(connectDTO);
	}
}
