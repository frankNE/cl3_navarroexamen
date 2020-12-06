package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("Select e from Usuario e where e.nombres = :var_filtro")
	public List<Usuario> listaPorNombre(@Param("var_filtro") String filtro);

}
