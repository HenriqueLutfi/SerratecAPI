package com.residencia.firstapi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "autor_id")
	private Integer autor_id;
	@Column(name = "autor_nome")
	private String autorNome;

	@OneToMany(mappedBy = "autor")
	@JsonIgnore
	private List<Livro> livroList;

	public Integer getAutor_id() {
		return autor_id;
	}

	public void setAutor_id(Integer autor_id) {
		this.autor_id = autor_id;
	}

	public String getAutorNome() {
		return autorNome;
	}

	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}

	public List<Livro> getLivroList() {
		return livroList;
	}

	public void setLivroList(List<Livro> livroList) {
		this.livroList = livroList;
	}

}