package com.crescendo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.model.Business;
import com.crescendo.repository.BusinessRepository;



@Service
public class BusinessServiceImpl {
	@Autowired
	private BusinessRepository businessRepository;
	
	
	public Business createBusiness(Business business) {
		return businessRepository.save(business);
		
	}
	
	public Business getBusinessById(int id) {
		return businessRepository.findById(id).orElse(null);
		
	}
	public List<Business> getAllBusiness() {
		return businessRepository.findAll();
		
	}
	public Business updateBusiness(Business business) {
		Business oldBusiness=null;
		Optional<Business> optionalbusiness=businessRepository.findById(business.getId());
		if(optionalbusiness.isPresent()) {
			oldBusiness=optionalbusiness.get();
			oldBusiness.setBusinessname(business.getBusinessname());
			oldBusiness.setAddress(business.getAddress());
			oldBusiness.setPhone(business.getPhone());
			businessRepository.save(oldBusiness);
		}else {
			return new Business();
		}
		return oldBusiness;
		
	}
	public String deleteBusiness(int id) {
		 businessRepository.deleteById(id);
		
		 
		 return ("delete");
		 
		
	}
}
