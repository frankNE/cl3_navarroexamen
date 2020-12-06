package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Usuario;
import com.redsocial.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	@Override
	public List<Usuario> listaUsuario() {

		return repository.findAll();
	}

	@Override
	public List<Usuario> listaUsuarioPorNombre(String nombre) {

		return repository.listaPorNombre(nombre);
	}

}
