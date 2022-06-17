package com.residencia.academia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.academia.entity.Atividade;



public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{
	Optional<Atividade> findByNomeAtividade(String nome);
}
