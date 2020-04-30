package com.example.sayon.TableperClass;

import javax.persistence.Entity;


@Entity

public class TwowheelerVehicle extends Vehicle {

		private String SteeringHandle;

		public String getSteeringHandle() {
			return SteeringHandle;
		}

		public void setSteeringHandle(String steeringHandle) {
			SteeringHandle = steeringHandle;
		}
		
		
	}


