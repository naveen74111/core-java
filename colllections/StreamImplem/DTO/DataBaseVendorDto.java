package com.xworkz.colllections.StreamImplem.DTO;

public class DataBaseVendorDto {

	private String name;
	private String developedBy;
	private Type type;
	private Double licenseCost;
	
	public DataBaseVendorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDto(String name, String developedBy, Type type, Double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDto [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", licenseCost="
				+ licenseCost + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	
		if(obj!=null) {
			if(obj instanceof DataBaseVendorDto) {
				DataBaseVendorDto dto = (DataBaseVendorDto)obj;
				if(dto.getName().equals(this.name))
				{
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(Double licenseCost) {
		this.licenseCost = licenseCost;
	}
	
	
}
