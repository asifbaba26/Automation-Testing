package com.hasa.programs;

public class Employee_HasA {
	private String ename;
	private int eid;
	private double esal;
	private Address_HasA eaddress;
	private Project_HasA eproject;

	public Employee_HasA(String ename, int eid, double esal, Address_HasA eaddress, Project_HasA eproject) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esal = esal;
		this.eaddress = eaddress;
		this.eproject = eproject;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public Address_HasA getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address_HasA eaddress) {
		this.eaddress = eaddress;
	}

	public Project_HasA getEproject() {
		return eproject;
	}

	public void setEproject(Project_HasA eproject) {
		this.eproject = eproject;
	}

	@Override
	public String toString() {
		return "Employee_HasA [ename=" + ename + ", eid=" + eid + ", esal=" + esal + ", eaddress=" + eaddress
				+ ", eproject=" + eproject + "]";
	}

}
