package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ServiceLayer;

@RestController
public class TatacliqController {
	
	private final ServiceLayer serviceLayer;
	@Autowired	
	public TatacliqController(ServiceLayer serviceLayer) 
	{
		this.serviceLayer = serviceLayer;
	}


	@GetMapping("/")
	public String getItemsf() {
		return serviceLayer.tatacliqApi();
				
	}
	
}
