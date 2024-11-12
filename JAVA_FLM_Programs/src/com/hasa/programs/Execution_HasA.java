package com.hasa.programs;

public class Execution_HasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_HasA std1 = new Student_HasA("asif", 26,
				new Percentage_HasA(new Tenth_HasA("stvhs", 88.0, new Address_HasA("ind", "tg", "chilkanagar", 39)),
						new Intermediate_HasA("NJC", 93.7, new Address_HasA("ind", "tg", "tarnkaka", 40)),
						new Degree_HasA("snist", 75.0, new Address_HasA("ind", "tg", "ghatkesar", 41))),
				new Address_HasA("ind", "tg", "hyd", 399));
		
		Employee_HasA emp1 = new Employee_HasA("asif",26,30000.0
				,new Address_HasA("ind", "tg", "raidurg", 50)
				,new Project_HasA("NVL","AT"));
		
		
		System.out.println(std1.getPercentage().getTenth_percentage().getPercentage());
		
		System.out.println(std1.getAddress());
		
		
		System.out.println(std1.getPercentage().getDegree_percentage());
		
		System.out.println(emp1.getEproject().getRole());

	}

}
