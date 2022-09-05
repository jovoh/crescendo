package com.crescendo.controller.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.crescendo.model.Business;
import com.crescendo.service.BusinessServiceImpl;






@RestController
public class BusinessController {
	
	@Autowired
	private BusinessServiceImpl businessService;
	

	@PostMapping("/addBusiness")
	public Business addBusiness(@RequestBody Business business) {
		return businessService.createBusiness(business);
	}
	
	@GetMapping("/business/{id}")
	public Business getBusinessById(@PathVariable int id) {
		return businessService.getBusinessById(id);
	}
	@GetMapping("/allBusiness")
	public List<Business> getAllBusiness() {
		return businessService.getAllBusiness();
	}
	@PutMapping("/updateBusiness")
	public Business updateBusiness(@RequestBody Business business) {
		return businessService.updateBusiness(business);
	}

	@DeleteMapping("/business/{id}")
	public String deleteUser(@PathVariable int id) {
		
		return businessService.deleteBusiness(id);
	}
}
