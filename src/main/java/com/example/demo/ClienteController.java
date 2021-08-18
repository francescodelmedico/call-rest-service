package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@GetMapping("")
	public ResponseEntity<List<Cliente>> findAllCliente() {
		try {
			List<Cliente> clienteList = new ArrayList<>();
			Cliente cliente1 = new Cliente();
			cliente1.setId(1);
			cliente1.setNome("FRANCESCO");
			clienteList.add(cliente1);
			Cliente cliente2 = new Cliente();
			cliente2.setId(2);
			cliente2.setNome("LORENZO");
			clienteList.add(cliente2);			
			Cliente cliente3 = new Cliente();
			cliente3.setId(3);
			cliente3.setNome("ANTONELLA");
			clienteList.add(cliente3);			
			return new ResponseEntity<List<Cliente>>(clienteList, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
