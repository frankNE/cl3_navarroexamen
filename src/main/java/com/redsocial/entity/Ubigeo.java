package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ubigeo")
public class Ubigeo {

	@Id
	private int idUbigeo;
	private String departamento;
	private String provincia;
	private String distrito;

}
