package com.example.sayon.joinedhibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED) 
/*In this strategy, tables are created as per class but related by foreign key. So there are no duplicate columns.
 whatever property is being inherited from the parent class they will remain in the parent table so the parent table
 will have the core property which is inherited by each of the child classes and the child class will have table
 for its self.It is doing table for each class but it has the only the properties that is specific to the child class
 all the inherited value will remain in parent class.  
 * */
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	
	
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
}