package com.example.demo.utility;
//package com.example.utility;
//
//import java.io.IOException;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import com.example.response.CrearteShippmentResponse;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import createshippment.Items;
//
//@Component
//public class MagentoUtility {
//	
//	@Autowired
//	private RestTemplate template;
//	HttpHeaders header = null;
//	ObjectMapper mapper = null;
//	
//	@PostConstruct
//	public void init() {
//		header = new HttpHeaders();
//		header.setContentType(MediaType.APPLICATION_JSON);
//	}
//	
//	public CrearteShippmentResponse itemDetails(Items item) {
//		String result ="";
//		try 
//		{
//			String jsonRequest = mapper.writeValueAsString(item);
//			HttpEntity<String> entity = new HttpEntity<String>(jsonRequest,header);
//			result = template.patchForObject("", entity, String.class);
//			
//			
//		}catch(IOException ex) {}
//		
//		return null;
//		
//	}
//	
//
//}
