package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Travel {

	public boolean isCarDriver(Driver d1) {
		if (d1.getCategory().equalsIgnoreCase("Car"))
			return true;
		else
			return false;

	}

	public String retrivebyDriverId(ArrayList<Driver> input, int driverId) {
		for (Driver d1 : input) {
			if (d1.getDriverId() == driverId) {
				return "Driver name is " + d1.getDriverName() + " Belonging to the category " + d1.getCategory()
						+ " travelled " + d1.getTotalDistance() + " KM so far";
			}
		}
		return null;

	}

	public int retriveCountOfDriverCategory(ArrayList<Driver> input, String category) {
		int count = 0;
		for (Driver d1 : input) {
			if (d1.getCategory().equalsIgnoreCase(category)) {
				count++;
			}
		}
		return count;

	}

	public ArrayList<Driver> retriveDriver(ArrayList<Driver> input, String category) {
		ArrayList<Driver> result = new ArrayList<>();
		for (Driver d1 : input) {
			if (d1.getCategory().equalsIgnoreCase(category)) {
				result.add(d1);
			}
		}
		return result;

	}

//	public double retriveMaximumDistanceTravelledDriver(ArrayList<Driver> input) {
//		double maxdist = 0.00;
//		for (Driver d1 : input) {
//			if (d1.getTotalDistance() > maxdist) {
//				maxdist = d1.getTotalDistance();
//			}
//
//		}
//
//		return maxdist;
//
//	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> input){
		List<Double>doublelist=new ArrayList<>();
		for(Driver vals: input){
		doublelist.add(vals.getTotalDistance());}
		Driver driver=null;
		Double d=Collections.max(doublelist);
		for(Driver values: input){
		if(values.getTotalDistance() == d){
		driver=values;}
		}
		return driver;}

}
