package com.xworkz.colllections.DTO;

import com.xworkz.colllections.DTO.DTOExample.GamesDto;

public class GamesRunner {

	public static void main(String[] args) {
		
		GamesDto game = new GamesDto("Kabaddi","indor",14);
		GamesDto game1 = new GamesDto("koko","indor",12);
		GamesDto game2 = new GamesDto("Kabaddi","outdor",14);
		GamesDto game3 = new GamesDto("cricket","outdor",15);
		GamesDto game4 = new GamesDto("basketball","outdor",16);
		GamesDto game5 = new GamesDto("wollyball","indor",13);

		Boolean result = game1.getType().equals(game2.getType());
		System.out.println("result : " +result);
		
		Boolean sol =  game1.getName().equals(game2.getName());
		System.out.println("result : "+ sol);
		
		Boolean sol1 = game2.getName().equals(game.getName());
		System.out.println("result : "+ sol1);
		
		Boolean sol2 = game1.getNoOfPlayers().equals(game2.getNoOfPlayers());
		System.out.println("result : "+ sol2);
		
		Boolean sol3 = game.getNoOfPlayers().equals(game2.getNoOfPlayers());
		System.out.println("result : " + sol3);
		
		Boolean sol4 = game1.getType().equals(game5.getType());
		System.out.println("result : "+sol4);
		
	}
	
}
