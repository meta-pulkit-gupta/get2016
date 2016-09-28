package com.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	public int id;
	public String name;
	public String city;
	public float experience;
	public int salary;
	
	Employee(){
		
	}

	public Employee(int id, String name, String city, float experience,
			int salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.experience = experience;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
