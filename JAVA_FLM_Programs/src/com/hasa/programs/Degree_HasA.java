package com.hasa.programs;

public class Degree_HasA {
	private String degreeCollegeName;
	private double percentage;
	private Address_HasA address_Degree;
	
	public String getDegreeCollegeName() {
		return degreeCollegeName;
	}

	public void setDegreeCollegeName(String degreeCollegeName) {
		this.degreeCollegeName = degreeCollegeName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Address_HasA getAddress_Degree() {
		return address_Degree;
	}

	public void setAddress_Degree(Address_HasA address_Degree) {
		this.address_Degree = address_Degree;
	}

	public Degree_HasA(String degreeCollegeName, double percentage, Address_HasA address_Degree) {
		super();
		this.degreeCollegeName = degreeCollegeName;
		this.percentage = percentage;
		this.address_Degree = address_Degree;
	}

	@Override
	public String toString() {
		return "Degree_HasA [degreeCollegeName=" + degreeCollegeName + ", percentage=" + percentage
				+ ", address_Degree=" + address_Degree + "]";
	}
	
	

}
