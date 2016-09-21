package com.VO;

public class Car extends Vehicle {

	private int id;
	private String ac;
	private String powerSteering;
	private String accessoryKit;

	public Car(String company, String model, int engineInCC,
			float fuelCapacity, float milage, int price, float roadTax,
			String ac, String powerSteering, String accessoryKit) {
		super(company, model, engineInCC, fuelCapacity, milage, price, roadTax);
		this.ac = ac;
		this.powerSteering = powerSteering;
		this.accessoryKit = accessoryKit;
	}
	
	public Car(int id,String company, String model, int engineInCC,
			float fuelCapacity, float milage, int price, float roadTax,
			String ac, String powerSteering, String accessoryKit) {
		super(id,company, model, engineInCC, fuelCapacity, milage, price, roadTax);
		this.id = id;
		this.ac = ac;
		this.powerSteering = powerSteering;
		this.accessoryKit = accessoryKit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}

	public String getAccessoryKit() {
		return accessoryKit;
	}

	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

}
