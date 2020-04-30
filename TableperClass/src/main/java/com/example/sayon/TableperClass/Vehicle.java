package com.example.sayon.TableperClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
/** In Table_Per_Class inheritance ,hibernate generates tables for each class whose objs r said to be saved in database
 
 we don't need to mention the discriminator column as all the classname table will be created diffterntly
 
 here twowheelervehicle and fourwheeler class inherits the vehical class so the properties will be inherited also in db
 
  twowheelervehicle and fourwheeler tables will also contain vehicle_id wth its generatedvalue properties and vehicle_name.
  
  In case of table per concrete class, tables are created as per class. But duplicate column is added in subclass tables.
 */
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