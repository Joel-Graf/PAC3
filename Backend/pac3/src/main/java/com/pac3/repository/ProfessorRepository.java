package com.pac3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pac3.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
	List<Professor> findByNome(String nome);
}
