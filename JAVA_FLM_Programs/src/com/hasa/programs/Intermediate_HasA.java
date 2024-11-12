package com.hasa.programs;

public class Intermediate_HasA {
	private String collegeName;
	private double percentage;
	private Address_HasA address_Intermediate;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Address_HasA getAddress_Intermediate() {
		return address_Intermediate;
	}

	public void setAddress_Intermediate(Address_HasA address_Intermediate) {
		this.address_Intermediate = address_Intermediate;
	}

	public Intermediate_HasA(String collegeName, double percentage, Address_HasA address_Intermediate) {
		super();
		this.collegeName = collegeName;
		this.percentage = percentage;
		this.address_Intermediate = address_Intermediate;
	}

	@Override
	public String toString() {
		return "Intermediate_HasA [collegeName=" + collegeName + ", percentage=" + percentage
				+ ", address_Intermediate=" + address_Intermediate + "]";
	}

}
