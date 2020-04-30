package com.example.sayon.manytomany;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	
	@ManyToMany(mappedBy = "listofvehicle")
	private List<Usersdetails> listofusers=new ArrayList<Usersdetails>();
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public List<Usersdetails> getListofusers() {
		return listofusers;
	}
	public void setListofusers(List<Usersdetails> listofusers) {
		this.listofusers = listofusers;
	}
	
	

}
