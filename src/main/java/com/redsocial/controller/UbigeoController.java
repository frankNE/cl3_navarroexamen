package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Ubigeo;
import com.redsocial.service.UbigeoService;

@RestController
@RequestMapping("/api/colegio/ubigeo")
public class UbigeoController {

	@Autowired
	private UbigeoService service;

	@GetMapping("/")
	public ResponseEntity<List<Ubigeo>> lista() {
		return ResponseEntity.ok(service.listaUbigeo());
	}

}
