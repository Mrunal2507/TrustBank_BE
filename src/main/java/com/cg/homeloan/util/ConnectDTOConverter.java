package com.cg.homeloan.util;

import org.springframework.stereotype.Component;

import com.cg.homeloan.dto.ConnectDTO;
import com.cg.homeloan.entity.Connect;

@Component
public class ConnectDTOConverter {

	public ConnectDTO toConnectDTO(Connect connect) {
		ConnectDTO connectDTO = new ConnectDTO();
		connectDTO.setConnectId(connect.getConnectId());
		connectDTO.setName(connect.getName());
		connectDTO.setPhnNo(connect.getPhnNo());
		connectDTO.setEmilId(connect.getEmilId());
		return connectDTO;
	}

	public Connect toConnectEntity(ConnectDTO connectDTO) {
		Connect connect = new Connect();
		connect.setConnectId(connectDTO.getConnectId());
		connect.setName(connectDTO.getName());
		connect.setPhnNo(connectDTO.getPhnNo());
		connect.setEmilId(connectDTO.getEmilId());
		return connect;
	}
}
