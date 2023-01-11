package com.xworkz.colllections.DTO.DTOExample;

public class AirportDto {

	private String name;
	private String location;
	private Integer noOfPlanes;
	
	public AirportDto() {
		
	}

	public AirportDto(String name, String location, Integer noOfPlanes) {
		super();
		this.name = name;
		this.location = location;
		this.noOfPlanes = noOfPlanes;
	}

	@Override
	public boolean equals(Object ref) {
		if(ref!=null)
		{
			if(ref instanceof AirportDto)
			{
				AirportDto dto =(AirportDto)ref;
				if(dto.getName().equals(this.name))
				{
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "AirportDto [name=" + name + ", location=" + location + ", noOfPlanes=" + noOfPlanes + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNoOfPlanes() {
		return noOfPlanes;
	}

	public void setNoOfPlanes(Integer noOfPlanes) {
		this.noOfPlanes = noOfPlanes;
	}

	
	
	
	
	
	
	
	
	
	
	
}
