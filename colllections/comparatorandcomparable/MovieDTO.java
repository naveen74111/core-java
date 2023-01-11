package com.xworkz.colllections.comparatorandcomparable;

import java.time.LocalDate;

public class MovieDTO implements Comparable<MovieDTO> {

	private String name;
	private double budget;
	private LocalDate date;
	private String language;
	private double price;

	public MovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Object) {

				MovieDTO ref = (MovieDTO) obj;
				if (ref.name.equals(this.name) && ref.language.equals(this.language)) {
					return true;
				}
			}
		}
		return false;
	}

	public MovieDTO(String name, double budget, LocalDate date, String language, double price) {
		super();
		this.name = name;
		this.budget = budget;
		this.date = date;
		this.language = language;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", budget=" + budget + ", date=" + date + ", language=" + language
				+ ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Asending Order
	public int compareTo(MovieDTO o) {
		// TODO Auto-generated method stub

		return this.name.compareTo(o.name);
	}

}
