package com.residencia.academia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.academia.dto.InstrutorDTO;
import com.residencia.academia.entity.Instrutor;
import com.residencia.academia.entity.Turma;

public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {

	Optional<Instrutor> findByCpf(String nome);
	Optional<Instrutor> findByNomeInstrutor(String nome);
	
	
}
