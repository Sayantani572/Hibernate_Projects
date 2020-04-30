package com.example.sayon.InheritanceHibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TwoWheeler")//this is used to changed the name of the dtype column of this class
public class TwowheelerVehicle extends Vehicle {

	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
	
	
}
