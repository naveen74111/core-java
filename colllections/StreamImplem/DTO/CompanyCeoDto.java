package com.xworkz.colllections.StreamImplem.DTO;

public class CompanyCeoDto {

	private String name;
	private String company;
	private String contry;
	private Integer age;
	private String qualification;
	private String married;
	
	private DaughterDto daughterDto;

	public CompanyCeoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyCeoDto(String name, String company, Integer age,String contry, String qualification, String married,
			DaughterDto daughterDto) {
		super();
		this.name = name;
		this.company = company;
		this.contry = contry;
		this.age = age;
		this.qualification = qualification;
		this.married = married;
		this.daughterDto = daughterDto;
	}

	@Override
	public String toString() {
		return "CompanyCeoDto [name=" + name + ", company=" + company + ", age=" + age +  ", contry=" + contry +", qualification="
				+ qualification + ", married=" + married + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 14;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof CompanyCeoDto)
			{
				CompanyCeoDto dto =(CompanyCeoDto)obj;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public String contry() {
		return contry;
	}

	public void contry(String contry) {
		this.contry = contry;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public DaughterDto getDaughterDto() {
		return daughterDto;
	}

	public void setDaughterDto(DaughterDto daughterDto) {
		this.daughterDto = daughterDto;
	}

	
	
}
