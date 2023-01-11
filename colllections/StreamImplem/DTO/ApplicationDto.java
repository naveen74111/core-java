package com.xworkz.colllections.StreamImplem.DTO;

public class ApplicationDto {

	private String name;
	private double version;
	private Boolean free;
	private String developedBy;
	private double price;
	
	public ApplicationDto() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDto(String name, double version, Boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDto [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ApplicationDto) {
				ApplicationDto dto = (ApplicationDto)obj;
				return true;
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

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Boolean getFree() {
		return free;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
