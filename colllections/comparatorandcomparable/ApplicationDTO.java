package com.xworkz.colllections.comparatorandcomparable;

public class ApplicationDTO implements Comparable<ApplicationDTO> {

	private String name;
	private int version;
	private Boolean free;
	private String developedBy;
	private double price;

	public ApplicationDTO() {

	}

	public ApplicationDTO(String name, int version, Boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ApplicationDTO) {
				ApplicationDTO dto = (ApplicationDTO) obj;
				if (dto.getName().equals(this.name)) {
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
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

	@Override
	public int compareTo(ApplicationDTO o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}


}
