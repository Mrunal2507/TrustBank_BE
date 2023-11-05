package com.cg.homeloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entity.Mortgage;
import com.cg.homeloan.repository.IMortgageRepository;

@Service

public class MortgageServiceImpl implements IMortgageService {

	@Autowired
	IMortgageRepository mortgageRepository;

	@Override
	public Mortgage addMortgage(Mortgage mortgage) {

//		MortgageValidator mortgageValidator = new MortgageValidator();
//		Map<String, String> errors = mortgageValidator.validate(mortgage);
//
//		if (!errors.isEmpty()) {
//			for (String fieldName : errors.keySet()) {
//				System.err.println(errors.get(fieldName));
//			}
//			return null;
//		}

		return mortgageRepository.save(mortgage);
	}

	@Override
	public List<Mortgage> getAllMortgage() {
		return mortgageRepository.findAll();
	}

	@Override
	public Mortgage getMortgageById(int mortId) {
		return mortgageRepository.getReferenceById(mortId);
	}

	@Override
	public Mortgage updateMortgageById(int mortId) {
		return mortgageRepository.getReferenceById(mortId);
	}

	@Override
	public void deleteMortgageById(int mortId) {
		mortgageRepository.deleteById(mortId);
	}
}
