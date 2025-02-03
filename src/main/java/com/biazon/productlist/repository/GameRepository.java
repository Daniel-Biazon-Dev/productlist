package com.biazon.productlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biazon.productlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
