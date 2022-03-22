package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceLayer;

@RestController
public class TatacliqController {
	@Autowired	
	private ServiceLayer serviceLayer;
	@GetMapping("/")
	public String getItemsf() {
		return serviceLayer.tatacliqApi();				
	}
}
