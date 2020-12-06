package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Usuario;

public interface UsuarioService {

	public List<Usuario> listaUsuario();

	public List<Usuario> listaUsuarioPorNombre(String nombre);

}
