package com.biazon.productlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biazon.productlist.dto.GameMinDTO;
import com.biazon.productlist.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping()
	public List<GameMinDTO> findAllGames(){
		return gameService.findAllGames();
		
	}
}
