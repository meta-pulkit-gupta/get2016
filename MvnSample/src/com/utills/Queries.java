package com.utills;

public class Queries {

	public static final String SAVE_VEHICLE = "INSERT INTO vehicle (company,model,engineincc,fuelcapacity,milage,price,roadtax) VALUES (?, ?, ?, ?, ?, ?, ?);";
	public static final String SAVE_CAR = "INSERT INTO car (id,ac,powersteering,accessorykit) VALUES (?, ?, ?, ?);";
	public static final String GET_CARS = "SELECT v.id, company, model, engineincc, fuelcapacity, milage, price, roadtax, ac, powersteering, accessorykit FROM vehicle v"
			+ " INNER JOIN car c ON v.id=c.id ;";
	public static final String GET_CAR_BY_ID = "SELECT v.id, company, model, engineincc, fuelcapacity, milage, price, roadtax, ac, powersteering, accessorykit FROM vehicle v"
			+ " INNER JOIN car c ON v.id=c.id WHERE v.id= ? ;";
}
