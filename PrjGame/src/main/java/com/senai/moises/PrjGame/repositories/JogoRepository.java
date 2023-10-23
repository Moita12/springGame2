package com.senai.moises.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.moises.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}
