package com.example.sayon.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;


@Entity
public class userdetails {

	@Id
	private int id;
	private String uname;
	
	//here we r creating an onetoone mapping betn userdetails and vehicle class
	@OneToOne
	private Vehicle vehicle;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
