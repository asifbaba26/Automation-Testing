package com.hasa.programs;

public class Project_HasA {
	private String pname;
	private String role;

	public Project_HasA(String pname, String role) {
		super();
		this.pname = pname;
		this.role = role;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Project_HasA [pname=" + pname + ", role=" + role + "]";
	}

}
