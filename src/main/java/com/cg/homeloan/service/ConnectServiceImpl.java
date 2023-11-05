package com.cg.homeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.dto.ConnectDTO;
import com.cg.homeloan.entity.Connect;
import com.cg.homeloan.repository.IConnectRepository;
import com.cg.homeloan.util.ConnectDTOConverter;

@Service
public class ConnectServiceImpl implements IConnectService {

	@Autowired
	private IConnectRepository connectRepository;

	@Autowired
	private ConnectDTOConverter connectConverter;

	@Override
	public ConnectDTO connectWithAgent(ConnectDTO connectDTO) {
		Connect connect = connectConverter.toConnectEntity(connectDTO);
		connect = connectRepository.save(connect);
		return connectConverter.toConnectDTO(connect);
	}
}
