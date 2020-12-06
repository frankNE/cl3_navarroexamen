package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Ubigeo;
import com.redsocial.repository.UbigeoRepository;

@Service
public class UbigeoServiceImpl implements UbigeoService {

	@Autowired
	private UbigeoRepository repository;

	@Override
	public List<Ubigeo> listaUbigeo() {
		return repository.findAll();
	}

}
