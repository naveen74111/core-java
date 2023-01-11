package com.xworkz.colllections.StreamImplem.DTO;

public class DaughterDto extends CompanyCeoDto{

	private String name;
	private Float mobile;
	private Integer age;
	private Boolean isCommitted;
	private Boolean  isalive;
	
	public DaughterDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaughterDto(String name, Float mobile, Integer age, Boolean isCommitted, Boolean isalive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.isCommitted = isCommitted;
		this.isalive = isalive;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 65;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null)
		{
			if(obj instanceof DaughterDto) {
				
				DaughterDto dto = (DaughterDto)obj;
				if(dto.getName().equals(this.name)){
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

	public Float getMobile() {
		return mobile;
	}

	public void setMobile(Float mobile) {
		this.mobile = mobile;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsCommitted() {
		return isCommitted;
	}

	public void setIsCommitted(Boolean isCommitted) {
		this.isCommitted = isCommitted;
	}

	public Boolean getIsalive() {
		return isalive;
	}

	public void setIsalive(Boolean isalive) {
		this.isalive = isalive;
	}
	
}
