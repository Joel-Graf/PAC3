package com.pac3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pac3.entity.Dificuldade;

@Repository
public interface DificuldadeRepository  extends JpaRepository<Dificuldade, Long>{

	Optional<Dificuldade> findById(Long id);
}
