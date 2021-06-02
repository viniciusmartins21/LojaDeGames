package com.gamestore.minhaLojaDeGames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table (name = "tb_categoria")
public class Categoria {

	//gerando os dados das colunas do Sql
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size (max = 100)
	@NotNull
	private String titulo;
	
	@NotNull
	@Size(max = 50)
	private String genero;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date date = new java.sql.Date(System.currentTimeMillis());

	
	//gerando getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenereo() {
		return genero;
	}

	public void setGenereo(String genereo) {
		this.genero = genereo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
