package com.xworkz.colllections.DTO.DTOExample;



public class GamesDto {

	private String name;
	private String type;
	private Integer noOfPlayers;
	
	public GamesDto() {
	
		
	}

	public GamesDto(String name, String type, Integer noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public String toString() {
		return "Games [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}
	
	

	@Override
	public boolean equals(Object ref) {
	
		if(ref !=null)
		{
			if(ref instanceof GamesDto) {
				GamesDto dto = (GamesDto)ref;
				if(dto.getName().equals(this.name)) {
					return true;
					
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	
	
}
