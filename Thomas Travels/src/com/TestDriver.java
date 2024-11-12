package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		ArrayList<Driver> a1 = new ArrayList<Driver>();
		// String category, int driverId, String driverName, double totalDistance

		Driver d1 = new Driver("Auto", 1, "Ajay", 2000.00);
		Driver d2 = new Driver("Auto", 2, "Bharath", 2500.00);
		Driver d3 = new Driver("Auto", 3, "Chetan", 3000.00);
		Driver d4 = new Driver("Car", 4, "Dinesh", 7000.00);
		Driver d5 = new Driver("Car", 5, "Ejaz", 1200000.00);
		Driver d6 = new Driver("Car", 6, "Himam", 9500.00);
		Driver d7 = new Driver("Car", 7, "Irfan", 6800.00);
		Driver d8 = new Driver("Lorry", 8, "Jadeja", 82000.00);
		Driver d9 = new Driver("Lorry", 9, "Kohli", 64000.00);
		Driver d10 = new Driver("Lorry", 10, "Lasith", 75000.00);

		a1.add(d1);
		a1.add(d2);
		a1.add(d3);
		a1.add(d4);
		a1.add(d5);
		a1.add(d6);
		a1.add(d7);
		a1.add(d8);
		a1.add(d9);
		a1.add(d10);

		Travel t1 = new Travel();
		System.out.println(t1.isCarDriver(d8));

		System.out.println(t1.retrivebyDriverId(a1, 7));

		System.out.println(t1.retriveCountOfDriverCategory(a1, "Car"));
		
		System.out.println(t1.retriveDriver(a1, "Auto"));
		
		System.out.println(t1.retriveMaximumDistanceTravelledDriver(a1));

	}

}
