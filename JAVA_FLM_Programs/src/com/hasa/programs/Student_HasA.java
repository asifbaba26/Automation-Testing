package com.hasa.programs;

public class Student_HasA {

	private String name;
	private int id;
	private Percentage_HasA percentage;
	private Address_HasA address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Percentage_HasA getPercentage() {
		return percentage;
	}

	public void setPercentage(Percentage_HasA percentage) {
		this.percentage = percentage;
	}

	public Address_HasA getAddress() {
		return address;
	}

	public void setAddress(Address_HasA address) {
		this.address = address;
	}

	public Student_HasA(String name, int id, Percentage_HasA percentage, Address_HasA address) {
		super();
		this.name = name;
		this.id = id;
		this.percentage = percentage;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student_HasA [name=" + name + ", id=" + id + ", percentage=" + percentage + ", address=" + address
				+ "]";
	}

}
