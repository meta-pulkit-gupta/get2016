package com.VO;

public class Vehicle {

	private int id;
	private String company;
	private String model;
	private int engineInCC;
	private float fuelCapacity;
	private float milage;
	private int price;
	private float roadTax;
	
	public Vehicle(String company, String model, int engineInCC,
			float fuelCapacity, float milage, int price, float roadTax) {
		this.company = company;
		this.model = model;
		this.engineInCC = engineInCC;
		this.fuelCapacity = fuelCapacity;
		this.milage = milage;
		this.price = price;
		this.roadTax = roadTax;
	}
	
	public Vehicle(int id,String company, String model, int engineInCC,
			float fuelCapacity, float milage, int price, float roadTax) {
		this.id = id;
		this.company = company;
		this.model = model;
		this.engineInCC = engineInCC;
		this.fuelCapacity = fuelCapacity;
		this.milage = milage;
		this.price = price;
		this.roadTax = roadTax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEngineInCC() {
		return engineInCC;
	}

	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}

	public float getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(float fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public float getMilage() {
		return milage;
	}

	public void setMilage(float milage) {
		this.milage = milage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getRoadTax() {
		return roadTax;
	}

	public void setRoadTax(float roadTax) {
		this.roadTax = roadTax;
	}

}
