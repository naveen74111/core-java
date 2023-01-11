package com.xworkz.colllections.linkedlist.ListImplem.dto;

import java.io.Serializable;

public class CakeDto implements Serializable {

	private String name;
	private double price;
	private String color;

	public CakeDto() {

	}

	public CakeDto(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof CakeDto) {
				CakeDto dto = (CakeDto)obj;
				if(dto.name.equals(this.name)&& dto.price== this.price) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
