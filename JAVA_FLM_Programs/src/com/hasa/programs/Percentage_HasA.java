package com.hasa.programs;

public class Percentage_HasA {
	private Tenth_HasA tenth_percentage;
	private Intermediate_HasA inter_percentage;
	private Degree_HasA degree_percentage;

	public Percentage_HasA(Tenth_HasA tenth_percentage, Intermediate_HasA inter_percentage,
			Degree_HasA degree_percentage) {
		super();
		this.tenth_percentage = tenth_percentage;
		this.inter_percentage = inter_percentage;
		this.degree_percentage = degree_percentage;
	}

	public Tenth_HasA getTenth_percentage() {
		return tenth_percentage;
	}

	public void setTenth_percentage(Tenth_HasA tenth_percentage) {
		this.tenth_percentage = tenth_percentage;
	}

	public Intermediate_HasA getInter_percentage() {
		return inter_percentage;
	}

	public void setInter_percentage(Intermediate_HasA inter_percentage) {
		this.inter_percentage = inter_percentage;
	}

	public Degree_HasA getDegree_percentage() {
		return degree_percentage;
	}

	public void setDegree_percentage(Degree_HasA degree_percentage) {
		this.degree_percentage = degree_percentage;
	}

	@Override
	public String toString() {
		return "Percentage_HasA [tenth_percentage=" + tenth_percentage + ", inter_percentage=" + inter_percentage
				+ ", degree_percentage=" + degree_percentage + "]";
	}

}
