package com.prowings.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.ProductApi;
import com.prowings.model.Product;

@RestController
public class Caller {

	@Autowired
	ProductApi productApi;
	
	@GetMapping("/callGetAllProducts")
	public void productCaller() {
	
		Product product=productApi.getProductById(2);
		System.out.println("......."+product);
		
	}
}
