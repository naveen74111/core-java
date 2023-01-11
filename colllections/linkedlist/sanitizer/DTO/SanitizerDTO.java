package com.xworkz.colllections.linkedlist.sanitizer.DTO;

public class SanitizerDTO {
	
	public int id;
	public String brand;
	public double price;
	public String color;
	
	public SanitizerDTO()
	{
		
	}


	public SanitizerDTO(int id, String brand, double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}


	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
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
