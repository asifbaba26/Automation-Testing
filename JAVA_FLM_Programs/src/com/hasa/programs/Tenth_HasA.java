package com.hasa.programs;

public class Tenth_HasA {
	private String SchoolName;
	private double percentage;
	private Address_HasA address_Tenth;
	
	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Address_HasA getAddress_Tenth() {
		return address_Tenth;
	}

	public void setAddress_Tenth(Address_HasA address_Tenth) {
		this.address_Tenth = address_Tenth;
	}

	public Tenth_HasA(String schoolName, double percentage, Address_HasA address_Tenth) {
		super();
		SchoolName = schoolName;
		this.percentage = percentage;
		this.address_Tenth = address_Tenth;
	}
	
	@Override
	public String toString() {
		return "Tenth_HasA [SchoolName=" + SchoolName + ", percentage=" + percentage + ", address_Tenth="
				+ address_Tenth + "]";
	}

}
