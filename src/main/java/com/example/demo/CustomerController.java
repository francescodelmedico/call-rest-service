package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@GetMapping("")
	public ResponseEntity<List<Customer>> findAllCustomer() {
		try {
			List<Customer> customerList = new ArrayList<>();
			Customer customer1 = new Customer();
			customer1.setId(1);
			customer1.setName("FRANCESCO");
			customerList.add(customer1);
			Customer customer2 = new Customer();
			customer2.setId(2);
			customer2.setName("LORENZO");
			customerList.add(customer2);			
			Customer customer3 = new Customer();
			customer3.setId(3);
			customer3.setName("ANTONELLA");
			customerList.add(customer3);			
			return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
