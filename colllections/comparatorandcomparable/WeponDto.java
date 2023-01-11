package com.xworkz.colllections.comparatorandcomparable;

public class WeponDto implements Comparable<WeponDto> {

	private String name;
	private String madeBY;
	private String madeOn;
	private Integer price;
	private Type type;
	
	public WeponDto() {
		super();
	}

	public WeponDto(String name, String madeBY, String madeOn, Integer price, Type type) {
		super();
		this.name = name;
		this.madeBY = madeBY;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBY=" + madeBY + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int compareTo(WeponDto o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 85;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof WeponDto){
				WeponDto dto = (WeponDto)obj;
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

	public String getMadeBY() {
		return madeBY;
	}

	public void setMadeBY(String madeBY) {
		this.madeBY = madeBY;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
}
