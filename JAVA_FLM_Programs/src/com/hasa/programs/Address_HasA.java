package com.hasa.programs;

public class Address_HasA {
	private String country;
	private String state;
	private String city;
	private int pincode;

	public Address_HasA(String country, String state, String city, int pincode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address_HasA [country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}

}
