package com.example.sayon.InheritanceHibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FourWheeler")//this is used to changed the name of the dtype column of this class
public class FourwheelerVehicle extends Vehicle {
	
	private String Steeringwheel;

	public String getSteeringwheel() {
		return Steeringwheel;
	}

	public void setSteeringwheel(String steeringwheel) {
		Steeringwheel = steeringwheel;
	}
	
	

}
